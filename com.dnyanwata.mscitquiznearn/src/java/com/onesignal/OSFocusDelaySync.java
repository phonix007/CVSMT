/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.onesignal.FocusDelaySyncJobService
 *  com.onesignal.FocusDelaySyncService
 *  com.onesignal.OSBackgroundSync
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.FocusDelaySyncJobService;
import com.onesignal.FocusDelaySyncService;
import com.onesignal.OSBackgroundSync;
import com.onesignal.OneSignal;

class OSFocusDelaySync
extends OSBackgroundSync {
    private static final Object INSTANCE_LOCK = new Object();
    private static final long SYNC_AFTER_BG_DELAY_MS = 2000L;
    private static final int SYNC_TASK_ID = 2081862118;
    private static final String SYNC_TASK_THREAD_ID = "OS_FOCUS_SYNCSRV_BG_SYNC";
    private static OSFocusDelaySync sInstance;

    OSFocusDelaySync() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static OSFocusDelaySync getInstance() {
        Object object;
        if (sInstance != null) return sInstance;
        Object object2 = object = INSTANCE_LOCK;
        synchronized (object2) {
            if (sInstance != null) return sInstance;
            sInstance = new OSFocusDelaySync();
            return sInstance;
        }
    }

    protected Class getSyncServiceJobClass() {
        return FocusDelaySyncJobService.class;
    }

    protected Class getSyncServicePendingIntentClass() {
        return FocusDelaySyncService.class;
    }

    protected int getSyncTaskId() {
        return 2081862118;
    }

    protected String getSyncTaskThreadId() {
        return SYNC_TASK_THREAD_ID;
    }

    protected void scheduleSyncTask(Context context) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.VERBOSE, (String)"OSFocusDelaySync scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 2000");
        this.scheduleBackgroundSyncTask(context, 2000L);
    }
}

