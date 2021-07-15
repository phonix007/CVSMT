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

public interface PushRegistrator {
    public void registerForPush(Context var1, String var2, RegisteredHandler var3);

    public static interface RegisteredHandler {
        public void complete(String var1, int var2);
    }

}

