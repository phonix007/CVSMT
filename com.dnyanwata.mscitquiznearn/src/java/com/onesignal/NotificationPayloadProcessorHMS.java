/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.NotificationOpenedProcessor;
import com.onesignal.NotificationPayloadProcessorHMS;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationPayloadProcessorHMS {
    NotificationPayloadProcessorHMS() {
    }

    private static JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!OSNotificationFormatHelper.isOneSignalIntent(intent)) {
            return null;
        }
        JSONObject jSONObject = NotificationBundleProcessor.bundleAsJSONObject(intent.getExtras());
        NotificationPayloadProcessorHMS.reformatButtonClickAction(jSONObject);
        return jSONObject;
    }

    static void handleHMSNotificationOpenIntent(Activity activity, Intent intent) {
        OneSignal.initWithContext(activity.getApplicationContext());
        if (intent == null) {
            return;
        }
        JSONObject jSONObject = NotificationPayloadProcessorHMS.covertHMSOpenIntentToJson(intent);
        if (jSONObject == null) {
            return;
        }
        NotificationPayloadProcessorHMS.handleProcessJsonOpenData(activity, jSONObject);
    }

    private static void handleProcessJsonOpenData(Activity activity, JSONObject jSONObject) {
        if (NotificationOpenedProcessor.handleIAMPreviewOpen(activity, jSONObject)) {
            return;
        }
        OneSignal.handleNotificationOpen(activity, new JSONArray().put((Object)jSONObject), false, OSNotificationFormatHelper.getOSNotificationIdFromJson(jSONObject));
    }

    public static void processDataMessageReceived(Context context, String string2) {
        OneSignal.initWithContext(context);
        if (string2 == null) {
            return;
        }
        Bundle bundle = OSUtils.jsonStringToBundle(string2);
        if (bundle == null) {
            return;
        }
        NotificationBundleProcessor.processBundleFromReceiver(context, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(context, bundle){
            final /* synthetic */ Bundle val$bundle;
            final /* synthetic */ Context val$context;
            {
                this.val$context = context;
                this.val$bundle = bundle;
            }

            public void onBundleProcessed(com.onesignal.NotificationBundleProcessor$ProcessedBundleResult processedBundleResult) {
                if (processedBundleResult != null && processedBundleResult.processed()) {
                    return;
                }
                com.onesignal.FCMBroadcastReceiver.startFCMService(this.val$context, this.val$bundle);
            }
        });
    }

    private static void reformatButtonClickAction(JSONObject jSONObject) {
        String string2;
        block3 : {
            try {
                string2 = (String)NotificationBundleProcessor.getCustomJSONObject(jSONObject).remove("actionId");
                if (string2 != null) break block3;
                return;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                return;
            }
        }
        jSONObject.put("actionId", (Object)string2);
    }
}

