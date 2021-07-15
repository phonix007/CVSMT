/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "", "notificationIds", "Lorg/json/JSONArray;", "inAppMessagesIds", "(Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "getInAppMessagesIds", "()Lorg/json/JSONArray;", "setInAppMessagesIds", "(Lorg/json/JSONArray;)V", "getNotificationIds", "setNotificationIds", "toJSONObject", "Lorg/json/JSONObject;", "toString", "", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSOutcomeSourceBody {
    private JSONArray inAppMessagesIds;
    private JSONArray notificationIds;

    public OSOutcomeSourceBody() {
        this(null, null, 3, null);
    }

    public OSOutcomeSourceBody(JSONArray jSONArray) {
        this(jSONArray, null, 2, null);
    }

    public OSOutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    public /* synthetic */ OSOutcomeSourceBody(JSONArray jSONArray, JSONArray jSONArray2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            jSONArray = new JSONArray();
        }
        if ((n & 2) != 0) {
            jSONArray2 = new JSONArray();
        }
        this(jSONArray, jSONArray2);
    }

    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject().put("notification_ids", (Object)this.notificationIds).put("in_app_message_ids", (Object)this.inAppMessagesIds);
        Intrinsics.checkExpressionValueIsNotNull((Object)jSONObject, (String)"JSONObject()\n           \u2026AM_IDS, inAppMessagesIds)");
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSOutcomeSourceBody{notificationIds=");
        stringBuilder.append((Object)this.notificationIds);
        stringBuilder.append(", inAppMessagesIds=");
        stringBuilder.append((Object)this.inAppMessagesIds);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

