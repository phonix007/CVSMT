/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  com.onesignal.BackgroundRunnable
 *  com.onesignal.OSBackgroundManager
 *  com.onesignal.OSDynamicTriggerController
 *  com.onesignal.OSDynamicTriggerController$OSDynamicTriggerControllerObserver
 *  com.onesignal.OSInAppMessage
 *  com.onesignal.OSInAppMessageAction
 *  com.onesignal.OSInAppMessageAction$OSInAppMessageActionUrlType
 *  com.onesignal.OSInAppMessageController$1
 *  com.onesignal.OSInAppMessageController$10
 *  com.onesignal.OSInAppMessageController$12
 *  com.onesignal.OSInAppMessageController$19
 *  com.onesignal.OSInAppMessageController$20
 *  com.onesignal.OSInAppMessageController$3
 *  com.onesignal.OSInAppMessageController$4
 *  com.onesignal.OSInAppMessageController$5
 *  com.onesignal.OSInAppMessageController$8
 *  com.onesignal.OSInAppMessageController$9
 *  com.onesignal.OSInAppMessageOutcome
 *  com.onesignal.OSInAppMessagePage
 *  com.onesignal.OSInAppMessagePrompt
 *  com.onesignal.OSInAppMessageRedisplayStats
 *  com.onesignal.OSInAppMessageRepository
 *  com.onesignal.OSInAppMessageTag
 *  com.onesignal.OSLogger
 *  com.onesignal.OSSystemConditionController
 *  com.onesignal.OSSystemConditionController$OSSystemConditionObserver
 *  com.onesignal.OSTaskController
 *  com.onesignal.OSTriggerController
 *  com.onesignal.OSUtils
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.OneSignal$OSGetTagsHandler
 *  com.onesignal.OneSignal$OSInAppMessageClickHandler
 *  com.onesignal.OneSignal$OSPromptActionCompletionCallback
 *  com.onesignal.OneSignal$PromptActionResult
 *  com.onesignal.OneSignalChromeTab
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.OneSignalRestClient
 *  com.onesignal.OneSignalRestClient$ResponseHandler
 *  com.onesignal.R
 *  com.onesignal.R$string
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.onesignal.BackgroundRunnable;
import com.onesignal.OSBackgroundManager;
import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSInAppMessage;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSInAppMessagePage;
import com.onesignal.OSInAppMessagePrompt;
import com.onesignal.OSInAppMessageRedisplayStats;
import com.onesignal.OSInAppMessageRepository;
import com.onesignal.OSInAppMessageTag;
import com.onesignal.OSLogger;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OSTaskController;
import com.onesignal.OSTriggerController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalChromeTab;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;
import com.onesignal.R;
import com.onesignal.WebViewManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageController
extends OSBackgroundManager
implements OSDynamicTriggerController.OSDynamicTriggerControllerObserver,
OSSystemConditionController.OSSystemConditionObserver {
    public static final String IN_APP_MESSAGES_JSON_KEY = "in_app_messages";
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private static final Object LOCK = new Object();
    private static final String OS_IAM_DB_ACCESS = "OS_IAM_DB_ACCESS";
    private static ArrayList<String> PREFERRED_VARIANT_ORDER = new 1();
    private final Set<String> clickedClickIds;
    private OSInAppMessagePrompt currentPrompt = null;
    private final Set<String> dismissedMessages;
    private int htmlNetworkRequestAttemptCount = 0;
    private final Set<String> impressionedMessages;
    private OSInAppMessageRepository inAppMessageRepository;
    private boolean inAppMessageShowing = false;
    private boolean inAppMessagingEnabled = true;
    Date lastTimeInAppDismissed = null;
    private final OSLogger logger;
    private final ArrayList<OSInAppMessage> messageDisplayQueue;
    private ArrayList<OSInAppMessage> messages;
    private String pendingHTMLContent = null;
    private List<OSInAppMessage> redisplayedInAppMessages = null;
    private OSSystemConditionController systemConditionController;
    private final OSTaskController taskController;
    OSTriggerController triggerController;
    private String userTagsString = null;
    private final Set<String> viewedPageIds;
    private boolean waitForTags = false;

    protected OSInAppMessageController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger) {
        Set set;
        Set set2;
        Set set3;
        Set set4;
        Set set5;
        Set set6;
        Set set7;
        this.taskController = oSTaskController;
        this.messages = new ArrayList();
        this.dismissedMessages = set2 = OSUtils.newConcurrentSet();
        this.messageDisplayQueue = new ArrayList();
        this.impressionedMessages = set7 = OSUtils.newConcurrentSet();
        this.viewedPageIds = set4 = OSUtils.newConcurrentSet();
        this.clickedClickIds = set3 = OSUtils.newConcurrentSet();
        this.triggerController = new OSTriggerController((OSDynamicTriggerController.OSDynamicTriggerControllerObserver)this);
        this.systemConditionController = new OSSystemConditionController((OSSystemConditionController.OSSystemConditionObserver)this);
        this.logger = oSLogger;
        Set set8 = OneSignalPrefs.getStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_DISPLAYED_IAMS", null);
        if (set8 != null) {
            set2.addAll((Collection)set8);
        }
        if ((set6 = OneSignalPrefs.getStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_IMPRESSIONED_IAMS", null)) != null) {
            set7.addAll((Collection)set6);
        }
        if ((set = OneSignalPrefs.getStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_PAGE_IMPRESSIONED_IAMS", null)) != null) {
            set4.addAll((Collection)set);
        }
        if ((set5 = OneSignalPrefs.getStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_CLICKED_CLICK_IDS_IAMS", null)) != null) {
            set3.addAll((Collection)set5);
        }
        this.initRedisplayData(oneSignalDbHelper);
    }

    static /* synthetic */ int access$1908(OSInAppMessageController oSInAppMessageController) {
        int n = oSInAppMessageController.htmlNetworkRequestAttemptCount;
        oSInAppMessageController.htmlNetworkRequestAttemptCount = n + 1;
        return n;
    }

    static /* synthetic */ void access$2200(OSInAppMessageController oSInAppMessageController, Collection collection) {
        oSInAppMessageController.checkRedisplayMessagesAndEvaluate((Collection<String>)collection);
    }

    static /* synthetic */ void access$300(OSInAppMessageController oSInAppMessageController) {
        oSInAppMessageController.resetRedisplayMessagesBySession();
    }

    static /* synthetic */ void access$400(OSInAppMessageController oSInAppMessageController, JSONArray jSONArray) throws JSONException {
        oSInAppMessageController.processInAppMessageJson(jSONArray);
    }

    static /* synthetic */ void access$500(OSInAppMessageController oSInAppMessageController) {
        oSInAppMessageController.evaluateInAppMessages();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void attemptToShowInAppMessage() {
        ArrayList<OSInAppMessage> arrayList;
        ArrayList<OSInAppMessage> arrayList2 = arrayList = this.messageDisplayQueue;
        synchronized (arrayList2) {
            if (!this.systemConditionController.systemConditionsAvailable()) {
                this.logger.warning("In app message not showing due to system condition not correct");
                return;
            }
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("displayFirstIAMOnQueue: ");
            stringBuilder.append(this.messageDisplayQueue);
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            if (this.messageDisplayQueue.size() > 0 && !this.isInAppMessageShowing()) {
                this.logger.debug("No IAM showing currently, showing first item in the queue!");
                this.displayMessage((OSInAppMessage)this.messageDisplayQueue.get(0));
                return;
            }
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: ");
            stringBuilder2.append(this.isInAppMessageShowing());
            oSLogger.debug(stringBuilder2.toString());
            return;
        }
    }

    private void beginProcessingPrompts(OSInAppMessage oSInAppMessage, List<OSInAppMessagePrompt> list) {
        if (list.size() > 0) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IAM showing prompts from IAM: ");
            stringBuilder.append(oSInAppMessage.toString());
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            WebViewManager.dismissCurrentInAppMessage();
            this.showMultiplePrompts(oSInAppMessage, list);
        }
    }

    private void checkRedisplayMessagesAndEvaluate(Collection<String> collection) {
        this.makeRedisplayMessagesAvailableWithTriggers(collection);
        this.evaluateInAppMessages();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void dismissCurrentMessage(OSInAppMessage oSInAppMessage) {
        ArrayList<OSInAppMessage> arrayList;
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClickFinished();
        if (this.currentPrompt != null) {
            this.logger.debug("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.inAppMessageShowing = false;
        ArrayList<OSInAppMessage> arrayList2 = arrayList = this.messageDisplayQueue;
        synchronized (arrayList2) {
            if (this.messageDisplayQueue.size() > 0) {
                if (oSInAppMessage != null && !this.messageDisplayQueue.contains((Object)oSInAppMessage)) {
                    this.logger.debug("Message already removed from the queue!");
                    return;
                }
                String string = ((OSInAppMessage)this.messageDisplayQueue.remove((int)0)).messageId;
                OSLogger oSLogger = this.logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("In app message with id: ");
                stringBuilder.append(string);
                stringBuilder.append(", dismissed (removed) from the queue!");
                oSLogger.debug(stringBuilder.toString());
            }
            if (this.messageDisplayQueue.size() > 0) {
                OSLogger oSLogger = this.logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("In app message on queue available: ");
                stringBuilder.append(((OSInAppMessage)this.messageDisplayQueue.get((int)0)).messageId);
                oSLogger.debug(stringBuilder.toString());
                this.displayMessage((OSInAppMessage)this.messageDisplayQueue.get(0));
            } else {
                this.logger.debug("In app message dismissed evaluating messages");
                this.evaluateInAppMessages();
            }
            return;
        }
    }

    private void displayMessage(final OSInAppMessage oSInAppMessage) {
        if (!this.inAppMessagingEnabled) {
            this.logger.verbose("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.inAppMessageShowing = true;
        this.getTagsForLiquidTemplating(oSInAppMessage, false);
        OneSignalRestClient.get((String)this.htmlPathForMessage(oSInAppMessage), (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            void onFailure(int n, String string, Throwable throwable) {
                OSInAppMessageController.this.inAppMessageShowing = false;
                OSInAppMessageController.this.printHttpErrorForInAppMessageRequest("html", n, string);
                if (OSUtils.shouldRetryNetworkRequest((int)n) && OSInAppMessageController.this.htmlNetworkRequestAttemptCount < OSUtils.MAX_NETWORK_REQUEST_ATTEMPT_COUNT) {
                    OSInAppMessageController.access$1908(OSInAppMessageController.this);
                    OSInAppMessageController.this.queueMessageForDisplay(oSInAppMessage);
                    return;
                }
                OSInAppMessageController.this.htmlNetworkRequestAttemptCount = 0;
                OSInAppMessageController.this.messageWasDismissed(oSInAppMessage, true);
            }

            void onSuccess(String string) {
                OSInAppMessageController.this.htmlNetworkRequestAttemptCount = 0;
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("html");
                    double d = jSONObject.optDouble("display_duration");
                    oSInAppMessage.setDisplayDuration(d);
                    if (OSInAppMessageController.this.waitForTags) {
                        OSInAppMessageController.this.pendingHTMLContent = string2;
                        return;
                    }
                    OneSignal.getSessionManager().onInAppMessageReceived(oSInAppMessage.messageId);
                    WebViewManager.showHTMLString(oSInAppMessage, OSInAppMessageController.this.taggedHTMLString(string2));
                    return;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
        }, null);
    }

    private void evaluateInAppMessages() {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"Starting evaluateInAppMessages");
        if (this.shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue((Runnable)new 4(this));
            return;
        }
        for (OSInAppMessage oSInAppMessage : this.messages) {
            if (!this.triggerController.evaluateMessageTriggers(oSInAppMessage)) continue;
            this.setDataForRedisplay(oSInAppMessage);
            if (this.dismissedMessages.contains((Object)oSInAppMessage.messageId) || oSInAppMessage.isFinished()) continue;
            this.queueMessageForDisplay(oSInAppMessage);
        }
    }

    private void fireClickAction(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getClickUrl() != null && !oSInAppMessageAction.getClickUrl().isEmpty()) {
            if (oSInAppMessageAction.getUrlTarget() == OSInAppMessageAction.OSInAppMessageActionUrlType.BROWSER) {
                OSUtils.openURLInBrowser((String)oSInAppMessageAction.getClickUrl());
                return;
            }
            if (oSInAppMessageAction.getUrlTarget() == OSInAppMessageAction.OSInAppMessageActionUrlType.IN_APP_WEBVIEW) {
                OneSignalChromeTab.open((String)oSInAppMessageAction.getClickUrl(), (boolean)true);
            }
        }
    }

    private void fireOutcomesForClick(String string, List<OSInAppMessageOutcome> list) {
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(string);
        OneSignal.sendClickActionOutcomes(list);
    }

    private void firePublicClickHandler(String string, OSInAppMessageAction oSInAppMessageAction) {
        if (OneSignal.inAppMessageClickHandler == null) {
            return;
        }
        OSUtils.runOnMainUIThread((Runnable)new 9(this, string, oSInAppMessageAction));
    }

    private void fireRESTCallForClick(OSInAppMessage oSInAppMessage, final OSInAppMessageAction oSInAppMessageAction) {
        String string = this.variantIdForMessage(oSInAppMessage);
        if (string == null) {
            return;
        }
        String string2 = oSInAppMessageAction.getClickId();
        boolean bl = oSInAppMessage.getRedisplayStats().isRedisplayEnabled() && oSInAppMessage.isClickAvailable(string2);
        if (!bl && this.clickedClickIds.contains((Object)string2)) {
            return;
        }
        this.clickedClickIds.add((Object)string2);
        oSInAppMessage.addClickId(string2);
        try {
            12 var7_6 = new 12(this, string2, string, oSInAppMessageAction);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("in_app_messages/");
            stringBuilder.append(oSInAppMessage.messageId);
            stringBuilder.append("/click");
            OneSignalRestClient.post((String)stringBuilder.toString(), (JSONObject)var7_6, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

                void onFailure(int n, String string, Throwable throwable) {
                    OSInAppMessageController.this.printHttpErrorForInAppMessageRequest("engagement", n, string);
                    OSInAppMessageController.this.clickedClickIds.remove((Object)oSInAppMessageAction.getClickId());
                }

                void onSuccess(String string) {
                    OSInAppMessageController.this.printHttpSuccessForInAppMessageRequest("engagement", string);
                    OneSignalPrefs.saveStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_CLICKED_CLICK_IDS_IAMS", (Set)OSInAppMessageController.this.clickedClickIds);
                }
            });
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"Unable to execute in-app message action HTTP request due to invalid JSON");
            return;
        }
    }

    private void fireRESTCallForPageChange(OSInAppMessage oSInAppMessage, OSInAppMessagePage oSInAppMessagePage) {
        String string = this.variantIdForMessage(oSInAppMessage);
        if (string == null) {
            return;
        }
        String string2 = oSInAppMessagePage.getPageId();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(oSInAppMessage.messageId);
        stringBuilder.append(string2);
        final String string3 = stringBuilder.toString();
        if (this.viewedPageIds.contains((Object)string3)) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Already sent page impression for id: ");
            stringBuilder2.append(string2);
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder2.toString());
            return;
        }
        this.viewedPageIds.add((Object)string3);
        try {
            10 var10_9 = new 10(this, string, string2);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("in_app_messages/");
            stringBuilder3.append(oSInAppMessage.messageId);
            stringBuilder3.append("/pageImpression");
            OneSignalRestClient.post((String)stringBuilder3.toString(), (JSONObject)var10_9, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

                void onFailure(int n, String string, Throwable throwable) {
                    OSInAppMessageController.this.printHttpErrorForInAppMessageRequest("page impression", n, string);
                    OSInAppMessageController.this.viewedPageIds.remove((Object)string3);
                }

                void onSuccess(String string) {
                    OSInAppMessageController.this.printHttpSuccessForInAppMessageRequest("page impression", string);
                    OSInAppMessageController.this.saveViewedPageIdsToPrefs();
                }
            });
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"Unable to execute in-app message impression HTTP request due to invalid JSON");
            return;
        }
    }

    private void fireTagCallForClick(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getTags() != null) {
            OSInAppMessageTag oSInAppMessageTag = oSInAppMessageAction.getTags();
            if (oSInAppMessageTag.getTagsToAdd() != null) {
                OneSignal.sendTags((JSONObject)oSInAppMessageTag.getTagsToAdd());
            }
            if (oSInAppMessageTag.getTagsToRemove() != null) {
                OneSignal.deleteTags((JSONArray)oSInAppMessageTag.getTagsToRemove(), null);
            }
        }
    }

    private void getTagsForLiquidTemplating(final OSInAppMessage oSInAppMessage, final boolean bl) {
        this.waitForTags = false;
        if (bl || oSInAppMessage.getHasLiquid()) {
            this.waitForTags = true;
            OneSignal.getTags((OneSignal.OSGetTagsHandler)new OneSignal.OSGetTagsHandler(){

                public void tagsAvailable(JSONObject jSONObject) {
                    OSInAppMessageController.this.waitForTags = false;
                    if (jSONObject != null) {
                        OSInAppMessageController.this.userTagsString = jSONObject.toString();
                    }
                    if (OSInAppMessageController.this.pendingHTMLContent != null) {
                        if (!bl) {
                            OneSignal.getSessionManager().onInAppMessageReceived(oSInAppMessage.messageId);
                        }
                        OSInAppMessage oSInAppMessage2 = oSInAppMessage;
                        OSInAppMessageController oSInAppMessageController = OSInAppMessageController.this;
                        WebViewManager.showHTMLString(oSInAppMessage2, oSInAppMessageController.taggedHTMLString(oSInAppMessageController.pendingHTMLContent));
                        OSInAppMessageController.this.pendingHTMLContent = null;
                    }
                }
            });
        }
    }

    private boolean hasMessageTriggerChanged(OSInAppMessage oSInAppMessage) {
        boolean bl = this.triggerController.messageHasOnlyDynamicTriggers(oSInAppMessage);
        boolean bl2 = true;
        if (bl) {
            return bl2 ^ oSInAppMessage.isDisplayedInSession();
        }
        boolean bl3 = !oSInAppMessage.isDisplayedInSession() && oSInAppMessage.triggers.isEmpty();
        if (!oSInAppMessage.isTriggerChanged()) {
            if (bl3) {
                return bl2;
            }
            bl2 = false;
        }
        return bl2;
    }

    private String htmlPathForMessage(OSInAppMessage oSInAppMessage) {
        String string = this.variantIdForMessage(oSInAppMessage);
        if (string == null) {
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to find a variant for in-app message ");
            stringBuilder.append(oSInAppMessage.messageId);
            oSLogger.error(stringBuilder.toString());
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("in_app_messages/");
        stringBuilder.append(oSInAppMessage.messageId);
        stringBuilder.append("/variants/");
        stringBuilder.append(string);
        stringBuilder.append("/html?app_id=");
        stringBuilder.append(OneSignal.appId);
        return stringBuilder.toString();
    }

    private void logInAppMessagePreviewActions(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getTags() != null) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: ");
            stringBuilder.append(oSInAppMessageAction.getTags().toString());
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        }
        if (oSInAppMessageAction.getOutcomes().size() > 0) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: ");
            stringBuilder.append(oSInAppMessageAction.getOutcomes().toString());
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        }
    }

    private void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection) {
        for (OSInAppMessage oSInAppMessage : this.messages) {
            if (oSInAppMessage.isTriggerChanged() || !this.redisplayedInAppMessages.contains((Object)oSInAppMessage) || !this.triggerController.isTriggerOnMessage(oSInAppMessage, collection)) continue;
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trigger changed for message: ");
            stringBuilder.append(oSInAppMessage.toString());
            oSLogger.debug(stringBuilder.toString());
            oSInAppMessage.setTriggerChanged(true);
        }
    }

    private void persistInAppMessage(final OSInAppMessage oSInAppMessage) {
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        oSInAppMessage.getRedisplayStats().setLastDisplayTime(l);
        oSInAppMessage.getRedisplayStats().incrementDisplayQuantity();
        oSInAppMessage.setTriggerChanged(false);
        oSInAppMessage.setDisplayedInSession(true);
        this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

            public void run() {
                super.run();
                OSInAppMessageController.this.inAppMessageRepository.saveInAppMessage(oSInAppMessage);
            }
        }, OS_IAM_DB_ACCESS);
        int n = this.redisplayedInAppMessages.indexOf((Object)oSInAppMessage);
        if (n != -1) {
            this.redisplayedInAppMessages.set(n, (Object)oSInAppMessage);
        } else {
            this.redisplayedInAppMessages.add((Object)oSInAppMessage);
        }
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("persistInAppMessageForRedisplay: ");
        stringBuilder.append(oSInAppMessage.toString());
        stringBuilder.append(" with msg array data: ");
        stringBuilder.append(this.redisplayedInAppMessages.toString());
        oSLogger.debug(stringBuilder.toString());
    }

    private void printHttpErrorForInAppMessageRequest(String string, int n, String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Encountered a ");
        stringBuilder.append(n);
        stringBuilder.append(" error while attempting in-app message ");
        stringBuilder.append(string);
        stringBuilder.append(" request: ");
        stringBuilder.append(string2);
        oSLogger.error(stringBuilder.toString());
    }

    private void printHttpSuccessForInAppMessageRequest(String string, String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Successful post for in-app message ");
        stringBuilder.append(string);
        stringBuilder.append(" request: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void processInAppMessageJson(JSONArray jSONArray) throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            ArrayList arrayList = new ArrayList();
            int n = 0;
            do {
                if (n >= jSONArray.length()) {
                    this.messages = arrayList;
                    // MONITOREXIT [3, 4, 5] lbl8 : w: MONITOREXIT : var7_3
                    this.evaluateInAppMessages();
                    return;
                }
                arrayList.add((Object)new OSInAppMessage(jSONArray.getJSONObject(n)));
                ++n;
            } while (true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void queueMessageForDisplay(OSInAppMessage oSInAppMessage) {
        ArrayList<OSInAppMessage> arrayList;
        ArrayList<OSInAppMessage> arrayList2 = arrayList = this.messageDisplayQueue;
        synchronized (arrayList2) {
            if (!this.messageDisplayQueue.contains((Object)oSInAppMessage)) {
                this.messageDisplayQueue.add((Object)oSInAppMessage);
                OSLogger oSLogger = this.logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("In app message with id: ");
                stringBuilder.append(oSInAppMessage.messageId);
                stringBuilder.append(", added to the queue");
                oSLogger.debug(stringBuilder.toString());
            }
            this.attemptToShowInAppMessage();
            return;
        }
    }

    private void resetRedisplayMessagesBySession() {
        Iterator iterator = this.redisplayedInAppMessages.iterator();
        while (iterator.hasNext()) {
            ((OSInAppMessage)iterator.next()).setDisplayedInSession(false);
        }
    }

    private void saveViewedPageIdsToPrefs() {
        OneSignalPrefs.saveStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_PAGE_IMPRESSIONED_IAMS", this.viewedPageIds);
    }

    private void setDataForRedisplay(OSInAppMessage oSInAppMessage) {
        boolean bl = this.dismissedMessages.contains((Object)oSInAppMessage.messageId);
        int n = this.redisplayedInAppMessages.indexOf((Object)oSInAppMessage);
        if (bl && n != -1) {
            OSInAppMessage oSInAppMessage2 = (OSInAppMessage)this.redisplayedInAppMessages.get(n);
            oSInAppMessage.getRedisplayStats().setDisplayStats(oSInAppMessage2.getRedisplayStats());
            oSInAppMessage.setDisplayedInSession(oSInAppMessage2.isDisplayedInSession());
            boolean bl2 = this.hasMessageTriggerChanged(oSInAppMessage);
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setDataForRedisplay: ");
            stringBuilder.append(oSInAppMessage.toString());
            stringBuilder.append(" triggerHasChanged: ");
            stringBuilder.append(bl2);
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            if (bl2 && oSInAppMessage.getRedisplayStats().isDelayTimeSatisfied() && oSInAppMessage.getRedisplayStats().shouldDisplayAgain()) {
                OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("setDataForRedisplay message available for redisplay: ");
                stringBuilder2.append(oSInAppMessage.messageId);
                OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL2, (String)stringBuilder2.toString());
                this.dismissedMessages.remove((Object)oSInAppMessage.messageId);
                this.impressionedMessages.remove((Object)oSInAppMessage.messageId);
                this.viewedPageIds.clear();
                this.saveViewedPageIdsToPrefs();
                oSInAppMessage.clearClickIds();
            }
        }
    }

    private void showAlertDialogMessage(OSInAppMessage oSInAppMessage, List<OSInAppMessagePrompt> list) {
        String string2 = OneSignal.appContext.getString(R.string.location_not_available_title);
        String string3 = OneSignal.appContext.getString(R.string.location_not_available_message);
        new AlertDialog.Builder((Context)OneSignal.getCurrentActivity()).setTitle((CharSequence)string2).setMessage((CharSequence)string3).setPositiveButton(17039370, (DialogInterface.OnClickListener)new 8(this, oSInAppMessage, list)).show();
    }

    private void showMultiplePrompts(final OSInAppMessage oSInAppMessage, final List<OSInAppMessagePrompt> list) {
        for (OSInAppMessagePrompt oSInAppMessagePrompt : list) {
            if (oSInAppMessagePrompt.hasPrompted()) continue;
            this.currentPrompt = oSInAppMessagePrompt;
            break;
        }
        if (this.currentPrompt != null) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IAM prompt to handle: ");
            stringBuilder.append(this.currentPrompt.toString());
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            this.currentPrompt.setPrompted(true);
            this.currentPrompt.handlePrompt(new OneSignal.OSPromptActionCompletionCallback(){

                public void onCompleted(OneSignal.PromptActionResult promptActionResult) {
                    OSInAppMessageController.this.currentPrompt = null;
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("IAM prompt to handle finished with result: ");
                    stringBuilder.append((Object)promptActionResult);
                    OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                    if (oSInAppMessage.isPreview && promptActionResult == OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        OSInAppMessageController.this.showAlertDialogMessage(oSInAppMessage, (List<OSInAppMessagePrompt>)list);
                        return;
                    }
                    OSInAppMessageController.this.showMultiplePrompts(oSInAppMessage, (List<OSInAppMessagePrompt>)list);
                }
            });
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No IAM prompt to handle, dismiss message: ");
        stringBuilder.append(oSInAppMessage.messageId);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.messageWasDismissed(oSInAppMessage);
    }

    private String variantIdForMessage(OSInAppMessage oSInAppMessage) {
        String string2 = OSUtils.getCorrectedLanguage();
        for (String string3 : PREFERRED_VARIANT_ORDER) {
            if (!oSInAppMessage.variants.containsKey((Object)string3)) continue;
            HashMap hashMap = (HashMap)oSInAppMessage.variants.get((Object)string3);
            if (hashMap.containsKey((Object)string2)) {
                return (String)hashMap.get((Object)string2);
            }
            return (String)hashMap.get((Object)"default");
        }
        return null;
    }

    void addTriggers(Map<String, Object> map) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Triggers added: ");
        stringBuilder.append(map.toString());
        oSLogger.debug(stringBuilder.toString());
        this.triggerController.addTriggers(map);
        if (this.shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue((Runnable)new 19(this, map));
            return;
        }
        this.checkRedisplayMessagesAndEvaluate((Collection<String>)map.keySet());
    }

    void cleanCachedInAppMessages() {
        this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

            public void run() {
                super.run();
                OSInAppMessageController.this.inAppMessageRepository.cleanCachedInAppMessages();
            }
        }, OS_IAM_DB_ACCESS);
    }

    void displayPreviewMessage(String string2) {
        this.inAppMessageShowing = true;
        final OSInAppMessage oSInAppMessage = new OSInAppMessage(true);
        this.getTagsForLiquidTemplating(oSInAppMessage, true);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("in_app_messages/device_preview?preview_id=");
        stringBuilder.append(string2);
        stringBuilder.append("&app_id=");
        stringBuilder.append(OneSignal.appId);
        OneSignalRestClient.get((String)stringBuilder.toString(), (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

            void onFailure(int n, String string, Throwable throwable) {
                OSInAppMessageController.this.printHttpErrorForInAppMessageRequest("html", n, string);
                OSInAppMessageController.this.dismissCurrentMessage(null);
            }

            void onSuccess(String string) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("html");
                    double d = jSONObject.optDouble("display_duration");
                    oSInAppMessage.setDisplayDuration(d);
                    if (OSInAppMessageController.this.waitForTags) {
                        OSInAppMessageController.this.pendingHTMLContent = string2;
                        return;
                    }
                    WebViewManager.showHTMLString(oSInAppMessage, OSInAppMessageController.this.taggedHTMLString(string2));
                    return;
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                    return;
                }
            }
        }, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void executeRedisplayIAMDataDependantTask(Runnable runnable) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (this.shouldRunTaskThroughQueue()) {
                OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"Delaying task due to redisplay data not retrieved yet");
                this.taskController.addTaskToQueue(runnable);
            } else {
                runnable.run();
            }
            return;
        }
    }

    OSInAppMessage getCurrentDisplayedInAppMessage() {
        if (this.inAppMessageShowing) {
            return (OSInAppMessage)this.messageDisplayQueue.get(0);
        }
        return null;
    }

    public ArrayList<OSInAppMessage> getInAppMessageDisplayQueue() {
        return this.messageDisplayQueue;
    }

    OSInAppMessageRepository getInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper) {
        if (this.inAppMessageRepository == null) {
            this.inAppMessageRepository = new OSInAppMessageRepository(oneSignalDbHelper);
        }
        return this.inAppMessageRepository;
    }

    public List<OSInAppMessage> getRedisplayedInAppMessages() {
        return this.redisplayedInAppMessages;
    }

    Object getTriggerValue(String string2) {
        return this.triggerController.getTriggerValue(string2);
    }

    Map<String, Object> getTriggers() {
        return new HashMap((Map)this.triggerController.getTriggers());
    }

    boolean inAppMessagingEnabled() {
        return this.inAppMessagingEnabled;
    }

    protected void initRedisplayData(OneSignalDbHelper oneSignalDbHelper) {
        this.inAppMessageRepository = this.getInAppMessageRepository(oneSignalDbHelper);
        BackgroundRunnable backgroundRunnable = new BackgroundRunnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                Object object;
                super.run();
                Object object2 = object = LOCK;
                synchronized (object2) {
                    OSInAppMessageController oSInAppMessageController = OSInAppMessageController.this;
                    oSInAppMessageController.redisplayedInAppMessages = oSInAppMessageController.inAppMessageRepository.getCachedInAppMessages();
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Retrieved IAMs from DB redisplayedInAppMessages: ");
                    stringBuilder.append(OSInAppMessageController.this.redisplayedInAppMessages.toString());
                    OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                    return;
                }
            }
        };
        this.taskController.addTaskToQueue((Runnable)backgroundRunnable);
        this.taskController.startPendingTasks();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void initWithCachedInAppMessages() {
        Object object;
        if (!this.messages.isEmpty()) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("initWithCachedInAppMessages with already in memory messages: ");
            stringBuilder.append(this.messages);
            OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            return;
        }
        String string2 = OneSignalPrefs.getString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_CACHED_IAMS", null);
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initWithCachedInAppMessages: ");
        stringBuilder.append(string2);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (string2 == null) {
            return;
        }
        if (string2.isEmpty()) {
            return;
        }
        Object object2 = object = LOCK;
        synchronized (object2) {
            try {
                block9 : {
                    boolean bl = this.messages.isEmpty();
                    if (bl) break block9;
                    return;
                }
                try {
                    this.processInAppMessageJson(new JSONArray(string2));
                }
                catch (JSONException jSONException) {
                    jSONException.printStackTrace();
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    boolean isInAppMessageShowing() {
        return this.inAppMessageShowing;
    }

    public void messageDynamicTriggerCompleted(String string2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("messageDynamicTriggerCompleted called with triggerId: ");
        stringBuilder.append(string2);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        HashSet hashSet = new HashSet();
        hashSet.add((Object)string2);
        this.makeRedisplayMessagesAvailableWithTriggers((Collection<String>)hashSet);
    }

    public void messageTriggerConditionChanged() {
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"messageTriggerConditionChanged called");
        this.evaluateInAppMessages();
    }

    void messageWasDismissed(OSInAppMessage oSInAppMessage) {
        this.messageWasDismissed(oSInAppMessage, false);
    }

    void messageWasDismissed(OSInAppMessage oSInAppMessage, boolean bl) {
        if (!oSInAppMessage.isPreview) {
            this.dismissedMessages.add((Object)oSInAppMessage.messageId);
            if (!bl) {
                OneSignalPrefs.saveStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_DISPLAYED_IAMS", this.dismissedMessages);
                this.lastTimeInAppDismissed = new Date();
                this.persistInAppMessage(oSInAppMessage);
            }
            OSLogger oSLogger = this.logger;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OSInAppMessageController messageWasDismissed dismissedMessages: ");
            stringBuilder.append(this.dismissedMessages.toString());
            oSLogger.debug(stringBuilder.toString());
        }
        this.dismissCurrentMessage(oSInAppMessage);
    }

    void messageWasDismissedByBackPress(OSInAppMessage oSInAppMessage) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("In app message OSInAppMessageController messageWasDismissed by back press: ");
        stringBuilder.append(oSInAppMessage.toString());
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.dismissCurrentMessage(oSInAppMessage);
    }

    void onMessageActionOccurredOnMessage(OSInAppMessage oSInAppMessage, JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.setFirstClick(oSInAppMessage.takeActionAsUnique());
        this.firePublicClickHandler(oSInAppMessage.messageId, oSInAppMessageAction);
        this.beginProcessingPrompts(oSInAppMessage, (List<OSInAppMessagePrompt>)oSInAppMessageAction.getPrompts());
        this.fireClickAction(oSInAppMessageAction);
        this.fireRESTCallForClick(oSInAppMessage, oSInAppMessageAction);
        this.fireTagCallForClick(oSInAppMessageAction);
        this.fireOutcomesForClick(oSInAppMessage.messageId, (List<OSInAppMessageOutcome>)oSInAppMessageAction.getOutcomes());
    }

    void onMessageActionOccurredOnPreview(OSInAppMessage oSInAppMessage, JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.setFirstClick(oSInAppMessage.takeActionAsUnique());
        this.firePublicClickHandler(oSInAppMessage.messageId, oSInAppMessageAction);
        this.beginProcessingPrompts(oSInAppMessage, (List<OSInAppMessagePrompt>)oSInAppMessageAction.getPrompts());
        this.fireClickAction(oSInAppMessageAction);
        this.logInAppMessagePreviewActions(oSInAppMessageAction);
    }

    void onMessageWasShown(final OSInAppMessage oSInAppMessage) {
        if (oSInAppMessage.isPreview) {
            return;
        }
        if (this.impressionedMessages.contains((Object)oSInAppMessage.messageId)) {
            return;
        }
        this.impressionedMessages.add((Object)oSInAppMessage.messageId);
        String string2 = this.variantIdForMessage(oSInAppMessage);
        if (string2 == null) {
            return;
        }
        try {
            5 var4_3 = new 5(this, string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("in_app_messages/");
            stringBuilder.append(oSInAppMessage.messageId);
            stringBuilder.append("/impression");
            OneSignalRestClient.post((String)stringBuilder.toString(), (JSONObject)var4_3, (OneSignalRestClient.ResponseHandler)new OneSignalRestClient.ResponseHandler(){

                void onFailure(int n, String string, Throwable throwable) {
                    OSInAppMessageController.this.printHttpErrorForInAppMessageRequest("impression", n, string);
                    OSInAppMessageController.this.impressionedMessages.remove((Object)oSInAppMessage.messageId);
                }

                void onSuccess(String string) {
                    OSInAppMessageController.this.printHttpSuccessForInAppMessageRequest("impression", string);
                    OneSignalPrefs.saveStringSet((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_IMPRESSIONED_IAMS", (Set)OSInAppMessageController.this.impressionedMessages);
                }
            });
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"Unable to execute in-app message impression HTTP request due to invalid JSON");
            return;
        }
    }

    void onPageChanged(OSInAppMessage oSInAppMessage, JSONObject jSONObject) {
        OSInAppMessagePage oSInAppMessagePage = new OSInAppMessagePage(jSONObject);
        if (oSInAppMessage.isPreview) {
            return;
        }
        this.fireRESTCallForPageChange(oSInAppMessage, oSInAppMessagePage);
    }

    void receivedInAppMessageJson(JSONArray jSONArray) throws JSONException {
        OneSignalPrefs.saveString((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"PREFS_OS_CACHED_IAMS", (String)jSONArray.toString());
        this.executeRedisplayIAMDataDependantTask((Runnable)new 3(this, jSONArray));
    }

    void removeTriggersForKeys(Collection<String> collection) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Triggers key to remove: ");
        stringBuilder.append(collection.toString());
        oSLogger.debug(stringBuilder.toString());
        this.triggerController.removeTriggersForKeys(collection);
        if (this.shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue((Runnable)new 20(this, collection));
            return;
        }
        this.checkRedisplayMessagesAndEvaluate(collection);
    }

    void resetSessionLaunchTime() {
        OSDynamicTriggerController.resetSessionLaunchTime();
    }

    void setInAppMessagingEnabled(boolean bl) {
        this.inAppMessagingEnabled = bl;
        if (bl) {
            this.evaluateInAppMessages();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean shouldRunTaskThroughQueue() {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (this.redisplayedInAppMessages != null) return false;
            if (!this.taskController.shouldRunTaskThroughQueue()) return false;
            return true;
        }
    }

    public void systemConditionChanged() {
        this.attemptToShowInAppMessage();
    }

    String taggedHTMLString(String string2) {
        String string3 = this.userTagsString;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(String.format((String)LIQUID_TAG_SCRIPT, (Object[])new Object[]{string3}));
        return stringBuilder.toString();
    }

}

