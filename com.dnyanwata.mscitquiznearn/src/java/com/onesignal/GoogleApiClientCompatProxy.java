/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.common.api.GoogleApiClient
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.lang.reflect.Method;

class GoogleApiClientCompatProxy {
    private final GoogleApiClient googleApiClient;
    private final Class googleApiClientListenerClass;

    GoogleApiClientCompatProxy(GoogleApiClient googleApiClient) {
        this.googleApiClient = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke((Object)this.googleApiClient, new Object[0]);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke((Object)this.googleApiClient, new Object[0]);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    GoogleApiClient realInstance() {
        return this.googleApiClient;
    }
}

