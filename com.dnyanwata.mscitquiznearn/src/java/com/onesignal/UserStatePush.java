/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.ImmutableJSONObject
 *  com.onesignal.UserState
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 */
package com.onesignal;

import com.onesignal.ImmutableJSONObject;
import com.onesignal.UserState;
import org.json.JSONException;

class UserStatePush
extends UserState {
    UserStatePush(String string2, boolean bl) {
        super(string2, bl);
    }

    private int getNotificationTypes() {
        int n = this.getDependValues().optInt("subscribableStatus", 1);
        if (n < -2) {
            return n;
        }
        if (!this.getDependValues().optBoolean("androidPermission", true)) {
            return 0;
        }
        if (!this.getDependValues().optBoolean("userSubscribePref", true)) {
            return -2;
        }
        return 1;
    }

    protected void addDependFields() {
        try {
            this.putOnSyncValues("notification_types", (Object)this.getNotificationTypes());
        }
        catch (JSONException jSONException) {}
    }

    boolean isSubscribed() {
        return this.getNotificationTypes() > 0;
    }

    UserState newInstance(String string2) {
        return new UserStatePush(string2, false);
    }
}

