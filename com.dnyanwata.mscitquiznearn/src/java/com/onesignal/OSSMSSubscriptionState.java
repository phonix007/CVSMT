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

public class OSSMSSubscriptionState
implements Cloneable {
    private static final String CHANGED_KEY = "changed";
    private static final String SMS_NUMBER = "smsNumber";
    private static final String SMS_USER_ID = "smsUserId";
    private static final String SUBSCRIBED = "isSubscribed";
    private OSObservable<Object, OSSMSSubscriptionState> observable = new OSObservable("changed", false);
    private String smsNumber;
    private String smsUserId;

    OSSMSSubscriptionState(boolean bl) {
        if (bl) {
            this.smsUserId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_ID_LAST", null);
            this.smsNumber = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_NUMBER_LAST", null);
            return;
        }
        this.smsUserId = OneSignal.getSMSId();
        this.smsNumber = OneSignalStateSynchronizer.getSMSStateSynchronizer().getRegistrationId();
    }

    void clearSMSAndId() {
        boolean bl = this.smsUserId != null || this.smsNumber != null;
        this.smsUserId = null;
        this.smsNumber = null;
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

    boolean compare(OSSMSSubscriptionState oSSMSSubscriptionState) {
        String string2 = this.smsUserId;
        String string3 = "";
        if (string2 == null) {
            string2 = string3;
        }
        String string4 = oSSMSSubscriptionState.smsUserId;
        if (string4 == null) {
            string4 = string3;
        }
        if (string2.equals((Object)string4)) {
            String string5 = this.smsNumber;
            if (string5 == null) {
                string5 = string3;
            }
            String string6 = oSSMSSubscriptionState.smsNumber;
            if (string6 != null) {
                string3 = string6;
            }
            if (string5.equals((Object)string3)) {
                return false;
            }
        }
        return true;
    }

    public OSObservable<Object, OSSMSSubscriptionState> getObservable() {
        return this.observable;
    }

    public String getSMSNumber() {
        return this.smsNumber;
    }

    public String getSmsUserId() {
        return this.smsUserId;
    }

    public boolean isSubscribed() {
        return this.smsUserId != null && this.smsNumber != null;
    }

    void persistAsFrom() {
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_ID_LAST", this.smsUserId);
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_NUMBER_LAST", this.smsNumber);
    }

    void setSMSNumber(String string2) {
        boolean bl = true ^ string2.equals((Object)this.smsNumber);
        this.smsNumber = string2;
        if (bl) {
            this.observable.notifyChange(this);
        }
    }

    void setSMSUserId(String string2) {
        boolean bl = true;
        if (!(string2 == null ? this.smsUserId != null : !string2.equals((Object)this.smsUserId))) {
            bl = false;
        }
        this.smsUserId = string2;
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
            String string2 = this.smsUserId;
            if (string2 != null) {
                jSONObject.put(SMS_USER_ID, (Object)string2);
            } else {
                jSONObject.put(SMS_USER_ID, JSONObject.NULL);
            }
            String string3 = this.smsNumber;
            if (string3 != null) {
                jSONObject.put(SMS_NUMBER, (Object)string3);
            } else {
                jSONObject.put(SMS_NUMBER, JSONObject.NULL);
            }
            jSONObject.put(SUBSCRIBED, this.isSubscribed());
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

