/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  com.onesignal.OSTime
 *  java.lang.Object
 *  java.lang.System
 */
package com.onesignal;

import android.os.SystemClock;
import com.onesignal.OSTime;

public class OSTimeImpl
implements OSTime {
    public long getCurrentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}

