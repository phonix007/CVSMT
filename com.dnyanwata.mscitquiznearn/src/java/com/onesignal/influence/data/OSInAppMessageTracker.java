/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  com.onesignal.OSTime
 *  com.onesignal.influence.data.OSChannelTracker
 *  com.onesignal.influence.data.OSInfluenceDataRepository
 *  com.onesignal.influence.domain.OSInfluence
 *  com.onesignal.influence.domain.OSInfluenceChannel
 *  com.onesignal.influence.domain.OSInfluenceType
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSTime;
import com.onesignal.influence.data.OSChannelTracker;
import com.onesignal.influence.data.OSInfluenceDataRepository;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension(value="SMAP\nOSInAppMessageTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSInAppMessageTracker.kt\ncom/onesignal/influence/data/OSInAppMessageTracker\n*L\n1#1,77:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0018H\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006'"}, d2={"Lcom/onesignal/influence/data/OSInAppMessageTracker;", "Lcom/onesignal/influence/data/OSChannelTracker;", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channelLimit", "", "getChannelLimit", "()I", "channelType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getChannelType", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "idTag", "", "getIdTag", "()Ljava/lang/String;", "indirectAttributionWindow", "getIndirectAttributionWindow", "lastChannelObjects", "Lorg/json/JSONArray;", "getLastChannelObjects", "()Lorg/json/JSONArray;", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "influence", "Lcom/onesignal/influence/domain/OSInfluence;", "cacheState", "getLastChannelObjectsReceivedByNewId", "id", "initInfluencedTypeFromCache", "saveChannelObjects", "channelObjects", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSInAppMessageTracker
extends OSChannelTracker {
    public OSInAppMessageTracker(OSInfluenceDataRepository oSInfluenceDataRepository, OSLogger oSLogger, OSTime oSTime) {
        Intrinsics.checkParameterIsNotNull((Object)oSInfluenceDataRepository, (String)"dataRepository");
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oSTime, (String)"timeProvider");
        super(oSInfluenceDataRepository, oSLogger, oSTime);
    }

    public void addSessionData(JSONObject jSONObject, OSInfluence oSInfluence) {
        Intrinsics.checkParameterIsNotNull((Object)jSONObject, (String)"jsonObject");
        Intrinsics.checkParameterIsNotNull((Object)oSInfluence, (String)"influence");
    }

    public void cacheState() {
        OSInfluenceType oSInfluenceType = this.getInfluenceType();
        if (oSInfluenceType == null) {
            oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
        }
        OSInfluenceDataRepository oSInfluenceDataRepository = this.getDataRepository();
        if (oSInfluenceType == OSInfluenceType.DIRECT) {
            oSInfluenceType = OSInfluenceType.INDIRECT;
        }
        oSInfluenceDataRepository.cacheIAMInfluenceType(oSInfluenceType);
    }

    public int getChannelLimit() {
        return this.getDataRepository().getIamLimit();
    }

    public OSInfluenceChannel getChannelType() {
        return OSInfluenceChannel.IAM;
    }

    public String getIdTag() {
        return "iam_id";
    }

    public int getIndirectAttributionWindow() {
        return this.getDataRepository().getIamIndirectAttributionWindow();
    }

    public JSONArray getLastChannelObjects() throws JSONException {
        return this.getDataRepository().getLastIAMsReceivedData();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONArray getLastChannelObjectsReceivedByNewId(String string2) {
        JSONArray jSONArray;
        int n;
        JSONArray jSONArray2;
        try {
            jSONArray = this.getLastChannelObjects();
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating IAM tracker getLastChannelObjects JSONObject ", (Throwable)jSONException);
            return new JSONArray();
        }
        try {
            jSONArray2 = new JSONArray();
            n = jSONArray.length();
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating tracker lastChannelObjectReceived get JSONObject ", (Throwable)jSONException);
            return jSONArray;
        }
        for (int i = 0; i < n; ++i) {
            if (!(true ^ Intrinsics.areEqual((Object)string2, (Object)jSONArray.getJSONObject(i).getString(this.getIdTag())))) continue;
            jSONArray2.put((Object)jSONArray.getJSONObject(i));
        }
        return jSONArray2;
    }

    public void initInfluencedTypeFromCache() {
        OSInfluenceType oSInfluenceType = this.getDataRepository().getIamCachedInfluenceType();
        if (oSInfluenceType.isIndirect()) {
            this.setIndirectIds(this.getLastReceivedIds());
        }
        this.setInfluenceType(oSInfluenceType);
        OSLogger oSLogger = this.getLogger();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ");
        stringBuilder.append((Object)this);
        oSLogger.debug(stringBuilder.toString());
    }

    public void saveChannelObjects(JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull((Object)jSONArray, (String)"channelObjects");
        this.getDataRepository().saveIAMs(jSONArray);
    }
}

