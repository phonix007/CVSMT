/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.ImmutableJSONObject
 *  com.onesignal.JSONUtils
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  com.onesignal.OneSignalStateSynchronizer
 *  com.onesignal.OneSignalStateSynchronizer$UserStateSynchronizerType
 *  com.onesignal.UserState
 *  com.onesignal.UserStateSynchronizer
 *  com.onesignal.UserStateSynchronizer$GetTagsResult
 *  com.onesignal.UserStateSynchronizer$NetworkHandlerThread
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.ImmutableJSONObject;
import com.onesignal.JSONUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStatePush;
import com.onesignal.UserStateSynchronizer;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class UserStatePushSynchronizer
extends UserStateSynchronizer {
    private static boolean serverSuccess;

    UserStatePushSynchronizer() {
        super(OneSignalStateSynchronizer.UserStateSynchronizerType.PUSH);
    }

    protected void addOnSessionOrCreateExtras(JSONObject jSONObject) {
    }

    protected void fireEventsForUpdateFailure(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            OneSignal.fireEmailUpdateFailure();
        }
        if (jSONObject.has("sms_number")) {
            OneSignal.fireSMSUpdateFailure();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String getExternalId(boolean bl) {
        Object object;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            return this.getToSyncUserState().getSyncValues().optString("external_user_id", null);
        }
    }

    protected String getId() {
        return OneSignal.getUserId();
    }

    protected OneSignal.LOG_LEVEL getLogLevel() {
        return OneSignal.LOG_LEVEL.ERROR;
    }

    boolean getSubscribed() {
        return this.getToSyncUserState().isSubscribed();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    UserStateSynchronizer.GetTagsResult getTags(boolean bl) {
        Object object;
        if (bl) {
            String string2 = OneSignal.getUserId();
            String string3 = OneSignal.getSavedAppId();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("players/");
            stringBuilder.append(string2);
            stringBuilder.append("?app_id=");
            stringBuilder.append(string3);
            OneSignalRestClient.getSync((String)stringBuilder.toString(), (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Converted monitor instructions to comments
                 * Lifted jumps to return sites
                 */
                void onSuccess(String string2) {
                    UserStatePushSynchronizer userStatePushSynchronizer;
                    JSONObject jSONObject;
                    serverSuccess = true;
                    if (string2 == null || string2.isEmpty()) {
                        string2 = "{}";
                    }
                    try {
                        Object object;
                        jSONObject = new JSONObject(string2);
                        if (!jSONObject.has("tags")) return;
                        Object object2 = object = UserStatePushSynchronizer.this.LOCK;
                        // MONITORENTER : object2
                        userStatePushSynchronizer = UserStatePushSynchronizer.this;
                    }
                    catch (JSONException jSONException) {
                        jSONException.printStackTrace();
                    }
                    JSONObject jSONObject2 = userStatePushSynchronizer.generateJsonDiff(userStatePushSynchronizer.getCurrentUserState().getSyncValues().optJSONObject("tags"), UserStatePushSynchronizer.this.getToSyncUserState().getSyncValues().optJSONObject("tags"), null, null);
                    UserStatePushSynchronizer.this.getCurrentUserState().putOnSyncValues("tags", (Object)jSONObject.optJSONObject("tags"));
                    UserStatePushSynchronizer.this.getCurrentUserState().persistState();
                    UserStatePushSynchronizer.this.getToSyncUserState().mergeTags(jSONObject, jSONObject2);
                    UserStatePushSynchronizer.this.getToSyncUserState().persistState();
                    // MONITOREXIT : object2
                    return;
                }
            }, (String)"CACHE_KEY_GET_TAGS");
        }
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            return new UserStateSynchronizer.GetTagsResult(serverSuccess, JSONUtils.getJSONObjectWithoutBlankValues((ImmutableJSONObject)this.getToSyncUserState().getSyncValues(), (String)"tags"));
        }
    }

    public boolean getUserSubscribePreference() {
        return this.getToSyncUserState().getDependValues().optBoolean("userSubscribePref", true);
    }

    void logoutChannel() {
    }

    void logoutEmail() {
        try {
            this.getUserStateForModification().putOnDependValues("logoutEmail", (Object)true);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    void logoutSMS() {
        UserState userState = this.getToSyncUserState();
        userState.removeFromDependValues("sms_auth_hash");
        userState.removeFromSyncValues("sms_number");
        userState.persistState();
        UserState userState2 = this.getCurrentUserState();
        userState2.removeFromDependValues("sms_auth_hash");
        String string2 = userState2.getSyncValues().optString("sms_number");
        userState2.removeFromSyncValues("sms_number");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sms_number", (Object)string2);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device successfully logged out of SMS number: ");
        stringBuilder.append((Object)jSONObject);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        OneSignal.handleSuccessfulSMSlLogout((JSONObject)jSONObject);
    }

    protected UserState newUserState(String string2, boolean bl) {
        return new UserStatePush(string2, bl);
    }

    protected void onSuccessfulSync(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            OneSignal.fireEmailUpdateSuccess();
        }
        if (jSONObject.has("sms_number")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("sms_number", jSONObject.get("sms_number"));
                if (jSONObject.has("sms_auth_hash")) {
                    jSONObject2.put("sms_auth_hash", jSONObject.get("sms_auth_hash"));
                }
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            OneSignal.fireSMSUpdateSuccess((JSONObject)jSONObject2);
        }
    }

    void saveChannelId(String string2) {
        OneSignal.saveUserId((String)string2);
    }

    protected void scheduleSyncToServer() {
        this.getNetworkHandlerThread(Integer.valueOf((int)0)).runNewJobDelayed();
    }

    void setEmail(String string2, String string3) {
        try {
            UserState userState = this.getUserStateForModification();
            userState.putOnDependValues("email_auth_hash", (Object)string3);
            userState.generateJsonDiffFromIntoSyncValued(new JSONObject().put("email", (Object)string2), null);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public void setPermission(boolean bl) {
        try {
            this.getUserStateForModification().putOnDependValues("androidPermission", (Object)bl);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    void setSMSNumber(String string2, String string3) {
        try {
            UserState userState = this.getUserStateForModification();
            userState.putOnDependValues("sms_auth_hash", (Object)string3);
            userState.generateJsonDiffFromIntoSyncValued(new JSONObject().put("sms_number", (Object)string2), null);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    void setSubscription(boolean bl) {
        try {
            this.getUserStateForModification().putOnDependValues("userSubscribePref", (Object)bl);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    void updateIdDependents(String string2) {
        OneSignal.updateUserIdDependents((String)string2);
    }

    void updateState(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", (Object)jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", (Object)jSONObject.optString("parent_player_id", null));
            this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject2, null);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            this.getUserStateForModification().generateJsonDiffFromIntoDependValues(jSONObject3, null);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

}

