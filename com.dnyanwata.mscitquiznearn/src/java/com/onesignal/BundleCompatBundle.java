/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  com.onesignal.BundleCompat
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.onesignal.BundleCompat;

class BundleCompatBundle
implements BundleCompat<Bundle> {
    private Bundle mBundle;

    BundleCompatBundle() {
        this.mBundle = new Bundle();
    }

    BundleCompatBundle(Intent intent) {
        this.mBundle = intent.getExtras();
    }

    BundleCompatBundle(Bundle bundle) {
        this.mBundle = bundle;
    }

    public boolean containsKey(String string) {
        return this.mBundle.containsKey(string);
    }

    public boolean getBoolean(String string) {
        return this.mBundle.getBoolean(string);
    }

    public boolean getBoolean(String string, boolean bl) {
        return this.mBundle.getBoolean(string, bl);
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public Integer getInt(String string) {
        return this.mBundle.getInt(string);
    }

    public Long getLong(String string) {
        return this.mBundle.getLong(string);
    }

    public String getString(String string) {
        return this.mBundle.getString(string);
    }

    public void putBoolean(String string, Boolean bl) {
        this.mBundle.putBoolean(string, bl.booleanValue());
    }

    public void putInt(String string, Integer n) {
        this.mBundle.putInt(string, n.intValue());
    }

    public void putLong(String string, Long l) {
        this.mBundle.putLong(string, l.longValue());
    }

    public void putString(String string, String string2) {
        this.mBundle.putString(string, string2);
    }

    public void setBundle(Parcelable parcelable) {
        this.mBundle = (Bundle)parcelable;
    }
}

