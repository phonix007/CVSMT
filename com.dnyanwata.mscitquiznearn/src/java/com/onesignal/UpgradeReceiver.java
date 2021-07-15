/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.onesignal.OSNotificationRestoreWorkManager
 */
package com.onesignal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.OSNotificationRestoreWorkManager;

public class UpgradeReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT == 24) {
            return;
        }
        OSNotificationRestoreWorkManager.beginEnqueueingWork((Context)context, (boolean)true);
    }
}

