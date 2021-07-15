/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.OneSignalRestClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignalRemoteParams {
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;
    private static final String DIRECT_PARAM = "direct";
    private static final String DISABLE_GMS_MISSING_PROMPT = "disable_gms_missing_prompt";
    private static final String ENABLED_PARAM = "enabled";
    private static final String FCM_API_KEY = "api_key";
    private static final String FCM_APP_ID = "app_id";
    private static final String FCM_PARENT_PARAM = "fcm";
    private static final String FCM_PROJECT_ID = "project_id";
    private static final String IAM_ATTRIBUTION_PARAM = "in_app_message_attribution";
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final String INDIRECT_PARAM = "indirect";
    private static final String LOCATION_SHARED = "location_shared";
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private static final String NOTIFICATION_ATTRIBUTION_PARAM = "notification_attribution";
    private static final String OUTCOMES_V2_SERVICE_PARAM = "v2_enabled";
    private static final String OUTCOME_PARAM = "outcomes";
    private static final String REQUIRES_USER_PRIVACY_CONSENT = "requires_user_privacy_consent";
    private static final String UNATTRIBUTED_PARAM = "unattributed";
    private static final String UNSUBSCRIBE_ON_NOTIFICATION_DISABLE = "unsubscribe_on_notifications_disabled";
    private static int androidParamsRetries;

    static /* synthetic */ int access$000() {
        return androidParamsRetries;
    }

    static /* synthetic */ int access$008() {
        int n = androidParamsRetries;
        androidParamsRetries = n + 1;
        return n;
    }

    static /* synthetic */ void access$100(String string2, Callback callback) {
        OneSignalRemoteParams.processJson(string2, callback);
    }

    static /* synthetic */ void access$200(JSONObject jSONObject, InfluenceParams influenceParams) {
        OneSignalRemoteParams.processOutcomeJson(jSONObject, influenceParams);
    }

    static void makeAndroidParamsRequest(String string2, String string3, Callback callback) {
        OneSignalRestClient.ResponseHandler responseHandler = new OneSignalRestClient.ResponseHandler(string2, string3, callback){
            final /* synthetic */ String val$appId;
            final /* synthetic */ Callback val$callback;
            final /* synthetic */ String val$userId;
            {
                this.val$appId = string2;
                this.val$userId = string3;
                this.val$callback = callback;
            }

            void onFailure(int n, String string2, Throwable throwable) {
                if (n == 403) {
                    OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error getting OneSignal params, omitting further retries!");
                    return;
                }
                new java.lang.Thread(new java.lang.Runnable(this){
                    final /* synthetic */ 1 this$0;
                    {
                        this.this$0 = var1_1;
                    }

                    public void run() {
                        int n = 30000 + 10000 * OneSignalRemoteParams.access$000();
                        if (n > 90000) {
                            n = 90000;
                        }
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to get Android parameters, trying again in ");
                        stringBuilder.append(n / 1000);
                        stringBuilder.append(" seconds.");
                        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                        com.onesignal.OSUtils.sleep(n);
                        OneSignalRemoteParams.access$008();
                        OneSignalRemoteParams.makeAndroidParamsRequest(this.this$0.val$appId, this.this$0.val$userId, this.this$0.val$callback);
                    }
                }, "OS_PARAMS_REQUEST").start();
            }

            void onSuccess(String string2) {
                OneSignalRemoteParams.access$100(string2, this.val$callback);
            }
        };
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("apps/");
        stringBuilder.append(string2);
        stringBuilder.append("/android_params.js");
        String string4 = stringBuilder.toString();
        if (string3 != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string4);
            stringBuilder2.append("?player_id=");
            stringBuilder2.append(string3);
            string4 = stringBuilder2.toString();
        }
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Starting request to get Android parameters.");
        OneSignalRestClient.get(string4, responseHandler, "CACHE_KEY_REMOTE_PARAMS");
    }

    private static void processJson(String string2, Callback callback) {
        void var3_5;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(string2);
        }
        catch (JSONException jSONException) {
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        callback.complete(new Params(jSONObject){
            final /* synthetic */ JSONObject val$responseJson;
            {
                this.val$responseJson = jSONObject;
                this.enterprise = jSONObject.optBoolean("enterp", false);
                this.useEmailAuth = jSONObject.optBoolean("require_email_auth", false);
                this.useUserIdAuth = jSONObject.optBoolean("require_user_id_auth", false);
                this.notificationChannels = jSONObject.optJSONArray("chnl_lst");
                this.firebaseAnalytics = jSONObject.optBoolean("fba", false);
                this.restoreTTLFilter = jSONObject.optBoolean("restore_ttl_filter", true);
                this.googleProjectNumber = jSONObject.optString("android_sender_id", null);
                this.clearGroupOnSummaryClick = jSONObject.optBoolean("clear_group_on_summary_click", true);
                this.receiveReceiptEnabled = jSONObject.optBoolean("receive_receipts_enable", false);
                this.disableGMSMissingPrompt = jSONObject.optBoolean("disable_gms_missing_prompt", false);
                Boolean bl = !jSONObject.has("unsubscribe_on_notifications_disabled") ? null : Boolean.valueOf((boolean)jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
                this.unsubscribeWhenNotificationsDisabled = bl;
                Boolean bl2 = !jSONObject.has("location_shared") ? null : Boolean.valueOf((boolean)jSONObject.optBoolean("location_shared", true));
                this.locationShared = bl2;
                Boolean bl3 = !jSONObject.has("requires_user_privacy_consent") ? null : Boolean.valueOf((boolean)jSONObject.optBoolean("requires_user_privacy_consent", false));
                this.requiresUserPrivacyConsent = bl3;
                this.influenceParams = new InfluenceParams();
                if (jSONObject.has("outcomes")) {
                    OneSignalRemoteParams.access$200(jSONObject.optJSONObject("outcomes"), this.influenceParams);
                }
                this.fcmParams = new FCMParams();
                if (jSONObject.has("fcm")) {
                    JSONObject jSONObject2 = jSONObject.optJSONObject("fcm");
                    this.fcmParams.apiKey = jSONObject2.optString("api_key", null);
                    this.fcmParams.appId = jSONObject2.optString("app_id", null);
                    this.fcmParams.projectId = jSONObject2.optString("project_id", null);
                }
            }
        });
        return;
        OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "Error parsing android_params!: ", (Throwable)var3_5);
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.FATAL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Response that errored from android_params!: ");
        stringBuilder.append(string2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    private static void processOutcomeJson(JSONObject jSONObject, InfluenceParams influenceParams) {
        if (jSONObject.has(OUTCOMES_V2_SERVICE_PARAM)) {
            influenceParams.outcomesV2ServiceEnabled = jSONObject.optBoolean(OUTCOMES_V2_SERVICE_PARAM);
        }
        if (jSONObject.has(DIRECT_PARAM)) {
            influenceParams.directEnabled = jSONObject.optJSONObject(DIRECT_PARAM).optBoolean(ENABLED_PARAM);
        }
        if (jSONObject.has(INDIRECT_PARAM)) {
            JSONObject jSONObject2 = jSONObject.optJSONObject(INDIRECT_PARAM);
            influenceParams.indirectEnabled = jSONObject2.optBoolean(ENABLED_PARAM);
            if (jSONObject2.has(NOTIFICATION_ATTRIBUTION_PARAM)) {
                JSONObject jSONObject3 = jSONObject2.optJSONObject(NOTIFICATION_ATTRIBUTION_PARAM);
                influenceParams.indirectNotificationAttributionWindow = jSONObject3.optInt("minutes_since_displayed", 1440);
                influenceParams.notificationLimit = jSONObject3.optInt("limit", 10);
            }
            if (jSONObject2.has(IAM_ATTRIBUTION_PARAM)) {
                JSONObject jSONObject4 = jSONObject2.optJSONObject(IAM_ATTRIBUTION_PARAM);
                influenceParams.indirectIAMAttributionWindow = jSONObject4.optInt("minutes_since_displayed", 1440);
                influenceParams.iamLimit = jSONObject4.optInt("limit", 10);
            }
        }
        if (jSONObject.has(UNATTRIBUTED_PARAM)) {
            influenceParams.unattributedEnabled = jSONObject.optJSONObject(UNATTRIBUTED_PARAM).optBoolean(ENABLED_PARAM);
        }
    }

    static interface Callback {
        public void complete(Params var1);
    }

    static class FCMParams {
        String apiKey;
        String appId;
        String projectId;

        FCMParams() {
        }
    }

    public static class InfluenceParams {
        boolean directEnabled = false;
        int iamLimit = 10;
        boolean indirectEnabled = false;
        int indirectIAMAttributionWindow = 1440;
        int indirectNotificationAttributionWindow = 1440;
        int notificationLimit = 10;
        boolean outcomesV2ServiceEnabled = false;
        boolean unattributedEnabled = false;

        public int getIamLimit() {
            return this.iamLimit;
        }

        public int getIndirectIAMAttributionWindow() {
            return this.indirectIAMAttributionWindow;
        }

        public int getIndirectNotificationAttributionWindow() {
            return this.indirectNotificationAttributionWindow;
        }

        public int getNotificationLimit() {
            return this.notificationLimit;
        }

        public boolean isDirectEnabled() {
            return this.directEnabled;
        }

        public boolean isIndirectEnabled() {
            return this.indirectEnabled;
        }

        public boolean isUnattributedEnabled() {
            return this.unattributedEnabled;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("InfluenceParams{indirectNotificationAttributionWindow=");
            stringBuilder.append(this.indirectNotificationAttributionWindow);
            stringBuilder.append(", notificationLimit=");
            stringBuilder.append(this.notificationLimit);
            stringBuilder.append(", indirectIAMAttributionWindow=");
            stringBuilder.append(this.indirectIAMAttributionWindow);
            stringBuilder.append(", iamLimit=");
            stringBuilder.append(this.iamLimit);
            stringBuilder.append(", directEnabled=");
            stringBuilder.append(this.directEnabled);
            stringBuilder.append(", indirectEnabled=");
            stringBuilder.append(this.indirectEnabled);
            stringBuilder.append(", unattributedEnabled=");
            stringBuilder.append(this.unattributedEnabled);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    static class Params {
        boolean clearGroupOnSummaryClick;
        boolean disableGMSMissingPrompt;
        boolean enterprise;
        FCMParams fcmParams;
        boolean firebaseAnalytics;
        String googleProjectNumber;
        InfluenceParams influenceParams;
        Boolean locationShared;
        JSONArray notificationChannels;
        boolean receiveReceiptEnabled;
        Boolean requiresUserPrivacyConsent;
        boolean restoreTTLFilter;
        Boolean unsubscribeWhenNotificationsDisabled;
        boolean useEmailAuth;
        boolean useSMSAuth;
        boolean useUserIdAuth;

        Params() {
        }
    }

}

