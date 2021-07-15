/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSEmailSubscriptionState;
import com.onesignal.OSPermissionState;
import com.onesignal.OSSMSSubscriptionState;
import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

public class OSDeviceState {
    private final boolean areNotificationsEnabled;
    private final String emailAddress;
    private final boolean emailSubscribed;
    private final String emailUserId;
    private final boolean pushDisabled;
    private final String pushToken;
    private final String smsNumber;
    private final boolean smsSubscribed;
    private final String smsUserId;
    private final boolean subscribed;
    private final String userId;

    OSDeviceState(OSSubscriptionState oSSubscriptionState, OSPermissionState oSPermissionState, OSEmailSubscriptionState oSEmailSubscriptionState, OSSMSSubscriptionState oSSMSSubscriptionState) {
        this.areNotificationsEnabled = oSPermissionState.areNotificationsEnabled();
        this.pushDisabled = oSSubscriptionState.isPushDisabled();
        this.subscribed = oSSubscriptionState.isSubscribed();
        this.userId = oSSubscriptionState.getUserId();
        this.pushToken = oSSubscriptionState.getPushToken();
        this.emailUserId = oSEmailSubscriptionState.getEmailUserId();
        this.emailAddress = oSEmailSubscriptionState.getEmailAddress();
        this.emailSubscribed = oSEmailSubscriptionState.isSubscribed();
        this.smsUserId = oSSMSSubscriptionState.getSmsUserId();
        this.smsNumber = oSSMSSubscriptionState.getSMSNumber();
        this.smsSubscribed = oSSMSSubscriptionState.isSubscribed();
    }

    public boolean areNotificationsEnabled() {
        return this.areNotificationsEnabled;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getEmailUserId() {
        return this.emailUserId;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public String getSMSNumber() {
        return this.smsNumber;
    }

    public String getSMSUserId() {
        return this.smsUserId;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isEmailSubscribed() {
        return this.emailSubscribed;
    }

    public boolean isPushDisabled() {
        return this.pushDisabled;
    }

    public boolean isSMSSubscribed() {
        return this.smsSubscribed;
    }

    public boolean isSubscribed() {
        return this.subscribed;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.areNotificationsEnabled);
            jSONObject.put("isPushDisabled", this.pushDisabled);
            jSONObject.put("isSubscribed", this.subscribed);
            jSONObject.put("userId", (Object)this.userId);
            jSONObject.put("pushToken", (Object)this.pushToken);
            jSONObject.put("isEmailSubscribed", this.emailSubscribed);
            jSONObject.put("emailUserId", (Object)this.emailUserId);
            jSONObject.put("emailAddress", (Object)this.emailAddress);
            jSONObject.put("isSMSSubscribed", this.smsSubscribed);
            jSONObject.put("smsUserId", (Object)this.smsUserId);
            jSONObject.put("smsNumber", (Object)this.smsNumber);
            return jSONObject;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return jSONObject;
        }
    }
}

