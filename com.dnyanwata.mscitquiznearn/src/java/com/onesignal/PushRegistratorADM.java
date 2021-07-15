/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.onesignal.PushRegistrator
 *  com.onesignal.PushRegistrator$RegisteredHandler
 *  com.onesignal.PushRegistratorADM$1
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.PushRegistrator;
import com.onesignal.PushRegistratorADM;

public class PushRegistratorADM
implements PushRegistrator {
    private static boolean callbackSuccessful;
    private static PushRegistrator.RegisteredHandler registeredCallback;

    static /* synthetic */ boolean access$000() {
        return callbackSuccessful;
    }

    public static void fireCallback(String string2) {
        PushRegistrator.RegisteredHandler registeredHandler = registeredCallback;
        if (registeredHandler == null) {
            return;
        }
        callbackSuccessful = true;
        registeredHandler.complete(string2, 1);
    }

    public void registerForPush(Context context, String string2, PushRegistrator.RegisteredHandler registeredHandler) {
        registeredCallback = registeredHandler;
        new Thread((Runnable)new 1(this, context, registeredHandler)).start();
    }
}

