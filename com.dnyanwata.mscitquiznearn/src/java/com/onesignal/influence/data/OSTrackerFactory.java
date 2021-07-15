/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OSSharedPreferences
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONObject
 */
package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OSTime;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.OSInfluenceConstants;
import com.onesignal.influence.data.OSChannelTracker;
import com.onesignal.influence.data.OSInAppMessageTracker;
import com.onesignal.influence.data.OSInfluenceDataRepository;
import com.onesignal.influence.data.OSNotificationTracker;
import com.onesignal.influence.data.OSTrackerFactory$WhenMappings;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import dalvik.annotation.SourceDebugExtension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@SourceDebugExtension(value="SMAP\nOSTrackerFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSTrackerFactory.kt\ncom/onesignal/influence/data/OSTrackerFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1366#2:84\n1435#2,3:85\n706#2:88\n783#2,2:89\n1366#2:91\n1435#2,3:92\n1648#2,2:95\n1648#2,2:97\n*E\n*S KotlinDebug\n*F\n+ 1 OSTrackerFactory.kt\ncom/onesignal/influence/data/OSTrackerFactory\n*L\n20#1:84\n20#1,3:85\n23#1:88\n23#1,2:89\n23#1:91\n23#1,3:92\n45#1,2:95\n55#1,2:97\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nJ\u0010\u0010!\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\"\u001a\u00020#J\u0006\u0010%\u001a\u00020\u001eJ\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2={"Lcom/onesignal/influence/data/OSTrackerFactory;", "", "preferences", "Lcom/onesignal/OSSharedPreferences;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/OSSharedPreferences;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channels", "", "Lcom/onesignal/influence/data/OSChannelTracker;", "getChannels", "()Ljava/util/List;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "iAMChannelTracker", "getIAMChannelTracker", "()Lcom/onesignal/influence/data/OSChannelTracker;", "influences", "Lcom/onesignal/influence/domain/OSInfluence;", "getInfluences", "notificationChannelTracker", "getNotificationChannelTracker", "sessionInfluences", "getSessionInfluences", "trackers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "getChannelByEntryAction", "entryAction", "Lcom/onesignal/OneSignal$AppEntryAction;", "getChannelsToResetByEntryAction", "initFromCache", "saveInfluenceParams", "influenceParams", "Lcom/onesignal/OneSignalRemoteParams$InfluenceParams;", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSTrackerFactory {
    private final OSInfluenceDataRepository dataRepository;
    private final ConcurrentHashMap<String, OSChannelTracker> trackers;

    public OSTrackerFactory(OSSharedPreferences oSSharedPreferences, OSLogger oSLogger, OSTime oSTime) {
        ConcurrentHashMap concurrentHashMap;
        OSInfluenceDataRepository oSInfluenceDataRepository;
        Intrinsics.checkParameterIsNotNull((Object)oSSharedPreferences, (String)"preferences");
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oSTime, (String)"timeProvider");
        this.trackers = concurrentHashMap = new ConcurrentHashMap();
        this.dataRepository = oSInfluenceDataRepository = new OSInfluenceDataRepository(oSSharedPreferences);
        ((Map)concurrentHashMap).put((Object)OSInfluenceConstants.INSTANCE.getIAM_TAG(), (Object)new OSInAppMessageTracker(oSInfluenceDataRepository, oSLogger, oSTime));
        ((Map)concurrentHashMap).put((Object)OSInfluenceConstants.INSTANCE.getNOTIFICATION_TAG(), (Object)new OSNotificationTracker(oSInfluenceDataRepository, oSLogger, oSTime));
    }

    public final void addSessionData(JSONObject jSONObject, List<OSInfluence> list) {
        Intrinsics.checkParameterIsNotNull((Object)jSONObject, (String)"jsonObject");
        Intrinsics.checkParameterIsNotNull(list, (String)"influences");
        for (OSInfluence oSInfluence : (Iterable)list) {
            OSInfluenceChannel oSInfluenceChannel = oSInfluence.getInfluenceChannel();
            if (OSTrackerFactory$WhenMappings.$EnumSwitchMapping$0[oSInfluenceChannel.ordinal()] != 1) continue;
            this.getNotificationChannelTracker().addSessionData(jSONObject, oSInfluence);
        }
    }

    public final OSChannelTracker getChannelByEntryAction(OneSignal.AppEntryAction appEntryAction) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)appEntryAction), (String)"entryAction");
        if (appEntryAction.isNotificationClick()) {
            return this.getNotificationChannelTracker();
        }
        return null;
    }

    public final List<OSChannelTracker> getChannels() {
        List list = (List)new ArrayList();
        list.add((Object)this.getNotificationChannelTracker());
        list.add((Object)this.getIAMChannelTracker());
        return list;
    }

    public final List<OSChannelTracker> getChannelsToResetByEntryAction(OneSignal.AppEntryAction appEntryAction) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)appEntryAction), (String)"entryAction");
        List list = (List)new ArrayList();
        if (appEntryAction.isAppClose()) {
            return list;
        }
        OSChannelTracker oSChannelTracker = appEntryAction.isAppOpen() ? this.getNotificationChannelTracker() : null;
        if (oSChannelTracker != null) {
            list.add((Object)oSChannelTracker);
        }
        list.add((Object)this.getIAMChannelTracker());
        return list;
    }

    public final OSChannelTracker getIAMChannelTracker() {
        Object object = this.trackers.get((Object)OSInfluenceConstants.INSTANCE.getIAM_TAG());
        if (object == null) {
            Intrinsics.throwNpe();
        }
        return (OSChannelTracker)object;
    }

    public final List<OSInfluence> getInfluences() {
        Collection collection = this.trackers.values();
        Intrinsics.checkExpressionValueIsNotNull((Object)collection, (String)"trackers.values");
        Iterable iterable = (Iterable)collection;
        Collection collection2 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            collection2.add((Object)((OSChannelTracker)iterator.next()).getCurrentSessionInfluence());
        }
        return (List)collection2;
    }

    public final OSChannelTracker getNotificationChannelTracker() {
        Object object = this.trackers.get((Object)OSInfluenceConstants.INSTANCE.getNOTIFICATION_TAG());
        if (object == null) {
            Intrinsics.throwNpe();
        }
        return (OSChannelTracker)object;
    }

    public final List<OSInfluence> getSessionInfluences() {
        Collection collection = this.trackers.values();
        Intrinsics.checkExpressionValueIsNotNull((Object)collection, (String)"trackers.values");
        Iterable iterable = (Iterable)collection;
        Collection collection2 = (Collection)new ArrayList();
        for (Object object : iterable) {
            if (!(true ^ Intrinsics.areEqual((Object)((OSChannelTracker)object).getIdTag(), (Object)OSInfluenceConstants.INSTANCE.getIAM_TAG()))) continue;
            collection2.add(object);
        }
        Iterable iterable2 = (Iterable)((List)collection2);
        Collection collection3 = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable2, (int)10));
        Iterator iterator = iterable2.iterator();
        while (iterator.hasNext()) {
            collection3.add((Object)((OSChannelTracker)iterator.next()).getCurrentSessionInfluence());
        }
        return (List)collection3;
    }

    public final void initFromCache() {
        Collection collection = this.trackers.values();
        Intrinsics.checkExpressionValueIsNotNull((Object)collection, (String)"trackers.values");
        Iterator iterator = ((Iterable)collection).iterator();
        while (iterator.hasNext()) {
            ((OSChannelTracker)iterator.next()).initInfluencedTypeFromCache();
        }
    }

    public final void saveInfluenceParams(OneSignalRemoteParams.InfluenceParams influenceParams) {
        Intrinsics.checkParameterIsNotNull((Object)influenceParams, (String)"influenceParams");
        this.dataRepository.saveInfluenceParams(influenceParams);
    }
}

