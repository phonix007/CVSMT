/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

public interface OneSignalApiResponseHandler {
    public void onFailure(int var1, String var2, Throwable var3);

    public void onSuccess(String var1);
}

