/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.onesignal.OneSignal;

class OSTimeoutHandler
extends HandlerThread {
    private static final Object SYNC_LOCK = new Object();
    private static final String TAG = "com.onesignal.OSTimeoutHandler";
    private static OSTimeoutHandler timeoutHandler;
    private final Handler mHandler;

    private OSTimeoutHandler() {
        super(TAG);
        this.start();
        this.mHandler = new Handler(this.getLooper());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static OSTimeoutHandler getTimeoutHandler() {
        Object object;
        if (timeoutHandler != null) return timeoutHandler;
        Object object2 = object = SYNC_LOCK;
        synchronized (object2) {
            if (timeoutHandler != null) return timeoutHandler;
            timeoutHandler = new OSTimeoutHandler();
            return timeoutHandler;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void destroyTimeout(Runnable runnable) {
        Object object;
        Object object2 = object = SYNC_LOCK;
        synchronized (object2) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Running destroyTimeout with runnable: ");
            stringBuilder.append(runnable.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.mHandler.removeCallbacks(runnable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void startTimeout(long l, Runnable runnable) {
        Object object;
        Object object2 = object = SYNC_LOCK;
        synchronized (object2) {
            this.destroyTimeout(runnable);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Running startTimeout with timeout: ");
            stringBuilder.append(l);
            stringBuilder.append(" and runnable: ");
            stringBuilder.append(runnable.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.mHandler.postDelayed(runnable, l);
            return;
        }
    }
}

