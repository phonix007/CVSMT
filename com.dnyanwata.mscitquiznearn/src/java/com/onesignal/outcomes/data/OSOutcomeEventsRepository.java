/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OneSignalApiResponseHandler
 *  com.onesignal.influence.domain.OSInfluence
 *  com.onesignal.outcomes.data.OSOutcomeEventsCache
 *  com.onesignal.outcomes.data.OutcomeEventsService
 *  com.onesignal.outcomes.domain.OSOutcomeEventParams
 *  com.onesignal.outcomes.domain.OSOutcomeEventsRepository
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Set
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.outcomes.data.OSOutcomeEventsCache;
import com.onesignal.outcomes.data.OutcomeEventsService;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv={1, 0, 3}, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0016J\u0010\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0016\u0010%\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0018H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006)"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "Lcom/onesignal/outcomes/domain/OSOutcomeEventsRepository;", "logger", "Lcom/onesignal/OSLogger;", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "outcomeEventsService", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;Lcom/onesignal/outcomes/data/OutcomeEventsService;)V", "getLogger", "()Lcom/onesignal/OSLogger;", "getOutcomeEventsService", "()Lcom/onesignal/outcomes/data/OutcomeEventsService;", "cleanCachedUniqueOutcomeEventNotifications", "", "notificationTableName", "", "notificationIdColumnName", "getNotCachedUniqueOutcome", "", "Lcom/onesignal/influence/domain/OSInfluence;", "name", "influences", "getSavedOutcomeEvents", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "getUnattributedUniqueOutcomeEventsSent", "", "removeEvent", "outcomeEvent", "requestMeasureOutcomeEvent", "appId", "deviceType", "", "event", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "saveOutcomeEvent", "saveUnattributedUniqueOutcomeEventsSent", "unattributedUniqueOutcomeEvents", "saveUniqueOutcomeNotifications", "eventParams", "onesignal_release"}, k=1, mv={1, 1, 16})
public abstract class OSOutcomeEventsRepository
implements com.onesignal.outcomes.domain.OSOutcomeEventsRepository {
    private final OSLogger logger;
    private final OSOutcomeEventsCache outcomeEventsCache;
    private final OutcomeEventsService outcomeEventsService;

    public OSOutcomeEventsRepository(OSLogger oSLogger, OSOutcomeEventsCache oSOutcomeEventsCache, OutcomeEventsService outcomeEventsService) {
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventsCache, (String)"outcomeEventsCache");
        Intrinsics.checkParameterIsNotNull((Object)outcomeEventsService, (String)"outcomeEventsService");
        this.logger = oSLogger;
        this.outcomeEventsCache = oSOutcomeEventsCache;
        this.outcomeEventsService = outcomeEventsService;
    }

    public void cleanCachedUniqueOutcomeEventNotifications(String string2, String string3) {
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"notificationTableName");
        Intrinsics.checkParameterIsNotNull((Object)string3, (String)"notificationIdColumnName");
        this.outcomeEventsCache.cleanCachedUniqueOutcomeEventNotifications(string2, string3);
    }

    protected final OSLogger getLogger() {
        return this.logger;
    }

    public List<OSInfluence> getNotCachedUniqueOutcome(String string2, List<OSInfluence> list) {
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"name");
        Intrinsics.checkParameterIsNotNull(list, (String)"influences");
        List list2 = this.outcomeEventsCache.getNotCachedUniqueInfluencesForOutcome(string2, list);
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal getNotCachedUniqueOutcome influences: ");
        stringBuilder.append((Object)list2);
        oSLogger.debug(stringBuilder.toString());
        return list2;
    }

    public final OutcomeEventsService getOutcomeEventsService() {
        return this.outcomeEventsService;
    }

    public List<OSOutcomeEventParams> getSavedOutcomeEvents() {
        return this.outcomeEventsCache.getAllEventsToSend();
    }

    public Set<String> getUnattributedUniqueOutcomeEventsSent() {
        Set set = this.outcomeEventsCache.getUnattributedUniqueOutcomeEventsSentByChannel();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ");
        stringBuilder.append((Object)set);
        oSLogger.debug(stringBuilder.toString());
        return set;
    }

    public void removeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"outcomeEvent");
        this.outcomeEventsCache.deleteOldOutcomeEvent(oSOutcomeEventParams);
    }

    public abstract void requestMeasureOutcomeEvent(String var1, int var2, OSOutcomeEventParams var3, OneSignalApiResponseHandler var4);

    public void saveOutcomeEvent(OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"event");
        this.outcomeEventsCache.saveOutcomeEvent(oSOutcomeEventParams);
    }

    public void saveUnattributedUniqueOutcomeEventsSent(Set<String> set) {
        Intrinsics.checkParameterIsNotNull(set, (String)"unattributedUniqueOutcomeEvents");
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal save unattributedUniqueOutcomeEvents: ");
        stringBuilder.append(set);
        oSLogger.debug(stringBuilder.toString());
        this.outcomeEventsCache.saveUnattributedUniqueOutcomeEventsSentByChannel(set);
    }

    public void saveUniqueOutcomeNotifications(OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkParameterIsNotNull((Object)oSOutcomeEventParams, (String)"eventParams");
        this.outcomeEventsCache.saveUniqueOutcomeEventParams(oSOutcomeEventParams);
    }
}

