/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.FocusTimeController;
import com.onesignal.OSFocusTimeProcessorFactory;
import com.onesignal.OSLogger;
import com.onesignal.OSSyncService;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalPrefs;
import com.onesignal.OneSignalRestClient;
import com.onesignal.influence.domain.OSInfluence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class FocusTimeController {
    private OSLogger logger;
    private OSFocusTimeProcessorFactory processorFactory;
    private Long timeFocusedAtMs;

    FocusTimeController(OSFocusTimeProcessorFactory oSFocusTimeProcessorFactory, OSLogger oSLogger) {
        this.processorFactory = oSFocusTimeProcessorFactory;
        this.logger = oSLogger;
    }

    private Long getTimeFocusedElapsed() {
        if (this.timeFocusedAtMs == null) {
            return null;
        }
        long l = (long)(0.5 + (double)(OneSignal.getTime().getElapsedRealtime() - this.timeFocusedAtMs) / 1000.0);
        if (l >= 1L) {
            if (l > 86400L) {
                return null;
            }
            return l;
        }
        return null;
    }

    private boolean giveProcessorsValidFocusTime(List<OSInfluence> list, FocusEventType focusEventType) {
        Long l = this.getTimeFocusedElapsed();
        if (l == null) {
            return false;
        }
        this.processorFactory.getTimeProcessorWithInfluences(list).addTime(l, (List<OSInfluence>)list, focusEventType);
        return true;
    }

    void appBackgrounded() {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application backgrounded focus time: ");
        stringBuilder.append((Object)this.timeFocusedAtMs);
        oSLogger.debug(stringBuilder.toString());
        this.processorFactory.getTimeProcessorSaved().sendUnsentTimeNow();
        this.timeFocusedAtMs = null;
    }

    void appForegrounded() {
        this.timeFocusedAtMs = OneSignal.getTime().getElapsedRealtime();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application foregrounded focus time: ");
        stringBuilder.append((Object)this.timeFocusedAtMs);
        oSLogger.debug(stringBuilder.toString());
    }

    void appStopped() {
        Long l = this.getTimeFocusedElapsed();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application stopped focus time: ");
        stringBuilder.append((Object)this.timeFocusedAtMs);
        stringBuilder.append(" timeElapsed: ");
        stringBuilder.append((Object)l);
        oSLogger.debug(stringBuilder.toString());
        if (l == null) {
            return;
        }
        List<OSInfluence> list = OneSignal.getSessionManager().getSessionInfluences();
        this.processorFactory.getTimeProcessorWithInfluences(list).saveUnsentActiveData(l, (List<OSInfluence>)list);
    }

    void doBlockingBackgroundSyncOfUnsentTime() {
        if (OneSignal.isInForeground()) {
            return;
        }
        this.processorFactory.getTimeProcessorSaved().syncUnsentTimeFromSyncJob();
    }

    void onSessionEnded(List<OSInfluence> list) {
        FocusEventType focusEventType = FocusEventType.END_SESSION;
        if (!this.giveProcessorsValidFocusTime(list, focusEventType)) {
            this.processorFactory.getTimeProcessorWithInfluences(list).sendUnsentTimeNow(focusEventType);
        }
    }

    private static final class FocusEventType
    extends Enum<FocusEventType> {
        private static final /* synthetic */ FocusEventType[] $VALUES;
        public static final /* enum */ FocusEventType BACKGROUND;
        public static final /* enum */ FocusEventType END_SESSION;

        static {
            FocusEventType focusEventType;
            FocusEventType focusEventType2;
            BACKGROUND = focusEventType = new FocusEventType();
            END_SESSION = focusEventType2 = new FocusEventType();
            $VALUES = new FocusEventType[]{focusEventType, focusEventType2};
        }

        public static FocusEventType valueOf(String string) {
            return (FocusEventType)Enum.valueOf(FocusEventType.class, (String)string);
        }

        public static FocusEventType[] values() {
            return (FocusEventType[])$VALUES.clone();
        }
    }

    static abstract class FocusTimeProcessorBase {
        protected long MIN_ON_FOCUS_TIME_SEC;
        protected String PREF_KEY_FOR_UNSENT_TIME;
        private final AtomicBoolean runningOnFocusTime = new AtomicBoolean();
        private Long unsentActiveTime = null;

        FocusTimeProcessorBase() {
        }

        static /* synthetic */ void access$500(FocusTimeProcessorBase focusTimeProcessorBase, long l) {
            focusTimeProcessorBase.saveUnsentActiveTime(l);
        }

        private void addTime(long l, List<OSInfluence> list, FocusEventType focusEventType) {
            this.saveUnsentActiveData(l, list);
            this.sendUnsentTimeNow(focusEventType);
        }

        private JSONObject generateOnFocusPayload(long l) throws JSONException {
            JSONObject jSONObject = new JSONObject().put("app_id", (Object)OneSignal.getSavedAppId()).put("type", 1).put("state", (Object)"ping").put("active_time", l).put("device_type", new OSUtils().getDeviceType());
            OneSignal.addNetType(jSONObject);
            return jSONObject;
        }

        private long getUnsentActiveTime() {
            if (this.unsentActiveTime == null) {
                this.unsentActiveTime = OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, this.PREF_KEY_FOR_UNSENT_TIME, 0L);
            }
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":getUnsentActiveTime: ");
            stringBuilder.append((Object)this.unsentActiveTime);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            return this.unsentActiveTime;
        }

        private boolean hasMinSyncTime() {
            return this.getUnsentActiveTime() >= this.MIN_ON_FOCUS_TIME_SEC;
        }

        private void saveUnsentActiveData(long l, List<OSInfluence> list) {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":saveUnsentActiveData with lastFocusTimeInfluences: ");
            stringBuilder.append(list.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            long l2 = l + this.getUnsentActiveTime();
            this.saveInfluences(list);
            this.saveUnsentActiveTime(l2);
        }

        private void saveUnsentActiveTime(long l) {
            this.unsentActiveTime = l;
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":saveUnsentActiveTime: ");
            stringBuilder.append((Object)this.unsentActiveTime);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, this.PREF_KEY_FOR_UNSENT_TIME, l);
        }

        private void sendOnFocus(long l) {
            try {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(":sendOnFocus with totalTimeActive: ");
                stringBuilder.append(l);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                JSONObject jSONObject = this.generateOnFocusPayload(l);
                this.additionalFieldsToAddToOnFocusPayload(jSONObject);
                this.sendOnFocusToPlayer(OneSignal.getUserId(), jSONObject);
                if (OneSignal.hasEmailId()) {
                    this.sendOnFocusToPlayer(OneSignal.getEmailId(), this.generateOnFocusPayload(l));
                }
                if (OneSignal.hasSMSlId()) {
                    this.sendOnFocusToPlayer(OneSignal.getSMSId(), this.generateOnFocusPayload(l));
                }
                this.saveInfluences((List<OSInfluence>)new ArrayList());
                return;
            }
            catch (JSONException jSONException) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating on_focus:JSON Failed.", jSONException);
                return;
            }
        }

        private void sendOnFocusToPlayer(String string, JSONObject jSONObject) {
            OneSignalRestClient.ResponseHandler responseHandler = new OneSignalRestClient.ResponseHandler(this){
                final /* synthetic */ FocusTimeProcessorBase this$0;
                {
                    this.this$0 = focusTimeProcessorBase;
                }

                void onFailure(int n, String string, java.lang.Throwable throwable) {
                    OneSignal.logHttpError("sending on_focus Failed", n, throwable, string);
                }

                void onSuccess(String string) {
                    FocusTimeProcessorBase.access$500(this.this$0, 0L);
                }
            };
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("players/");
            stringBuilder.append(string);
            stringBuilder.append("/on_focus");
            OneSignalRestClient.postSync(stringBuilder.toString(), jSONObject, responseHandler);
        }

        private void sendUnsentTimeNow() {
            List<OSInfluence> list = this.getInfluences();
            long l = this.getUnsentActiveTime();
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(":sendUnsentTimeNow with time: ");
            stringBuilder.append(l);
            stringBuilder.append(" and influences: ");
            stringBuilder.append(list.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            this.sendUnsentTimeNow(FocusEventType.BACKGROUND);
        }

        private void sendUnsentTimeNow(FocusEventType focusEventType) {
            if (!OneSignal.hasUserId()) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.WARN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(":sendUnsentTimeNow not possible due to user id null");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                return;
            }
            this.sendTime(focusEventType);
        }

        private void syncUnsentTimeFromSyncJob() {
            if (this.hasMinSyncTime()) {
                this.syncOnFocusTime();
            }
        }

        protected void additionalFieldsToAddToOnFocusPayload(JSONObject jSONObject) {
        }

        protected abstract List<OSInfluence> getInfluences();

        protected abstract void saveInfluences(List<OSInfluence> var1);

        protected abstract void sendTime(FocusEventType var1);

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void syncOnFocusTime() {
            AtomicBoolean atomicBoolean;
            if (this.runningOnFocusTime.get()) {
                return;
            }
            AtomicBoolean atomicBoolean2 = atomicBoolean = this.runningOnFocusTime;
            synchronized (atomicBoolean2) {
                this.runningOnFocusTime.set(true);
                if (this.hasMinSyncTime()) {
                    this.sendOnFocus(this.getUnsentActiveTime());
                }
                this.runningOnFocusTime.set(false);
                return;
            }
        }

        protected void syncUnsentTimeOnBackgroundEvent() {
            if (!this.hasMinSyncTime()) {
                return;
            }
            OSSyncService.getInstance().scheduleSyncTask(OneSignal.appContext);
        }
    }

}

