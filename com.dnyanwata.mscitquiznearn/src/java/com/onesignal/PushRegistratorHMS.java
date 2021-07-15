/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.huawei.agconnect.config.AGConnectServicesConfig
 *  com.huawei.hms.aaid.HmsInstanceId
 *  com.huawei.hms.common.ApiException
 *  com.onesignal.OSUtils
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.PushRegistrator
 *  com.onesignal.PushRegistrator$RegisteredHandler
 *  com.onesignal.PushRegistratorHMS$1
 *  java.lang.CharSequence
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistrator;
import com.onesignal.PushRegistratorHMS;

class PushRegistratorHMS
implements PushRegistrator {
    static final String HMS_CLIENT_APP_ID = "client/app_id";
    private static final int NEW_TOKEN_TIMEOUT_MS = 30000;
    private static boolean callbackSuccessful;
    private static PushRegistrator.RegisteredHandler registeredHandler;

    PushRegistratorHMS() {
    }

    static /* synthetic */ void access$000(PushRegistratorHMS pushRegistratorHMS, Context context, PushRegistrator.RegisteredHandler registeredHandler) throws ApiException {
        pushRegistratorHMS.getHMSTokenTask(context, registeredHandler);
    }

    private static void doTimeOutWait() {
        try {
            Thread.sleep((long)30000L);
        }
        catch (InterruptedException interruptedException) {}
    }

    static void fireCallback(String string2) {
        PushRegistrator.RegisteredHandler registeredHandler = PushRegistratorHMS.registeredHandler;
        if (registeredHandler == null) {
            return;
        }
        callbackSuccessful = true;
        registeredHandler.complete(string2, 1);
    }

    private void getHMSTokenTask(Context context, PushRegistrator.RegisteredHandler registeredHandler) throws ApiException {
        PushRegistratorHMS pushRegistratorHMS = this;
        synchronized (pushRegistratorHMS) {
            if (!OSUtils.hasAllHMSLibrariesForPushKit()) {
                registeredHandler.complete(null, -28);
                return;
            }
            String string2 = AGConnectServicesConfig.fromContext((Context)context).getString(HMS_CLIENT_APP_ID);
            String string3 = HmsInstanceId.getInstance((Context)context).getToken(string2, "HCM");
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Device registered for HMS, push token = ");
                stringBuilder.append(string3);
                OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                registeredHandler.complete(string3, 1);
            } else {
                this.waitForOnNewPushTokenEvent(registeredHandler);
            }
            return;
        }
    }

    public void registerForPush(Context context, String string2, PushRegistrator.RegisteredHandler registeredHandler) {
        PushRegistratorHMS.registeredHandler = registeredHandler;
        new Thread((Runnable)new 1(this, context, registeredHandler), "OS_HMS_GET_TOKEN").start();
    }

    void waitForOnNewPushTokenEvent(PushRegistrator.RegisteredHandler registeredHandler) {
        PushRegistratorHMS.doTimeOutWait();
        if (!callbackSuccessful) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"HmsMessageServiceOneSignal.onNewToken timed out.");
            registeredHandler.complete(null, -25);
        }
    }
}

