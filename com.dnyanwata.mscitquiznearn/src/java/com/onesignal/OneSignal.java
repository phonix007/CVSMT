/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  com.onesignal.ActivityLifecycleListener
 *  com.onesignal.AdvertisingIdentifierProvider
 *  com.onesignal.BadgeCountUpdater
 *  com.onesignal.DelayedConsentInitializationParameters
 *  com.onesignal.FocusTimeController
 *  com.onesignal.LocationController
 *  com.onesignal.LocationController$LocationHandler
 *  com.onesignal.LocationController$LocationPoint
 *  com.onesignal.NotificationBundleProcessor
 *  com.onesignal.OSDeviceState
 *  com.onesignal.OSEmailSubscriptionChangedInternalObserver
 *  com.onesignal.OSEmailSubscriptionObserver
 *  com.onesignal.OSEmailSubscriptionState
 *  com.onesignal.OSEmailSubscriptionStateChanges
 *  com.onesignal.OSFocusTimeProcessorFactory
 *  com.onesignal.OSInAppMessageAction
 *  com.onesignal.OSInAppMessageControllerFactory
 *  com.onesignal.OSInAppMessageOutcome
 *  com.onesignal.OSLogger
 *  com.onesignal.OSNotification
 *  com.onesignal.OSNotificationAction
 *  com.onesignal.OSNotificationAction$ActionType
 *  com.onesignal.OSNotificationController
 *  com.onesignal.OSNotificationDataController$InvalidOrDuplicateNotificationCallback
 *  com.onesignal.OSNotificationGenerationJob
 *  com.onesignal.OSNotificationReceivedEvent
 *  com.onesignal.OSNotificationRestoreWorkManager
 *  com.onesignal.OSObservable
 *  com.onesignal.OSOutcomeEvent
 *  com.onesignal.OSOutcomeEventsController
 *  com.onesignal.OSPermissionChangedInternalObserver
 *  com.onesignal.OSPermissionObserver
 *  com.onesignal.OSPermissionState
 *  com.onesignal.OSPermissionStateChanges
 *  com.onesignal.OSRemoteParamController
 *  com.onesignal.OSSMSSubscriptionChangedInternalObserver
 *  com.onesignal.OSSMSSubscriptionObserver
 *  com.onesignal.OSSMSSubscriptionState
 *  com.onesignal.OSSMSSubscriptionStateChanges
 *  com.onesignal.OSSessionManager
 *  com.onesignal.OSSessionManager$SessionListener
 *  com.onesignal.OSSharedPreferences
 *  com.onesignal.OSSubscriptionChangedInternalObserver
 *  com.onesignal.OSSubscriptionObserver
 *  com.onesignal.OSSubscriptionState
 *  com.onesignal.OSSubscriptionStateChanges
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.time.ZoneId
 *  java.util.ArrayList
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.TimeZone
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.onesignal.ActivityLifecycleHandler;
import com.onesignal.ActivityLifecycleListener;
import com.onesignal.AdvertisingIdProviderGPS;
import com.onesignal.AdvertisingIdentifierProvider;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.DelayedConsentInitializationParameters;
import com.onesignal.FocusTimeController;
import com.onesignal.LocationController;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSDeviceState;
import com.onesignal.OSEmailSubscriptionChangedInternalObserver;
import com.onesignal.OSEmailSubscriptionObserver;
import com.onesignal.OSEmailSubscriptionState;
import com.onesignal.OSEmailSubscriptionStateChanges;
import com.onesignal.OSFocusTimeProcessorFactory;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSInAppMessageControllerFactory;
import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSLogWrapper;
import com.onesignal.OSLogger;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationController;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationOpenedResult;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OSObservable;
import com.onesignal.OSOutcomeEvent;
import com.onesignal.OSOutcomeEventsController;
import com.onesignal.OSPermissionChangedInternalObserver;
import com.onesignal.OSPermissionObserver;
import com.onesignal.OSPermissionState;
import com.onesignal.OSPermissionStateChanges;
import com.onesignal.OSRemoteParamController;
import com.onesignal.OSSMSSubscriptionChangedInternalObserver;
import com.onesignal.OSSMSSubscriptionObserver;
import com.onesignal.OSSMSSubscriptionState;
import com.onesignal.OSSMSSubscriptionStateChanges;
import com.onesignal.OSSessionManager;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSSharedPreferencesWrapper;
import com.onesignal.OSSubscriptionChangedInternalObserver;
import com.onesignal.OSSubscriptionObserver;
import com.onesignal.OSSubscriptionState;
import com.onesignal.OSSubscriptionStateChanges;
import com.onesignal.OSSyncService;
import com.onesignal.OSTaskController;
import com.onesignal.OSTaskRemoteController;
import com.onesignal.OSTime;
import com.onesignal.OSTimeImpl;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalChromeTabAndroidFrame;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalRestClientWrapper;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.PushRegistrator;
import com.onesignal.PushRegistratorADM;
import com.onesignal.PushRegistratorFCM;
import com.onesignal.PushRegistratorHMS;
import com.onesignal.TrackAmazonPurchase;
import com.onesignal.TrackFirebaseAnalytics;
import com.onesignal.TrackGooglePurchase;
import com.onesignal.UserStateSynchronizer;
import com.onesignal.influence.data.OSTrackerFactory;
import com.onesignal.outcomes.data.OSOutcomeEventsFactory;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignal {
    static final long MIN_ON_SESSION_TIME_MILLIS = 30000L;
    private static final String VERSION = "040303";
    private static AdvertisingIdentifierProvider adIdProvider;
    private static boolean androidParamsRequestStarted;
    private static OneSignalAPIClient apiClient;
    static WeakReference<Activity> appActivity;
    static Context appContext;
    private static AppEntryAction appEntryState;
    static String appId;
    private static OSEmailSubscriptionState currentEmailSubscriptionState;
    private static OSPermissionState currentPermissionState;
    private static OSSMSSubscriptionState currentSMSSubscriptionState;
    private static OSSubscriptionState currentSubscriptionState;
    private static DelayedConsentInitializationParameters delayedInitParams;
    private static String emailId;
    private static EmailUpdateHandler emailLogoutHandler;
    private static OSObservable<OSEmailSubscriptionObserver, OSEmailSubscriptionStateChanges> emailSubscriptionStateChangesObserver;
    private static EmailUpdateHandler emailUpdateHandler;
    private static List<EntryStateListener> entryStateListeners;
    private static FocusTimeController focusTimeController;
    private static boolean getTagsCall;
    static String googleProjectNumber;
    private static IAPUpdateJob iapUpdateJob;
    static OSInAppMessageClickHandler inAppMessageClickHandler;
    private static OSInAppMessageControllerFactory inAppMessageControllerFactory;
    private static boolean inForeground;
    private static boolean initDone;
    static OSEmailSubscriptionState lastEmailSubscriptionState;
    private static LocationController.LocationPoint lastLocationPoint;
    static OSPermissionState lastPermissionState;
    private static String lastRegistrationId;
    static OSSMSSubscriptionState lastSMSSubscriptionState;
    static OSSubscriptionState lastSubscriptionState;
    private static boolean locationFired;
    private static LOG_LEVEL logCatLevel;
    private static OSLogger logger;
    private static PushRegistrator mPushRegistrator;
    private static OSNotificationDataController notificationDataController;
    static OSNotificationOpenedHandler notificationOpenedHandler;
    static OSNotificationWillShowInForegroundHandler notificationWillShowInForegroundHandler;
    private static OSUtils osUtils;
    private static OSOutcomeEventsController outcomeEventsController;
    private static OSOutcomeEventsFactory outcomeEventsFactory;
    private static final ArrayList<OSGetTagsHandler> pendingGetTagsHandlers;
    private static OSObservable<OSPermissionObserver, OSPermissionStateChanges> permissionStateChangesObserver;
    private static HashSet<String> postedOpenedNotifIds;
    private static OSSharedPreferences preferences;
    private static boolean registerForPushFired;
    static OSRemoteNotificationReceivedHandler remoteNotificationReceivedHandler;
    private static OSRemoteParamController remoteParamController;
    public static String sdkType;
    private static OSSessionManager.SessionListener sessionListener;
    private static OSSessionManager sessionManager;
    private static String smsId;
    private static OSSMSUpdateHandler smsLogoutHandler;
    private static OSObservable<OSSMSSubscriptionObserver, OSSMSSubscriptionStateChanges> smsSubscriptionStateChangesObserver;
    private static OSSMSUpdateHandler smsUpdateHandler;
    private static int subscribableStatus;
    private static OSObservable<OSSubscriptionObserver, OSSubscriptionStateChanges> subscriptionStateChangesObserver;
    private static OSTaskController taskController;
    private static OSTaskRemoteController taskRemoteController;
    private static OSTime time;
    private static TrackAmazonPurchase trackAmazonPurchase;
    private static TrackFirebaseAnalytics trackFirebaseAnalytics;
    private static TrackGooglePurchase trackGooglePurchase;
    private static OSTrackerFactory trackerFactory;
    private static Collection<JSONArray> unprocessedOpenedNotifs;
    private static String userId;
    private static LOG_LEVEL visualLogLevel;
    private static boolean waitingToPostStateSync;

    static {
        OSTrackerFactory oSTrackerFactory;
        entryStateListeners = new ArrayList();
        visualLogLevel = LOG_LEVEL.NONE;
        logCatLevel = LOG_LEVEL.WARN;
        userId = null;
        emailId = null;
        smsId = null;
        subscribableStatus = Integer.MAX_VALUE;
        appEntryState = AppEntryAction.APP_CLOSE;
        logger = new OSLogWrapper();
        focusTimeController = new FocusTimeController(new OSFocusTimeProcessorFactory(), logger);
        sessionListener = new OSSessionManager.SessionListener(){

            public void onSessionEnding(List<com.onesignal.influence.domain.OSInfluence> list) {
                if (OneSignal.access$000() == null) {
                    OneSignal.Log(LOG_LEVEL.WARN, "OneSignal onSessionEnding called before init!");
                }
                if (OneSignal.access$000() != null) {
                    OneSignal.access$000().cleanOutcomes();
                }
                OneSignal.access$100().onSessionEnded(list);
            }
        };
        inAppMessageControllerFactory = new OSInAppMessageControllerFactory();
        time = new OSTimeImpl();
        remoteParamController = new OSRemoteParamController();
        taskController = new OSTaskController(logger);
        taskRemoteController = new OSTaskRemoteController(remoteParamController, logger);
        apiClient = new OneSignalRestClientWrapper();
        OSSharedPreferencesWrapper oSSharedPreferencesWrapper = new OSSharedPreferencesWrapper();
        preferences = oSSharedPreferencesWrapper;
        trackerFactory = oSTrackerFactory = new OSTrackerFactory(oSSharedPreferencesWrapper, logger, time);
        sessionManager = new OSSessionManager(sessionListener, oSTrackerFactory, logger);
        sdkType = "native";
        osUtils = new OSUtils();
        unprocessedOpenedNotifs = new ArrayList();
        postedOpenedNotifIds = new HashSet();
        pendingGetTagsHandlers = new ArrayList();
    }

    static void Log(LOG_LEVEL lOG_LEVEL, String string2) {
        OneSignal.Log(lOG_LEVEL, string2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void Log(final LOG_LEVEL lOG_LEVEL, String string2, Throwable throwable) {
        if (lOG_LEVEL.compareTo((Enum)logCatLevel) < 1) {
            if (lOG_LEVEL == LOG_LEVEL.VERBOSE) {
                Log.v((String)"OneSignal", (String)string2, (Throwable)throwable);
            } else if (lOG_LEVEL == LOG_LEVEL.DEBUG) {
                Log.d((String)"OneSignal", (String)string2, (Throwable)throwable);
            } else if (lOG_LEVEL == LOG_LEVEL.INFO) {
                Log.i((String)"OneSignal", (String)string2, (Throwable)throwable);
            } else if (lOG_LEVEL == LOG_LEVEL.WARN) {
                Log.w((String)"OneSignal", (String)string2, (Throwable)throwable);
            } else if (lOG_LEVEL == LOG_LEVEL.ERROR || lOG_LEVEL == LOG_LEVEL.FATAL) {
                Log.e((String)"OneSignal", (String)string2, (Throwable)throwable);
            }
        }
        if (lOG_LEVEL.compareTo((Enum)visualLogLevel) < 1 && OneSignal.getCurrentActivity() != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("\n");
                final String string3 = stringBuilder.toString();
                if (throwable != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string3);
                    stringBuilder2.append(throwable.getMessage());
                    String string4 = stringBuilder2.toString();
                    StringWriter stringWriter = new StringWriter();
                    throwable.printStackTrace(new PrintWriter((Writer)stringWriter));
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(string4);
                    stringBuilder3.append(stringWriter.toString());
                    string3 = stringBuilder3.toString();
                }
                OSUtils.runOnMainUIThread(new Runnable(){

                    public void run() {
                        if (OneSignal.getCurrentActivity() != null) {
                            new AlertDialog.Builder((Context)OneSignal.getCurrentActivity()).setTitle((CharSequence)lOG_LEVEL.toString()).setMessage((CharSequence)string3).show();
                        }
                    }
                });
                return;
            }
            catch (Throwable throwable2) {
                Log.e((String)"OneSignal", (String)"Error showing logging message.", (Throwable)throwable2);
            }
        }
    }

    static /* synthetic */ OSOutcomeEventsController access$000() {
        return outcomeEventsController;
    }

    static /* synthetic */ FocusTimeController access$100() {
        return focusTimeController;
    }

    static /* synthetic */ OSSubscriptionState access$1000(Context context) {
        return OneSignal.getCurrentSubscriptionState(context);
    }

    static /* synthetic */ boolean access$1102(boolean bl) {
        androidParamsRequestStarted = bl;
        return bl;
    }

    static /* synthetic */ OSTrackerFactory access$1200() {
        return trackerFactory;
    }

    static /* synthetic */ OSSharedPreferences access$1300() {
        return preferences;
    }

    static /* synthetic */ OSRemoteParamController access$1400() {
        return remoteParamController;
    }

    static /* synthetic */ void access$1500() {
        OneSignal.registerForPushToken();
    }

    static /* synthetic */ LocationController.LocationPoint access$302(LocationController.LocationPoint locationPoint) {
        lastLocationPoint = locationPoint;
        return locationPoint;
    }

    static /* synthetic */ boolean access$402(boolean bl) {
        locationFired = bl;
        return bl;
    }

    static /* synthetic */ void access$500() {
        OneSignal.registerUser();
    }

    static /* synthetic */ int access$600() {
        return subscribableStatus;
    }

    static /* synthetic */ int access$602(int n) {
        subscribableStatus = n;
        return n;
    }

    static /* synthetic */ boolean access$700(int n) {
        return OneSignal.pushStatusRuntimeError(n);
    }

    static /* synthetic */ String access$802(String string2) {
        lastRegistrationId = string2;
        return string2;
    }

    static /* synthetic */ boolean access$902(boolean bl) {
        registerForPushFired = bl;
        return bl;
    }

    public static void addEmailSubscriptionObserver(OSEmailSubscriptionObserver oSEmailSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add email subscription observer");
            return;
        }
        OneSignal.getEmailSubscriptionStateChangesObserver().addObserver((Object)oSEmailSubscriptionObserver);
        if (OneSignal.getCurrentEmailSubscriptionState(appContext).compare(OneSignal.getLastEmailSubscriptionState(appContext))) {
            OSEmailSubscriptionChangedInternalObserver.fireChangesToPublicObserver((OSEmailSubscriptionState)OneSignal.getCurrentEmailSubscriptionState(appContext));
        }
    }

    static void addEntryStateListener(EntryStateListener entryStateListener, AppEntryAction appEntryAction) {
        if (!appEntryAction.equals((Object)AppEntryAction.NOTIFICATION_CLICK)) {
            entryStateListeners.add((Object)entryStateListener);
        }
    }

    static void addNetType(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", (Object)osUtils.getNetType());
        }
        catch (Throwable throwable) {}
    }

    public static void addPermissionObserver(OSPermissionObserver oSPermissionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add permission observer");
            return;
        }
        OneSignal.getPermissionStateChangesObserver().addObserver((Object)oSPermissionObserver);
        if (OneSignal.getCurrentPermissionState(appContext).compare(OneSignal.getLastPermissionState(appContext))) {
            OSPermissionChangedInternalObserver.fireChangesToPublicObserver((OSPermissionState)OneSignal.getCurrentPermissionState(appContext));
        }
    }

    public static void addSMSSubscriptionObserver(OSSMSSubscriptionObserver oSSMSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add sms subscription observer");
            return;
        }
        OneSignal.getSMSSubscriptionStateChangesObserver().addObserver((Object)oSSMSSubscriptionObserver);
        if (OneSignal.getCurrentSMSSubscriptionState(appContext).compare(OneSignal.getLastSMSSubscriptionState(appContext))) {
            OSSMSSubscriptionChangedInternalObserver.fireChangesToPublicObserver((OSSMSSubscriptionState)OneSignal.getCurrentSMSSubscriptionState(appContext));
        }
    }

    public static void addSubscriptionObserver(OSSubscriptionObserver oSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        OneSignal.getSubscriptionStateChangesObserver().addObserver((Object)oSSubscriptionObserver);
        if (OneSignal.getCurrentSubscriptionState(appContext).compare(OneSignal.getLastSubscriptionState(appContext))) {
            OSSubscriptionChangedInternalObserver.fireChangesToPublicObserver((OSSubscriptionState)OneSignal.getCurrentSubscriptionState(appContext));
        }
    }

    public static void addTrigger(String string2, Object object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)string2, object);
        OneSignal.getInAppMessageController().addTriggers((Map<String, Object>)hashMap);
    }

    public static void addTriggers(Map<String, Object> map) {
        OneSignal.getInAppMessageController().addTriggers(map);
    }

    static void applicationOpenedByNotification(String string2) {
        AppEntryAction appEntryAction;
        appEntryState = appEntryAction = AppEntryAction.NOTIFICATION_CLICK;
        sessionManager.onDirectInfluenceFromNotificationOpen(appEntryAction, string2);
    }

    static boolean areNotificationsEnabledForSubscribedState() {
        if (remoteParamController.unsubscribeWhenNotificationsAreDisabled()) {
            return OSUtils.areNotificationsEnabled(appContext);
        }
        return true;
    }

    static boolean atLogLevel(LOG_LEVEL lOG_LEVEL) {
        int n;
        int n2 = lOG_LEVEL.compareTo((Enum)visualLogLevel);
        if (n2 >= (n = 1)) {
            if (lOG_LEVEL.compareTo((Enum)logCatLevel) < n) {
                return (boolean)n;
            }
            n = 0;
        }
        return (boolean)n;
    }

    static void backgroundSyncLogic() {
        if (inForeground) {
            return;
        }
        TrackAmazonPurchase trackAmazonPurchase = OneSignal.trackAmazonPurchase;
        if (trackAmazonPurchase != null) {
            trackAmazonPurchase.checkListener();
        }
        focusTimeController.appBackgrounded();
        OneSignal.scheduleSyncService();
    }

    static void callEntryStateListeners(AppEntryAction appEntryAction) {
        Iterator iterator = new ArrayList(entryStateListeners).iterator();
        while (iterator.hasNext()) {
            ((EntryStateListener)iterator.next()).onEntryStateChange(appEntryAction);
        }
    }

    public static void clearOneSignalNotifications() {
        OSNotificationDataController oSNotificationDataController;
        if (!taskRemoteController.shouldQueueTaskForInit("clearOneSignalNotifications()") && (oSNotificationDataController = notificationDataController) != null) {
            oSNotificationDataController.clearOneSignalNotifications((WeakReference<Context>)new WeakReference((Object)appContext));
            return;
        }
        logger.error("Waiting for remote params. Moving clearOneSignalNotifications() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(){

            public void run() {
                logger.debug("Running clearOneSignalNotifications() operation from pending queue.");
                OneSignal.clearOneSignalNotifications();
            }
        });
    }

    public static void deleteTag(String string2) {
        OneSignal.deleteTag(string2, null);
    }

    public static void deleteTag(String string2, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTag()")) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add((Object)string2);
        OneSignal.deleteTags((Collection<String>)arrayList, changeTagsUpdateHandler);
    }

    public static void deleteTags(String string2) {
        OneSignal.deleteTags(string2, null);
    }

    public static void deleteTags(String string2, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        try {
            OneSignal.deleteTags(new JSONArray(string2), changeTagsUpdateHandler);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", throwable);
            return;
        }
    }

    public static void deleteTags(Collection<String> collection) {
        OneSignal.deleteTags(collection, null);
    }

    public static void deleteTags(Collection<String> collection, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                jSONObject.put((String)iterator.next(), (Object)"");
            }
            OneSignal.sendTags(jSONObject, changeTagsUpdateHandler);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", throwable);
            return;
        }
    }

    public static void deleteTags(JSONArray jSONArray, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTags()")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        int n = 0;
        do {
            if (n >= jSONArray.length()) break;
            jSONObject.put(jSONArray.getString(n), (Object)"");
            ++n;
        } while (true);
        try {
            OneSignal.sendTags(jSONObject, changeTagsUpdateHandler);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", throwable);
            return;
        }
    }

    public static void disablePush(final boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("setSubscription()")) {
            logger.error("Waiting for remote params. Moving setSubscription() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running setSubscription() operation from pending queue.");
                    OneSignal.disablePush(bl);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setSubscription()")) {
            return;
        }
        OneSignal.getCurrentSubscriptionState(appContext).setPushDisabled(bl);
        OneSignalStateSynchronizer.setSubscription(bl ^ true);
    }

    private static void doSessionInit() {
        if (OneSignal.shouldStartNewSession()) {
            OSLogger oSLogger = logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Starting new session with appEntryState: ");
            stringBuilder.append((Object)OneSignal.getAppEntryState());
            oSLogger.debug(stringBuilder.toString());
            OneSignalStateSynchronizer.setNewSession();
            outcomeEventsController.cleanOutcomes();
            sessionManager.restartSessionIfNeeded(OneSignal.getAppEntryState());
            OneSignal.getInAppMessageController().resetSessionLaunchTime();
            OneSignal.setLastSessionTime(time.getCurrentTimeMillis());
        } else if (OneSignal.isInForeground()) {
            OSLogger oSLogger = logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Continue on same session with appEntryState: ");
            stringBuilder.append((Object)OneSignal.getAppEntryState());
            oSLogger.debug(stringBuilder.toString());
            sessionManager.attemptSessionUpgrade(OneSignal.getAppEntryState());
        }
        OneSignal.getInAppMessageController().initWithCachedInAppMessages();
        if (!inForeground && OneSignal.hasUserId()) {
            logger.debug("doSessionInit on background with already registered user");
        }
        OneSignal.startRegistrationOrOnSession();
    }

    private static void fireCallbackForOpenedNotifications() {
        Iterator iterator = unprocessedOpenedNotifs.iterator();
        while (iterator.hasNext()) {
            OneSignal.runNotificationOpenedCallback((JSONArray)iterator.next());
        }
        unprocessedOpenedNotifs.clear();
    }

    static void fireEmailUpdateFailure() {
        EmailUpdateHandler emailUpdateHandler = OneSignal.emailUpdateHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            OneSignal.emailUpdateHandler = null;
        }
    }

    static void fireEmailUpdateSuccess() {
        EmailUpdateHandler emailUpdateHandler = OneSignal.emailUpdateHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onSuccess();
            OneSignal.emailUpdateHandler = null;
        }
    }

    static void fireForegroundHandlers(OSNotificationController oSNotificationController) {
        OneSignal.onesignalLog(LOG_LEVEL.INFO, "Fire notificationWillShowInForegroundHandler");
        OSNotificationReceivedEvent oSNotificationReceivedEvent = oSNotificationController.getNotificationReceivedEvent();
        try {
            notificationWillShowInForegroundHandler.notificationWillShowInForeground(oSNotificationReceivedEvent);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.onesignalLog(LOG_LEVEL.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            oSNotificationReceivedEvent.complete(oSNotificationReceivedEvent.getNotification());
            throw throwable;
        }
    }

    private static void fireNotificationOpenedHandler(final OSNotificationOpenedResult oSNotificationOpenedResult) {
        OSUtils.runOnMainUIThread(new Runnable(){

            public void run() {
                OneSignal.notificationOpenedHandler.notificationOpened(oSNotificationOpenedResult);
            }
        });
    }

    static void fireSMSUpdateFailure() {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsUpdateHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            smsUpdateHandler = null;
        }
    }

    static void fireSMSUpdateSuccess(JSONObject jSONObject) {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsUpdateHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onSuccess(jSONObject);
            smsUpdateHandler = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static OSNotificationOpenedResult generateNotificationOpenedResult(JSONArray jSONArray) {
        int n = jSONArray.length();
        int n2 = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean bl = true;
        String string2 = null;
        JSONObject jSONObject = null;
        int n3 = 0;
        do {
            block8 : {
                block7 : {
                    if (n3 < n) {
                        try {
                            jSONObject = jSONArray.getJSONObject(n3);
                            if (string2 == null && jSONObject.has("actionId")) {
                                string2 = jSONObject.optString("actionId", null);
                            }
                            break block7;
                        }
                        catch (Throwable throwable) {
                            LOG_LEVEL lOG_LEVEL = LOG_LEVEL.ERROR;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Error parsing JSON item ");
                            stringBuilder.append(n3);
                            stringBuilder.append("/");
                            stringBuilder.append(n);
                            stringBuilder.append(" for callback.");
                            OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), throwable);
                            break block8;
                        }
                    }
                    OSNotificationAction.ActionType actionType = string2 != null ? OSNotificationAction.ActionType.ActionTaken : OSNotificationAction.ActionType.Opened;
                    OSNotificationAction oSNotificationAction = new OSNotificationAction(actionType, string2);
                    return new OSNotificationOpenedResult(new OSNotification((List)arrayList, jSONObject, n2), oSNotificationAction);
                }
                if (bl) {
                    bl = false;
                } else {
                    arrayList.add((Object)new OSNotification(jSONObject));
                }
            }
            ++n3;
        } while (true);
    }

    static AppEntryAction getAppEntryState() {
        return appEntryState;
    }

    static boolean getClearGroupSummaryClick() {
        return remoteParamController.getClearGroupSummaryClick();
    }

    static Activity getCurrentActivity() {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            return activityLifecycleHandler.getCurActivity();
        }
        return null;
    }

    private static OSEmailSubscriptionState getCurrentEmailSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentEmailSubscriptionState == null) {
            OSEmailSubscriptionState oSEmailSubscriptionState;
            currentEmailSubscriptionState = oSEmailSubscriptionState = new OSEmailSubscriptionState(false);
            oSEmailSubscriptionState.getObservable().addObserverStrong((Object)new OSEmailSubscriptionChangedInternalObserver());
        }
        return currentEmailSubscriptionState;
    }

    private static OSPermissionState getCurrentPermissionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentPermissionState == null) {
            OSPermissionState oSPermissionState;
            currentPermissionState = oSPermissionState = new OSPermissionState(false);
            oSPermissionState.getObservable().addObserverStrong((Object)new OSPermissionChangedInternalObserver());
        }
        return currentPermissionState;
    }

    private static OSSMSSubscriptionState getCurrentSMSSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentSMSSubscriptionState == null) {
            OSSMSSubscriptionState oSSMSSubscriptionState;
            currentSMSSubscriptionState = oSSMSSubscriptionState = new OSSMSSubscriptionState(false);
            oSSMSSubscriptionState.getObservable().addObserverStrong((Object)new OSSMSSubscriptionChangedInternalObserver());
        }
        return currentSMSSubscriptionState;
    }

    private static OSSubscriptionState getCurrentSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentSubscriptionState == null) {
            currentSubscriptionState = new OSSubscriptionState(false, OneSignal.getCurrentPermissionState(context).areNotificationsEnabled());
            OneSignal.getCurrentPermissionState(context).getObservable().addObserver((Object)currentSubscriptionState);
            currentSubscriptionState.getObservable().addObserverStrong((Object)new OSSubscriptionChangedInternalObserver());
        }
        return currentSubscriptionState;
    }

    static OneSignalDbHelper getDBHelperInstance() {
        return OneSignalDbHelper.getInstance(appContext);
    }

    static DelayedConsentInitializationParameters getDelayedInitParams() {
        return delayedInitParams;
    }

    public static OSDeviceState getDeviceState() {
        Context context = appContext;
        if (context == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
            return null;
        }
        return new OSDeviceState(OneSignal.getCurrentSubscriptionState(context), OneSignal.getCurrentPermissionState(appContext), OneSignal.getCurrentEmailSubscriptionState(appContext), OneSignal.getCurrentSMSSubscriptionState(appContext));
    }

    static boolean getDisableGMSMissingPrompt() {
        return remoteParamController.isGMSMissingPromptDisable();
    }

    static String getEmailId() {
        if (emailId == null && appContext != null) {
            emailId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty((CharSequence)emailId)) {
            return null;
        }
        return emailId;
    }

    static OSEmailSubscriptionState getEmailSubscriptionState() {
        return OneSignal.getCurrentEmailSubscriptionState(appContext);
    }

    static OSObservable<OSEmailSubscriptionObserver, OSEmailSubscriptionStateChanges> getEmailSubscriptionStateChangesObserver() {
        if (emailSubscriptionStateChangesObserver == null) {
            emailSubscriptionStateChangesObserver = new OSObservable("onOSEmailSubscriptionChanged", true);
        }
        return emailSubscriptionStateChangesObserver;
    }

    static boolean getFirebaseAnalyticsEnabled() {
        return remoteParamController.getFirebaseAnalyticsEnabled();
    }

    static FocusTimeController getFocusTimeController() {
        return focusTimeController;
    }

    static OSInAppMessageController getInAppMessageController() {
        return inAppMessageControllerFactory.getController(OneSignal.getDBHelperInstance(), taskController, OneSignal.getLogger());
    }

    private static OSEmailSubscriptionState getLastEmailSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastEmailSubscriptionState == null) {
            lastEmailSubscriptionState = new OSEmailSubscriptionState(true);
        }
        return lastEmailSubscriptionState;
    }

    private static OSPermissionState getLastPermissionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastPermissionState == null) {
            lastPermissionState = new OSPermissionState(true);
        }
        return lastPermissionState;
    }

    private static OSSMSSubscriptionState getLastSMSSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastSMSSubscriptionState == null) {
            lastSMSSubscriptionState = new OSSMSSubscriptionState(true);
        }
        return lastSMSSubscriptionState;
    }

    private static long getLastSessionTime() {
        return OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, "OS_LAST_SESSION_TIME", -31000L);
    }

    private static OSSubscriptionState getLastSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastSubscriptionState == null) {
            lastSubscriptionState = new OSSubscriptionState(true, false);
        }
        return lastSubscriptionState;
    }

    private static LOG_LEVEL getLogLevel(int n) {
        switch (n) {
            default: {
                if (n >= 0) break;
                return LOG_LEVEL.NONE;
            }
            case 6: {
                return LOG_LEVEL.VERBOSE;
            }
            case 5: {
                return LOG_LEVEL.DEBUG;
            }
            case 4: {
                return LOG_LEVEL.INFO;
            }
            case 3: {
                return LOG_LEVEL.WARN;
            }
            case 2: {
                return LOG_LEVEL.ERROR;
            }
            case 1: {
                return LOG_LEVEL.FATAL;
            }
            case 0: {
                return LOG_LEVEL.NONE;
            }
        }
        return LOG_LEVEL.VERBOSE;
    }

    static OSLogger getLogger() {
        return logger;
    }

    static String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", null);
            }
            logger.debug("Not a OneSignal formatted FCM message. No 'i' field in custom.");
            return null;
        }
        catch (JSONException jSONException) {
            logger.debug("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
            return null;
        }
    }

    static OSObservable<OSPermissionObserver, OSPermissionStateChanges> getPermissionStateChangesObserver() {
        if (permissionStateChangesObserver == null) {
            permissionStateChangesObserver = new OSObservable("onOSPermissionChanged", true);
        }
        return permissionStateChangesObserver;
    }

    private static PushRegistrator getPushRegistrator() {
        PushRegistrator pushRegistrator = mPushRegistrator;
        if (pushRegistrator != null) {
            return pushRegistrator;
        }
        if (OSUtils.isFireOSDeviceType()) {
            mPushRegistrator = new PushRegistratorADM();
        } else if (OSUtils.isAndroidDeviceType()) {
            if (OSUtils.hasFCMLibrary()) {
                mPushRegistrator = new PushRegistratorFCM();
            }
        } else {
            mPushRegistrator = new PushRegistratorHMS();
        }
        return mPushRegistrator;
    }

    static OSRemoteParamController getRemoteParamController() {
        return remoteParamController;
    }

    static OneSignalRemoteParams.Params getRemoteParams() {
        return remoteParamController.getRemoteParams();
    }

    static String getSMSId() {
        if (smsId == null && appContext != null) {
            smsId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty((CharSequence)smsId)) {
            return null;
        }
        return smsId;
    }

    static OSSMSSubscriptionState getSMSSubscriptionState() {
        return OneSignal.getCurrentSMSSubscriptionState(appContext);
    }

    static OSObservable<OSSMSSubscriptionObserver, OSSMSSubscriptionStateChanges> getSMSSubscriptionStateChangesObserver() {
        if (smsSubscriptionStateChangesObserver == null) {
            smsSubscriptionStateChangesObserver = new OSObservable("onSMSSubscriptionChanged", true);
        }
        return smsSubscriptionStateChangesObserver;
    }

    static String getSavedAppId() {
        return OneSignal.getSavedAppId(appContext);
    }

    private static String getSavedAppId(Context context) {
        if (context == null) {
            return null;
        }
        return OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "GT_APP_ID", null);
    }

    private static String getSavedUserId(Context context) {
        if (context == null) {
            return null;
        }
        return OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, "GT_PLAYER_ID", null);
    }

    public static String getSdkVersionRaw() {
        return VERSION;
    }

    static OSSessionManager.SessionListener getSessionListener() {
        return sessionListener;
    }

    static OSSessionManager getSessionManager() {
        return sessionManager;
    }

    static OSObservable<OSSubscriptionObserver, OSSubscriptionStateChanges> getSubscriptionStateChangesObserver() {
        if (subscriptionStateChangesObserver == null) {
            subscriptionStateChangesObserver = new OSObservable("onOSSubscriptionChanged", true);
        }
        return subscriptionStateChangesObserver;
    }

    public static void getTags(final OSGetTagsHandler oSGetTagsHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("getTags()")) {
            logger.error("Waiting for remote params. Moving getTags() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running getTags() operation from pending queue.");
                    OneSignal.getTags(oSGetTagsHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("getTags()")) {
            return;
        }
        if (oSGetTagsHandler == null) {
            logger.error("getTags called with null GetTagsHandler!");
            return;
        }
        new Thread(new Runnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                ArrayList arrayList;
                ArrayList arrayList2 = arrayList = pendingGetTagsHandlers;
                synchronized (arrayList2) {
                    pendingGetTagsHandlers.add((Object)oSGetTagsHandler);
                    if (pendingGetTagsHandlers.size() > 1) {
                        return;
                    }
                }
                OneSignal.runGetTags();
            }
        }, "OS_GETTAGS").start();
    }

    static OSTaskController getTaskRemoteController() {
        return taskRemoteController;
    }

    static OSTime getTime() {
        return time;
    }

    private static String getTimeZoneId() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    private static int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int n = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            n += timeZone.getDSTSavings();
        }
        return n / 1000;
    }

    public static Object getTriggerValueForKey(String string2) {
        if (appContext == null) {
            logger.error("Before calling getTriggerValueForKey, Make sure OneSignal initWithContext and setAppId is called first");
            return null;
        }
        return OneSignal.getInAppMessageController().getTriggerValue(string2);
    }

    public static Map<String, Object> getTriggers() {
        if (appContext == null) {
            logger.error("Before calling getTriggers, Make sure OneSignal initWithContext and setAppId is called first");
            return new HashMap();
        }
        return OneSignal.getInAppMessageController().getTriggers();
    }

    static String getUserId() {
        Context context;
        if (userId == null && (context = appContext) != null) {
            userId = OneSignal.getSavedUserId(context);
        }
        return userId;
    }

    private static void handleActivityLifecycleHandler(Context context) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        boolean bl = OneSignal.getCurrentActivity() != null || context instanceof Activity;
        OneSignal.setInForeground(bl);
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal handleActivityLifecycleHandler inForeground: ");
        stringBuilder.append(inForeground);
        oSLogger.debug(stringBuilder.toString());
        if (inForeground) {
            if (OneSignal.getCurrentActivity() == null && activityLifecycleHandler != null) {
                activityLifecycleHandler.setCurActivity((Activity)context);
                activityLifecycleHandler.setNextResumeIsFirstActivity(true);
            }
            OSNotificationRestoreWorkManager.beginEnqueueingWork((Context)context, (boolean)false);
            focusTimeController.appForegrounded();
            return;
        }
        if (activityLifecycleHandler != null) {
            activityLifecycleHandler.setNextResumeIsFirstActivity(true);
        }
    }

    private static void handleAmazonPurchase() {
        try {
            Class.forName((String)"com.amazon.device.iap.PurchasingListener");
            trackAmazonPurchase = new TrackAmazonPurchase(appContext);
        }
        catch (ClassNotFoundException classNotFoundException) {}
    }

    private static void handleAppIdChange() {
        String string2 = OneSignal.getSavedAppId();
        if (string2 != null) {
            if (!string2.equals((Object)appId)) {
                LOG_LEVEL lOG_LEVEL = LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("App id has changed:\nFrom: ");
                stringBuilder.append(string2);
                stringBuilder.append("\n To: ");
                stringBuilder.append(appId);
                stringBuilder.append("\nClearing the user id, app state, and remoteParams as they are no longer valid");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                OneSignal.saveAppId(appId);
                OneSignalStateSynchronizer.resetCurrentState();
                remoteParamController.clearRemoteParams();
                return;
            }
        } else {
            LOG_LEVEL lOG_LEVEL = LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("App id set for first time:  ");
            stringBuilder.append(appId);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            BadgeCountUpdater.updateCount((int)0, (Context)appContext);
            OneSignal.saveAppId(appId);
        }
    }

    static void handleFailedEmailLogout() {
        EmailUpdateHandler emailUpdateHandler = emailLogoutHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            emailLogoutHandler = null;
        }
    }

    static void handleFailedSMSLogout() {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsLogoutHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            smsLogoutHandler = null;
        }
    }

    static void handleNotificationOpen(final Activity activity, final JSONArray jSONArray, final boolean bl, final String string2) {
        if (taskRemoteController.shouldQueueTaskForInit("handleNotificationOpen()")) {
            logger.error("Waiting for remote params. Moving handleNotificationOpen() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    if (OneSignal.appContext != null) {
                        logger.debug("Running handleNotificationOpen() operation from pending queue.");
                        OneSignal.handleNotificationOpen(activity, jSONArray, bl, string2);
                    }
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName(null)) {
            return;
        }
        OneSignal.notificationOpenedRESTCall((Context)activity, jSONArray);
        if (trackFirebaseAnalytics != null && OneSignal.getFirebaseAnalyticsEnabled()) {
            trackFirebaseAnalytics.trackOpenedEvent(OneSignal.generateNotificationOpenedResult(jSONArray));
        }
        boolean bl2 = "DISABLE".equals((Object)OSUtils.getManifestMeta((Context)activity, "com.onesignal.NotificationOpened.DEFAULT"));
        boolean bl3 = false;
        if (!bl2) {
            bl3 = OneSignal.openURLFromNotification((Context)activity, jSONArray);
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("handleNotificationOpen from context: ");
        stringBuilder.append((Object)activity);
        stringBuilder.append(" with fromAlert: ");
        stringBuilder.append(bl);
        stringBuilder.append(" urlOpened: ");
        stringBuilder.append(bl3);
        stringBuilder.append(" defaultOpenActionDisabled: ");
        stringBuilder.append(bl2);
        oSLogger.debug(stringBuilder.toString());
        if (OneSignal.shouldInitDirectSessionFromNotificationOpen(activity, bl, bl3, bl2)) {
            OneSignal.applicationOpenedByNotification(string2);
        }
        OneSignal.runNotificationOpenedCallback(jSONArray);
    }

    static void handleNotificationReceived(OSNotificationGenerationJob oSNotificationGenerationJob) {
        try {
            JSONObject jSONObject = new JSONObject(oSNotificationGenerationJob.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", (Object)oSNotificationGenerationJob.getAndroidId());
            OSNotificationOpenedResult oSNotificationOpenedResult = OneSignal.generateNotificationOpenedResult(NotificationBundleProcessor.newJsonArray((JSONObject)jSONObject));
            if (trackFirebaseAnalytics != null && OneSignal.getFirebaseAnalyticsEnabled()) {
                trackFirebaseAnalytics.trackReceivedEvent(oSNotificationOpenedResult);
                return;
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
    }

    static void handleSuccessfulEmailLogout() {
        EmailUpdateHandler emailUpdateHandler = emailLogoutHandler;
        if (emailUpdateHandler != null) {
            emailUpdateHandler.onSuccess();
            emailLogoutHandler = null;
        }
    }

    static void handleSuccessfulSMSlLogout(JSONObject jSONObject) {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsLogoutHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onSuccess(jSONObject);
            smsLogoutHandler = null;
        }
    }

    static boolean hasEmailId() {
        return true ^ TextUtils.isEmpty((CharSequence)emailId);
    }

    static boolean hasSMSlId() {
        return true ^ TextUtils.isEmpty((CharSequence)smsId);
    }

    static boolean hasUserId() {
        return OneSignal.getUserId() != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void init(Context context) {
        Class<OneSignal> class_ = OneSignal.class;
        synchronized (OneSignal.class) {
            logger.verbose("Starting OneSignal initialization!");
            OSNotificationController.setupNotificationServiceExtension((Context)appContext);
            if (!OneSignal.requiresUserPrivacyConsent() && remoteParamController.isRemoteParamsCallDone()) {
                int n = subscribableStatus;
                if (n == Integer.MAX_VALUE) {
                    n = osUtils.initializationChecker(appContext, appId);
                }
                subscribableStatus = n;
                boolean bl = OneSignal.isSubscriptionStatusUninitializable();
                if (bl) {
                    // ** MonitorExit[var5_1] (shouldn't be in output)
                    return;
                }
                if (initDone) {
                    if (notificationOpenedHandler != null) {
                        OneSignal.fireCallbackForOpenedNotifications();
                    }
                    logger.debug("OneSignal SDK initialization already completed.");
                    // ** MonitorExit[var5_1] (shouldn't be in output)
                    return;
                }
                OneSignal.handleActivityLifecycleHandler(context);
                appActivity = null;
                OneSignalStateSynchronizer.initUserState();
                OneSignal.handleAppIdChange();
                OneSignal.handleAmazonPurchase();
                OSPermissionChangedInternalObserver.handleInternalChanges((OSPermissionState)OneSignal.getCurrentPermissionState(appContext));
                OneSignal.doSessionInit();
                if (notificationOpenedHandler != null) {
                    OneSignal.fireCallbackForOpenedNotifications();
                }
                if (TrackGooglePurchase.CanTrack(appContext)) {
                    trackGooglePurchase = new TrackGooglePurchase(appContext);
                }
                if (TrackFirebaseAnalytics.CanTrack()) {
                    trackFirebaseAnalytics = new TrackFirebaseAnalytics(appContext);
                }
                initDone = true;
                OneSignal.Log(LOG_LEVEL.VERBOSE, "OneSignal SDK initialization done.");
                outcomeEventsController.sendSavedOutcomes();
                taskRemoteController.startPendingTasks();
                // ** MonitorExit[var5_1] (shouldn't be in output)
                return;
            }
            if (!remoteParamController.isRemoteParamsCallDone()) {
                logger.verbose("OneSignal SDK initialization delayed, waiting for remote params.");
            } else {
                logger.verbose("OneSignal SDK initialization delayed, waiting for privacy consent to be set.");
            }
            delayedInitParams = new DelayedConsentInitializationParameters(context, appId);
            String string2 = appId;
            appId = null;
            if (string2 != null && context != null) {
                OneSignal.makeAndroidParamsRequest(string2, OneSignal.getUserId(), false);
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return;
        }
    }

    public static void initWithContext(Context context) {
        if (context == null) {
            logger.warning("initWithContext called with null context, ignoring!");
            return;
        }
        boolean bl = appContext == null;
        appContext = context.getApplicationContext();
        if (context instanceof Activity) {
            appActivity = new WeakReference((Object)((Activity)context));
        }
        OneSignal.setupContextListeners(bl);
        OneSignal.setupPrivacyConsent(appContext);
        if (appId == null) {
            String string2 = OneSignal.getSavedAppId();
            if (string2 == null) {
                logger.warning("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            OSLogger oSLogger = logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("appContext set and cached app id found, calling setAppId with: ");
            stringBuilder.append(string2);
            oSLogger.verbose(stringBuilder.toString());
            OneSignal.setAppId(string2);
            return;
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initWithContext called with: ");
        stringBuilder.append((Object)context);
        oSLogger.verbose(stringBuilder.toString());
        OneSignal.init(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void internalFireGetTagsCallbacks() {
        ArrayList<OSGetTagsHandler> arrayList;
        ArrayList<OSGetTagsHandler> arrayList2 = arrayList = pendingGetTagsHandlers;
        synchronized (arrayList2) {
            if (arrayList.size() == 0) {
                return;
            }
        }
        new Thread(new Runnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                ArrayList arrayList;
                UserStateSynchronizer.GetTagsResult getTagsResult = OneSignalStateSynchronizer.getTags(true ^ getTagsCall);
                if (getTagsResult.serverSuccess) {
                    getTagsCall = true;
                }
                ArrayList arrayList2 = arrayList = pendingGetTagsHandlers;
                synchronized (arrayList2) {
                    Iterator iterator = pendingGetTagsHandlers.iterator();
                    do {
                        if (!iterator.hasNext()) {
                            pendingGetTagsHandlers.clear();
                            return;
                        }
                        OSGetTagsHandler oSGetTagsHandler = (OSGetTagsHandler)iterator.next();
                        JSONObject jSONObject = getTagsResult.result != null && !getTagsResult.toString().equals((Object)"{}") ? getTagsResult.result : null;
                        oSGetTagsHandler.tagsAvailable(jSONObject);
                    } while (true);
                }
            }
        }, "OS_GETTAGS_CALLBACK").start();
    }

    static boolean isAppActive() {
        return initDone && OneSignal.isInForeground();
    }

    public static boolean isInAppMessagingPaused() {
        if (appContext == null) {
            logger.error("Before calling isInAppMessagingPaused, Make sure OneSignal initWithContext and setAppId is called first");
            return false;
        }
        return true ^ OneSignal.getInAppMessageController().inAppMessagingEnabled();
    }

    static boolean isInForeground() {
        return inForeground;
    }

    static boolean isInitDone() {
        return initDone;
    }

    public static boolean isLocationShared() {
        return remoteParamController.isLocationShared();
    }

    private static boolean isPastOnSessionTime() {
        long l = OneSignal.getTime().getCurrentTimeMillis();
        long l2 = OneSignal.getLastSessionTime();
        long l3 = l - l2;
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("isPastOnSessionTime currentTimeMillis: ");
        stringBuilder.append(l);
        stringBuilder.append(" lastSessionTime: ");
        stringBuilder.append(l2);
        stringBuilder.append(" difference: ");
        stringBuilder.append(l3);
        oSLogger.debug(stringBuilder.toString());
        return l3 >= 30000L;
    }

    private static boolean isSubscriptionStatusUninitializable() {
        return subscribableStatus == -999;
    }

    static boolean isUserPrivacyConsentRequired() {
        return remoteParamController.isPrivacyConsentRequired();
    }

    private static boolean isValidOutcomeEntry(String string2) {
        if (string2 != null && !string2.isEmpty()) {
            return true;
        }
        OneSignal.Log(LOG_LEVEL.ERROR, "Outcome name must not be empty");
        return false;
    }

    private static boolean isValidOutcomeValue(float f) {
        if (f <= 0.0f) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Outcome value must be greater than 0");
            return false;
        }
        return true;
    }

    static void logHttpError(String string2, int n, Throwable throwable, String string3) {
        String string4;
        if (string3 != null && OneSignal.atLogLevel(LOG_LEVEL.INFO)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\n");
            stringBuilder.append(string3);
            stringBuilder.append("\n");
            string4 = stringBuilder.toString();
        } else {
            string4 = "";
        }
        LOG_LEVEL lOG_LEVEL = LOG_LEVEL.WARN;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP code: ");
        stringBuilder.append(n);
        stringBuilder.append(" ");
        stringBuilder.append(string2);
        stringBuilder.append(string4);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), throwable);
    }

    public static void logoutEmail() {
        OneSignal.logoutEmail(null);
    }

    public static void logoutEmail(final EmailUpdateHandler emailUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("logoutEmail()")) {
            logger.error("Waiting for remote params. Moving logoutEmail() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running  logoutEmail() operation from pending task queue.");
                    OneSignal.logoutEmail(emailUpdateHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("logoutEmail()")) {
            return;
        }
        if (OneSignal.getEmailId() == null) {
            if (emailUpdateHandler != null) {
                emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.INVALID_OPERATION, "logoutEmail not valid as email was not set or already logged out!"));
            }
            logger.error("logoutEmail not valid as email was not set or already logged out!");
            return;
        }
        emailLogoutHandler = emailUpdateHandler;
        OneSignalStateSynchronizer.logoutEmail();
    }

    public static void logoutSMSNumber() {
        OneSignal.logoutSMSNumber(null);
    }

    public static void logoutSMSNumber(final OSSMSUpdateHandler oSSMSUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("logoutSMSNumber()")) {
            logger.error("Waiting for remote params. Moving logoutSMSNumber() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running  logoutSMSNumber() operation from pending task queue.");
                    OneSignal.logoutSMSNumber(oSSMSUpdateHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("logoutSMSNumber()")) {
            return;
        }
        if (OneSignal.getSMSId() == null) {
            if (oSSMSUpdateHandler != null) {
                oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.INVALID_OPERATION, "logoutSMSNumber() not valid as sms number was not set or already logged out!"));
            }
            logger.error("logoutSMSNumber() not valid as sms number was not set or already logged out!");
            return;
        }
        smsLogoutHandler = oSSMSUpdateHandler;
        OneSignalStateSynchronizer.logoutSMS();
    }

    private static void makeAndroidParamsRequest(String string2, String string3, boolean bl) {
        if (OneSignal.getRemoteParams() == null) {
            if (androidParamsRequestStarted) {
                return;
            }
            androidParamsRequestStarted = true;
            OneSignalRemoteParams.makeAndroidParamsRequest(string2, string3, new OneSignalRemoteParams.Callback(bl){
                final /* synthetic */ boolean val$queuePushRegistration;
                {
                    this.val$queuePushRegistration = bl;
                }

                public void complete(OneSignalRemoteParams.Params params) {
                    OneSignal.access$1102(false);
                    if (params.googleProjectNumber != null) {
                        OneSignal.googleProjectNumber = params.googleProjectNumber;
                    }
                    OneSignal.access$1400().saveRemoteParams(params, OneSignal.access$1200(), OneSignal.access$1300(), OneSignal.access$200());
                    OneSignal.onRemoteParamSet();
                    com.onesignal.NotificationChannelManager.processChannelList((Context)OneSignal.appContext, (JSONArray)params.notificationChannels);
                    if (this.val$queuePushRegistration) {
                        OneSignal.access$1500();
                    }
                }
            });
        }
    }

    static void notValidOrDuplicated(JSONObject jSONObject, OSNotificationDataController.InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        notificationDataController.notValidOrDuplicated(jSONObject, invalidOrDuplicateNotificationCallback);
    }

    private static void notificationOpenedRESTCall(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); ++i) {
            try {
                String string2 = new JSONObject(jSONArray.getJSONObject(i).optString("custom", null)).optString("i", null);
                if (postedOpenedNotifIds.contains((Object)string2)) continue;
                postedOpenedNotifIds.add((Object)string2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", (Object)OneSignal.getSavedAppId(context));
                jSONObject.put("player_id", (Object)OneSignal.getSavedUserId(context));
                jSONObject.put("opened", true);
                jSONObject.put("device_type", osUtils.getDeviceType());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("notifications/");
                stringBuilder.append(string2);
                OneSignalRestClient.put(stringBuilder.toString(), jSONObject, new OneSignalRestClient.ResponseHandler(){

                    void onFailure(int n, String string2, Throwable throwable) {
                        OneSignal.logHttpError("sending Notification Opened Failed", n, throwable, string2);
                    }
                });
                continue;
            }
            catch (Throwable throwable) {
                OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON to send notification opened.", throwable);
            }
        }
    }

    static void onAppFocus() {
        OneSignal.Log(LOG_LEVEL.DEBUG, "Application on focus");
        OneSignal.setInForeground(true);
        if (!appEntryState.equals((Object)AppEntryAction.NOTIFICATION_CLICK)) {
            OneSignal.callEntryStateListeners(appEntryState);
            if (!appEntryState.equals((Object)AppEntryAction.NOTIFICATION_CLICK)) {
                appEntryState = AppEntryAction.APP_OPEN;
            }
        }
        LocationController.onFocusChange();
        if (OSUtils.shouldLogMissingAppIdError(appId)) {
            return;
        }
        if (!remoteParamController.isRemoteParamsCallDone()) {
            OneSignal.Log(LOG_LEVEL.DEBUG, "Delay onAppFocus logic due to missing remote params");
            OneSignal.makeAndroidParamsRequest(appId, OneSignal.getUserId(), false);
            return;
        }
        OneSignal.onAppFocusLogic();
    }

    private static void onAppFocusLogic() {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("onAppFocus")) {
            return;
        }
        focusTimeController.appForegrounded();
        OneSignal.doSessionInit();
        TrackGooglePurchase trackGooglePurchase = OneSignal.trackGooglePurchase;
        if (trackGooglePurchase != null) {
            trackGooglePurchase.trackIAP();
        }
        OSNotificationRestoreWorkManager.beginEnqueueingWork((Context)appContext, (boolean)false);
        OneSignal.getCurrentPermissionState(appContext).refreshAsTo();
        if (trackFirebaseAnalytics != null && OneSignal.getFirebaseAnalyticsEnabled()) {
            trackFirebaseAnalytics.trackInfluenceOpenEvent();
        }
        OSSyncService.getInstance().cancelSyncTask(appContext);
    }

    static void onAppLostFocus() {
        LOG_LEVEL lOG_LEVEL = LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application lost focus initDone: ");
        stringBuilder.append(initDone);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        OneSignal.setInForeground(false);
        appEntryState = AppEntryAction.APP_CLOSE;
        OneSignal.setLastSessionTime(OneSignal.getTime().getCurrentTimeMillis());
        LocationController.onFocusChange();
        if (!initDone) {
            if (taskRemoteController.shouldQueueTaskForInit("onAppLostFocus()")) {
                logger.error("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                taskRemoteController.addTaskToQueue(new Runnable(){

                    public void run() {
                        logger.debug("Running onAppLostFocus() operation from a pending task queue.");
                        OneSignal.backgroundSyncLogic();
                    }
                });
            }
            return;
        }
        OneSignal.backgroundSyncLogic();
    }

    static void onRemoteParamSet() {
        if (!OneSignal.reassignDelayedInitParams() && inForeground) {
            OneSignal.onAppFocusLogic();
        }
    }

    public static void onesignalLog(LOG_LEVEL lOG_LEVEL, String string2) {
        OneSignal.Log(lOG_LEVEL, string2);
    }

    private static boolean openURLFromNotification(Context context, JSONArray jSONArray) {
        boolean bl = OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName(null);
        if (bl) {
            return false;
        }
        int n = jSONArray.length();
        boolean bl2 = "true".equals((Object)OSUtils.getManifestMeta(context, "com.onesignal.suppressLaunchURLs"));
        boolean bl3 = false;
        for (int i = 0; i < n; ++i) {
            JSONObject jSONObject;
            String string2;
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (!jSONObject2.has("custom") || !(jSONObject = new JSONObject(jSONObject2.optString("custom"))).has("u") || (string2 = jSONObject.optString("u", null)) == null || bl2) continue;
            try {
                OSUtils.openURLInBrowser(string2);
                bl3 = true;
                continue;
            }
            catch (Throwable throwable) {
                LOG_LEVEL lOG_LEVEL = LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error parsing JSON item ");
                stringBuilder.append(i);
                stringBuilder.append("/");
                stringBuilder.append(n);
                stringBuilder.append(" for launching a web URL.");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), throwable);
            }
        }
        return bl3;
    }

    public static void pauseInAppMessages(final boolean bl) {
        if (appContext == null) {
            logger.error("Waiting initWithContext. Moving pauseInAppMessages() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running pauseInAppMessages() operation from pending queue.");
                    OneSignal.pauseInAppMessages(bl);
                }
            });
            return;
        }
        OneSignal.getInAppMessageController().setInAppMessagingEnabled(bl ^ true);
    }

    public static void postNotification(String string2, PostNotificationResponseHandler postNotificationResponseHandler) {
        try {
            OneSignal.postNotification(new JSONObject(string2), postNotificationResponseHandler);
            return;
        }
        catch (JSONException jSONException) {
            LOG_LEVEL lOG_LEVEL = LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid postNotification JSON format: ");
            stringBuilder.append(string2);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void postNotification(JSONObject jSONObject, PostNotificationResponseHandler postNotificationResponseHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("postNotification()")) {
            return;
        }
        try {
            if (!jSONObject.has("app_id")) {
                jSONObject.put("app_id", (Object)OneSignal.getSavedAppId());
            }
            if (!jSONObject.has("app_id")) {
                if (postNotificationResponseHandler == null) return;
                postNotificationResponseHandler.onFailure(new JSONObject().put("error", (Object)"Missing app_id"));
                return;
            }
            OneSignalRestClient.post("notifications/", jSONObject, new OneSignalRestClient.ResponseHandler(postNotificationResponseHandler){
                final /* synthetic */ PostNotificationResponseHandler val$handler;
                {
                    this.val$handler = postNotificationResponseHandler;
                }

                void onFailure(int n, String string2, Throwable throwable) {
                    OneSignal.logHttpError("create notification failed", n, throwable, string2);
                    PostNotificationResponseHandler postNotificationResponseHandler = this.val$handler;
                    if (postNotificationResponseHandler != null) {
                        if (n == 0) {
                            string2 = "{\"error\": \"HTTP no response error\"}";
                        }
                        try {
                            postNotificationResponseHandler.onFailure(new JSONObject(string2));
                            return;
                        }
                        catch (Throwable throwable2) {
                            try {
                                this.val$handler.onFailure(new JSONObject("{\"error\": \"Unknown response!\"}"));
                                return;
                            }
                            catch (JSONException jSONException) {
                                jSONException.printStackTrace();
                            }
                        }
                    }
                }

                public void onSuccess(String string2) {
                    OSLogger oSLogger = OneSignal.access$200();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("HTTP create notification success: ");
                    String string3 = string2 != null ? string2 : "null";
                    stringBuilder.append(string3);
                    oSLogger.debug(stringBuilder.toString());
                    if (this.val$handler != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(string2);
                            if (jSONObject.has("errors")) {
                                this.val$handler.onFailure(jSONObject);
                                return;
                            }
                            this.val$handler.onSuccess(new JSONObject(string2));
                            return;
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }
                }
            });
            return;
        }
        catch (JSONException jSONException) {
            logger.error("HTTP create notification json exception!", (Throwable)jSONException);
            if (postNotificationResponseHandler == null) return;
            try {
                postNotificationResponseHandler.onFailure(new JSONObject("{'error': 'HTTP create notification json exception!'}"));
                return;
            }
            catch (JSONException jSONException2) {
                jSONException2.printStackTrace();
            }
            return;
        }
    }

    public static void promptLocation() {
        OneSignal.promptLocation(null, false);
    }

    static void promptLocation(final OSPromptActionCompletionCallback oSPromptActionCompletionCallback, final boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("promptLocation()")) {
            logger.error("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running promptLocation() operation from pending queue.");
                    OneSignal.promptLocation(oSPromptActionCompletionCallback, bl);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("promptLocation()")) {
            return;
        }
        LocationController.LocationPromptCompletionHandler locationPromptCompletionHandler = new LocationController.LocationPromptCompletionHandler(oSPromptActionCompletionCallback){
            final /* synthetic */ OSPromptActionCompletionCallback val$callback;
            {
                this.val$callback = oSPromptActionCompletionCallback;
            }

            public com.onesignal.LocationController$PermissionType getType() {
                return com.onesignal.LocationController$PermissionType.PROMPT_LOCATION;
            }

            void onAnswered(PromptActionResult promptActionResult) {
                super.onAnswered(promptActionResult);
                OSPromptActionCompletionCallback oSPromptActionCompletionCallback = this.val$callback;
                if (oSPromptActionCompletionCallback != null) {
                    oSPromptActionCompletionCallback.onCompleted(promptActionResult);
                }
            }

            public void onComplete(LocationController.LocationPoint locationPoint) {
                if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("promptLocation()")) {
                    return;
                }
                if (locationPoint != null) {
                    OneSignalStateSynchronizer.updateLocation(locationPoint);
                }
            }
        };
        LocationController.getLocation((Context)appContext, (boolean)true, (boolean)bl, (LocationController.LocationHandler)locationPromptCompletionHandler);
    }

    public static void provideUserConsent(boolean bl) {
        boolean bl2 = OneSignal.userProvidedPrivacyConsent();
        remoteParamController.saveUserConsentStatus(bl);
        if (!bl2 && bl && delayedInitParams != null) {
            OneSignal.Log(LOG_LEVEL.VERBOSE, "Privacy consent provided, reassigning all delayed init params and attempting init again...");
            OneSignal.reassignDelayedInitParams();
        }
    }

    private static boolean pushStatusRuntimeError(int n) {
        return n < -6;
    }

    private static boolean reassignDelayedInitParams() {
        Context context;
        String string2;
        if (initDone) {
            return false;
        }
        DelayedConsentInitializationParameters delayedConsentInitializationParameters = delayedInitParams;
        if (delayedConsentInitializationParameters == null) {
            string2 = OneSignal.getSavedAppId();
            context = appContext;
            logger.error("Trying to continue OneSignal with null delayed params");
        } else {
            string2 = delayedConsentInitializationParameters.appId;
            context = OneSignal.delayedInitParams.context;
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reassignDelayedInitParams with appContext: ");
        stringBuilder.append((Object)appContext);
        oSLogger.debug(stringBuilder.toString());
        delayedInitParams = null;
        OneSignal.setAppId(string2);
        if (!initDone) {
            if (context == null) {
                logger.error("Trying to continue OneSignal with null delayed params context");
                return false;
            }
            OneSignal.initWithContext(context);
        }
        return true;
    }

    private static void registerForPushToken() {
        OneSignal.getPushRegistrator().registerForPush(appContext, googleProjectNumber, new PushRegistrator.RegisteredHandler(){

            public void complete(String string2, int n) {
                OSLogger oSLogger = OneSignal.access$200();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("registerForPushToken completed with id: ");
                stringBuilder.append(string2);
                stringBuilder.append(" status: ");
                stringBuilder.append(n);
                oSLogger.debug(stringBuilder.toString());
                if (n < 1) {
                    if (OneSignalStateSynchronizer.getRegistrationId() == null && (OneSignal.access$600() == 1 || OneSignal.access$700(OneSignal.access$600()))) {
                        OneSignal.access$602(n);
                    }
                } else if (OneSignal.access$700(OneSignal.access$600())) {
                    OneSignal.access$602(n);
                }
                OneSignal.access$802(string2);
                OneSignal.access$902(true);
                OneSignal.access$1000(OneSignal.appContext).setPushToken(string2);
                OneSignal.access$500();
            }
        });
    }

    private static void registerUser() {
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("registerUser:registerForPushFired:");
        stringBuilder.append(registerForPushFired);
        stringBuilder.append(", locationFired: ");
        stringBuilder.append(locationFired);
        stringBuilder.append(", remoteParams: ");
        stringBuilder.append((Object)OneSignal.getRemoteParams());
        stringBuilder.append(", appId: ");
        stringBuilder.append(appId);
        oSLogger.debug(stringBuilder.toString());
        if (registerForPushFired && locationFired && OneSignal.getRemoteParams() != null && appId != null) {
            new Thread(new Runnable(){

                public void run() {
                    try {
                        OneSignal.registerUserTask();
                        OneSignalChromeTabAndroidFrame.setup(OneSignal.appId, userId, AdvertisingIdProviderGPS.getLastValue(), OneSignal.getRemoteParams());
                        return;
                    }
                    catch (JSONException jSONException) {
                        OneSignal.Log(LOG_LEVEL.FATAL, "FATAL Error registering device!", jSONException);
                        return;
                    }
                }
            }, "OS_REG_USER").start();
            return;
        }
        logger.debug("registerUser not possible");
    }

    /*
     * Exception decompiling
     */
    private static void registerUserTask() throws JSONException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl66.1 : ALOAD_2 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static void removeEmailSubscriptionObserver(OSEmailSubscriptionObserver oSEmailSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify email subscription observer");
            return;
        }
        OneSignal.getEmailSubscriptionStateChangesObserver().removeObserver((Object)oSEmailSubscriptionObserver);
    }

    static void removeEntryStateListener(EntryStateListener entryStateListener) {
        entryStateListeners.remove((Object)entryStateListener);
    }

    public static void removeExternalUserId() {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeExternalUserId()")) {
            return;
        }
        OneSignal.removeExternalUserId(null);
    }

    public static void removeExternalUserId(OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeExternalUserId()")) {
            return;
        }
        OneSignal.setExternalUserId("", oSExternalUserIdUpdateCompletionHandler);
    }

    public static void removeGroupedNotifications(final String string2) {
        if (!taskRemoteController.shouldQueueTaskForInit("removeGroupedNotifications()") && notificationDataController != null) {
            if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeGroupedNotifications()")) {
                return;
            }
            notificationDataController.removeGroupedNotifications(string2, (WeakReference<Context>)new WeakReference((Object)appContext));
            return;
        }
        logger.error("Waiting for remote params. Moving removeGroupedNotifications() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(){

            public void run() {
                logger.debug("Running removeGroupedNotifications() operation from pending queue.");
                OneSignal.removeGroupedNotifications(string2);
            }
        });
    }

    public static void removeNotification(final int n) {
        if (!taskRemoteController.shouldQueueTaskForInit("removeNotification()") && notificationDataController != null) {
            if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("removeNotification()")) {
                return;
            }
            notificationDataController.removeNotification(n, (WeakReference<Context>)new WeakReference((Object)appContext));
            return;
        }
        logger.error("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(){

            public void run() {
                logger.debug("Running removeNotification() operation from pending queue.");
                OneSignal.removeNotification(n);
            }
        });
    }

    public static void removePermissionObserver(OSPermissionObserver oSPermissionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify permission observer");
            return;
        }
        OneSignal.getPermissionStateChangesObserver().removeObserver((Object)oSPermissionObserver);
    }

    public static void removeSMSSubscriptionObserver(OSSMSSubscriptionObserver oSSMSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify sms subscription observer");
            return;
        }
        OneSignal.getSMSSubscriptionStateChangesObserver().removeObserver((Object)oSSMSSubscriptionObserver);
    }

    public static void removeSubscriptionObserver(OSSubscriptionObserver oSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify subscription observer");
            return;
        }
        OneSignal.getSubscriptionStateChangesObserver().removeObserver((Object)oSSubscriptionObserver);
    }

    public static void removeTriggerForKey(String string2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)string2);
        OneSignal.getInAppMessageController().removeTriggersForKeys((Collection<String>)arrayList);
    }

    public static void removeTriggersForKeys(Collection<String> collection) {
        OneSignal.getInAppMessageController().removeTriggersForKeys(collection);
    }

    public static boolean requiresUserPrivacyConsent() {
        return appContext == null || OneSignal.isUserPrivacyConsentRequired() && !OneSignal.userProvidedPrivacyConsent();
        {
        }
    }

    private static void runGetTags() {
        if (OneSignal.getUserId() == null) {
            logger.warning("getTags called under a null user!");
            return;
        }
        OneSignal.internalFireGetTagsCallbacks();
    }

    private static void runNotificationOpenedCallback(JSONArray jSONArray) {
        if (notificationOpenedHandler == null) {
            unprocessedOpenedNotifs.add((Object)jSONArray);
            return;
        }
        OSNotificationOpenedResult oSNotificationOpenedResult = OneSignal.generateNotificationOpenedResult(jSONArray);
        OneSignal.addEntryStateListener(oSNotificationOpenedResult, appEntryState);
        OneSignal.fireNotificationOpenedHandler(oSNotificationOpenedResult);
    }

    private static void saveAppId(String string2) {
        if (appContext == null) {
            return;
        }
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "GT_APP_ID", string2);
    }

    static void saveEmailId(String string2) {
        emailId = string2;
        if (appContext == null) {
            return;
        }
        String string3 = OneSignalPrefs.PREFS_ONESIGNAL;
        String string4 = "".equals((Object)emailId) ? null : emailId;
        OneSignalPrefs.saveString(string3, "OS_EMAIL_ID", string4);
    }

    static void saveSMSId(String string2) {
        smsId = string2;
        if (appContext == null) {
            return;
        }
        String string3 = OneSignalPrefs.PREFS_ONESIGNAL;
        String string4 = "".equals((Object)smsId) ? null : smsId;
        OneSignalPrefs.saveString(string3, "PREFS_OS_SMS_ID", string4);
    }

    static void saveUserId(String string2) {
        userId = string2;
        if (appContext == null) {
            return;
        }
        OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, "GT_PLAYER_ID", userId);
    }

    private static boolean scheduleSyncService() {
        boolean bl = OneSignalStateSynchronizer.persist();
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal scheduleSyncService unsyncedChanges: ");
        stringBuilder.append(bl);
        oSLogger.debug(stringBuilder.toString());
        if (bl) {
            OSSyncService.getInstance().scheduleSyncTask(appContext);
        }
        boolean bl2 = LocationController.scheduleUpdate((Context)appContext);
        OSLogger oSLogger2 = logger;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("OneSignal scheduleSyncService locationScheduled: ");
        stringBuilder2.append(bl2);
        oSLogger2.debug(stringBuilder2.toString());
        return bl2 || bl;
        {
        }
    }

    static void sendClickActionOutcomes(List<OSInAppMessageOutcome> list) {
        OSOutcomeEventsController oSOutcomeEventsController = outcomeEventsController;
        if (oSOutcomeEventsController != null && appId != null) {
            oSOutcomeEventsController.sendClickActionOutcomes(list);
            return;
        }
        OneSignal.Log(LOG_LEVEL.ERROR, "Make sure OneSignal.init is called first");
    }

    public static void sendOutcome(String string2) {
        OneSignal.sendOutcome(string2, null);
    }

    public static void sendOutcome(final String string2, final OutcomeCallback outcomeCallback) {
        OSOutcomeEventsController oSOutcomeEventsController;
        if (!OneSignal.isValidOutcomeEntry(string2)) {
            logger.error("Make sure OneSignal initWithContext and setAppId is called first");
            return;
        }
        if (!taskRemoteController.shouldQueueTaskForInit("sendOutcome()") && (oSOutcomeEventsController = outcomeEventsController) != null) {
            oSOutcomeEventsController.sendOutcomeEvent(string2, outcomeCallback);
            return;
        }
        logger.error("Waiting for remote params. Moving sendOutcome() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(){

            public void run() {
                logger.debug("Running sendOutcome() operation from pending queue.");
                OneSignal.sendOutcome(string2, outcomeCallback);
            }
        });
    }

    public static void sendOutcomeWithValue(String string2, float f) {
        OneSignal.sendOutcomeWithValue(string2, f, null);
    }

    public static void sendOutcomeWithValue(final String string2, final float f, final OutcomeCallback outcomeCallback) {
        if (OneSignal.isValidOutcomeEntry(string2)) {
            OSOutcomeEventsController oSOutcomeEventsController;
            if (!OneSignal.isValidOutcomeValue(f)) {
                return;
            }
            if (!taskRemoteController.shouldQueueTaskForInit("sendOutcomeWithValue()") && (oSOutcomeEventsController = outcomeEventsController) != null) {
                oSOutcomeEventsController.sendOutcomeEventWithValue(string2, f, outcomeCallback);
                return;
            }
            logger.error("Waiting for remote params. Moving sendOutcomeWithValue() operation to a pending queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running sendOutcomeWithValue() operation from pending queue.");
                    OneSignal.sendOutcomeWithValue(string2, f, outcomeCallback);
                }
            });
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void sendPurchases(JSONArray jSONArray, boolean bl, OneSignalRestClient.ResponseHandler responseHandler) {
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendPurchases()")) {
            return;
        }
        if (OneSignal.getUserId() == null) {
            IAPUpdateJob iAPUpdateJob;
            iapUpdateJob = iAPUpdateJob = new IAPUpdateJob(jSONArray);
            iAPUpdateJob.newAsExisting = bl;
            OneSignal.iapUpdateJob.restResponseHandler = responseHandler;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", (Object)OneSignal.getSavedAppId());
            if (bl) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", (Object)jSONArray);
            OneSignalStateSynchronizer.sendPurchases(jSONObject, responseHandler);
            return;
        }
        catch (Throwable throwable) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Failed to generate JSON for sendPurchases.", throwable);
            return;
        }
    }

    public static void sendTag(final String string2, final String string3) {
        if (taskRemoteController.shouldQueueTaskForInit("sendTag()")) {
            logger.error("Waiting for remote params. Moving sendTag() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running sendTag() operation from pending task queue.");
                    OneSignal.sendTag(string2, string3);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendTag()")) {
            return;
        }
        try {
            OneSignal.sendTags(new JSONObject().put(string2, (Object)string3));
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    public static void sendTags(String string2) {
        try {
            OneSignal.sendTags(new JSONObject(string2));
            return;
        }
        catch (JSONException jSONException) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Generating JSONObject for sendTags failed!", jSONException);
            return;
        }
    }

    public static void sendTags(JSONObject jSONObject) {
        OneSignal.sendTags(jSONObject, null);
    }

    public static void sendTags(final JSONObject jSONObject, final ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("sendTags()")) {
            logger.error("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running sendTags() operation from pending task queue.");
                    OneSignal.sendTags(jSONObject, changeTagsUpdateHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("sendTags()")) {
            return;
        }
        Runnable runnable = new Runnable(){

            /*
             * Exception decompiling
             */
            public void run() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32 : ALOAD_3 : trying to set 1 previously set to 0
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
                // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
                // org.benf.cfr.reader.b.a(Driver.java:128)
                // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
                // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
                // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
                // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
                // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
                // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
                // java.lang.Thread.run(Thread.java:919)
                throw new IllegalStateException("Decompilation failed");
            }
        };
        if (taskRemoteController.shouldRunTaskThroughQueue()) {
            logger.debug("Sending sendTags() operation to pending task queue.");
            taskRemoteController.addTaskToQueue(runnable);
            return;
        }
        runnable.run();
    }

    public static void sendUniqueOutcome(String string2) {
        OneSignal.sendUniqueOutcome(string2, null);
    }

    public static void sendUniqueOutcome(final String string2, final OutcomeCallback outcomeCallback) {
        OSOutcomeEventsController oSOutcomeEventsController;
        if (!OneSignal.isValidOutcomeEntry(string2)) {
            return;
        }
        if (!taskRemoteController.shouldQueueTaskForInit("sendUniqueOutcome()") && (oSOutcomeEventsController = outcomeEventsController) != null) {
            oSOutcomeEventsController.sendUniqueOutcomeEvent(string2, outcomeCallback);
            return;
        }
        logger.error("Waiting for remote params. Moving sendUniqueOutcome() operation to a pending queue.");
        taskRemoteController.addTaskToQueue(new Runnable(){

            public void run() {
                logger.debug("Running sendUniqueOutcome() operation from pending queue.");
                OneSignal.sendUniqueOutcome(string2, outcomeCallback);
            }
        });
    }

    public static void setAppId(String string2) {
        if (string2 != null && !string2.isEmpty()) {
            if (!string2.equals((Object)appId)) {
                initDone = false;
                OSLogger oSLogger = logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setAppId called with id: ");
                stringBuilder.append(string2);
                stringBuilder.append(" changing id from: ");
                stringBuilder.append(appId);
                oSLogger.verbose(stringBuilder.toString());
            }
            appId = string2;
            if (appContext == null) {
                logger.warning("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
                return;
            }
            WeakReference<Activity> weakReference = appActivity;
            if (weakReference != null && weakReference.get() != null) {
                OneSignal.init((Context)appActivity.get());
                return;
            }
            OneSignal.init(appContext);
            return;
        }
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setAppId called with id: ");
        stringBuilder.append(string2);
        stringBuilder.append(", ignoring!");
        oSLogger.warning(stringBuilder.toString());
    }

    public static void setEmail(String string2) {
        OneSignal.setEmail(string2, null, null);
    }

    public static void setEmail(String string2, EmailUpdateHandler emailUpdateHandler) {
        OneSignal.setEmail(string2, null, emailUpdateHandler);
    }

    public static void setEmail(String string2, String string3) {
        OneSignal.setEmail(string2, string3, null);
    }

    public static void setEmail(final String string2, final String string3, final EmailUpdateHandler emailUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setEmail()")) {
            logger.error("Waiting for remote params. Moving setEmail() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running setEmail() operation from a pending task queue.");
                    OneSignal.setEmail(string2, string3, emailUpdateHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setEmail()")) {
            return;
        }
        if (!OSUtils.isValidEmail(string2)) {
            if (emailUpdateHandler != null) {
                emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.VALIDATION, "Email is invalid"));
            }
            logger.error("Email is invalid");
            return;
        }
        if (OneSignal.getRemoteParams().useEmailAuth && (string3 == null || string3.length() == 0)) {
            if (emailUpdateHandler != null) {
                emailUpdateHandler.onFailure(new EmailUpdateError(EmailErrorType.REQUIRES_EMAIL_AUTH, "Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            logger.error("Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        OneSignal.emailUpdateHandler = emailUpdateHandler;
        String string4 = string2.trim();
        if (string3 != null) {
            string3 = string3.toLowerCase();
        }
        OneSignal.getCurrentEmailSubscriptionState(appContext).setEmailAddress(string4);
        OneSignalStateSynchronizer.setEmail(string4.toLowerCase(), string3);
    }

    public static void setExternalUserId(String string2) {
        OneSignal.setExternalUserId(string2, null, null);
    }

    public static void setExternalUserId(String string2, OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        OneSignal.setExternalUserId(string2, null, oSExternalUserIdUpdateCompletionHandler);
    }

    public static void setExternalUserId(String string2, String string3) {
        OneSignal.setExternalUserId(string2, string3, null);
    }

    public static void setExternalUserId(final String string2, final String string3, final OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setExternalUserId()")) {
            logger.error("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running setExternalUserId() operation from pending task queue.");
                    OneSignal.setExternalUserId(string2, string3, oSExternalUserIdUpdateCompletionHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setExternalUserId()")) {
            return;
        }
        if (string2 == null) {
            logger.warning("External id can't be null, set an empty string to remove an external id");
            return;
        }
        if (!string2.isEmpty() && OneSignal.getRemoteParams() != null && OneSignal.getRemoteParams().useUserIdAuth && (string3 == null || string3.length() == 0)) {
            if (oSExternalUserIdUpdateCompletionHandler != null) {
                oSExternalUserIdUpdateCompletionHandler.onFailure(new ExternalIdError(ExternalIdErrorType.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            logger.error("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        if (string3 != null) {
            string3 = string3.toLowerCase();
        }
        try {
            OneSignalStateSynchronizer.setExternalUserId(string2, string3, oSExternalUserIdUpdateCompletionHandler);
            return;
        }
        catch (JSONException jSONException) {
            String string4 = string2.equals((Object)"") ? "remove" : "set";
            OSLogger oSLogger = logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to ");
            stringBuilder.append(string4);
            stringBuilder.append(" external ID but encountered a JSON exception");
            oSLogger.error(stringBuilder.toString());
            jSONException.printStackTrace();
            return;
        }
    }

    public static void setInAppMessageClickHandler(OSInAppMessageClickHandler oSInAppMessageClickHandler) {
        inAppMessageClickHandler = oSInAppMessageClickHandler;
    }

    static void setInForeground(boolean bl) {
        inForeground = bl;
    }

    static void setLastSessionTime(long l) {
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Last session time set to: ");
        stringBuilder.append(l);
        oSLogger.debug(stringBuilder.toString());
        OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, "OS_LAST_SESSION_TIME", l);
    }

    public static void setLocationShared(final boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("setLocationShared()")) {
            logger.error("Waiting for remote params. Moving setLocationShared() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running setLocationShared() operation from pending task queue.");
                    OneSignal.setLocationShared(bl);
                }
            });
            return;
        }
        if (OneSignal.getRemoteParamController().hasLocationKey()) {
            return;
        }
        OneSignal.startLocationShared(bl);
    }

    public static void setLogLevel(int n, int n2) {
        OneSignal.setLogLevel(OneSignal.getLogLevel(n), OneSignal.getLogLevel(n2));
    }

    public static void setLogLevel(LOG_LEVEL lOG_LEVEL, LOG_LEVEL lOG_LEVEL2) {
        logCatLevel = lOG_LEVEL;
        visualLogLevel = lOG_LEVEL2;
    }

    public static void setNotificationOpenedHandler(OSNotificationOpenedHandler oSNotificationOpenedHandler) {
        notificationOpenedHandler = oSNotificationOpenedHandler;
        if (initDone && oSNotificationOpenedHandler != null) {
            OneSignal.fireCallbackForOpenedNotifications();
        }
    }

    public static void setNotificationWillShowInForegroundHandler(OSNotificationWillShowInForegroundHandler oSNotificationWillShowInForegroundHandler) {
        notificationWillShowInForegroundHandler = oSNotificationWillShowInForegroundHandler;
    }

    static void setRemoteNotificationReceivedHandler(OSRemoteNotificationReceivedHandler oSRemoteNotificationReceivedHandler) {
        if (remoteNotificationReceivedHandler == null) {
            remoteNotificationReceivedHandler = oSRemoteNotificationReceivedHandler;
        }
    }

    public static void setRequiresUserPrivacyConsent(boolean bl) {
        if (OneSignal.getRemoteParamController().hasPrivacyConsentKey()) {
            logger.warning("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
            return;
        }
        if (OneSignal.requiresUserPrivacyConsent() && !bl) {
            OneSignal.Log(LOG_LEVEL.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
            return;
        }
        OneSignal.getRemoteParamController().savePrivacyConsentRequired(bl);
    }

    public static void setSMSNumber(String string2) {
        OneSignal.setSMSNumber(string2, null, null);
    }

    public static void setSMSNumber(String string2, OSSMSUpdateHandler oSSMSUpdateHandler) {
        OneSignal.setSMSNumber(string2, null, oSSMSUpdateHandler);
    }

    public static void setSMSNumber(String string2, String string3) {
        OneSignal.setSMSNumber(string2, string3, null);
    }

    public static void setSMSNumber(final String string2, final String string3, final OSSMSUpdateHandler oSSMSUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setSMSNumber()")) {
            logger.error("Waiting for remote params. Moving setSMSNumber() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running setSMSNumber() operation from a pending task queue.");
                    OneSignal.setSMSNumber(string2, string3, oSSMSUpdateHandler);
                }
            });
            return;
        }
        if (OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("setSMSNumber()")) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)string2)) {
            if (oSSMSUpdateHandler != null) {
                oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.VALIDATION, "SMS number is invalid"));
            }
            logger.error("SMS number is invalid");
            return;
        }
        if (OneSignal.getRemoteParams().useSMSAuth && (string3 == null || string3.length() == 0)) {
            if (oSSMSUpdateHandler != null) {
                oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.REQUIRES_SMS_AUTH, "SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
            }
            logger.error("SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            return;
        }
        smsUpdateHandler = oSSMSUpdateHandler;
        OneSignal.getCurrentSMSSubscriptionState(appContext).setSMSNumber(string2);
        OneSignalStateSynchronizer.setSMSNumber(string2, string3);
    }

    static void setSessionManager(OSSessionManager oSSessionManager) {
        sessionManager = oSSessionManager;
    }

    static void setSharedPreferences(OSSharedPreferences oSSharedPreferences) {
        preferences = oSSharedPreferences;
    }

    static void setTime(OSTime oSTime) {
        time = oSTime;
    }

    static void setTrackerFactory(OSTrackerFactory oSTrackerFactory) {
        trackerFactory = oSTrackerFactory;
    }

    private static void setupContextListeners(boolean bl) {
        ActivityLifecycleListener.registerActivityLifecycleCallbacks((Application)((Application)appContext));
        if (bl) {
            OSOutcomeEventsController oSOutcomeEventsController;
            OSNotificationDataController oSNotificationDataController;
            OneSignalPrefs.startDelayedWrite();
            notificationDataController = oSNotificationDataController = new OSNotificationDataController(OneSignal.getDBHelperInstance(), logger);
            oSNotificationDataController.cleanOldCachedData();
            OneSignal.getInAppMessageController().cleanCachedInAppMessages();
            if (outcomeEventsFactory == null) {
                outcomeEventsFactory = new OSOutcomeEventsFactory(logger, apiClient, OneSignal.getDBHelperInstance(), preferences);
            }
            sessionManager.initSessionFromCache();
            outcomeEventsController = oSOutcomeEventsController = new OSOutcomeEventsController(sessionManager, outcomeEventsFactory);
            oSOutcomeEventsController.cleanCachedUniqueOutcomes();
        }
    }

    private static void setupPrivacyConsent(Context context) {
        try {
            OneSignal.setRequiresUserPrivacyConsent("ENABLE".equalsIgnoreCase(context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData.getString("com.onesignal.PrivacyConsent")));
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    static boolean shouldFireForegroundHandlers() {
        if (!OneSignal.isInForeground()) {
            OneSignal.onesignalLog(LOG_LEVEL.INFO, "App is in background, show notification");
            return false;
        }
        if (notificationWillShowInForegroundHandler == null) {
            OneSignal.onesignalLog(LOG_LEVEL.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        }
        return true;
    }

    private static boolean shouldInitDirectSessionFromNotificationOpen(Activity activity, boolean bl, boolean bl2, boolean bl3) {
        return !bl && !bl2 && !bl3 && !inForeground && OneSignal.startOrResumeApp(activity);
    }

    static boolean shouldLogUserPrivacyConsentErrorMessageForMethodName(String string2) {
        if (OneSignal.requiresUserPrivacyConsent()) {
            if (string2 != null) {
                LOG_LEVEL lOG_LEVEL = LOG_LEVEL.WARN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Method ");
                stringBuilder.append(string2);
                stringBuilder.append(" was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            }
            return true;
        }
        return false;
    }

    private static boolean shouldStartNewSession() {
        if (!OneSignal.isInForeground()) {
            return false;
        }
        return OneSignal.isPastOnSessionTime();
    }

    static void startLocationShared(boolean bl) {
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal startLocationShared: ");
        stringBuilder.append(bl);
        oSLogger.debug(stringBuilder.toString());
        OneSignal.getRemoteParamController().saveLocationShared(bl);
        if (!bl) {
            logger.debug("OneSignal is shareLocation set false, clearing last location!");
            OneSignalStateSynchronizer.clearLocation();
        }
    }

    private static void startLocationUpdate() {
        LocationController.LocationHandler locationHandler = new LocationController.LocationHandler(){

            public com.onesignal.LocationController$PermissionType getType() {
                return com.onesignal.LocationController$PermissionType.STARTUP;
            }

            public void onComplete(LocationController.LocationPoint locationPoint) {
                OneSignal.access$302(locationPoint);
                OneSignal.access$402(true);
                OneSignal.access$500();
            }
        };
        LocationController.getLocation((Context)appContext, (boolean)false, (boolean)false, (LocationController.LocationHandler)locationHandler);
    }

    static boolean startOrResumeApp(Activity activity) {
        Intent intent = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        OSLogger oSLogger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("startOrResumeApp from context: ");
        stringBuilder.append((Object)activity);
        stringBuilder.append(" isRoot: ");
        stringBuilder.append(activity.isTaskRoot());
        stringBuilder.append(" with launchIntent: ");
        stringBuilder.append((Object)intent);
        oSLogger.debug(stringBuilder.toString());
        if (intent == null) {
            return false;
        }
        intent.setPackage(null);
        activity.startActivity(intent);
        return true;
    }

    private static void startRegistrationOrOnSession() {
        if (waitingToPostStateSync) {
            return;
        }
        waitingToPostStateSync = true;
        if (inForeground && OneSignalStateSynchronizer.getSyncAsNewSession()) {
            locationFired = false;
        }
        OneSignal.startLocationUpdate();
        registerForPushFired = false;
        if (OneSignal.getRemoteParams() != null) {
            OneSignal.registerForPushToken();
            return;
        }
        OneSignal.makeAndroidParamsRequest(appId, OneSignal.getUserId(), true);
    }

    public static void unsubscribeWhenNotificationsAreDisabled(final boolean bl) {
        if (taskRemoteController.shouldQueueTaskForInit("unsubscribeWhenNotificationsAreDisabled()")) {
            logger.error("Waiting for remote params. Moving unsubscribeWhenNotificationsAreDisabled() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue(new Runnable(){

                public void run() {
                    logger.debug("Running unsubscribeWhenNotificationsAreDisabled() operation from pending task queue.");
                    OneSignal.unsubscribeWhenNotificationsAreDisabled(bl);
                }
            });
            return;
        }
        if (OneSignal.getRemoteParamController().hasUnsubscribeNotificationKey()) {
            logger.warning("unsubscribeWhenNotificationsAreDisabled already called by remote params!, ignoring user set");
            return;
        }
        OneSignal.getRemoteParamController().saveUnsubscribeWhenNotificationsAreDisabled(bl);
    }

    static void updateEmailIdDependents(String string2) {
        OneSignal.saveEmailId(string2);
        OneSignal.getCurrentEmailSubscriptionState(appContext).setEmailUserId(string2);
        try {
            OneSignalStateSynchronizer.updatePushState(new JSONObject().put("parent_player_id", (Object)string2));
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    static void updateSMSIdDependents(String string2) {
        OneSignal.saveSMSId(string2);
        OneSignal.getCurrentSMSSubscriptionState(appContext).setSMSUserId(string2);
    }

    static void updateUserIdDependents(String string2) {
        OneSignal.saveUserId(string2);
        OneSignal.internalFireGetTagsCallbacks();
        OneSignal.getCurrentSubscriptionState(appContext).setUserId(string2);
        IAPUpdateJob iAPUpdateJob = iapUpdateJob;
        if (iAPUpdateJob != null) {
            OneSignal.sendPurchases(iAPUpdateJob.toReport, OneSignal.iapUpdateJob.newAsExisting, OneSignal.iapUpdateJob.restResponseHandler);
            iapUpdateJob = null;
        }
        OneSignalStateSynchronizer.refreshSecondaryChannelState();
        OneSignalChromeTabAndroidFrame.setup(appId, string2, AdvertisingIdProviderGPS.getLastValue(), OneSignal.getRemoteParams());
    }

    public static boolean userProvidedPrivacyConsent() {
        return remoteParamController.getSavedUserConsentStatus();
    }

    public static final class AppEntryAction
    extends Enum<AppEntryAction> {
        private static final /* synthetic */ AppEntryAction[] $VALUES;
        public static final /* enum */ AppEntryAction APP_CLOSE;
        public static final /* enum */ AppEntryAction APP_OPEN;
        public static final /* enum */ AppEntryAction NOTIFICATION_CLICK;

        static {
            AppEntryAction appEntryAction;
            AppEntryAction appEntryAction2;
            AppEntryAction appEntryAction3;
            NOTIFICATION_CLICK = appEntryAction = new AppEntryAction();
            APP_OPEN = appEntryAction2 = new AppEntryAction();
            APP_CLOSE = appEntryAction3 = new AppEntryAction();
            $VALUES = new AppEntryAction[]{appEntryAction, appEntryAction2, appEntryAction3};
        }

        public static AppEntryAction valueOf(String string2) {
            return (AppEntryAction)Enum.valueOf(AppEntryAction.class, (String)string2);
        }

        public static AppEntryAction[] values() {
            return (AppEntryAction[])$VALUES.clone();
        }

        public boolean isAppClose() {
            return this.equals((Object)APP_CLOSE);
        }

        public boolean isAppOpen() {
            return this.equals((Object)APP_OPEN);
        }

        public boolean isNotificationClick() {
            return this.equals((Object)NOTIFICATION_CLICK);
        }
    }

    public static interface ChangeTagsUpdateHandler {
        public void onFailure(SendTagsError var1);

        public void onSuccess(JSONObject var1);
    }

    public static final class EmailErrorType
    extends Enum<EmailErrorType> {
        private static final /* synthetic */ EmailErrorType[] $VALUES;
        public static final /* enum */ EmailErrorType INVALID_OPERATION;
        public static final /* enum */ EmailErrorType NETWORK;
        public static final /* enum */ EmailErrorType REQUIRES_EMAIL_AUTH;
        public static final /* enum */ EmailErrorType VALIDATION;

        static {
            EmailErrorType emailErrorType;
            EmailErrorType emailErrorType2;
            EmailErrorType emailErrorType3;
            EmailErrorType emailErrorType4;
            VALIDATION = emailErrorType3 = new EmailErrorType();
            REQUIRES_EMAIL_AUTH = emailErrorType4 = new EmailErrorType();
            INVALID_OPERATION = emailErrorType2 = new EmailErrorType();
            NETWORK = emailErrorType = new EmailErrorType();
            $VALUES = new EmailErrorType[]{emailErrorType3, emailErrorType4, emailErrorType2, emailErrorType};
        }

        public static EmailErrorType valueOf(String string2) {
            return (EmailErrorType)Enum.valueOf(EmailErrorType.class, (String)string2);
        }

        public static EmailErrorType[] values() {
            return (EmailErrorType[])$VALUES.clone();
        }
    }

    public static class EmailUpdateError {
        private String message;
        private EmailErrorType type;

        EmailUpdateError(EmailErrorType emailErrorType, String string2) {
            this.type = emailErrorType;
            this.message = string2;
        }

        public String getMessage() {
            return this.message;
        }

        public EmailErrorType getType() {
            return this.type;
        }
    }

    public static interface EmailUpdateHandler {
        public void onFailure(EmailUpdateError var1);

        public void onSuccess();
    }

    static interface EntryStateListener {
        public void onEntryStateChange(AppEntryAction var1);
    }

    public static class ExternalIdError {
        private String message;
        private ExternalIdErrorType type;

        ExternalIdError(ExternalIdErrorType externalIdErrorType, String string2) {
            this.type = externalIdErrorType;
            this.message = string2;
        }

        public String getMessage() {
            return this.message;
        }

        public ExternalIdErrorType getType() {
            return this.type;
        }
    }

    public static final class ExternalIdErrorType
    extends Enum<ExternalIdErrorType> {
        private static final /* synthetic */ ExternalIdErrorType[] $VALUES;
        public static final /* enum */ ExternalIdErrorType INVALID_OPERATION;
        public static final /* enum */ ExternalIdErrorType NETWORK;
        public static final /* enum */ ExternalIdErrorType REQUIRES_EXTERNAL_ID_AUTH;

        static {
            ExternalIdErrorType externalIdErrorType;
            ExternalIdErrorType externalIdErrorType2;
            ExternalIdErrorType externalIdErrorType3;
            REQUIRES_EXTERNAL_ID_AUTH = externalIdErrorType3 = new ExternalIdErrorType();
            INVALID_OPERATION = externalIdErrorType2 = new ExternalIdErrorType();
            NETWORK = externalIdErrorType = new ExternalIdErrorType();
            $VALUES = new ExternalIdErrorType[]{externalIdErrorType3, externalIdErrorType2, externalIdErrorType};
        }

        public static ExternalIdErrorType valueOf(String string2) {
            return (ExternalIdErrorType)Enum.valueOf(ExternalIdErrorType.class, (String)string2);
        }

        public static ExternalIdErrorType[] values() {
            return (ExternalIdErrorType[])$VALUES.clone();
        }
    }

    private static class IAPUpdateJob {
        boolean newAsExisting;
        OneSignalRestClient.ResponseHandler restResponseHandler;
        JSONArray toReport;

        IAPUpdateJob(JSONArray jSONArray) {
            this.toReport = jSONArray;
        }
    }

    public static final class LOG_LEVEL
    extends Enum<LOG_LEVEL> {
        private static final /* synthetic */ LOG_LEVEL[] $VALUES;
        public static final /* enum */ LOG_LEVEL DEBUG;
        public static final /* enum */ LOG_LEVEL ERROR;
        public static final /* enum */ LOG_LEVEL FATAL;
        public static final /* enum */ LOG_LEVEL INFO;
        public static final /* enum */ LOG_LEVEL NONE;
        public static final /* enum */ LOG_LEVEL VERBOSE;
        public static final /* enum */ LOG_LEVEL WARN;

        static {
            LOG_LEVEL lOG_LEVEL;
            LOG_LEVEL lOG_LEVEL2;
            LOG_LEVEL lOG_LEVEL3;
            LOG_LEVEL lOG_LEVEL4;
            LOG_LEVEL lOG_LEVEL5;
            LOG_LEVEL lOG_LEVEL6;
            LOG_LEVEL lOG_LEVEL7;
            NONE = lOG_LEVEL3 = new LOG_LEVEL();
            FATAL = lOG_LEVEL2 = new LOG_LEVEL();
            ERROR = lOG_LEVEL6 = new LOG_LEVEL();
            WARN = lOG_LEVEL4 = new LOG_LEVEL();
            INFO = lOG_LEVEL7 = new LOG_LEVEL();
            DEBUG = lOG_LEVEL = new LOG_LEVEL();
            VERBOSE = lOG_LEVEL5 = new LOG_LEVEL();
            $VALUES = new LOG_LEVEL[]{lOG_LEVEL3, lOG_LEVEL2, lOG_LEVEL6, lOG_LEVEL4, lOG_LEVEL7, lOG_LEVEL, lOG_LEVEL5};
        }

        public static LOG_LEVEL valueOf(String string2) {
            return (LOG_LEVEL)Enum.valueOf(LOG_LEVEL.class, (String)string2);
        }

        public static LOG_LEVEL[] values() {
            return (LOG_LEVEL[])$VALUES.clone();
        }
    }

    public static interface OSExternalUserIdUpdateCompletionHandler {
        public void onFailure(ExternalIdError var1);

        public void onSuccess(JSONObject var1);
    }

    public static interface OSGetTagsHandler {
        public void tagsAvailable(JSONObject var1);
    }

    public static interface OSInAppMessageClickHandler {
        public void inAppMessageClicked(OSInAppMessageAction var1);
    }

    static interface OSInternalExternalUserIdUpdateCompletionHandler {
        public void onComplete(String var1, boolean var2);
    }

    public static interface OSNotificationOpenedHandler {
        public void notificationOpened(OSNotificationOpenedResult var1);
    }

    public static interface OSNotificationWillShowInForegroundHandler {
        public void notificationWillShowInForeground(OSNotificationReceivedEvent var1);
    }

    static interface OSPromptActionCompletionCallback {
        public void onCompleted(PromptActionResult var1);
    }

    public static interface OSRemoteNotificationReceivedHandler {
        public void remoteNotificationReceived(Context var1, OSNotificationReceivedEvent var2);
    }

    public static class OSSMSUpdateError {
        private String message;
        private SMSErrorType type;

        OSSMSUpdateError(SMSErrorType sMSErrorType, String string2) {
            this.type = sMSErrorType;
            this.message = string2;
        }

        public String getMessage() {
            return this.message;
        }

        public SMSErrorType getType() {
            return this.type;
        }
    }

    public static interface OSSMSUpdateHandler {
        public void onFailure(OSSMSUpdateError var1);

        public void onSuccess(JSONObject var1);
    }

    public static interface OutcomeCallback {
        public void onSuccess(OSOutcomeEvent var1);
    }

    public static interface PostNotificationResponseHandler {
        public void onFailure(JSONObject var1);

        public void onSuccess(JSONObject var1);
    }

    static final class PromptActionResult
    extends Enum<PromptActionResult> {
        private static final /* synthetic */ PromptActionResult[] $VALUES;
        public static final /* enum */ PromptActionResult ERROR;
        public static final /* enum */ PromptActionResult LOCATION_PERMISSIONS_MISSING_MANIFEST;
        public static final /* enum */ PromptActionResult PERMISSION_DENIED;
        public static final /* enum */ PromptActionResult PERMISSION_GRANTED;

        static {
            PromptActionResult promptActionResult;
            PromptActionResult promptActionResult2;
            PromptActionResult promptActionResult3;
            PromptActionResult promptActionResult4;
            PERMISSION_GRANTED = promptActionResult2 = new PromptActionResult();
            PERMISSION_DENIED = promptActionResult4 = new PromptActionResult();
            LOCATION_PERMISSIONS_MISSING_MANIFEST = promptActionResult = new PromptActionResult();
            ERROR = promptActionResult3 = new PromptActionResult();
            $VALUES = new PromptActionResult[]{promptActionResult2, promptActionResult4, promptActionResult, promptActionResult3};
        }

        public static PromptActionResult valueOf(String string2) {
            return (PromptActionResult)Enum.valueOf(PromptActionResult.class, (String)string2);
        }

        public static PromptActionResult[] values() {
            return (PromptActionResult[])$VALUES.clone();
        }
    }

    public static final class SMSErrorType
    extends Enum<SMSErrorType> {
        private static final /* synthetic */ SMSErrorType[] $VALUES;
        public static final /* enum */ SMSErrorType INVALID_OPERATION;
        public static final /* enum */ SMSErrorType NETWORK;
        public static final /* enum */ SMSErrorType REQUIRES_SMS_AUTH;
        public static final /* enum */ SMSErrorType VALIDATION;

        static {
            SMSErrorType sMSErrorType;
            SMSErrorType sMSErrorType2;
            SMSErrorType sMSErrorType3;
            SMSErrorType sMSErrorType4;
            VALIDATION = sMSErrorType2 = new SMSErrorType();
            REQUIRES_SMS_AUTH = sMSErrorType3 = new SMSErrorType();
            INVALID_OPERATION = sMSErrorType = new SMSErrorType();
            NETWORK = sMSErrorType4 = new SMSErrorType();
            $VALUES = new SMSErrorType[]{sMSErrorType2, sMSErrorType3, sMSErrorType, sMSErrorType4};
        }

        public static SMSErrorType valueOf(String string2) {
            return (SMSErrorType)Enum.valueOf(SMSErrorType.class, (String)string2);
        }

        public static SMSErrorType[] values() {
            return (SMSErrorType[])$VALUES.clone();
        }
    }

    public static class SendTagsError {
        private int code;
        private String message;

        SendTagsError(int n, String string2) {
            this.message = string2;
            this.code = n;
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }
    }

}

