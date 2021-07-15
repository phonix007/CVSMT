/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.influence.domain.OSInfluenceType;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import com.onesignal.outcomes.domain.OSOutcomeSource;
import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSOutcomeEvent {
    private static final String NOTIFICATION_IDS = "notification_ids";
    private static final String OUTCOME_ID = "id";
    private static final String SESSION = "session";
    private static final String TIMESTAMP = "timestamp";
    private static final String WEIGHT = "weight";
    private String name;
    private JSONArray notificationIds;
    private OSInfluenceType session;
    private long timestamp;
    private Float weight;

    public OSOutcomeEvent(OSInfluenceType oSInfluenceType, JSONArray jSONArray, String string2, long l, float f) {
        this.session = oSInfluenceType;
        this.notificationIds = jSONArray;
        this.name = string2;
        this.timestamp = l;
        this.weight = Float.valueOf((float)f);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static OSOutcomeEvent fromOutcomeEventParamsV2toOutcomeEventV1(OSOutcomeEventParams var0) {
        var1_1 = OSInfluenceType.UNATTRIBUTED;
        if (var0.getOutcomeSource() == null) ** GOTO lbl-1000
        var6_2 = var0.getOutcomeSource();
        if (var6_2.getDirectBody() != null && var6_2.getDirectBody().getNotificationIds() != null && var6_2.getDirectBody().getNotificationIds().length() > 0) {
            var1_1 = OSInfluenceType.DIRECT;
            var2_3 = var6_2.getDirectBody().getNotificationIds();
        } else if (var6_2.getIndirectBody() != null && var6_2.getIndirectBody().getNotificationIds() != null && var6_2.getIndirectBody().getNotificationIds().length() > 0) {
            var1_1 = OSInfluenceType.INDIRECT;
            var2_3 = var6_2.getIndirectBody().getNotificationIds();
        } else lbl-1000: // 2 sources:
        {
            var2_3 = null;
        }
        var3_4 = var1_1;
        var4_5 = var2_3;
        return new OSOutcomeEvent(var3_4, var4_5, var0.getOutcomeId(), var0.getTimestamp(), var0.getWeight());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            OSOutcomeEvent oSOutcomeEvent = (OSOutcomeEvent)object;
            return this.session.equals((Object)oSOutcomeEvent.session) && this.notificationIds.equals((Object)oSOutcomeEvent.notificationIds) && this.name.equals((Object)oSOutcomeEvent.name) && this.timestamp == oSOutcomeEvent.timestamp && this.weight.equals((Object)oSOutcomeEvent.weight);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public OSInfluenceType getSession() {
        return this.session;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public float getWeight() {
        return this.weight.floatValue();
    }

    public int hashCode() {
        Object[] arrobject = new Object[5];
        arrobject[0] = this.session;
        JSONArray jSONArray = this.notificationIds;
        int n = 1;
        arrobject[n] = jSONArray;
        arrobject[2] = this.name;
        arrobject[3] = this.timestamp;
        arrobject[4] = this.weight;
        for (int i = 0; i < 5; ++i) {
            Object object = arrobject[i];
            int n2 = n * 31;
            int n3 = object == null ? 0 : object.hashCode();
            n = n2 + n3;
        }
        return n;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SESSION, (Object)this.session);
        jSONObject.put(NOTIFICATION_IDS, (Object)this.notificationIds);
        jSONObject.put(OUTCOME_ID, (Object)this.name);
        jSONObject.put(TIMESTAMP, this.timestamp);
        jSONObject.put(WEIGHT, (Object)this.weight);
        return jSONObject;
    }

    public JSONObject toJSONObjectForMeasure() throws JSONException {
        long l;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.notificationIds;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put(NOTIFICATION_IDS, (Object)this.notificationIds);
        }
        jSONObject.put(OUTCOME_ID, (Object)this.name);
        if (this.weight.floatValue() > 0.0f) {
            jSONObject.put(WEIGHT, (Object)this.weight);
        }
        if ((l = this.timestamp) > 0L) {
            jSONObject.put(TIMESTAMP, l);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OutcomeEvent{session=");
        stringBuilder.append((Object)this.session);
        stringBuilder.append(", notificationIds=");
        stringBuilder.append((Object)this.notificationIds);
        stringBuilder.append(", name='");
        stringBuilder.append(this.name);
        stringBuilder.append('\'');
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", weight=");
        stringBuilder.append((Object)this.weight);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

