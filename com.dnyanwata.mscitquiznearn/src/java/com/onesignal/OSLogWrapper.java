/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import com.onesignal.OSLogger;
import com.onesignal.OneSignal;

class OSLogWrapper
implements OSLogger {
    OSLogWrapper() {
    }

    public void debug(String string2) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)string2);
    }

    public void error(String string2) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)string2);
    }

    public void error(String string2, Throwable throwable) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)string2, (Throwable)throwable);
    }

    public void info(String string2) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.INFO, (String)string2);
    }

    public void verbose(String string2) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.VERBOSE, (String)string2);
    }

    public void warning(String string2) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.WARN, (String)string2);
    }
}

