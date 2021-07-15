/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.ImmutableJSONObject
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.OneSignalStateSynchronizer
 *  com.onesignal.OneSignalStateSynchronizer$UserStateSynchronizerType
 *  com.onesignal.UserState
 *  com.onesignal.UserStateSynchronizer
 *  com.onesignal.UserStateSynchronizer$GetTagsResult
 *  com.onesignal.UserStateSynchronizer$NetworkHandlerThread
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.ImmutableJSONObject;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStateSynchronizer;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSecondaryChannelSynchronizer
extends UserStateSynchronizer {
    UserStateSecondaryChannelSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        super(userStateSynchronizerType);
    }

    protected void addOnSessionOrCreateExtras(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", this.getDeviceType());
            jSONObject.putOpt("device_player_id", (Object)OneSignal.getUserId());
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    protected void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            this.fireUpdateFailure();
        }
    }

    abstract void fireUpdateFailure();

    abstract void fireUpdateSuccess(JSONObject var1);

    protected abstract String getAuthHashKey();

    protected abstract String getChannelKey();

    protected abstract int getDeviceType();

    String getExternalId(boolean bl) {
        return null;
    }

    protected abstract String getId();

    protected OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.INFO;
    }

    boolean getSubscribed() {
        return false;
    }

    UserStateSynchronizer.GetTagsResult getTags(boolean bl) {
        return null;
    }

    public boolean getUserSubscribePreference() {
        return false;
    }

    abstract void logoutChannel();

    protected abstract UserState newUserState(String var1, boolean var2);

    protected void onSuccessfulSync(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(this.getChannelKey(), jSONObject.get("identifier"));
                if (jSONObject.has(this.getAuthHashKey())) {
                    jSONObject2.put(this.getAuthHashKey(), jSONObject.get(this.getAuthHashKey()));
                }
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            this.fireUpdateSuccess(jSONObject2);
        }
    }

    void refresh() {
        this.scheduleSyncToServer();
    }

    protected void scheduleSyncToServer() {
        boolean bl = this.getId() == null && this.getRegistrationId() == null;
        if (!bl) {
            if (OneSignal.getUserId() == null) {
                return;
            }
            this.getNetworkHandlerThread(Integer.valueOf((int)0)).runNewJobDelayed();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void setChannelId(String string2, String string3) {
        String string4;
        String string5;
        UserState userState = this.getUserStateForModification();
        ImmutableJSONObject immutableJSONObject = userState.getSyncValues();
        boolean bl = string2.equals((Object)immutableJSONObject.optString("identifier")) && (string4 = immutableJSONObject.optString(this.getAuthHashKey())).equals((Object)(string5 = string3 == null ? "" : string3));
        if (bl) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(this.getChannelKey(), (Object)string2);
                jSONObject.put(this.getAuthHashKey(), (Object)string3);
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            this.fireUpdateSuccess(jSONObject);
            return;
        }
        String string6 = immutableJSONObject.optString("identifier", null);
        if (string6 == null) {
            this.setNewSession();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("identifier", (Object)string2);
            if (string3 != null) {
                jSONObject.put(this.getAuthHashKey(), (Object)string3);
            }
            if (string3 == null && string6 != null && !string6.equals((Object)string2)) {
                this.saveChannelId("");
                this.resetCurrentState();
                this.setNewSession();
            }
            userState.generateJsonDiffFromIntoSyncValued(jSONObject, null);
            this.scheduleSyncToServer();
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public void setPermission(boolean bl) {
    }

    void setSubscription(boolean bl) {
    }

    abstract void updateIdDependents(String var1);

    void updateState(JSONObject jSONObject) {
    }
}

