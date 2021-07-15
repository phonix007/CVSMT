/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;

class DelayedConsentInitializationParameters {
    String appId;
    Context context;

    DelayedConsentInitializationParameters(Context context, String string) {
        this.context = context;
        this.appId = string;
    }
}

