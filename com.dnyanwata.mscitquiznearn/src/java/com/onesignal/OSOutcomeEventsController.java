/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONArray
 */
package com.onesignal;

import com.onesignal.OSInAppMessageOutcome;
import com.onesignal.OSOutcomeEvent;
import com.onesignal.OSOutcomeEventsController;
import com.onesignal.OSSessionManager;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.data.OSOutcomeEventsFactory;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeEventsRepository;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

class OSOutcomeEventsController {
    private static final String OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD = "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD";
    private static final String OS_SAVE_OUTCOMES = "OS_SAVE_OUTCOMES";
    private static final String OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS = "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS";
    private static final String OS_SEND_SAVED_OUTCOMES = "OS_SEND_SAVED_OUTCOMES";
    private final OSSessionManager osSessionManager;
    private final OSOutcomeEventsFactory outcomeEventsFactory;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public OSOutcomeEventsController(OSSessionManager oSSessionManager, OSOutcomeEventsFactory oSOutcomeEventsFactory) {
        this.osSessionManager = oSSessionManager;
        this.outcomeEventsFactory = oSOutcomeEventsFactory;
        this.initUniqueOutcomeEventsSentSets();
    }

    static /* synthetic */ void access$200(OSOutcomeEventsController oSOutcomeEventsController, OSOutcomeEventParams oSOutcomeEventParams) {
        oSOutcomeEventsController.saveUniqueOutcome(oSOutcomeEventParams);
    }

    private List<OSInfluence> getUniqueIds(String string2, List<OSInfluence> list) {
        List<OSInfluence> list2 = this.outcomeEventsFactory.getRepository().getNotCachedUniqueOutcome(string2, list);
        if (list2.size() > 0) {
            return list2;
        }
        return null;
    }

    private void initUniqueOutcomeEventsSentSets() {
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        Set<String> set = this.outcomeEventsFactory.getRepository().getUnattributedUniqueOutcomeEventsSent();
        if (set != null) {
            this.unattributedUniqueOutcomeEventsSentOnSession = set;
        }
    }

    private List<OSInfluence> removeDisabledInfluences(List<OSInfluence> list) {
        ArrayList arrayList = new ArrayList(list);
        for (OSInfluence oSInfluence : list) {
            if (!oSInfluence.getInfluenceType().isDisabled()) continue;
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Outcomes disabled for channel: ");
            stringBuilder.append(oSInfluence.getInfluenceChannel().toString());
            OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
            arrayList.remove((Object)oSInfluence);
        }
        return arrayList;
    }

    private void saveAttributedUniqueOutcomeNotifications(final OSOutcomeEventParams oSOutcomeEventParams) {
        new Thread(new Runnable(){

            public void run() {
                Thread.currentThread().setPriority(10);
                OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().saveUniqueOutcomeNotifications(oSOutcomeEventParams);
            }
        }, OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS).start();
    }

