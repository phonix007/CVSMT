/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.os.Parcelable;

public interface BundleCompat<T> {
    public boolean containsKey(String var1);

    public boolean getBoolean(String var1);

    public boolean getBoolean(String var1, boolean var2);

    public T getBundle();

    public Integer getInt(String var1);

    public Long getLong(String var1);

    public String getString(String var1);

    public void putBoolean(String var1, Boolean var2);

    public void putInt(String var1, Integer var2);

    public void putLong(String var1, Long var2);

    public void putString(String var1, String var2);

    public void setBundle(Parcelable var1);
}

