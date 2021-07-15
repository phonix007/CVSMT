/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  android.os.PersistableBundle
 *  com.onesignal.BundleCompat
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.os.Parcelable;
import android.os.PersistableBundle;
import com.onesignal.BundleCompat;

class BundleCompatPersistableBundle
implements BundleCompat<PersistableBundle> {
    private PersistableBundle mBundle;

    BundleCompatPersistableBundle() {
        this.mBundle = new PersistableBundle();
    }

    BundleCompatPersistableBundle(PersistableBundle persistableBundle) {
        this.mBundle = persistableBundle;
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

    public PersistableBundle getBundle() {
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
        this.mBundle = (PersistableBundle)parcelable;
    }
}

