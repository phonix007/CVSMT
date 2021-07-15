/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.data.OSTrackerFactory;

class OSRemoteParamController {
    private OneSignalRemoteParams.Params remoteParams = null;

    OSRemoteParamController() {
    }

    void clearRemoteParams() {
        this.remoteParams = null;
    }

    boolean getClearGroupSummaryClick() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    boolean getFirebaseAnalyticsEnabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    OneSignalRemoteParams.Params getRemoteParams() {
        return this.remoteParams;
    }

    boolean getSavedUserConsentStatus() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    boolean hasLocationKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return params != null && params.locationShared != null;
    }

    boolean hasPrivacyConsentKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return params != null && params.requiresUserPrivacyConsent != null;
    }

    boolean hasUnsubscribeNotificationKey() {
        OneSignalRemoteParams.Params params = this.remoteParams;
        return params != null && params.unsubscribeWhenNotificationsDisabled != null;
    }

    boolean isGMSMissingPromptDisable() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    boolean isLocationShared() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_LOCATION_SHARED", true);
    }

    boolean isPrivacyConsentRequired() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    boolean isRemoteParamsCallDone() {
        return this.remoteParams != null;
    }

    void saveGMSMissingPromptDisable(boolean bl) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", bl);
    }

    void saveLocationShared(boolean bl) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_LOCATION_SHARED", bl);
    }

    void savePrivacyConsentRequired(boolean bl) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", bl);
    }

    void saveRemoteParams(OneSignalRemoteParams.Params params, OSTrackerFactory oSTrackerFactory, OSSharedPreferences oSSharedPreferences, OSLogger oSLogger) {
        this.remoteParams = params;
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "GT_FIREBASE_TRACKING_ENABLED", params.firebaseAnalytics);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "OS_RESTORE_TTL_FILTER", params.restoreTTLFilter);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "OS_CLEAR_GROUP_SUMMARY_CLICK", params.clearGroupOnSummaryClick);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", params.receiveReceiptEnabled);
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, oSSharedPreferences.getOutcomesV2KeyName(), params.influenceParams.outcomesV2ServiceEnabled);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal saveInfluenceParams: ");
        stringBuilder.append(params.influenceParams.toString());
        oSLogger.debug(stringBuilder.toString());
        oSTrackerFactory.saveInfluenceParams(params.influenceParams);
        this.saveGMSMissingPromptDisable(params.disableGMSMissingPrompt);
        if (params.unsubscribeWhenNotificationsDisabled != null) {
            this.saveUnsubscribeWhenNotificationsAreDisabled(params.unsubscribeWhenNotificationsDisabled);
        }
        if (params.locationShared != null) {
            OneSignal.startLocationShared(params.locationShared);
        }
        if (params.requiresUserPrivacyConsent != null) {
            this.savePrivacyConsentRequired(params.requiresUserPrivacyConsent);
        }
    }

    void saveUnsubscribeWhenNotificationsAreDisabled(boolean bl) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", bl);
    }

    void saveUserConsentStatus(boolean bl) {
        OneSignalPrefs.saveBool(OneSignalPrefs.PREFS_ONESIGNAL, "ONESIGNAL_USER_PROVIDED_CONSENT", bl);
    }

    boolean unsubscribeWhenNotificationsAreDisabled() {
        return OneSignalPrefs.getBool(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}

