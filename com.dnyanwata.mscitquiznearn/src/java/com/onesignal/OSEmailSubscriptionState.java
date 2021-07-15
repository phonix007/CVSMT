/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSObservable;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

public class OSEmailSubscriptionState
implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private String emailAddress;
    private String emailUserId;
    private OSObservable<Object, OSEmailSubscriptionState> observable = new OSObservable("changed", false);

    OSEmailSubscriptionState(boolean bl) {
        if (bl) {
            this.emailUserId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_ONESIGNAL_EMAIL_ID_LAST", null);
            this.emailAddress = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", null);
            return;
        }
        this.emailUserId = OneSignal.getEmailId();
        this.emailAddress = OneSignalStateSynchronizer.getEmailStateSynchronizer().getRegistrationId();
    }

    void clearEmailAndId() {
        boolean bl = this.emailUserId != null || this.emailAddress != null;
        this.emailUserId = null;
        this.emailAddress = null;
        if (bl) {
            this.observable.notifyChange(this);
        }
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

    boolean compare(OSEmailSubscriptionState oSEmailSubscriptionState) {
        String string2 = this.emailUserId;
        String string3 = "";
        if (string2 == null) {
            string2 = string3;
        }
        String string4 = oSEmailSubscriptionState.emailUserId;
        if (string4 == null) {
            string4 = string3;
        }
        if (string2.equals((Object)string4)) {
            String string5 = this.emailAddress;
            if (string5 == null) {
                string5 = string3;
            }
            String string6 = oSEmailSubscriptionState.emailAddress;
            if (string6 != null) {
                string3 = string6;
            }
            if (string5.equals((Object)string3)) {
                return false;
            }
        }
        return true;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getEmailUserId() {
        return this.emailUserId;
    }

    public OSObservable<Object, OSEmailSubscriptionState> getObservable() {
        return this.observable;
    }

    public boolean isSubscribed() {
        return this.emailUserId != null && this.emailAddress != null;
    }

    void persistAsFrom() {
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.emailUserId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.emailAddress);
    }

    void setEmailAddress(String string2) {
        boolean bl = true ^ string2.equals((Object)this.emailAddress);
        this.emailAddress = string2;
        if (bl) {
            this.observable.notifyChange(this);
        }
    }

    void setEmailUserId(String string2) {
        boolean bl = true;
        if (!(string2 == null ? this.emailUserId != null : !string2.equals((Object)this.emailUserId))) {
            bl = false;
        }
        this.emailUserId = string2;
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
            String string2 = this.emailUserId;
            if (string2 != null) {
                jSONObject.put("emailUserId", (Object)string2);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            String string3 = this.emailAddress;
            if (string3 != null) {
                jSONObject.put("emailAddress", (Object)string3);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", this.isSubscribed());
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

