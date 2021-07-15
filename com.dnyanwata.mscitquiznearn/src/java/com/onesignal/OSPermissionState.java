/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.OSObservable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import org.json.JSONObject;

public class OSPermissionState
implements Cloneable {
    private static final String ARE_NOTIFICATION_ENABLED_KEY = "areNotificationsEnabled";
    private static final String CHANGED_KEY = "changed";
    private boolean notificationsEnabled;
    private OSObservable<Object, OSPermissionState> observable = new OSObservable("changed", false);

    OSPermissionState(boolean bl) {
        if (bl) {
            this.notificationsEnabled = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
            return;
        }
        this.refreshAsTo();
    }

    private void setNotificationsEnabled(boolean bl) {
        boolean bl2 = this.notificationsEnabled != bl;
        this.notificationsEnabled = bl;
        if (bl2) {
            this.observable.notifyChange(this);
        }
    }

    public boolean areNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    protected Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    boolean compare(OSPermissionState oSPermissionState) {
        return this.notificationsEnabled != oSPermissionState.notificationsEnabled;
    }

    public OSObservable<Object, OSPermissionState> getObservable() {
        return this.observable;
    }

    void persistAsFrom() {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.notificationsEnabled);
    }

    void refreshAsTo() {
        this.setNotificationsEnabled(OSUtils.areNotificationsEnabled(OneSignal.appContext));
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ARE_NOTIFICATION_ENABLED_KEY, this.notificationsEnabled);
            return jSONObject;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return this.toJSONObject().toString();
    }
}

