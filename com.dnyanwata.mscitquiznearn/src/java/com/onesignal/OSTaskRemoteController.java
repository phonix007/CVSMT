/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OSRemoteParamController
 *  com.onesignal.OSTaskController
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 */
package com.onesignal;

import com.onesignal.OSLogger;
import com.onesignal.OSRemoteParamController;
import com.onesignal.OSTaskController;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

class OSTaskRemoteController
extends OSTaskController {
    static final String APP_LOST_FOCUS = "onAppLostFocus()";
    static final String CLEAR_NOTIFICATIONS = "clearOneSignalNotifications()";
    static final String GET_TAGS = "getTags()";
    static final String HANDLE_NOTIFICATION_OPEN = "handleNotificationOpen()";
    static final String IDS_AVAILABLE = "idsAvailable()";
    static final String LOGOUT_EMAIL = "logoutEmail()";
    static final String LOGOUT_SMS_NUMBER = "logoutSMSNumber()";
    static final HashSet<String> METHODS_AVAILABLE_FOR_DELAY = new HashSet((Collection)Arrays.asList((Object[])new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));
    static final String PAUSE_IN_APP_MESSAGES = "pauseInAppMessages()";
    static final String PROMPT_LOCATION = "promptLocation()";
    static final String REMOVE_GROUPED_NOTIFICATIONS = "removeGroupedNotifications()";
    static final String REMOVE_NOTIFICATION = "removeNotification()";
    static final String SEND_OUTCOME = "sendOutcome()";
    static final String SEND_OUTCOME_WITH_VALUE = "sendOutcomeWithValue()";
    static final String SEND_TAG = "sendTag()";
    static final String SEND_TAGS = "sendTags()";
    static final String SEND_UNIQUE_OUTCOME = "sendUniqueOutcome()";
    static final String SET_EMAIL = "setEmail()";
    static final String SET_EXTERNAL_USER_ID = "setExternalUserId()";
    static final String SET_LOCATION_SHARED = "setLocationShared()";
    static final String SET_REQUIRES_USER_PRIVACY_CONSENT = "setRequiresUserPrivacyConsent()";
    static final String SET_SMS_NUMBER = "setSMSNumber()";
    static final String SET_SUBSCRIPTION = "setSubscription()";
    static final String SYNC_HASHED_EMAIL = "syncHashedEmail()";
    static final String UNSUBSCRIBE_WHEN_NOTIFICATION_ARE_DISABLED = "unsubscribeWhenNotificationsAreDisabled()";
    private final OSRemoteParamController paramController;

    OSTaskRemoteController(OSRemoteParamController oSRemoteParamController, OSLogger oSLogger) {
        super(oSLogger);
        this.paramController = oSRemoteParamController;
    }

    boolean shouldQueueTaskForInit(String string2) {
        return !this.paramController.isRemoteParamsCallDone() && METHODS_AVAILABLE_FOR_DELAY.contains((Object)string2);
    }
}

