/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSObservable;
import com.onesignal.OSPermissionState;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSubscriptionState
implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private boolean accepted;
    private OSObservable<Object, OSSubscriptionState> observable = new OSObservable("changed", false);
    private boolean pushDisabled;
    private String pushToken;
    private String userId;

    OSSubscriptionState(boolean bl, boolean bl2) {
        if (bl) {
            this.pushDisabled = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.userId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PLAYER_ID_LAST", null);
            this.pushToken = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PUSH_TOKEN_LAST", null);
            this.accepted = OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.pushDisabled = true ^ OneSignalStateSynchronizer.getUserSubscribePreference();
        this.userId = OneSignal.getUserId();
        this.pushToken = OneSignalStateSynchronizer.getRegistrationId();
        this.accepted = bl2;
    }

    private void setAccepted(boolean bl) {
        boolean bl2 = this.isSubscribed();
        this.accepted = bl;
        if (bl2 != this.isSubscribed()) {
            this.observable.notifyChange(this);
        }
    }

    void changed(OSPermissionState oSPermissionState) {
        this.setAccepted(oSPermissionState.areNotificationsEnabled());
    }

    protected Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    boolean compare(OSSubscriptionState oSSubscriptionState) {
        if (this.pushDisabled == oSSubscriptionState.pushDisabled) {
            String string2 = this.userId;
            String string3 = "";
            if (string2 == null) {
                string2 = string3;
            }
            String string4 = oSSubscriptionState.userId;
            if (string4 == null) {
                string4 = string3;
            }
            if (string2.equals((Object)string4)) {
                String string5 = this.pushToken;
                if (string5 == null) {
                    string5 = string3;
                }
                String string6 = oSSubscriptionState.pushToken;
                if (string6 != null) {
                    string3 = string6;
                }
                if (string5.equals((Object)string3) && this.accepted == oSSubscriptionState.accepted) {
                    return false;
                }
            }
        }
        return true;
    }

    public OSObservable<Object, OSSubscriptionState> getObservable() {
        return this.observable;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isPushDisabled() {
        return this.pushDisabled;
    }

    public boolean isSubscribed() {
        return this.userId != null && this.pushToken != null && !this.pushDisabled && this.accepted;
    }

    void persistAsFrom() {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_SUBSCRIPTION_LAST", this.pushDisabled);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PLAYER_ID_LAST", this.userId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PUSH_TOKEN_LAST", this.pushToken);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.accepted);
    }

    void setPushDisabled(boolean bl) {
        boolean bl2 = this.pushDisabled != bl;
        this.pushDisabled = bl;
        if (bl2) {
            this.observable.notifyChange(this);
        }
    }

    void setPushToken(String string2) {
        if (string2 == null) {
            return;
        }
        boolean bl = true ^ string2.equals((Object)this.pushToken);
        this.pushToken = string2;
        if (bl) {
            this.observable.notifyChange(this);
        }
    }

    void setUserId(String string2) {
        boolean bl = true;
        if (!(string2 == null ? this.userId != null : !string2.equals((Object)this.userId))) {
            bl = false;
        }
        this.userId = string2;
        if (bl) {
            this.observable.notifyChange(this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            String string2 = this.userId;
            if (string2 != null) {
                jSONObject.put("userId", (Object)string2);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            String string3 = this.pushToken;
            if (string3 != null) {
                jSONObject.put("pushToken", (Object)string3);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", this.isPushDisabled());
            jSONObject.put("isSubscribed", this.isSubscribed());
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return this.toJSONObject().toString();
    }
}

