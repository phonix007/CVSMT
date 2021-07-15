/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  com.onesignal.ImmutableJSONObject
 *  com.onesignal.JSONUtils
 *  com.onesignal.LocationController
 *  com.onesignal.LocationController$LocationPoint
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.onesignal.ImmutableJSONObject;
import com.onesignal.JSONUtils;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserState;
import com.onesignal.UserStateSynchronizer;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSynchronizer {
    protected static final String ANDROID_PERMISSION = "androidPermission";
    static final String APP_ID = "app_id";
    private static final String CURRENT_STATE = "CURRENT_STATE";
    protected static final String DEVICE_PLAYER_ID = "device_player_id";
    protected static final String DEVICE_TYPE = "device_type";
    static final String EMAIL_AUTH_HASH_KEY = "email_auth_hash";
    protected static final String EMAIL_KEY = "email";
    private static final String ERRORS = "errors";
    protected static final String EXTERNAL_USER_ID = "external_user_id";
    static final String EXTERNAL_USER_ID_AUTH_HASH = "external_user_id_auth_hash";
    private static final String ID = "id";
    protected static final String IDENTIFIER = "identifier";
    protected static final String LOGOUT_EMAIL = "logoutEmail";
    protected static final String PARENT_PLAYER_ID = "parent_player_id";
    private static final String SESSION = "session";
    static final String SMS_AUTH_HASH_KEY = "sms_auth_hash";
    protected static final String SMS_NUMBER_KEY = "sms_number";
    protected static final String SUBSCRIBABLE_STATUS = "subscribableStatus";
    protected static final String TAGS = "tags";
    private static final String TOSYNC_STATE = "TOSYNC_STATE";
    protected static final String USER_SUBSCRIBE_PREF = "userSubscribePref";
    protected final Object LOCK = new Object();
    private boolean canMakeUpdates;
    private OneSignalStateSynchronizer.UserStateSynchronizerType channel;
    private UserState currentUserState;
    private final Queue<OneSignal.OSInternalExternalUserIdUpdateCompletionHandler> externalUserIdUpdateHandlers = new ConcurrentLinkedQueue();
    private final Object networkHandlerSyncLock = new Object(){};
    HashMap<Integer, NetworkHandlerThread> networkHandlerThreads = new HashMap();
    private AtomicBoolean runningSyncUserState = new AtomicBoolean();
    private final Queue<OneSignal.ChangeTagsUpdateHandler> sendTagsHandlers = new ConcurrentLinkedQueue();
    private UserState toSyncUserState;
    protected boolean waitingForSessionResponse = false;

    UserStateSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        this.channel = userStateSynchronizerType;
    }

    static /* synthetic */ void access$1000(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.sendTagsHandlersPerformOnSuccess();
    }

    static /* synthetic */ void access$1100(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.externalUserIdUpdateHandlersPerformOnSuccess();
    }

    static /* synthetic */ boolean access$300(UserStateSynchronizer userStateSynchronizer, int n, String string2, String string3) {
        return userStateSynchronizer.response400WithErrorsContaining(n, string2, string3);
    }

    static /* synthetic */ void access$400(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.logoutEmailSyncSuccess();
    }

    static /* synthetic */ void access$500(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.handlePlayerDeletedFromServer();
    }

    static /* synthetic */ void access$600(UserStateSynchronizer userStateSynchronizer, int n) {
        userStateSynchronizer.handleNetworkFailure(n);
    }

    static /* synthetic */ void access$700(UserStateSynchronizer userStateSynchronizer, OneSignal.SendTagsError sendTagsError) {
        userStateSynchronizer.sendTagsHandlersPerformOnFailure(sendTagsError);
    }

    static /* synthetic */ void access$800(UserStateSynchronizer userStateSynchronizer) {
        userStateSynchronizer.externalUserIdUpdateHandlersPerformOnFailure();
    }

    static /* synthetic */ UserState access$900(UserStateSynchronizer userStateSynchronizer) {
        return userStateSynchronizer.currentUserState;
    }

    private void doCreateOrNewSession(String string2, JSONObject jSONObject, JSONObject jSONObject2) {
        String string3;
        if (string2 == null) {
            string3 = "players";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("players/");
            stringBuilder.append(string2);
            stringBuilder.append("/on_session");
            string3 = stringBuilder.toString();
        }
        this.waitingForSessionResponse = true;
        this.addOnSessionOrCreateExtras(jSONObject);
        OneSignalRestClient.postSync(string3, jSONObject, new OneSignalRestClient.ResponseHandler(this, jSONObject2, jSONObject, string2){
            final /* synthetic */ UserStateSynchronizer this$0;
            final /* synthetic */ JSONObject val$dependDiff;
            final /* synthetic */ JSONObject val$jsonBody;
            final /* synthetic */ String val$userId;
            {
                this.this$0 = userStateSynchronizer;
                this.val$dependDiff = jSONObject;
                this.val$jsonBody = jSONObject2;
                this.val$userId = string2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            void onFailure(int n, String string2, java.lang.Throwable throwable) {
                Object object;
                Object object2 = object = this.this$0.LOCK;
                synchronized (object2) {
                    this.this$0.waitingForSessionResponse = false;
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.WARN;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed last request. statusCode: ");
                    stringBuilder.append(n);
                    stringBuilder.append("\nresponse: ");
                    stringBuilder.append(string2);
                    OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                    if (UserStateSynchronizer.access$300(this.this$0, n, string2, "not a valid device_type")) {
                        UserStateSynchronizer.access$500(this.this$0);
                    } else {
                        UserStateSynchronizer.access$600(this.this$0, n);
                    }
                    return;
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            void onSuccess(String string2) {
                Object object;
                Object object2 = object = this.this$0.LOCK;
                synchronized (object2) {
                    this.this$0.waitingForSessionResponse = false;
                    UserStateSynchronizer.access$900(this.this$0).persistStateAfterSync(this.val$dependDiff, this.val$jsonBody);
                    try {
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("doCreateOrNewSession:response: ");
                        stringBuilder.append(string2);
                        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                        JSONObject jSONObject = new JSONObject(string2);
                        if (jSONObject.has("id")) {
                            String string3 = jSONObject.optString("id");
                            this.this$0.updateIdDependents(string3);
                            OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.INFO;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Device registered, UserId = ");
                            stringBuilder2.append(string3);
                            OneSignal.Log(lOG_LEVEL2, stringBuilder2.toString());
                        } else {
                            OneSignal.LOG_LEVEL lOG_LEVEL3 = OneSignal.LOG_LEVEL.INFO;
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("session sent, UserId = ");
                            stringBuilder3.append(this.val$userId);
                            OneSignal.Log(lOG_LEVEL3, stringBuilder3.toString());
                        }
                        this.this$0.getUserStateForModification().putOnDependValues("session", false);
                        this.this$0.getUserStateForModification().persistState();
                        if (jSONObject.has("in_app_messages")) {
                            OneSignal.getInAppMessageController().receivedInAppMessageJson(jSONObject.getJSONArray("in_app_messages"));
                        }
                        this.this$0.onSuccessfulSync(this.val$jsonBody);
                    }
                    catch (JSONException jSONException) {
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "ERROR parsing on_session or create JSON Response.", jSONException);
                    }
                    return;
                }
            }
        });
    }

    private void doEmailLogout(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("players/");
        stringBuilder.append(string2);
        stringBuilder.append("/email_logout");
        String string3 = stringBuilder.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            ImmutableJSONObject immutableJSONObject;
            ImmutableJSONObject immutableJSONObject2 = this.currentUserState.getDependValues();
            if (immutableJSONObject2.has(EMAIL_AUTH_HASH_KEY)) {
                jSONObject.put(EMAIL_AUTH_HASH_KEY, (Object)immutableJSONObject2.optString(EMAIL_AUTH_HASH_KEY));
            }
            if ((immutableJSONObject = this.currentUserState.getSyncValues()).has(PARENT_PLAYER_ID)) {
                jSONObject.put(PARENT_PLAYER_ID, (Object)immutableJSONObject.optString(PARENT_PLAYER_ID));
            }
            jSONObject.put(APP_ID, (Object)immutableJSONObject.optString(APP_ID));
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        OneSignalRestClient.postSync(string3, jSONObject, new OneSignalRestClient.ResponseHandler(this){
            final /* synthetic */ UserStateSynchronizer this$0;
            {
                this.this$0 = userStateSynchronizer;
            }

            void onFailure(int n, String string2, java.lang.Throwable throwable) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.WARN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed last request. statusCode: ");
                stringBuilder.append(n);
                stringBuilder.append("\nresponse: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                if (UserStateSynchronizer.access$300(this.this$0, n, string2, "already logged out of email")) {
                    UserStateSynchronizer.access$400(this.this$0);
                    return;
                }
                if (UserStateSynchronizer.access$300(this.this$0, n, string2, "not a valid device_type")) {
                    UserStateSynchronizer.access$500(this.this$0);
                    return;
                }
                UserStateSynchronizer.access$600(this.this$0, n);
            }

            void onSuccess(String string2) {
                UserStateSynchronizer.access$400(this.this$0);
            }
        });
    }

    private void doPutSync(String string2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (string2 == null) {
            OneSignal.onesignalLog(this.getLogLevel(), "Error updating the user record because of the null user id");
            this.sendTagsHandlersPerformOnFailure(new OneSignal.SendTagsError(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            this.externalUserIdUpdateHandlersPerformOnFailure();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("players/");
        stringBuilder.append(string2);
        OneSignalRestClient.putSync(stringBuilder.toString(), jSONObject, new OneSignalRestClient.ResponseHandler(this, jSONObject, jSONObject2){
            final /* synthetic */ UserStateSynchronizer this$0;
            final /* synthetic */ JSONObject val$dependDiff;
            final /* synthetic */ JSONObject val$jsonBody;
            {
                this.this$0 = userStateSynchronizer;
                this.val$jsonBody = jSONObject;
                this.val$dependDiff = jSONObject2;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            void onFailure(int n, String string2, java.lang.Throwable throwable) {
                Object object;
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed PUT sync request with status code: ");
                stringBuilder.append(n);
                stringBuilder.append(" and response: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                Object object2 = object = this.this$0.LOCK;
                // MONITORENTER : object2
                if (UserStateSynchronizer.access$300(this.this$0, n, string2, "No user with this id found")) {
                    UserStateSynchronizer.access$500(this.this$0);
                } else {
                    UserStateSynchronizer.access$600(this.this$0, n);
                }
                // MONITOREXIT : object2
                if (this.val$jsonBody.has("tags")) {
                    UserStateSynchronizer.access$700(this.this$0, new OneSignal.SendTagsError(n, string2));
                }
                if (!this.val$jsonBody.has("external_user_id")) return;
                OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Error setting external user id for push with status code: ");
                stringBuilder2.append(n);
                stringBuilder2.append(" and message: ");
                stringBuilder2.append(string2);
                OneSignal.onesignalLog(lOG_LEVEL2, stringBuilder2.toString());
                UserStateSynchronizer.access$800(this.this$0);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            void onSuccess(String string2) {
                Object object;
                Object object2 = object = this.this$0.LOCK;
                // MONITORENTER : object2
                UserStateSynchronizer.access$900(this.this$0).persistStateAfterSync(this.val$dependDiff, this.val$jsonBody);
                this.this$0.onSuccessfulSync(this.val$jsonBody);
                // MONITOREXIT : object2
                if (this.val$jsonBody.has("tags")) {
                    UserStateSynchronizer.access$1000(this.this$0);
                }
                if (!this.val$jsonBody.has("external_user_id")) return;
                UserStateSynchronizer.access$1100(this.this$0);
            }
        });
    }

    private void externalUserIdUpdateHandlersPerformOnFailure() {
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler;
        while ((oSInternalExternalUserIdUpdateCompletionHandler = (OneSignal.OSInternalExternalUserIdUpdateCompletionHandler)this.externalUserIdUpdateHandlers.poll()) != null) {
            oSInternalExternalUserIdUpdateCompletionHandler.onComplete(this.getChannelString(), false);
        }
    }

    private void externalUserIdUpdateHandlersPerformOnSuccess() {
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler;
        while ((oSInternalExternalUserIdUpdateCompletionHandler = (OneSignal.OSInternalExternalUserIdUpdateCompletionHandler)this.externalUserIdUpdateHandlers.poll()) != null) {
            oSInternalExternalUserIdUpdateCompletionHandler.onComplete(this.getChannelString(), true);
        }
    }

    private void fireNetworkFailureEvents() {
        JSONObject jSONObject = this.currentUserState.generateJsonDiff(this.toSyncUserState, false);
        if (jSONObject != null) {
            this.fireEventsForUpdateFailure(jSONObject);
        }
        if (this.getToSyncUserState().getDependValues().optBoolean(LOGOUT_EMAIL, false)) {
            OneSignal.handleFailedEmailLogout();
        }
    }

    private void handleNetworkFailure(int n) {
        if (n == 403) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            this.fireNetworkFailureEvents();
            return;
        }
        if (!this.getNetworkHandlerThread(0).doRetry()) {
            this.fireNetworkFailureEvents();
        }
    }

    private void handlePlayerDeletedFromServer() {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.handleSuccessfulEmailLogout();
        this.resetCurrentState();
        this.updateIdDependents(null);
        this.scheduleSyncToServer();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void internalSyncUserState(boolean bl) {
        Object object;
        String string2 = this.getId();
        if (this.syncEmailLogout() && string2 != null) {
            this.doEmailLogout(string2);
            return;
        }
        if (this.currentUserState == null) {
            this.initUserState();
        }
        boolean bl2 = !bl && this.isSessionCall();
        Object object2 = object = this.LOCK;
        // MONITORENTER : object2
        JSONObject jSONObject = this.currentUserState.generateJsonDiff(this.getToSyncUserState(), bl2);
        UserState userState = this.getToSyncUserState();
        JSONObject jSONObject2 = this.currentUserState.generateJsonDiffFromDependValues(userState, null);
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserStateSynchronizer internalSyncUserState from session call: ");
        stringBuilder.append(bl2);
        stringBuilder.append(" jsonBody: ");
        stringBuilder.append((Object)jSONObject);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        if (jSONObject == null) {
            this.currentUserState.persistStateAfterSync(jSONObject2, null);
            this.sendTagsHandlersPerformOnSuccess();
            this.externalUserIdUpdateHandlersPerformOnSuccess();
            // MONITOREXIT : object2
            return;
        }
        this.getToSyncUserState().persistState();
        // MONITOREXIT : object2
        if (!bl2) {
            this.doPutSync(string2, jSONObject, jSONObject2);
            return;
        }
        this.doCreateOrNewSession(string2, jSONObject, jSONObject2);
    }

    private boolean isSessionCall() {
        return (this.getToSyncUserState().getDependValues().optBoolean(SESSION) || this.getId() == null) && !this.waitingForSessionResponse;
    }

    private void logoutEmailSyncSuccess() {
        this.getToSyncUserState().removeFromDependValues(LOGOUT_EMAIL);
        this.toSyncUserState.removeFromDependValues(EMAIL_AUTH_HASH_KEY);
        this.toSyncUserState.removeFromSyncValues(PARENT_PLAYER_ID);
        this.toSyncUserState.removeFromSyncValues(EMAIL_KEY);
        this.toSyncUserState.persistState();
        this.currentUserState.removeFromDependValues(EMAIL_AUTH_HASH_KEY);
        this.currentUserState.removeFromSyncValues(PARENT_PLAYER_ID);
        String string2 = this.currentUserState.getSyncValues().optString(EMAIL_KEY);
        this.currentUserState.removeFromSyncValues(EMAIL_KEY);
        OneSignalStateSynchronizer.setNewSessionForEmail();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Device successfully logged out of email: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        OneSignal.handleSuccessfulEmailLogout();
    }

    private boolean response400WithErrorsContaining(int n, String string2, String string3) {
        if (n == 400 && string2 != null) {
            boolean bl;
            block4 : {
                JSONObject jSONObject = new JSONObject(string2);
                boolean bl2 = jSONObject.has(ERRORS);
                bl = false;
                if (!bl2) break block4;
                try {
                    boolean bl3 = jSONObject.optString(ERRORS).contains((CharSequence)string3);
                    bl = false;
                    if (!bl3) break block4;
                    bl = true;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
            }
            return bl;
        }
        return false;
    }

    private void sendTagsHandlersPerformOnFailure(OneSignal.SendTagsError sendTagsError) {
        OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler;
        while ((changeTagsUpdateHandler = (OneSignal.ChangeTagsUpdateHandler)this.sendTagsHandlers.poll()) != null) {
            changeTagsUpdateHandler.onFailure(sendTagsError);
        }
    }

    private void sendTagsHandlersPerformOnSuccess() {
        OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler;
        JSONObject jSONObject = OneSignalStateSynchronizer.getTags((boolean)false).result;
        while ((changeTagsUpdateHandler = (OneSignal.ChangeTagsUpdateHandler)this.sendTagsHandlers.poll()) != null) {
            changeTagsUpdateHandler.onSuccess(jSONObject);
        }
    }

    private boolean syncEmailLogout() {
        return this.getToSyncUserState().getDependValues().optBoolean(LOGOUT_EMAIL, false);
    }

    protected abstract void addOnSessionOrCreateExtras(JSONObject var1);

    void clearLocation() {
        this.getToSyncUserState().clearLocation();
        this.getToSyncUserState().persistState();
    }

    protected abstract void fireEventsForUpdateFailure(JSONObject var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        Object object;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff((JSONObject)jSONObject, (JSONObject)jSONObject2, (JSONObject)jSONObject3, set);
        }
    }

    String getChannelString() {
        return this.channel.name().toLowerCase();
    }

    OneSignalStateSynchronizer.UserStateSynchronizerType getChannelType() {
        return this.channel;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected UserState getCurrentUserState() {
        Object object;
        if (this.currentUserState != null) return this.currentUserState;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            if (this.currentUserState != null) return this.currentUserState;
            this.currentUserState = this.newUserState("CURRENT_STATE", true);
            return this.currentUserState;
        }
    }

    abstract String getExternalId(boolean var1);

    protected abstract String getId();

    protected abstract OneSignal.LOG_LEVEL getLogLevel();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected NetworkHandlerThread getNetworkHandlerThread(Integer n) {
        Object object;
        Object object2 = object = this.networkHandlerSyncLock;
        synchronized (object2) {
            if (this.networkHandlerThreads.containsKey((Object)n)) return (NetworkHandlerThread)((Object)this.networkHandlerThreads.get((Object)n));
            this.networkHandlerThreads.put((Object)n, (Object)((Object)new NetworkHandlerThread(n)));
            return (NetworkHandlerThread)((Object)this.networkHandlerThreads.get((Object)n));
        }
    }

    String getRegistrationId() {
        return this.getToSyncUserState().getSyncValues().optString("identifier", null);
    }

    abstract boolean getSubscribed();

    boolean getSyncAsNewSession() {
        return this.getUserStateForModification().getDependValues().optBoolean("session");
    }

    abstract GetTagsResult getTags(boolean var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected UserState getToSyncUserState() {
        Object object;
        if (this.toSyncUserState != null) return this.toSyncUserState;
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            if (this.toSyncUserState != null) return this.toSyncUserState;
            this.toSyncUserState = this.newUserState("TOSYNC_STATE", true);
            return this.toSyncUserState;
        }
    }

    protected UserState getUserStateForModification() {
        if (this.toSyncUserState == null) {
            this.toSyncUserState = this.getCurrentUserState().deepClone("TOSYNC_STATE");
        }
        this.scheduleSyncToServer();
        return this.toSyncUserState;
    }

    public abstract boolean getUserSubscribePreference();

    boolean hasQueuedHandlers() {
        return this.externalUserIdUpdateHandlers.size() > 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void initUserState() {
        if (this.currentUserState == null) {
            Object object;
            Object object2 = object = this.LOCK;
            synchronized (object2) {
                if (this.currentUserState == null) {
                    this.currentUserState = this.newUserState("CURRENT_STATE", true);
                }
            }
        }
        this.getToSyncUserState();
    }

    abstract void logoutChannel();

    protected abstract UserState newUserState(String var1, boolean var2);

    protected abstract void onSuccessfulSync(JSONObject var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean persist() {
        Object object;
        if (this.toSyncUserState == null) {
            return false;
        }
        Object object2 = object = this.LOCK;
        synchronized (object2) {
            JSONObject jSONObject = this.getCurrentUserState().generateJsonDiff(this.toSyncUserState, this.isSessionCall());
            boolean bl = false;
            if (jSONObject != null) {
                bl = true;
            }
            this.toSyncUserState.persistState();
            return bl;
        }
    }

    void readyToUpdate(boolean bl) {
        boolean bl2 = this.canMakeUpdates != bl;
        this.canMakeUpdates = bl;
        if (bl2 && bl) {
            this.scheduleSyncToServer();
        }
    }

    void resetCurrentState() {
        this.currentUserState.setSyncValues(new JSONObject());
        this.currentUserState.persistState();
    }

    abstract void saveChannelId(String var1);

    protected abstract void scheduleSyncToServer();

    void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("players/");
        stringBuilder.append(this.getId());
        stringBuilder.append("/on_purchase");
        OneSignalRestClient.post(stringBuilder.toString(), jSONObject, responseHandler);
    }

    void sendTags(JSONObject jSONObject, OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (changeTagsUpdateHandler != null) {
            this.sendTagsHandlers.add((Object)changeTagsUpdateHandler);
        }
        this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, null);
    }

    void setExternalUserId(String string2, String string3, OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler) throws JSONException {
        if (oSInternalExternalUserIdUpdateCompletionHandler != null) {
            this.externalUserIdUpdateHandlers.add((Object)oSInternalExternalUserIdUpdateCompletionHandler);
        }
        UserState userState = this.getUserStateForModification();
        userState.putOnSyncValues("external_user_id", string2);
        if (string3 != null) {
            userState.putOnSyncValues("external_user_id_auth_hash", string3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void setNewSession() {
        try {
            Object object;
            Object object2 = object = this.LOCK;
            // MONITORENTER : object2
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
        this.getUserStateForModification().putOnDependValues("session", true);
        this.getUserStateForModification().persistState();
        // MONITOREXIT : object2
    }

    public abstract void setPermission(boolean var1);

    abstract void setSubscription(boolean var1);

    void syncHashedEmail(JSONObject jSONObject) {
        this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, null);
    }

    void syncUserState(boolean bl) {
        this.runningSyncUserState.set(true);
        this.internalSyncUserState(bl);
        this.runningSyncUserState.set(false);
    }

    void updateDeviceInfo(JSONObject jSONObject) {
        this.getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, null);
    }

    abstract void updateIdDependents(String var1);

    void updateLocation(LocationController.LocationPoint locationPoint) {
        this.getUserStateForModification().setLocation(locationPoint);
    }

    abstract void updateState(JSONObject var1);

    static class GetTagsResult {
        JSONObject result;
        boolean serverSuccess;

        GetTagsResult(boolean bl, JSONObject jSONObject) {
            this.serverSuccess = bl;
            this.result = jSONObject;
        }
    }

    class NetworkHandlerThread
    extends HandlerThread {
        static final int MAX_RETRIES = 3;
        static final int NETWORK_CALL_DELAY_TO_BUFFER_MS = 5000;
        protected static final int NETWORK_HANDLER_USERSTATE = 0;
        private static final String THREAD_NAME_PREFIX = "OSH_NetworkHandlerThread_";
        int currentRetry;
        Handler mHandler;
        int mType;

        NetworkHandlerThread(int n) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(THREAD_NAME_PREFIX);
            stringBuilder.append((Object)UserStateSynchronizer.this.channel);
            super(stringBuilder.toString());
            this.mType = n;
            this.start();
            this.mHandler = new Handler(this.getLooper());
        }

        private Runnable getNewRunnable() {
            if (this.mType != 0) {
                return null;
            }
            return new Runnable(){

                public void run() {
                    if (true ^ UserStateSynchronizer.this.runningSyncUserState.get()) {
                        UserStateSynchronizer.this.syncUserState(false);
                    }
                }
            };
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        boolean doRetry() {
            Handler handler;
            Handler handler2 = handler = this.mHandler;
            synchronized (handler2) {
                boolean bl = this.currentRetry < 3;
                boolean bl2 = this.mHandler.hasMessages(0);
                if (!bl) return this.mHandler.hasMessages(0);
                if (bl2) return this.mHandler.hasMessages(0);
                this.currentRetry = 1 + this.currentRetry;
                this.mHandler.postDelayed(this.getNewRunnable(), (long)(15000 * this.currentRetry));
                return this.mHandler.hasMessages(0);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void runNewJobDelayed() {
            Handler handler;
            if (!UserStateSynchronizer.this.canMakeUpdates) {
                return;
            }
            Handler handler2 = handler = this.mHandler;
            synchronized (handler2) {
                this.currentRetry = 0;
                this.mHandler.removeCallbacksAndMessages(null);
                this.mHandler.postDelayed(this.getNewRunnable(), 5000L);
                return;
            }
        }

        void stopScheduledRunnable() {
            this.mHandler.removeCallbacksAndMessages(null);
        }

    }

}

