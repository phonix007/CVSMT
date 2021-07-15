/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.JSONUtils;
import com.onesignal.OSLogger;
import com.onesignal.OneSignal;
import com.onesignal.influence.data.OSChannelTracker;
import com.onesignal.influence.data.OSTrackerFactory;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class OSSessionManager {
    private static final String OS_END_CURRENT_SESSION = "OS_END_CURRENT_SESSION";
    private OSLogger logger;
    private SessionListener sessionListener;
    protected OSTrackerFactory trackerFactory;

    public OSSessionManager(SessionListener sessionListener, OSTrackerFactory oSTrackerFactory, OSLogger oSLogger) {
        this.sessionListener = sessionListener;
        this.trackerFactory = oSTrackerFactory;
        this.logger = oSLogger;
    }

    private void attemptSessionUpgrade(OneSignal.AppEntryAction appEntryAction, String string2) {
        OSInfluence oSInfluence;
        boolean bl;
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager attemptSessionUpgrade with entryAction: ");
        stringBuilder.append((Object)appEntryAction);
        oSLogger.debug(stringBuilder.toString());
        OSChannelTracker oSChannelTracker = this.trackerFactory.getChannelByEntryAction(appEntryAction);
        List<OSChannelTracker> list = this.trackerFactory.getChannelsToResetByEntryAction(appEntryAction);
        ArrayList arrayList = new ArrayList();
        if (oSChannelTracker != null) {
            oSInfluence = oSChannelTracker.getCurrentSessionInfluence();
            OSInfluenceType oSInfluenceType = OSInfluenceType.DIRECT;
            if (string2 == null) {
                string2 = oSChannelTracker.getDirectId();
            }
            bl = this.setSession(oSChannelTracker, oSInfluenceType, string2, null);
        } else {
            bl = false;
            oSInfluence = null;
        }
        if (bl) {
            OSLogger oSLogger2 = this.logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: ");
            stringBuilder2.append(list);
            oSLogger2.debug(stringBuilder2.toString());
            arrayList.add((Object)oSInfluence);
            for (OSChannelTracker oSChannelTracker2 : list) {
                if (!oSChannelTracker2.getInfluenceType().isDirect()) continue;
                arrayList.add((Object)oSChannelTracker2.getCurrentSessionInfluence());
                oSChannelTracker2.resetAndInitInfluence();
            }
        }
        this.logger.debug("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (OSChannelTracker oSChannelTracker3 : list) {
            JSONArray jSONArray;
            if (!oSChannelTracker3.getInfluenceType().isUnattributed() || (jSONArray = oSChannelTracker3.getLastReceivedIds()).length() <= 0 || appEntryAction.isAppClose()) continue;
            OSInfluence oSInfluence2 = oSChannelTracker3.getCurrentSessionInfluence();
            if (!this.setSession(oSChannelTracker3, OSInfluenceType.INDIRECT, null, jSONArray)) continue;
            arrayList.add((Object)oSInfluence2);
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Trackers after update attempt: ");
        stringBuilder3.append(this.trackerFactory.getChannels().toString());
        OneSignal.Log(lOG_LEVEL, stringBuilder3.toString());
        this.sendSessionEndingWithInfluences((List<OSInfluence>)arrayList);
    }

    private void sendSessionEndingWithInfluences(final List<OSInfluence> list) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager sendSessionEndingWithInfluences with influences: ");
        stringBuilder.append(list);
        oSLogger.debug(stringBuilder.toString());
        if (list.size() > 0) {
            new Thread(new Runnable(){

                public void run() {
                    Thread.currentThread().setPriority(10);
                    OSSessionManager.this.sessionListener.onSessionEnding((List<OSInfluence>)list);
                }
            }, OS_END_CURRENT_SESSION).start();
        }
    }

    private boolean setSession(OSChannelTracker oSChannelTracker, OSInfluenceType oSInfluenceType, String string2, JSONArray jSONArray) {
        if (!this.willChangeSession(oSChannelTracker, oSInfluenceType, string2, jSONArray)) {
            return false;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSChannelTracker changed: ");
        stringBuilder.append(oSChannelTracker.getIdTag());
        stringBuilder.append("\nfrom:\ninfluenceType: ");
        stringBuilder.append((Object)oSChannelTracker.getInfluenceType());
        stringBuilder.append(", directNotificationId: ");
        stringBuilder.append(oSChannelTracker.getDirectId());
        stringBuilder.append(", indirectNotificationIds: ");
        stringBuilder.append((Object)oSChannelTracker.getIndirectIds());
        stringBuilder.append("\nto:\ninfluenceType: ");
        stringBuilder.append((Object)oSInfluenceType);
        stringBuilder.append(", directNotificationId: ");
        stringBuilder.append(string2);
        stringBuilder.append(", indirectNotificationIds: ");
        stringBuilder.append((Object)jSONArray);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        oSChannelTracker.setInfluenceType(oSInfluenceType);
        oSChannelTracker.setDirectId(string2);
        oSChannelTracker.setIndirectIds(jSONArray);
        oSChannelTracker.cacheState();
        OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Trackers changed to: ");
        stringBuilder2.append(this.trackerFactory.getChannels().toString());
        OneSignal.Log(lOG_LEVEL2, stringBuilder2.toString());
        return true;
    }

    private boolean willChangeSession(OSChannelTracker oSChannelTracker, OSInfluenceType oSInfluenceType, String string2, JSONArray jSONArray) {
        if (!oSInfluenceType.equals((Object)oSChannelTracker.getInfluenceType())) {
            return true;
        }
        OSInfluenceType oSInfluenceType2 = oSChannelTracker.getInfluenceType();
        if (oSInfluenceType2.isDirect() && oSChannelTracker.getDirectId() != null && !oSChannelTracker.getDirectId().equals((Object)string2)) {
            return true;
        }
        return oSInfluenceType2.isIndirect() && oSChannelTracker.getIndirectIds() != null && oSChannelTracker.getIndirectIds().length() > 0 && !JSONUtils.compareJSONArrays(oSChannelTracker.getIndirectIds(), jSONArray);
    }

    void addSessionIds(JSONObject jSONObject, List<OSInfluence> list) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager addSessionData with influences: ");
        stringBuilder.append(list.toString());
        oSLogger.debug(stringBuilder.toString());
        this.trackerFactory.addSessionData(jSONObject, list);
        OSLogger oSLogger2 = this.logger;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("OneSignal SessionManager addSessionIds on jsonObject: ");
        stringBuilder2.append((Object)jSONObject);
        oSLogger2.debug(stringBuilder2.toString());
    }

    void attemptSessionUpgrade(OneSignal.AppEntryAction appEntryAction) {
        this.attemptSessionUpgrade(appEntryAction, null);
    }

    List<OSInfluence> getInfluences() {
        return this.trackerFactory.getInfluences();
    }

    List<OSInfluence> getSessionInfluences() {
        return this.trackerFactory.getSessionInfluences();
    }

    void initSessionFromCache() {
        this.trackerFactory.initFromCache();
    }

    void onDirectInfluenceFromIAMClick(String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        this.setSession(this.trackerFactory.getIAMChannelTracker(), OSInfluenceType.DIRECT, string2, null);
    }

    void onDirectInfluenceFromIAMClickFinished() {
        this.logger.debug("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.trackerFactory.getIAMChannelTracker().resetAndInitInfluence();
    }

    void onDirectInfluenceFromNotificationOpen(OneSignal.AppEntryAction appEntryAction, String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        if (string2 != null) {
            if (string2.isEmpty()) {
                return;
            }
            this.attemptSessionUpgrade(appEntryAction, string2);
        }
    }

    void onInAppMessageReceived(String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onInAppMessageReceived messageId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        OSChannelTracker oSChannelTracker = this.trackerFactory.getIAMChannelTracker();
        oSChannelTracker.saveLastId(string2);
        oSChannelTracker.resetAndInitInfluence();
    }

    void onNotificationReceived(String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager onNotificationReceived notificationId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        if (string2 != null) {
            if (string2.isEmpty()) {
                return;
            }
            this.trackerFactory.getNotificationChannelTracker().saveLastId(string2);
        }
    }

    void restartSessionIfNeeded(OneSignal.AppEntryAction appEntryAction) {
        List<OSChannelTracker> list = this.trackerFactory.getChannelsToResetByEntryAction(appEntryAction);
        ArrayList arrayList = new ArrayList();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal SessionManager restartSessionIfNeeded with entryAction: ");
        stringBuilder.append((Object)appEntryAction);
        stringBuilder.append("\n channelTrackers: ");
        stringBuilder.append(list.toString());
        oSLogger.debug(stringBuilder.toString());
        for (OSChannelTracker oSChannelTracker : list) {
            JSONArray jSONArray = oSChannelTracker.getLastReceivedIds();
            OSLogger oSLogger2 = this.logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("OneSignal SessionManager restartSessionIfNeeded lastIds: ");
            stringBuilder2.append((Object)jSONArray);
            oSLogger2.debug(stringBuilder2.toString());
            OSInfluence oSInfluence = oSChannelTracker.getCurrentSessionInfluence();
            boolean bl = jSONArray.length() > 0 ? this.setSession(oSChannelTracker, OSInfluenceType.INDIRECT, null, jSONArray) : this.setSession(oSChannelTracker, OSInfluenceType.UNATTRIBUTED, null, null);
            if (!bl) continue;
            arrayList.add((Object)oSInfluence);
        }
        this.sendSessionEndingWithInfluences((List<OSInfluence>)arrayList);
    }

    public static interface SessionListener {
        public void onSessionEnding(List<OSInfluence> var1);
    }

}

