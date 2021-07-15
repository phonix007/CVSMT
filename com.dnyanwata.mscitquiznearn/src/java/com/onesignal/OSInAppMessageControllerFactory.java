/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package com.onesignal;

import android.os.Build;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSInAppMessageDummyController;
import com.onesignal.OSLogger;
import com.onesignal.OSTaskController;
import com.onesignal.OneSignalDbHelper;

class OSInAppMessageControllerFactory {
    private static final Object LOCK = new Object();
    private OSInAppMessageController controller;

    OSInAppMessageControllerFactory() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OSInAppMessageController getController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger) {
        Object object;
        if (this.controller != null) return this.controller;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (this.controller != null) return this.controller;
            this.controller = Build.VERSION.SDK_INT <= 18 ? new OSInAppMessageDummyController(null, oSTaskController, oSLogger) : new OSInAppMessageController(oneSignalDbHelper, oSTaskController, oSLogger);
            return this.controller;
        }
    }
}

