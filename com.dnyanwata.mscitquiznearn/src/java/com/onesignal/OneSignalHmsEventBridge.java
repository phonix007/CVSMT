/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.huawei.hms.push.RemoteMessage
 *  com.onesignal.NotificationPayloadProcessorHMS
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.Context;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.NotificationPayloadProcessorHMS;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorHMS;

public class OneSignalHmsEventBridge {
    public static void onMessageReceived(Context context, RemoteMessage remoteMessage) {
        NotificationPayloadProcessorHMS.processDataMessageReceived((Context)context, (String)remoteMessage.getData());
    }

    public static void onNewToken(Context context, String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HmsMessageServiceOneSignal.onNewToken - HMS token: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        PushRegistratorHMS.fireCallback(string2);
    }
}

