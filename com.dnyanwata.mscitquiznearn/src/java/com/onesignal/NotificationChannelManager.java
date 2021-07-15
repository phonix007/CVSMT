/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.app.NotificationChannelGroup
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalNotificationManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationChannelManager {
    private static final String CHANNEL_PREFIX = "OS_";
    private static final String DEFAULT_CHANNEL_ID = "fcm_fallback_notification_channel";
    private static final String RESTORE_CHANNEL_ID = "restored_OS_notifications";
    private static final Pattern hexPattern = Pattern.compile((String)"^([A-Fa-f0-9]{8})$");

    NotificationChannelManager() {
    }

    private static String createChannel(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        long[] arrl;
        JSONObject jSONObject2;
        int n;
        String string2;
        String string3;
        Object object = jSONObject.opt("chnl");
        JSONObject jSONObject3 = object instanceof String ? new JSONObject((String)object) : (JSONObject)object;
        String string4 = jSONObject3.optString("id", string3 = DEFAULT_CHANNEL_ID);
        if (!string4.equals((Object)"miscellaneous")) {
            string3 = string4;
        }
        JSONObject jSONObject4 = jSONObject3.has("langs") && (jSONObject2 = jSONObject3.getJSONObject("langs")).has(string2 = OSUtils.getCorrectedLanguage()) ? jSONObject2.optJSONObject(string2) : jSONObject3;
        NotificationChannel notificationChannel = new NotificationChannel(string3, (CharSequence)jSONObject4.optString("nm", "Miscellaneous"), NotificationChannelManager.priorityToImportance(jSONObject.optInt("pri", 6)));
        notificationChannel.setDescription(jSONObject4.optString("dscr", null));
        if (jSONObject3.has("grp_id")) {
            String string5 = jSONObject3.optString("grp_id");
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(string5, (CharSequence)jSONObject4.optString("grp_nm")));
            notificationChannel.setGroup(string5);
        }
        if (jSONObject.has("ledc")) {
            String string6 = jSONObject.optString("ledc");
            if (!hexPattern.matcher((CharSequence)string6).matches()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)");
                string6 = "FFFFFFFF";
            }
            try {
                notificationChannel.setLightColor(new BigInteger(string6, 16).intValue());
            }
            catch (Throwable throwable) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Couldn't convert ARGB Hex value to BigInteger:", throwable);
            }
        }
        boolean bl = jSONObject.optInt("led", n = 1) == n;
        notificationChannel.enableLights(bl);
        if (jSONObject.has("vib_pt") && (arrl = OSUtils.parseVibrationPattern(jSONObject)) != null) {
            notificationChannel.setVibrationPattern(arrl);
        }
        boolean bl2 = jSONObject.optInt("vib", n) == n;
        notificationChannel.enableVibration(bl2);
        if (jSONObject.has("sound")) {
            String string7 = jSONObject.optString("sound", null);
            Uri uri = OSUtils.getSoundUri(context, string7);
            if (uri != null) {
                notificationChannel.setSound(uri, null);
            } else if ("null".equals((Object)string7) || "nil".equals((Object)string7)) {
                notificationChannel.setSound(null, null);
            }
        }
        notificationChannel.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        boolean bl3 = jSONObject.optInt("bdg", n) == n;
        notificationChannel.setShowBadge(bl3);
        if (jSONObject.optInt("bdnd", 0) != n) {
            n = 0;
        }
        notificationChannel.setBypassDnd((boolean)n);
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Creating notification channel with channel:\n");
        stringBuilder.append(notificationChannel.toString());
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        try {
            notificationManager.createNotificationChannel(notificationChannel);
            return string3;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return string3;
        }
    }

    private static String createDefaultChannel(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel(DEFAULT_CHANNEL_ID, (CharSequence)"Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return DEFAULT_CHANNEL_ID;
    }

    static String createNotificationChannel(OSNotificationGenerationJob oSNotificationGenerationJob) {
        String string2;
        if (Build.VERSION.SDK_INT < 26) {
            return DEFAULT_CHANNEL_ID;
        }
        Context context = oSNotificationGenerationJob.getContext();
        JSONObject jSONObject = oSNotificationGenerationJob.getJsonPayload();
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
        if (oSNotificationGenerationJob.isRestoring()) {
            return NotificationChannelManager.createRestoreChannel(notificationManager);
        }
        if (jSONObject.has("oth_chnl") && notificationManager.getNotificationChannel(string2 = jSONObject.optString("oth_chnl")) != null) {
            return string2;
        }
        if (!jSONObject.has("chnl")) {
            return NotificationChannelManager.createDefaultChannel(notificationManager);
        }
        try {
            String string3 = NotificationChannelManager.createChannel(context, notificationManager, jSONObject);
            return string3;
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", jSONException);
            return DEFAULT_CHANNEL_ID;
        }
    }

    private static String createRestoreChannel(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(RESTORE_CHANNEL_ID, (CharSequence)"Restored", 2));
        return RESTORE_CHANNEL_ID;
    }

    private static int priorityToImportance(int n) {
        if (n > 9) {
            return 5;
        }
        if (n > 7) {
            return 4;
        }
        if (n > 5) {
            return 3;
        }
        if (n > 3) {
            return 2;
        }
        return n > 1;
    }

    static void processChannelList(Context context, JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (jSONArray != null) {
            if (jSONArray.length() == 0) {
                return;
            }
            NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
            HashSet hashSet = new HashSet();
            int n = jSONArray.length();
            for (int i = 0; i < n; ++i) {
                try {
                    hashSet.add((Object)NotificationChannelManager.createChannel(context, notificationManager, jSONArray.getJSONObject(i)));
                    continue;
                }
                catch (JSONException jSONException) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not create notification channel due to JSON payload error!", jSONException);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            try {
                arrayList = notificationManager.getNotificationChannels();
            }
            catch (NullPointerException nullPointerException) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error when trying to delete notification channel: ");
                stringBuilder.append(nullPointerException.getMessage());
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String string2 = ((NotificationChannel)iterator.next()).getId();
                if (!string2.startsWith(CHANNEL_PREFIX) || hashSet.contains((Object)string2)) continue;
                notificationManager.deleteNotificationChannel(string2);
            }
        }
    }
}

