/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationFormatHelper {
    public static final String PAYLOAD_OS_NOTIFICATION_ID = "i";
    public static final String PAYLOAD_OS_ROOT_CUSTOM = "custom";

    OSNotificationFormatHelper() {
    }

    private static String getOSNotificationIdFromBundle(Bundle bundle) {
        if (bundle != null) {
            if (bundle.isEmpty()) {
                return null;
            }
            String string2 = bundle.getString(PAYLOAD_OS_ROOT_CUSTOM, null);
            if (string2 != null) {
                return OSNotificationFormatHelper.getOSNotificationIdFromJsonString(string2);
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    static String getOSNotificationIdFromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return OSNotificationFormatHelper.getOSNotificationIdFromJsonString(jSONObject.optString(PAYLOAD_OS_ROOT_CUSTOM, null));
    }

    private static String getOSNotificationIdFromJsonString(String string2) {
        try {
            JSONObject jSONObject = new JSONObject(string2);
            if (jSONObject.has(PAYLOAD_OS_NOTIFICATION_ID)) {
                return jSONObject.optString(PAYLOAD_OS_NOTIFICATION_ID, null);
            }
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
            return null;
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
            return null;
        }
    }

    static boolean isOneSignalBundle(Bundle bundle) {
        return OSNotificationFormatHelper.getOSNotificationIdFromBundle(bundle) != null;
    }

    static boolean isOneSignalIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        return OSNotificationFormatHelper.isOneSignalBundle(intent.getExtras());
    }
}

