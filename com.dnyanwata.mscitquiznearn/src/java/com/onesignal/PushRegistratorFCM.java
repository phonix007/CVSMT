/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.FirebaseOptions
 *  com.google.firebase.FirebaseOptions$Builder
 *  com.google.firebase.iid.FirebaseInstanceId
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignalRemoteParams
 *  com.onesignal.OneSignalRemoteParams$FCMParams
 *  com.onesignal.OneSignalRemoteParams$Params
 *  com.onesignal.PushRegistratorAbstractGoogle
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import android.content.Context;
import android.util.Base64;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.FirebaseInstanceId;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.PushRegistratorAbstractGoogle;

class PushRegistratorFCM
extends PushRegistratorAbstractGoogle {
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";
    private FirebaseApp firebaseApp;

    PushRegistratorFCM() {
    }

    private static String getApiKey(OneSignalRemoteParams.Params params) {
        if (params.fcmParams.apiKey != null) {
            return params.fcmParams.apiKey;
        }
        return new String(Base64.decode((String)FCM_DEFAULT_API_KEY_BASE64, (int)0));
    }

    private static String getAppId(OneSignalRemoteParams.Params params) {
        if (params.fcmParams.appId != null) {
            return params.fcmParams.appId;
        }
        return FCM_DEFAULT_APP_ID;
    }

    private static String getProjectId(OneSignalRemoteParams.Params params) {
        if (params.fcmParams.projectId != null) {
            return params.fcmParams.projectId;
        }
        return FCM_DEFAULT_PROJECT_ID;
    }

    private void initFirebaseApp(String string) {
        if (this.firebaseApp != null) {
            return;
        }
        OneSignalRemoteParams.Params params = OneSignal.getRemoteParams();
        FirebaseOptions firebaseOptions = new FirebaseOptions.Builder().setGcmSenderId(string).setApplicationId(PushRegistratorFCM.getAppId(params)).setApiKey(PushRegistratorFCM.getApiKey(params)).setProjectId(PushRegistratorFCM.getProjectId(params)).build();
        this.firebaseApp = FirebaseApp.initializeApp((Context)OneSignal.appContext, (FirebaseOptions)firebaseOptions, (String)FCM_APP_NAME);
    }

    String getProviderName() {
        return "FCM";
    }

    String getToken(String string) throws Throwable {
        this.initFirebaseApp(string);
        return FirebaseInstanceId.getInstance((FirebaseApp)this.firebaseApp).getToken(string, "FCM");
    }
}

