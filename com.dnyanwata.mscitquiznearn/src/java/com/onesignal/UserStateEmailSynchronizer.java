/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignalStateSynchronizer
 *  com.onesignal.OneSignalStateSynchronizer$UserStateSynchronizerType
 *  com.onesignal.UserState
 *  com.onesignal.UserStateEmail
 *  com.onesignal.UserStateSecondaryChannelSynchronizer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStateEmail;
import com.onesignal.UserStateSecondaryChannelSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

class UserStateEmailSynchronizer
extends UserStateSecondaryChannelSynchronizer {
    UserStateEmailSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.EMAIL);
    }

    void fireUpdateFailure() {
        OneSignal.fireEmailUpdateFailure();
    }

    void fireUpdateSuccess(JSONObject jSONObject) {
        OneSignal.fireEmailUpdateSuccess();
    }

    protected String getAuthHashKey() {
        return "email_auth_hash";
    }

    protected String getChannelKey() {
        return "email";
    }

    protected int getDeviceType() {
        return 11;
    }

    protected String getId() {
        return OneSignal.getEmailId();
    }

    void logoutChannel() {
        OneSignal.saveEmailId((String)"");
        this.resetCurrentState();
        this.getToSyncUserState().removeFromSyncValues("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"email_auth_hash");
        arrayList.add((Object)"device_player_id");
        arrayList.add((Object)"external_user_id");
        this.getToSyncUserState().removeFromSyncValues((List)arrayList);
        this.getToSyncUserState().persistState();
        OneSignal.getEmailSubscriptionState().clearEmailAndId();
    }

    protected UserState newUserState(String string, boolean bl) {
        return new UserStateEmail(string, bl);
    }

    void saveChannelId(String string) {
        OneSignal.saveEmailId((String)string);
    }

    void updateIdDependents(String string) {
        OneSignal.updateEmailIdDependents((String)string);
    }
}

