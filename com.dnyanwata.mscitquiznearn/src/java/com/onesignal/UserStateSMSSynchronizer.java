/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignalStateSynchronizer
 *  com.onesignal.OneSignalStateSynchronizer$UserStateSynchronizerType
 *  com.onesignal.UserState
 *  com.onesignal.UserStateSMS
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
import com.onesignal.UserStateSMS;
import com.onesignal.UserStateSecondaryChannelSynchronizer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class UserStateSMSSynchronizer
extends UserStateSecondaryChannelSynchronizer {
    UserStateSMSSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.SMS);
    }

    void fireUpdateFailure() {
        OneSignal.fireSMSUpdateFailure();
    }

    void fireUpdateSuccess(JSONObject jSONObject) {
        OneSignal.fireSMSUpdateSuccess((JSONObject)jSONObject);
    }

    protected String getAuthHashKey() {
        return "sms_auth_hash";
    }

    protected String getChannelKey() {
        return "sms_number";
    }

    protected int getDeviceType() {
        return 14;
    }

    protected String getId() {
        return OneSignal.getSMSId();
    }

    void logoutChannel() {
        this.saveChannelId("");
        this.resetCurrentState();
        this.getToSyncUserState().removeFromSyncValues("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"sms_auth_hash");
        arrayList.add((Object)"device_player_id");
        arrayList.add((Object)"external_user_id");
        this.getToSyncUserState().removeFromSyncValues((List)arrayList);
        this.getToSyncUserState().persistState();
        OneSignal.getSMSSubscriptionState().clearSMSAndId();
    }

    protected UserState newUserState(String string, boolean bl) {
        return new UserStateSMS(string, bl);
    }

    void saveChannelId(String string) {
        OneSignal.saveSMSId((String)string);
    }

    void updateIdDependents(String string) {
        OneSignal.updateSMSIdDependents((String)string);
    }
}

