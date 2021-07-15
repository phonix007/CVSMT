/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.LocationController
 *  com.onesignal.LocationController$LocationPoint
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.UserStateEmailSynchronizer;
import com.onesignal.UserStatePushSynchronizer;
import com.onesignal.UserStateSMSSynchronizer;
import com.onesignal.UserStateSynchronizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class OneSignalStateSynchronizer {
    private static HashMap<UserStateSynchronizerType, UserStateSynchronizer> userStateSynchronizers = new HashMap();

    OneSignalStateSynchronizer() {
    }

    static /* synthetic */ HashMap access$000() {
        return userStateSynchronizers;
    }

    static void clearLocation() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().clearLocation();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().clearLocation();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().clearLocation();
    }

    static UserStateEmailSynchronizer getEmailStateSynchronizer() {
        if (!userStateSynchronizers.containsKey((Object)UserStateSynchronizerType.EMAIL) || userStateSynchronizers.get((Object)UserStateSynchronizerType.EMAIL) == null) {
            userStateSynchronizers.put((Object)UserStateSynchronizerType.EMAIL, (Object)new UserStateEmailSynchronizer());
        }
        return (UserStateEmailSynchronizer)userStateSynchronizers.get((Object)UserStateSynchronizerType.EMAIL);
    }

    static UserStatePushSynchronizer getPushStateSynchronizer() {
        if (!userStateSynchronizers.containsKey((Object)UserStateSynchronizerType.PUSH) || userStateSynchronizers.get((Object)UserStateSynchronizerType.PUSH) == null) {
            userStateSynchronizers.put((Object)UserStateSynchronizerType.PUSH, (Object)new UserStatePushSynchronizer());
        }
        return (UserStatePushSynchronizer)userStateSynchronizers.get((Object)UserStateSynchronizerType.PUSH);
    }

    static String getRegistrationId() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getRegistrationId();
    }

    static UserStateSMSSynchronizer getSMSStateSynchronizer() {
        if (!userStateSynchronizers.containsKey((Object)UserStateSynchronizerType.SMS) || userStateSynchronizers.get((Object)UserStateSynchronizerType.SMS) == null) {
            userStateSynchronizers.put((Object)UserStateSynchronizerType.SMS, (Object)new UserStateSMSSynchronizer());
        }
        return (UserStateSMSSynchronizer)userStateSynchronizers.get((Object)UserStateSynchronizerType.SMS);
    }

    static boolean getSubscribed() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getSubscribed();
    }

    static boolean getSyncAsNewSession() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getSyncAsNewSession() || OneSignalStateSynchronizer.getEmailStateSynchronizer().getSyncAsNewSession() || OneSignalStateSynchronizer.getSMSStateSynchronizer().getSyncAsNewSession();
        {
        }
    }

    static UserStateSynchronizer.GetTagsResult getTags(boolean bl) {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getTags(bl);
    }

    static List<UserStateSynchronizer> getUserStateSynchronizers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)OneSignalStateSynchronizer.getPushStateSynchronizer());
        if (OneSignal.hasEmailId()) {
            arrayList.add((Object)OneSignalStateSynchronizer.getEmailStateSynchronizer());
        }
        if (OneSignal.hasSMSlId()) {
            arrayList.add((Object)OneSignalStateSynchronizer.getSMSStateSynchronizer());
        }
        return arrayList;
    }

    static boolean getUserSubscribePreference() {
        return OneSignalStateSynchronizer.getPushStateSynchronizer().getUserSubscribePreference();
    }

    static void initUserState() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().initUserState();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().initUserState();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().initUserState();
    }

    static void logoutEmail() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().logoutEmail();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().logoutChannel();
    }

    static void logoutSMS() {
        OneSignalStateSynchronizer.getSMSStateSynchronizer().logoutChannel();
        OneSignalStateSynchronizer.getPushStateSynchronizer().logoutSMS();
    }

    static boolean persist() {
        boolean bl = OneSignalStateSynchronizer.getPushStateSynchronizer().persist();
        boolean bl2 = OneSignalStateSynchronizer.getEmailStateSynchronizer().persist();
        boolean bl3 = OneSignalStateSynchronizer.getSMSStateSynchronizer().persist();
        boolean bl4 = true;
        if (bl2) {
            bl2 = OneSignalStateSynchronizer.getEmailStateSynchronizer().getRegistrationId() != null;
        }
        if (bl3) {
            bl3 = OneSignalStateSynchronizer.getSMSStateSynchronizer().getRegistrationId() != null;
        }
        if (!bl && !bl2) {
            if (bl3) {
                return bl4;
            }
            bl4 = false;
        }
        return bl4;
    }

    static void readyToUpdate(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().readyToUpdate(bl);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().readyToUpdate(bl);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().readyToUpdate(bl);
    }

    static void refreshSecondaryChannelState() {
        OneSignalStateSynchronizer.getEmailStateSynchronizer().refresh();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().refresh();
    }

    static void resetCurrentState() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().resetCurrentState();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().resetCurrentState();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().resetCurrentState();
        OneSignalStateSynchronizer.getPushStateSynchronizer().saveChannelId(null);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().saveChannelId(null);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().saveChannelId(null);
        OneSignal.setLastSessionTime(-3660L);
    }

    static void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        Iterator iterator = OneSignalStateSynchronizer.getUserStateSynchronizers().iterator();
        while (iterator.hasNext()) {
            ((UserStateSynchronizer)iterator.next()).sendPurchases(jSONObject, responseHandler);
        }
    }

    static void sendTags(JSONObject jSONObject, OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        try {
            JSONObject jSONObject2 = new JSONObject().put("tags", (Object)jSONObject);
            OneSignalStateSynchronizer.getPushStateSynchronizer().sendTags(jSONObject2, changeTagsUpdateHandler);
            OneSignalStateSynchronizer.getEmailStateSynchronizer().sendTags(jSONObject2, changeTagsUpdateHandler);
            OneSignalStateSynchronizer.getSMSStateSynchronizer().sendTags(jSONObject2, changeTagsUpdateHandler);
            return;
        }
        catch (JSONException jSONException) {
            if (changeTagsUpdateHandler != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Encountered an error attempting to serialize your tags into JSON: ");
                stringBuilder.append(jSONException.getMessage());
                stringBuilder.append("\n");
                stringBuilder.append((Object)jSONException.getStackTrace());
                changeTagsUpdateHandler.onFailure(new OneSignal.SendTagsError(-1, stringBuilder.toString()));
            }
            jSONException.printStackTrace();
            return;
        }
    }

    static void setEmail(String string2, String string3) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setEmail(string2, string3);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().setChannelId(string2, string3);
    }

    static void setExternalUserId(String string2, String string3, OneSignal.OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) throws JSONException {
        OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler = new OneSignal.OSInternalExternalUserIdUpdateCompletionHandler(new JSONObject(), oSExternalUserIdUpdateCompletionHandler){
            final /* synthetic */ OneSignal.OSExternalUserIdUpdateCompletionHandler val$completionHandler;
            final /* synthetic */ JSONObject val$responses;
            {
                this.val$responses = jSONObject;
                this.val$completionHandler = oSExternalUserIdUpdateCompletionHandler;
            }

            public void onComplete(String string2, boolean bl) {
                com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL = com.onesignal.OneSignal$LOG_LEVEL.VERBOSE;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Completed request to update external user id for channel: ");
                stringBuilder.append(string2);
                stringBuilder.append(" and success: ");
                stringBuilder.append(bl);
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                try {
                    this.val$responses.put(string2, (Object)new JSONObject().put("success", bl));
                }
                catch (JSONException jSONException) {
                    com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL2 = com.onesignal.OneSignal$LOG_LEVEL.ERROR;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Error while adding the success status of external id for channel: ");
                    stringBuilder2.append(string2);
                    OneSignal.onesignalLog(lOG_LEVEL2, stringBuilder2.toString());
                    jSONException.printStackTrace();
                }
                for (UserStateSynchronizer userStateSynchronizer : OneSignalStateSynchronizer.access$000().values()) {
                    if (!userStateSynchronizer.hasQueuedHandlers()) continue;
                    com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL3 = com.onesignal.OneSignal$LOG_LEVEL.VERBOSE;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("External user id handlers are still being processed for channel: ");
                    stringBuilder3.append(userStateSynchronizer.getChannelString());
                    stringBuilder3.append(" , wait until finished before proceeding");
                    OneSignal.onesignalLog(lOG_LEVEL3, stringBuilder3.toString());
                    return;
                }
                com.onesignal.OSUtils.runOnMainUIThread(new java.lang.Runnable(this){
                    final /* synthetic */ 1 this$0;
                    {
                        this.this$0 = var1_1;
                    }

                    public void run() {
                        if (this.this$0.val$completionHandler != null) {
                            this.this$0.val$completionHandler.onSuccess(this.this$0.val$responses);
                        }
                    }
                });
            }
        };
        Iterator iterator = OneSignalStateSynchronizer.getUserStateSynchronizers().iterator();
        while (iterator.hasNext()) {
            ((UserStateSynchronizer)iterator.next()).setExternalUserId(string2, string3, oSInternalExternalUserIdUpdateCompletionHandler);
        }
    }

    static void setNewSession() {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setNewSession();
        OneSignalStateSynchronizer.getEmailStateSynchronizer().setNewSession();
        OneSignalStateSynchronizer.getSMSStateSynchronizer().setNewSession();
    }

    static void setNewSessionForEmail() {
        OneSignalStateSynchronizer.getEmailStateSynchronizer().setNewSession();
    }

    static void setPermission(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setPermission(bl);
    }

    static void setSMSNumber(String string2, String string3) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setSMSNumber(string2, string3);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().setChannelId(string2, string3);
    }

    static void setSubscription(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().setSubscription(bl);
    }

    static void syncUserState(boolean bl) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().syncUserState(bl);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().syncUserState(bl);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().syncUserState(bl);
    }

    static void updateDeviceInfo(JSONObject jSONObject) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().updateDeviceInfo(jSONObject);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().updateDeviceInfo(jSONObject);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().updateDeviceInfo(jSONObject);
    }

    static void updateLocation(LocationController.LocationPoint locationPoint) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().updateLocation(locationPoint);
        OneSignalStateSynchronizer.getEmailStateSynchronizer().updateLocation(locationPoint);
        OneSignalStateSynchronizer.getSMSStateSynchronizer().updateLocation(locationPoint);
    }

    static void updatePushState(JSONObject jSONObject) {
        OneSignalStateSynchronizer.getPushStateSynchronizer().updateState(jSONObject);
    }

    static final class UserStateSynchronizerType
    extends Enum<UserStateSynchronizerType> {
        private static final /* synthetic */ UserStateSynchronizerType[] $VALUES;
        public static final /* enum */ UserStateSynchronizerType EMAIL;
        public static final /* enum */ UserStateSynchronizerType PUSH;
        public static final /* enum */ UserStateSynchronizerType SMS;

        static {
            UserStateSynchronizerType userStateSynchronizerType;
            UserStateSynchronizerType userStateSynchronizerType2;
            UserStateSynchronizerType userStateSynchronizerType3;
            PUSH = userStateSynchronizerType2 = new UserStateSynchronizerType();
            EMAIL = userStateSynchronizerType3 = new UserStateSynchronizerType();
            SMS = userStateSynchronizerType = new UserStateSynchronizerType();
            $VALUES = new UserStateSynchronizerType[]{userStateSynchronizerType2, userStateSynchronizerType3, userStateSynchronizerType};
        }

        public static UserStateSynchronizerType valueOf(String string2) {
            return (UserStateSynchronizerType)Enum.valueOf(UserStateSynchronizerType.class, (String)string2);
        }

        public static UserStateSynchronizerType[] values() {
            return (UserStateSynchronizerType[])$VALUES.clone();
        }

        public boolean isEmail() {
            return this.equals((Object)EMAIL);
        }

        public boolean isPush() {
            return this.equals((Object)PUSH);
        }

        public boolean isSMS() {
            return this.equals((Object)SMS);
        }
    }

}

