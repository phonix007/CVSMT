/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSLogger
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.CharSequence
 *  java.lang.Class
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

@SourceDebugExtension(value="SMAP\nOSChannelTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSChannelTracker.kt\ncom/onesignal/influence/data/OSChannelTracker\n*L\n1#1,174:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0012H&J\b\u0010A\u001a\u00020=H&J\u0013\u0010B\u001a\u0002002\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0012\u0010D\u001a\u00020$2\b\u0010E\u001a\u0004\u0018\u00010\u001aH&J\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020=H&J\u0006\u0010H\u001a\u00020=J\u0010\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020$H&J\u0010\u0010K\u001a\u00020=2\b\u0010E\u001a\u0004\u0018\u00010\u001aJ\b\u0010L\u001a\u00020\u001aH\u0016R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u001aX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0012\u0010!\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\fR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00101R\u0014\u00102\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00101R\u0014\u00103\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00104\u001a\u00020$8fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010&R\u0011\u00106\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b7\u0010&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2={"Lcom/onesignal/influence/data/OSChannelTracker;", "", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channelLimit", "", "getChannelLimit", "()I", "channelType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getChannelType", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "currentSessionInfluence", "Lcom/onesignal/influence/domain/OSInfluence;", "getCurrentSessionInfluence", "()Lcom/onesignal/influence/domain/OSInfluence;", "getDataRepository", "()Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "setDataRepository", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;)V", "directId", "", "getDirectId", "()Ljava/lang/String;", "setDirectId", "(Ljava/lang/String;)V", "idTag", "getIdTag", "indirectAttributionWindow", "getIndirectAttributionWindow", "indirectIds", "Lorg/json/JSONArray;", "getIndirectIds", "()Lorg/json/JSONArray;", "setIndirectIds", "(Lorg/json/JSONArray;)V", "influenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "getInfluenceType", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "setInfluenceType", "(Lcom/onesignal/influence/domain/OSInfluenceType;)V", "isDirectSessionEnabled", "", "()Z", "isIndirectSessionEnabled", "isUnattributedSessionEnabled", "lastChannelObjects", "getLastChannelObjects", "lastReceivedIds", "getLastReceivedIds", "getLogger", "()Lcom/onesignal/OSLogger;", "setLogger", "(Lcom/onesignal/OSLogger;)V", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "influence", "cacheState", "equals", "other", "getLastChannelObjectsReceivedByNewId", "id", "hashCode", "initInfluencedTypeFromCache", "resetAndInitInfluence", "saveChannelObjects", "channelObjects", "saveLastId", "toString", "onesignal_release"}, k=1, mv={1, 1, 16})
public abstract class OSChannelTracker {
    private OSInfluenceDataRepository dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private OSInfluenceType influenceType;
    private OSLogger logger;
    private OSTime timeProvider;

    public OSChannelTracker(OSInfluenceDataRepository oSInfluenceDataRepository, OSLogger oSLogger, OSTime oSTime) {
        Intrinsics.checkParameterIsNotNull((Object)oSInfluenceDataRepository, (String)"dataRepository");
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"logger");
        Intrinsics.checkParameterIsNotNull((Object)oSTime, (String)"timeProvider");
        this.dataRepository = oSInfluenceDataRepository;
        this.logger = oSLogger;
        this.timeProvider = oSTime;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    public abstract void addSessionData(JSONObject var1, OSInfluence var2);

    public abstract void cacheState();

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (true ^ Intrinsics.areEqual((Object)this.getClass(), (Object)object.getClass())) {
                return false;
            }
            OSChannelTracker oSChannelTracker = (OSChannelTracker)object;
            return this.influenceType == oSChannelTracker.influenceType && Intrinsics.areEqual((Object)oSChannelTracker.getIdTag(), (Object)this.getIdTag());
        }
        return false;
    }

    public abstract int getChannelLimit();

    public abstract OSInfluenceChannel getChannelType();

    public final OSInfluence getCurrentSessionInfluence() {
        OSInfluenceType oSInfluenceType;
        OSInfluence oSInfluence = new OSInfluence(this.getChannelType(), OSInfluenceType.DISABLED, null);
        if (this.influenceType == null) {
            this.initInfluencedTypeFromCache();
        }
        if ((oSInfluenceType = this.influenceType) == null) {
            oSInfluenceType = OSInfluenceType.DISABLED;
        }
        if (oSInfluenceType.isDirect()) {
            if (this.isDirectSessionEnabled()) {
                oSInfluence.setIds(new JSONArray().put((Object)this.directId));
                oSInfluence.setInfluenceType(OSInfluenceType.DIRECT);
                return oSInfluence;
            }
        } else if (oSInfluenceType.isIndirect()) {
            if (this.isIndirectSessionEnabled()) {
                oSInfluence.setIds(this.indirectIds);
                oSInfluence.setInfluenceType(OSInfluenceType.INDIRECT);
                return oSInfluence;
            }
        } else if (this.isUnattributedSessionEnabled()) {
            oSInfluence.setInfluenceType(OSInfluenceType.UNATTRIBUTED);
        }
        return oSInfluence;
    }

    protected final OSInfluenceDataRepository getDataRepository() {
        return this.dataRepository;
    }

    public final String getDirectId() {
        return this.directId;
    }

    public abstract String getIdTag();

    public abstract int getIndirectAttributionWindow();

    public final JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    public final OSInfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects() throws JSONException;

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String var1);

    public final JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = this.getLastChannelObjects();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ");
        stringBuilder.append((Object)jSONArray2);
        oSLogger.debug(stringBuilder.toString());
        long l = 1000L * (long)(60 * this.getIndirectAttributionWindow());
        long l2 = this.timeProvider.getCurrentTimeMillis();
        int n = jSONArray2.length();
        for (int i = 0; i < n; ++i) {
            try {
                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                if (l2 - jSONObject.getLong("time") > l) continue;
                jSONArray.put((Object)jSONObject.getString(this.getIdTag()));
            }
            catch (JSONException jSONException) {
                this.logger.error("Generating tracker getLastReceivedIds JSONObject ", (Throwable)jSONException);
                break;
            }
            continue;
        }
        return jSONArray;
    }

    public final OSLogger getLogger() {
        return this.logger;
    }

    public int hashCode() {
        OSInfluenceType oSInfluenceType = this.influenceType;
        int n = oSInfluenceType != null ? oSInfluenceType.hashCode() : 0;
        return n * 31 + this.getIdTag().hashCode();
    }

    public abstract void initInfluencedTypeFromCache();

    public final void resetAndInitInfluence() {
        JSONArray jSONArray;
        this.directId = null;
        this.indirectIds = jSONArray = this.getLastReceivedIds();
        int n = jSONArray != null ? jSONArray.length() : 0;
        OSInfluenceType oSInfluenceType = n > 0 ? OSInfluenceType.INDIRECT : OSInfluenceType.UNATTRIBUTED;
        this.influenceType = oSInfluenceType;
        this.cacheState();
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal OSChannelTracker resetAndInitInfluence: ");
        stringBuilder.append(this.getIdTag());
        stringBuilder.append(" finish with influenceType: ");
        stringBuilder.append((Object)((Object)this.influenceType));
        oSLogger.debug(stringBuilder.toString());
    }

    public abstract void saveChannelObjects(JSONArray var1);

    public final void saveLastId(String string2) {
        OSLogger oSLogger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal OSChannelTracker for: ");
        stringBuilder.append(this.getIdTag());
        stringBuilder.append(" saveLastId: ");
        stringBuilder.append(string2);
        oSLogger.debug(stringBuilder.toString());
        if (string2 != null) {
            boolean bl = ((CharSequence)string2).length() == 0;
            if (bl) {
                return;
            }
            JSONArray jSONArray = this.getLastChannelObjectsReceivedByNewId(string2);
            OSLogger oSLogger2 = this.logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("OneSignal OSChannelTracker for: ");
            stringBuilder2.append(this.getIdTag());
            stringBuilder2.append(" saveLastId with lastChannelObjectsReceived: ");
            stringBuilder2.append((Object)jSONArray);
            oSLogger2.debug(stringBuilder2.toString());
            try {
                OSTime oSTime = this.timeProvider;
                jSONArray.put((Object)new JSONObject().put(this.getIdTag(), (Object)string2).put("time", oSTime.getCurrentTimeMillis()));
            }
            catch (JSONException jSONException) {
                this.logger.error("Generating tracker newInfluenceId JSONObject ", (Throwable)jSONException);
            }
            if (jSONArray.length() > this.getChannelLimit()) {
                JSONArray jSONArray2 = new JSONArray();
                int n = jSONArray.length();
                for (int i = jSONArray.length() - this.getChannelLimit(); i < n; ++i) {
                    try {
                        jSONArray2.put(jSONArray.get(i));
                        continue;
                    }
                    catch (JSONException jSONException) {
                        this.logger.error("Generating tracker lastChannelObjectsReceived get JSONObject ", (Throwable)jSONException);
                    }
                }
                jSONArray = jSONArray2;
            }
            OSLogger oSLogger3 = this.logger;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("OneSignal OSChannelTracker for: ");
            stringBuilder3.append(this.getIdTag());
            stringBuilder3.append(" with channelObjectToSave: ");
            stringBuilder3.append((Object)jSONArray);
            oSLogger3.debug(stringBuilder3.toString());
            this.saveChannelObjects(jSONArray);
            return;
        }
    }

    protected final void setDataRepository(OSInfluenceDataRepository oSInfluenceDataRepository) {
        Intrinsics.checkParameterIsNotNull((Object)oSInfluenceDataRepository, (String)"<set-?>");
        this.dataRepository = oSInfluenceDataRepository;
    }

    public final void setDirectId(String string2) {
        this.directId = string2;
    }

    public final void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    public final void setInfluenceType(OSInfluenceType oSInfluenceType) {
        this.influenceType = oSInfluenceType;
    }

    public final void setLogger(OSLogger oSLogger) {
        Intrinsics.checkParameterIsNotNull((Object)oSLogger, (String)"<set-?>");
        this.logger = oSLogger;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSChannelTracker{tag=");
        stringBuilder.append(this.getIdTag());
        stringBuilder.append(", influenceType=");
        stringBuilder.append((Object)((Object)this.influenceType));
        stringBuilder.append(", indirectIds=");
        stringBuilder.append((Object)this.indirectIds);
        stringBuilder.append(", directId=");
        stringBuilder.append(this.directId);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