    private void saveUnattributedUniqueOutcomeEvents() {
        this.outcomeEventsFactory.getRepository().saveUnattributedUniqueOutcomeEventsSent(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private void saveUniqueOutcome(OSOutcomeEventParams oSOutcomeEventParams) {
        if (oSOutcomeEventParams.isUnattributed()) {
            this.saveUnattributedUniqueOutcomeEvents();
            return;
        }
        this.saveAttributedUniqueOutcomeNotifications(oSOutcomeEventParams);
    }

    private void sendAndCreateOutcomeEvent(String string2, float f, List<OSInfluence> list, OneSignal.OutcomeCallback outcomeCallback) {
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        int n = new OSUtils().getDeviceType();
        String string3 = OneSignal.appId;
        Iterator iterator = list.iterator();
        boolean bl = false;
        OSOutcomeSourceBody oSOutcomeSourceBody = null;
        OSOutcomeSourceBody oSOutcomeSourceBody2 = null;
        while (iterator.hasNext()) {
            OSInfluence oSInfluence = (OSInfluence)iterator.next();
            int n2 = 6.$SwitchMap$com$onesignal$influence$domain$OSInfluenceType[oSInfluence.getInfluenceType().ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) continue;
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Outcomes disabled for channel: ");
                        stringBuilder.append((Object)oSInfluence.getInfluenceChannel());
                        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                        if (outcomeCallback != null) {
                            outcomeCallback.onSuccess(null);
                        }
                        return;
                    }
                    bl = true;
                    continue;
                }
                if (oSOutcomeSourceBody2 == null) {
                    oSOutcomeSourceBody2 = new OSOutcomeSourceBody();
                }
                oSOutcomeSourceBody2 = this.setSourceChannelIds(oSInfluence, oSOutcomeSourceBody2);
                continue;
            }
            if (oSOutcomeSourceBody == null) {
                oSOutcomeSourceBody = new OSOutcomeSourceBody();
            }
            oSOutcomeSourceBody = this.setSourceChannelIds(oSInfluence, oSOutcomeSourceBody);
        }
        if (oSOutcomeSourceBody == null && oSOutcomeSourceBody2 == null && !bl) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "Outcomes disabled for all channels");
            if (outcomeCallback != null) {
                outcomeCallback.onSuccess(null);
            }
            return;
        }
        OSOutcomeSource oSOutcomeSource = new OSOutcomeSource(oSOutcomeSourceBody, oSOutcomeSourceBody2);
        OSOutcomeEventParams oSOutcomeEventParams = new OSOutcomeEventParams(string2, oSOutcomeSource, f, 0L);
        OneSignalApiResponseHandler oneSignalApiResponseHandler = new OneSignalApiResponseHandler(this, oSOutcomeEventParams, outcomeCallback, l, string2){
            final /* synthetic */ OSOutcomeEventsController this$0;
            final /* synthetic */ OneSignal.OutcomeCallback val$callback;
            final /* synthetic */ OSOutcomeEventParams val$eventParams;
            final /* synthetic */ String val$name;
            final /* synthetic */ long val$timestampSeconds;
            {
                this.this$0 = oSOutcomeEventsController;
                this.val$eventParams = oSOutcomeEventParams;
                this.val$callback = outcomeCallback;
                this.val$timestampSeconds = l;
                this.val$name = string2;
            }

            public void onFailure(int n, String string2, java.lang.Throwable throwable) {
                new Thread(new Runnable(this){
                    final /* synthetic */ 4 this$1;
                    {
                        this.this$1 = var1_1;
                    }

                    public void run() {
                        Thread.currentThread().setPriority(10);
                        this.this$1.val$eventParams.setTimestamp(this.this$1.val$timestampSeconds);
                        OSOutcomeEventsController.access$000(this.this$1.this$0).getRepository().saveOutcomeEvent(this.this$1.val$eventParams);
                    }
                }, "OS_SAVE_OUTCOMES").start();
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.WARN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Sending outcome with name: ");
                stringBuilder.append(this.val$name);
                stringBuilder.append(" failed with status code: ");
                stringBuilder.append(n);
                stringBuilder.append(" and response: ");
                stringBuilder.append(string2);
                stringBuilder.append("\nOutcome event was cached and will be reattempted on app cold start");
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                OneSignal.OutcomeCallback outcomeCallback = this.val$callback;
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess(null);
                }
            }

            public void onSuccess(String string2) {
                OSOutcomeEventsController.access$200(this.this$0, this.val$eventParams);
                OneSignal.OutcomeCallback outcomeCallback = this.val$callback;
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess(OSOutcomeEvent.fromOutcomeEventParamsV2toOutcomeEventV1(this.val$eventParams));
                }
            }
        };
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(string3, n, oSOutcomeEventParams, oneSignalApiResponseHandler);
    }

    private void sendSavedOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        int n = new OSUtils().getDeviceType();
        String string2 = OneSignal.appId;
        OneSignalApiResponseHandler oneSignalApiResponseHandler = new OneSignalApiResponseHandler(this, oSOutcomeEventParams){
            final /* synthetic */ OSOutcomeEventsController this$0;
            final /* synthetic */ OSOutcomeEventParams val$event;
            {
                this.this$0 = oSOutcomeEventsController;
                this.val$event = oSOutcomeEventParams;
            }

            public void onFailure(int n, String string2, java.lang.Throwable throwable) {
            }

            public void onSuccess(String string2) {
                OSOutcomeEventsController.access$000(this.this$0).getRepository().removeEvent(this.val$event);
            }
        };
        this.outcomeEventsFactory.getRepository().requestMeasureOutcomeEvent(string2, n, oSOutcomeEventParams, oneSignalApiResponseHandler);
    }

    private void sendUniqueOutcomeEvent(String string2, List<OSInfluence> list, OneSignal.OutcomeCallback outcomeCallback) {
        boolean bl;
        List<OSInfluence> list2;
        block7 : {
            list2 = this.removeDisabledInfluences(list);
            if (list2.isEmpty()) {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Unique Outcome disabled for current session");
                return;
            }
            Iterator iterator = list2.iterator();
            do {
                boolean bl2 = iterator.hasNext();
                bl = false;
                if (!bl2) break block7;
            } while (!((OSInfluence)iterator.next()).getInfluenceType().isAttributed());
            bl = true;
        }
        if (bl) {
            List<OSInfluence> list3 = this.getUniqueIds(string2, list2);
            if (list3 == null) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: ");
                stringBuilder.append(list2.toString());
                stringBuilder.append("\nOutcome name: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                if (outcomeCallback != null) {
                    outcomeCallback.onSuccess(null);
                }
                return;
            }
            this.sendAndCreateOutcomeEvent(string2, 0.0f, list3, outcomeCallback);
            return;
        }
        if (this.unattributedUniqueOutcomeEventsSentOnSession.contains((Object)string2)) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Measure endpoint will not send because unique outcome already sent for: \nSession: ");
            stringBuilder.append((Object)OSInfluenceType.UNATTRIBUTED);
            stringBuilder.append("\nOutcome name: ");
            stringBuilder.append(string2);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            if (outcomeCallback != null) {
                outcomeCallback.onSuccess(null);
            }
            return;
        }
        this.unattributedUniqueOutcomeEventsSentOnSession.add((Object)string2);
        this.sendAndCreateOutcomeEvent(string2, 0.0f, list2, outcomeCallback);
    }

    private OSOutcomeSourceBody setSourceChannelIds(OSInfluence oSInfluence, OSOutcomeSourceBody oSOutcomeSourceBody) {
        int n = 6.$SwitchMap$com$onesignal$influence$domain$OSInfluenceChannel[oSInfluence.getInfluenceChannel().ordinal()];
        if (n != 1) {
            if (n != 2) {
                return oSOutcomeSourceBody;
            }
            oSOutcomeSourceBody.setNotificationIds(oSInfluence.getIds());
            return oSOutcomeSourceBody;
        }
        oSOutcomeSourceBody.setInAppMessagesIds(oSInfluence.getIds());
        return oSOutcomeSourceBody;
    }

    void cleanCachedUniqueOutcomes() {
        new Thread(new Runnable(){

            public void run() {
                Thread.currentThread().setPriority(10);
                OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().cleanCachedUniqueOutcomeEventNotifications("notification", "notification_id");
            }
        }, OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD).start();
    }

    void cleanOutcomes() {
        OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "OneSignal cleanOutcomes for session");
        this.unattributedUniqueOutcomeEventsSentOnSession = OSUtils.newConcurrentSet();
        this.saveUnattributedUniqueOutcomeEvents();
    }

    void sendClickActionOutcomes(List<OSInAppMessageOutcome> list) {
        for (OSInAppMessageOutcome oSInAppMessageOutcome : list) {
            String string2 = oSInAppMessageOutcome.getName();
            if (oSInAppMessageOutcome.isUnique()) {
                this.sendUniqueOutcomeEvent(string2, null);
                continue;
            }
            if (oSInAppMessageOutcome.getWeight() > 0.0f) {
                this.sendOutcomeEventWithValue(string2, oSInAppMessageOutcome.getWeight(), null);
                continue;
            }
            this.sendOutcomeEvent(string2, null);
        }
    }

    void sendOutcomeEvent(String string2, OneSignal.OutcomeCallback outcomeCallback) {
        this.sendAndCreateOutcomeEvent(string2, 0.0f, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    void sendOutcomeEventWithValue(String string2, float f, OneSignal.OutcomeCallback outcomeCallback) {
        this.sendAndCreateOutcomeEvent(string2, f, this.osSessionManager.getInfluences(), outcomeCallback);
    }

    void sendSavedOutcomes() {
        new Thread(new Runnable(){

            public void run() {
                Thread.currentThread().setPriority(10);
                for (OSOutcomeEventParams oSOutcomeEventParams : OSOutcomeEventsController.this.outcomeEventsFactory.getRepository().getSavedOutcomeEvents()) {
                    OSOutcomeEventsController.this.sendSavedOutcomeEvent(oSOutcomeEventParams);
                }
            }
        }, OS_SEND_SAVED_OUTCOMES).start();
    }

    void sendUniqueOutcomeEvent(String string2, OneSignal.OutcomeCallback outcomeCallback) {
        this.sendUniqueOutcomeEvent(string2, this.osSessionManager.getInfluences(), outcomeCallback);
    }

}

