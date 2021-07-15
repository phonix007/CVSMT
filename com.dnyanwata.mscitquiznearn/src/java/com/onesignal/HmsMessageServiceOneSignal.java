/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.huawei.hms.push.HmsMessageService
 *  com.huawei.hms.push.RemoteMessage
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignalHmsEventBridge;

public class HmsMessageServiceOneSignal
extends HmsMessageService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        OneSignalHmsEventBridge.onMessageReceived((Context)this, remoteMessage);
    }

    public void onNewToken(String string2) {
        OneSignalHmsEventBridge.onNewToken((Context)this, string2);
    }
}

