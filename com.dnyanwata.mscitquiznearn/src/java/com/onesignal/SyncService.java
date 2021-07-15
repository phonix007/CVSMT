/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.IBinder
 *  java.lang.Runnable
 */
package com.onesignal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.OSSyncService;

public class SyncService
extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int n, int n2) {
        OSSyncService.getInstance().doBackgroundSync((Context)this, (Runnable)new OSSyncService.LegacySyncRunnable(this));
        return 1;
    }
}

