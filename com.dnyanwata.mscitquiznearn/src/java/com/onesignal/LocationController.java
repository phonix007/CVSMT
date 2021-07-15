/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.location.Location
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.onesignal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.GMSLocationController;
import com.onesignal.HMSLocationController;
import com.onesignal.OSSyncService;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.PermissionsActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class LocationController {
    static final long BACKGROUND_UPDATE_TIME_MS = 570000L;
    static final long FOREGROUND_UPDATE_TIME_MS = 270000L;
    private static final long TIME_BACKGROUND_SEC = 600L;
    private static final long TIME_FOREGROUND_SEC = 300L;
    static Context classContext;
    static Thread fallbackFailThread;
    static Location lastLocation;
    private static boolean locationCoarse;
    private static LocationHandlerThread locationHandlerThread;
    private static ConcurrentHashMap<PermissionType, LocationHandler> locationHandlers;
    private static final List<LocationPromptCompletionHandler> promptHandlers;
    static String requestPermission;
    static final Object syncLock;

    static {
        promptHandlers = new ArrayList();
        locationHandlers = new ConcurrentHashMap();
        syncLock = new Object(){};
    }

    LocationController() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void addPromptHandlerIfAvailable(LocationHandler locationHandler) {
        if (locationHandler instanceof LocationPromptCompletionHandler) {
            List<LocationPromptCompletionHandler> list;
            List<LocationPromptCompletionHandler> list2 = list = promptHandlers;
            synchronized (list2) {
                list.add((Object)(locationHandler));
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void backgroundLocationPermissionLogic(Context context, boolean bl, boolean bl2) {
        try {
            if (Arrays.asList((Object[])context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)4096).requestedPermissions).contains((Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) {
                requestPermission = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (requestPermission != null && bl) {
                PermissionsActivity.startPrompt(bl2);
                return;
            }
            LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            LocationController.startGetLocation();
            return;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.ERROR);
            nameNotFoundException.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void fireComplete(LocationPoint locationPoint) {
        HashMap hashMap = new HashMap();
        Class<LocationController> class_ = LocationController.class;
        // MONITORENTER : com.onesignal.LocationController.class
        hashMap.putAll(locationHandlers);
        locationHandlers.clear();
        Thread thread = fallbackFailThread;
        // MONITOREXIT : class_
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            ((LocationHandler)hashMap.get((Object)((PermissionType)((Object)iterator.next())))).onComplete(locationPoint);
        }
        if (thread != null && !Thread.currentThread().equals((Object)thread)) {
            thread.interrupt();
        }
        if (thread == fallbackFailThread) {
            class_ = LocationController.class;
            // MONITORENTER : com.onesignal.LocationController.class
            if (thread == fallbackFailThread) {
                fallbackFailThread = null;
            }
            // MONITOREXIT : class_
        }
        LocationController.setLastLocationTime(OneSignal.getTime().getCurrentTimeMillis());
    }

    protected static void fireCompleteForLocation(Location location) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationController fireCompleteForLocation with location: ");
        stringBuilder.append((Object)location);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        LocationPoint locationPoint = new LocationPoint();
        locationPoint.accuracy = Float.valueOf((float)location.getAccuracy());
        locationPoint.bg = true ^ OneSignal.isInForeground();
        locationPoint.type = true ^ locationCoarse;
        locationPoint.timeStamp = location.getTime();
        if (locationCoarse) {
            locationPoint.lat = new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
            locationPoint.log = new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
        } else {
            locationPoint.lat = location.getLatitude();
            locationPoint.log = location.getLongitude();
        }
        LocationController.fireComplete(locationPoint);
        LocationController.scheduleUpdate(classContext);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void fireFailedComplete() {
        Object object;
        PermissionsActivity.answered = false;
        Object object2 = object = syncLock;
        synchronized (object2) {
            if (LocationController.isGooglePlayServicesAvailable()) {
                GMSLocationController.fireFailedComplete();
            } else if (LocationController.isHMSAvailable()) {
                HMSLocationController.fireFailedComplete();
            }
        }
        LocationController.fireComplete(null);
    }

    private static long getLastLocationTime() {
        return OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, "OS_LAST_LOCATION_TIME", -600000L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void getLocation(Context context, boolean bl, boolean bl2, LocationHandler locationHandler) {
        int n;
        int n2;
        LocationController.addPromptHandlerIfAvailable(locationHandler);
        classContext = context;
        locationHandlers.put((Object)locationHandler.getType(), (Object)locationHandler);
        if (!OneSignal.isLocationShared()) {
            LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.ERROR);
            LocationController.fireFailedComplete();
            return;
        }
        int n3 = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        if (n3 == (n2 = -1)) {
            n = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
            locationCoarse = true;
        } else {
            n = -1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n2 = AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (n3 != 0 && n != 0) {
                LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST);
                locationHandler.onComplete(null);
                return;
            }
            LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.PERMISSION_GRANTED);
            LocationController.startGetLocation();
            return;
        }
        if (n3 != 0) {
            try {
                List list = Arrays.asList((Object[])context.getPackageManager().getPackageInfo((String)context.getPackageName(), (int)4096).requestedPermissions);
                OneSignal.PromptActionResult promptActionResult = OneSignal.PromptActionResult.PERMISSION_DENIED;
                if (list.contains((Object)"android.permission.ACCESS_FINE_LOCATION")) {
                    requestPermission = "android.permission.ACCESS_FINE_LOCATION";
                } else if (list.contains((Object)"android.permission.ACCESS_COARSE_LOCATION")) {
                    if (n != 0) {
                        requestPermission = "android.permission.ACCESS_COARSE_LOCATION";
                    } else if (Build.VERSION.SDK_INT >= 29 && list.contains((Object)"android.permission.ACCESS_BACKGROUND_LOCATION")) {
                        requestPermission = "android.permission.ACCESS_BACKGROUND_LOCATION";
                    }
                } else {
                    OneSignal.onesignalLog(OneSignal.LOG_LEVEL.INFO, "Location permissions not added on AndroidManifest file");
                    promptActionResult = OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST;
                }
                if (requestPermission != null && bl) {
                    PermissionsActivity.startPrompt(bl2);
                    return;
                }
                if (n == 0) {
                    LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.PERMISSION_GRANTED);
                    LocationController.startGetLocation();
                    return;
                }
                LocationController.sendAndClearPromptHandlers(bl, promptActionResult);
                LocationController.fireFailedComplete();
                return;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.ERROR);
                nameNotFoundException.printStackTrace();
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && n2 != 0) {
            LocationController.backgroundLocationPermissionLogic(context, bl, bl2);
            return;
        }
        LocationController.sendAndClearPromptHandlers(bl, OneSignal.PromptActionResult.PERMISSION_GRANTED);
        LocationController.startGetLocation();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static LocationHandlerThread getLocationHandlerThread() {
        Object object;
        if (locationHandlerThread != null) return locationHandlerThread;
        Object object2 = object = syncLock;
        synchronized (object2) {
            if (locationHandlerThread != null) return locationHandlerThread;
            locationHandlerThread = new LocationHandlerThread();
            return locationHandlerThread;
        }
    }

    private static boolean hasLocationPermission(Context context) {
        return AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        {
        }
    }

    static boolean isGooglePlayServicesAvailable() {
        return OSUtils.isAndroidDeviceType() && OSUtils.hasGMSLocationLibrary();
    }

    static boolean isHMSAvailable() {
        return OSUtils.isHuaweiDeviceType() && OSUtils.hasHMSLocationLibrary();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void onFocusChange() {
        Object object;
        Object object2 = object = syncLock;
        synchronized (object2) {
            if (LocationController.isGooglePlayServicesAvailable()) {
                GMSLocationController.onFocusChange();
                return;
            }
            if (LocationController.isHMSAvailable()) {
                HMSLocationController.onFocusChange();
            }
            return;
        }
    }

    static boolean scheduleUpdate(Context context) {
        if (!LocationController.hasLocationPermission(context)) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location permission not enabled");
            return false;
        }
        if (!OneSignal.isLocationShared()) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController scheduleUpdate not possible, location shared not enabled");
            return false;
        }
        long l = OneSignal.getTime().getCurrentTimeMillis() - LocationController.getLastLocationTime();
        long l2 = OneSignal.isInForeground() ? 300L : 600L;
        long l3 = l2 * 1000L;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationController scheduleUpdate lastTime: ");
        stringBuilder.append(l);
        stringBuilder.append(" minTime: ");
        stringBuilder.append(l3);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        long l4 = l3 - l;
        OSSyncService.getInstance().scheduleLocationUpdateTask(context, l4);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void sendAndClearPromptHandlers(boolean bl, OneSignal.PromptActionResult promptActionResult) {
        List<LocationPromptCompletionHandler> list;
        if (!bl) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List<LocationPromptCompletionHandler> list2 = list = promptHandlers;
        synchronized (list2) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "LocationController calling prompt handlers");
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) {
                    promptHandlers.clear();
                    return;
                }
                (iterator.next()).onAnswered(promptActionResult);
            } while (true);
        }
    }

    private static void setLastLocationTime(long l) {
        OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, "OS_LAST_LOCATION_TIME", l);
    }

    static void startGetLocation() {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationController startGetLocation with lastLocation: ");
        stringBuilder.append((Object)lastLocation);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        try {
            if (LocationController.isGooglePlayServicesAvailable()) {
                GMSLocationController.startGetLocation();
                return;
            }
            if (LocationController.isHMSAvailable()) {
                HMSLocationController.startGetLocation();
                return;
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "LocationController startGetLocation not possible, no location dependency found");
            LocationController.fireFailedComplete();
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Location permission exists but there was an error initializing: ", throwable);
            LocationController.fireFailedComplete();
            return;
        }
    }

    static interface LocationHandler {
        public PermissionType getType();

        public void onComplete(LocationPoint var1);
    }

    protected static class LocationHandlerThread
    extends HandlerThread {
        Handler mHandler;

        LocationHandlerThread() {
            super("OSH_LocationHandlerThread");
            this.start();
            this.mHandler = new Handler(this.getLooper());
        }
    }

    static class LocationPoint {
        Float accuracy;
        Boolean bg;
        Double lat;
        Double log;
        Long timeStamp;
        Integer type;

        LocationPoint() {
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LocationPoint{lat=");
            stringBuilder.append((Object)this.lat);
            stringBuilder.append(", log=");
            stringBuilder.append((Object)this.log);
            stringBuilder.append(", accuracy=");
            stringBuilder.append((Object)this.accuracy);
            stringBuilder.append(", type=");
            stringBuilder.append((Object)this.type);
            stringBuilder.append(", bg=");
            stringBuilder.append((Object)this.bg);
            stringBuilder.append(", timeStamp=");
            stringBuilder.append((Object)this.timeStamp);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static final class PermissionType
    extends Enum<PermissionType> {
        private static final /* synthetic */ PermissionType[] $VALUES;
        public static final /* enum */ PermissionType PROMPT_LOCATION;
        public static final /* enum */ PermissionType STARTUP;
        public static final /* enum */ PermissionType SYNC_SERVICE;

        static {
            PermissionType permissionType;
            PermissionType permissionType2;
            PermissionType permissionType3;
            STARTUP = permissionType = new PermissionType();
            PROMPT_LOCATION = permissionType3 = new PermissionType();
            SYNC_SERVICE = permissionType2 = new PermissionType();
            $VALUES = new PermissionType[]{permissionType, permissionType3, permissionType2};
        }

        public static PermissionType valueOf(String string2) {
            return (PermissionType)Enum.valueOf(PermissionType.class, (String)string2);
        }

        public static PermissionType[] values() {
            return (PermissionType[])$VALUES.clone();
        }
    }

}

