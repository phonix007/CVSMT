/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import org.json.JSONException;
import org.json.JSONObject;

class OSReceiveReceiptRepository {
    private static final String APP_ID = "app_id";
    private static final String PLAYER_ID = "player_id";

    OSReceiveReceiptRepository() {
    }

    void sendReceiveReceipt(String string2, String string3, String string4, OneSignalRestClient.ResponseHandler responseHandler) {
        try {
            JSONObject jSONObject = new JSONObject().put(APP_ID, (Object)string2).put(PLAYER_ID, (Object)string3);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("notifications/");
            stringBuilder.append(string4);
            stringBuilder.append("/report_received");
            OneSignalRestClient.put(stringBuilder.toString(), jSONObject, responseHandler);
            return;
        }
        catch (JSONException jSONException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating direct receive receipt:JSON Failed.", jSONException);
            return;
        }
    }
}

