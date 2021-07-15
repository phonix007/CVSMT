/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package com.onesignal;

import com.onesignal.FocusTimeController;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class OSFocusTimeProcessorFactory {
    private final HashMap<String, FocusTimeController.FocusTimeProcessorBase> focusTimeProcessors;

    public OSFocusTimeProcessorFactory() {
        HashMap hashMap;
        this.focusTimeProcessors = hashMap = new HashMap();
        hashMap.put((Object)FocusTimeController.FocusTimeProcessorUnattributed.class.getName(), (Object)new FocusTimeController.FocusTimeProcessorBase(){
            {
                this.MIN_ON_FOCUS_TIME_SEC = 60L;
                this.PREF_KEY_FOR_UNSENT_TIME = "GT_UNSENT_ACTIVE_TIME";
            }

            @Override
            protected List<OSInfluence> getInfluences() {
                return new java.util.ArrayList();
            }

            @Override
            protected void saveInfluences(List<OSInfluence> list) {
            }

            @Override
            protected void sendTime(com.onesignal.FocusTimeController$FocusEventType focusEventType) {
                com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL = com.onesignal.OneSignal$LOG_LEVEL.DEBUG;
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(" sendTime with: ");
                stringBuilder.append((Object)focusEventType);
                com.onesignal.OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                if (focusEventType.equals((Object)com.onesignal.FocusTimeController$FocusEventType.END_SESSION)) {
                    return;
                }
                this.syncUnsentTimeOnBackgroundEvent();
            }
        });
        hashMap.put((Object)FocusTimeController.FocusTimeProcessorAttributed.class.getName(), (Object)new FocusTimeController.FocusTimeProcessorBase(){
            {
                this.MIN_ON_FOCUS_TIME_SEC = 1L;
                this.PREF_KEY_FOR_UNSENT_TIME = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
            }

            @Override
            protected void additionalFieldsToAddToOnFocusPayload(org.json.JSONObject jSONObject) {
                com.onesignal.OneSignal.getSessionManager().addSessionIds(jSONObject, this.getInfluences());
            }

            @Override
            protected List<OSInfluence> getInfluences() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (String string : com.onesignal.OneSignalPrefs.getStringSet(com.onesignal.OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_ATTRIBUTED_INFLUENCES", (java.util.Set<String>)new java.util.HashSet())) {
                    try {
                        arrayList.add((Object)new OSInfluence(string));
                    }
                    catch (org.json.JSONException jSONException) {
                        com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL = com.onesignal.OneSignal$LOG_LEVEL.ERROR;
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append(this.getClass().getSimpleName());
                        stringBuilder.append(": error generation OSInfluence from json object: ");
                        stringBuilder.append((Object)jSONException);
                        com.onesignal.OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                    }
                }
                return arrayList;
            }

            @Override
            protected void saveInfluences(List<OSInfluence> list) {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (OSInfluence oSInfluence : list) {
                    try {
                        hashSet.add((Object)oSInfluence.toJSONString());
                    }
                    catch (org.json.JSONException jSONException) {
                        com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL = com.onesignal.OneSignal$LOG_LEVEL.ERROR;
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append(this.getClass().getSimpleName());
                        stringBuilder.append(": error generation json object OSInfluence: ");
                        stringBuilder.append((Object)jSONException);
                        com.onesignal.OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                    }
                }
                com.onesignal.OneSignalPrefs.saveStringSet(com.onesignal.OneSignalPrefs.PREFS_ONESIGNAL, "PREFS_OS_ATTRIBUTED_INFLUENCES", (java.util.Set<String>)hashSet);
            }

            @Override
            protected void sendTime(com.onesignal.FocusTimeController$FocusEventType focusEventType) {
                com.onesignal.OneSignal$LOG_LEVEL lOG_LEVEL = com.onesignal.OneSignal$LOG_LEVEL.DEBUG;
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append(this.getClass().getSimpleName());
                stringBuilder.append(" sendTime with: ");
                stringBuilder.append((Object)focusEventType);
                com.onesignal.OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                if (focusEventType.equals((Object)com.onesignal.FocusTimeController$FocusEventType.END_SESSION)) {
                    this.syncOnFocusTime();
                    return;
                }
                com.onesignal.OSSyncService.getInstance().scheduleSyncTask(com.onesignal.OneSignal.appContext);
            }
        });
    }

    private FocusTimeController.FocusTimeProcessorBase getAttributedProcessor() {
        return (FocusTimeController.FocusTimeProcessorBase)this.focusTimeProcessors.get((Object)FocusTimeController.FocusTimeProcessorAttributed.class.getName());
    }

    private FocusTimeController.FocusTimeProcessorBase getUnattributedProcessor() {
        return (FocusTimeController.FocusTimeProcessorBase)this.focusTimeProcessors.get((Object)FocusTimeController.FocusTimeProcessorUnattributed.class.getName());
    }

    FocusTimeController.FocusTimeProcessorBase getTimeProcessorSaved() {
        FocusTimeController.FocusTimeProcessorBase focusTimeProcessorBase = this.getAttributedProcessor();
        Iterator iterator = focusTimeProcessorBase.getInfluences().iterator();
        while (iterator.hasNext()) {
            if (!((OSInfluence)iterator.next()).getInfluenceType().isAttributed()) continue;
            return focusTimeProcessorBase;
        }
        return this.getUnattributedProcessor();
    }

    FocusTimeController.FocusTimeProcessorBase getTimeProcessorWithInfluences(List<OSInfluence> list) {
        boolean bl;
        block2 : {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!((OSInfluence)iterator.next()).getInfluenceType().isAttributed()) continue;
                bl = true;
                break block2;
            }
            bl = false;
        }
        if (bl) {
            return this.getAttributedProcessor();
        }
        return this.getUnattributedProcessor();
    }
}

