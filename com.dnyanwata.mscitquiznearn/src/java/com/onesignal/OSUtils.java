/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  androidx.core.app.NotificationManagerCompat
 *  com.huawei.hms.api.HuaweiApiAvailability
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.UUID
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSUtils {
    private static final int HMS_AVAILABLE_SUCCESSFUL = 0;
    private static final String HMS_CORE_SERVICES_PACKAGE = "com.huawei.hwid";
    public static int MAX_NETWORK_REQUEST_ATTEMPT_COUNT = 3;
    static final int[] NO_RETRY_NETWROK_REQUEST_STATUS_CODES = new int[]{401, 402, 403, 404, 410};
    public static final int UNINITIALIZABLE_STATUS = -999;

    OSUtils() {
    }

    static boolean areNotificationsEnabled(Context context) {
        try {
            boolean bl = NotificationManagerCompat.from((Context)OneSignal.appContext).areNotificationsEnabled();
            return bl;
        }
        catch (Throwable throwable) {
            return true;
        }
    }

    private Integer checkAndroidSupportLibrary(Context context) {
        boolean bl = OSUtils.hasWakefulBroadcastReceiver();
        boolean bl2 = OSUtils.hasNotificationManagerCompat();
        if (!bl && !bl2) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        }
        if (bl && bl2) {
            if (Build.VERSION.SDK_INT >= 26 && OSUtils.getTargetSdkVersion(context) >= 26 && !OSUtils.hasJobIntentService()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
                return -5;
            }
            return null;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
        return -5;
    }

    static Collection<String> extractStringsFromCollection(Collection<Object> collection) {
        ArrayList arrayList = new ArrayList();
        if (collection == null) {
            return arrayList;
        }
        for (Object object : collection) {
            if (!(object instanceof String)) continue;
            arrayList.add((Object)((String)object));
        }
        return arrayList;
    }

    static String getCorrectedLanguage() {
        String string2 = Locale.getDefault().getLanguage();
        if (string2.equals((Object)"iw")) {
            return "he";
        }
        if (string2.equals((Object)"in")) {
            return "id";
        }
        if (string2.equals((Object)"ji")) {
            return "yi";
        }
        if (string2.equals((Object)"zh")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("-");
            stringBuilder.append(Locale.getDefault().getCountry());
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    static String getManifestMeta(Context context, String string2) {
        try {
            String string3 = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData.getString(string2);
            return string3;
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "", throwable);
            return null;
        }
    }

    static String getResourceString(Context context, String string2, String string3) {
        Resources resources = context.getResources();
        int n = resources.getIdentifier(string2, "string", context.getPackageName());
        if (n != 0) {
            return resources.getString(n);
        }
        return string3;
    }

    static Uri getSoundUri(Context context, String string2) {
        int n;
        Resources resources = context.getResources();
        String string3 = context.getPackageName();
        if (OSUtils.isValidResourceName(string2) && (n = resources.getIdentifier(string2, "raw", string3)) != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.resource://");
            stringBuilder.append(string3);
            stringBuilder.append("/");
            stringBuilder.append(n);
            return Uri.parse((String)stringBuilder.toString());
        }
        int n2 = resources.getIdentifier("onesignal_default_sound", "raw", string3);
        if (n2 != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.resource://");
            stringBuilder.append(string3);
            stringBuilder.append("/");
            stringBuilder.append(n2);
            return Uri.parse((String)stringBuilder.toString());
        }
        return null;
    }

    static int getTargetSdkVersion(Context context) {
        String string2 = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            int n = packageManager.getApplicationInfo((String)string2, (int)0).targetSdkVersion;
            return n;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
            return 15;
        }
    }

    static boolean hasAllHMSLibrariesForPushKit() {
        return OSUtils.hasHMSAGConnectLibrary() && OSUtils.hasHMSPushKitLibrary();
    }

    static boolean hasConfigChangeFlag(Activity activity, int n) {
        int n2;
        try {
            n2 = activity.getPackageManager().getActivityInfo((ComponentName)activity.getComponentName(), (int)0).configChanges;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            nameNotFoundException.printStackTrace();
        }
        if ((n2 & n) != 0) {
            return true;
        }
        return false;
    }

    static boolean hasFCMLibrary() {
        return true;
    }

    static boolean hasGMSLocationLibrary() {
        return true;
    }

    private static boolean hasHMSAGConnectLibrary() {
        return true;
    }

    private static boolean hasHMSAvailabilityLibrary() {
        return true;
    }

    static boolean hasHMSLocationLibrary() {
        return true;
    }

    private static boolean hasHMSPushKitLibrary() {
        return true;
    }

    private static boolean hasJobIntentService() {
        return true;
    }

    private static boolean hasNotificationManagerCompat() {
        return true;
    }

    private static boolean hasWakefulBroadcastReceiver() {
        return true;
    }

    static boolean isAndroidDeviceType() {
        return new OSUtils().getDeviceType() == 1;
    }

    static boolean isFireOSDeviceType() {
        return new OSUtils().getDeviceType() == 2;
    }

    static boolean isGMSInstalledAndEnabled() {
        return OSUtils.packageInstalledAndEnabled("com.google.android.gms");
    }

    private static boolean isHMSCoreInstalledAndEnabled() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(OneSignal.appContext) == 0;
    }

    private static boolean isHMSCoreInstalledAndEnabledFallback() {
        return OSUtils.packageInstalledAndEnabled(HMS_CORE_SERVICES_PACKAGE);
    }

    static boolean isHuaweiDeviceType() {
        return new OSUtils().getDeviceType() == 13;
    }

    static boolean isRunningOnMainThread() {
        return Thread.currentThread().equals((Object)Looper.getMainLooper().getThread());
    }

    static boolean isStringNotEmpty(String string2) {
        return true ^ TextUtils.isEmpty((CharSequence)string2);
    }

    static boolean isValidEmail(String string2) {
        if (string2 == null) {
            return false;
        }
        return Pattern.compile((String)"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher((CharSequence)string2).matches();
    }

    static boolean isValidResourceName(String string2) {
        return string2 != null && !string2.matches("^[0-9]");
    }

    static Bundle jsonStringToBundle(String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            Bundle bundle = new Bundle();
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                bundle.putString(string3, jSONObject.getString(string3));
            }
            return bundle;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return null;
        }
    }

    static <T> Set<T> newConcurrentSet() {
        return Collections.newSetFromMap((Map)new ConcurrentHashMap());
    }

    static Set<String> newStringSetFromJSONArray(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); ++i) {
            hashSet.add((Object)jSONArray.getString(i));
        }
        return hashSet;
    }

    private static void openURLInBrowser(Uri uri) {
        Intent intent;
        SchemaType schemaType = uri.getScheme() != null ? SchemaType.fromString(uri.getScheme()) : null;
        if (schemaType == null) {
            schemaType = SchemaType.HTTP;
            if (!uri.toString().contains((CharSequence)"://")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("http://");
                stringBuilder.append(uri.toString());
                uri = Uri.parse((String)stringBuilder.toString());
            }
        }
        if (1.$SwitchMap$com$onesignal$OSUtils$SchemaType[schemaType.ordinal()] != 1) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity((String)"android.intent.action.MAIN", (String)"android.intent.category.APP_BROWSER");
            intent.setData(uri);
        }
        intent.addFlags(1476919296);
        OneSignal.appContext.startActivity(intent);
    }

    static void openURLInBrowser(String string2) {
        OSUtils.openURLInBrowser(Uri.parse((String)string2.trim()));
    }

    private static boolean packageInstalledAndEnabled(String string2) {
        try {
            boolean bl = OneSignal.appContext.getPackageManager().getPackageInfo((String)string2, (int)128).applicationInfo.enabled;
            return bl;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    static long[] parseVibrationPattern(JSONObject jSONObject) {
        int n;
        JSONArray jSONArray;
        long[] arrl;
        try {
            Object object = jSONObject.opt("vib_pt");
            jSONArray = object instanceof String ? new JSONArray((String)object) : (JSONArray)object;
            arrl = new long[jSONArray.length()];
            n = 0;
        }
        catch (JSONException jSONException) {
            return null;
        }
        do {
            if (n >= jSONArray.length()) break;
            arrl[n] = jSONArray.optLong(n);
            ++n;
        } while (true);
        return arrl;
    }

    static void runOnMainThreadDelayed(Runnable runnable, int n) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long)n);
    }

    static void runOnMainUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
            return;
        }
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    static boolean shouldLogMissingAppIdError(String string2) {
        if (string2 != null) {
            return false;
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean shouldRetryNetworkRequest(int n) {
        int[] arrn = NO_RETRY_NETWROK_REQUEST_STATUS_CODES;
        int n2 = arrn.length;
        for (int i = 0; i < n2; ++i) {
            if (n != arrn[i]) continue;
            return false;
        }
        return true;
    }

    static void sleep(int n) {
        long l = n;
        try {
            Thread.sleep((long)l);
            return;
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            return;
        }
    }

    private boolean supportsADM() {
        try {
            Class.forName((String)"com.amazon.device.messaging.ADM");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private boolean supportsGooglePush() {
        if (!OSUtils.hasFCMLibrary()) {
            return false;
        }
        return OSUtils.isGMSInstalledAndEnabled();
    }

    private boolean supportsHMS() {
        if (OSUtils.hasHMSAvailabilityLibrary() && OSUtils.hasAllHMSLibrariesForPushKit()) {
            return OSUtils.isHMSCoreInstalledAndEnabled();
        }
        return false;
    }

    Integer checkForGooglePushLibrary() {
        if (!OSUtils.hasFCMLibrary()) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
            return -4;
        }
        return null;
    }

    String getCarrierName() {
        try {
            String string2 = ((TelephonyManager)OneSignal.appContext.getSystemService("phone")).getNetworkOperatorName();
            boolean bl = "".equals((Object)string2);
            if (bl) {
                return null;
            }
            return string2;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    int getDeviceType() {
        if (this.supportsADM()) {
            return 2;
        }
        if (this.supportsGooglePush()) {
            return 1;
        }
        if (this.supportsHMS()) {
            return 13;
        }
        if (OSUtils.isGMSInstalledAndEnabled()) {
            return 1;
        }
        if (OSUtils.isHMSCoreInstalledAndEnabledFallback()) {
            return 13;
        }
        return 1;
    }

    Integer getNetType() {
        NetworkInfo networkInfo = ((ConnectivityManager)OneSignal.appContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkInfo != null) {
            int n = networkInfo.getType();
            if (n != 1 && n != 9) {
                return 1;
            }
            return 0;
        }
        return null;
    }

    int initializationChecker(Context context, String string2) {
        int n;
        Integer n2;
        Integer n3;
        int n4 = this.getDeviceType();
        try {
            UUID.fromString((String)string2);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", throwable);
            return -999;
        }
        if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals((Object)string2) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals((Object)string2)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
        }
        if (n4 == (n = 1) && (n3 = this.checkForGooglePushLibrary()) != null) {
            n = n3;
        }
        if ((n2 = this.checkAndroidSupportLibrary(context)) != null) {
            n = n2;
        }
        return n;
    }

    public static final class SchemaType
    extends Enum<SchemaType> {
        private static final /* synthetic */ SchemaType[] $VALUES;
        public static final /* enum */ SchemaType DATA;
        public static final /* enum */ SchemaType HTTP;
        public static final /* enum */ SchemaType HTTPS;
        private final String text;

        static {
            SchemaType schemaType;
            SchemaType schemaType2;
            SchemaType schemaType3;
            DATA = schemaType3 = new SchemaType("data");
            HTTPS = schemaType2 = new SchemaType("https");
            HTTP = schemaType = new SchemaType("http");
            $VALUES = new SchemaType[]{schemaType3, schemaType2, schemaType};
        }

        private SchemaType(String string3) {
            this.text = string3;
        }

        public static SchemaType fromString(String string2) {
            for (SchemaType schemaType : SchemaType.values()) {
                if (!schemaType.text.equalsIgnoreCase(string2)) continue;
                return schemaType;
            }
            return null;
        }

        public static SchemaType valueOf(String string2) {
            return (SchemaType)Enum.valueOf(SchemaType.class, (String)string2);
        }

        public static SchemaType[] values() {
            return (SchemaType[])$VALUES.clone();
        }
    }

}

