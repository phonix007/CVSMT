/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.influence.domain;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension(value="SMAP\nOSInfluence.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSInfluence.kt\ncom/onesignal/influence/domain/OSInfluence\n*L\n1#1,74:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001a\u001a\u00020\u0000J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u0003J\b\u0010!\u001a\u00020\u0003H\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\""}, d2={"Lcom/onesignal/influence/domain/OSInfluence;", "", "jsonString", "", "(Ljava/lang/String;)V", "influenceChannel", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "influenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "ids", "Lorg/json/JSONArray;", "(Lcom/onesignal/influence/domain/OSInfluenceChannel;Lcom/onesignal/influence/domain/OSInfluenceType;Lorg/json/JSONArray;)V", "directId", "getDirectId", "()Ljava/lang/String;", "getIds", "()Lorg/json/JSONArray;", "setIds", "(Lorg/json/JSONArray;)V", "<set-?>", "getInfluenceChannel", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getInfluenceType", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "setInfluenceType", "(Lcom/onesignal/influence/domain/OSInfluenceType;)V", "copy", "equals", "", "o", "hashCode", "", "toJSONString", "toString", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSInfluence {
    private JSONArray ids;
    private OSInfluenceChannel influenceChannel;
    private OSInfluenceType influenceType;

    public OSInfluence(OSInfluenceChannel oSInfluenceChannel, OSInfluenceType oSInfluenceType, JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)oSInfluenceChannel), (String)"influenceChannel");
        Intrinsics.checkParameterIsNotNull((Object)((Object)oSInfluenceType), (String)"influenceType");
        this.influenceChannel = oSInfluenceChannel;
        this.influenceType = oSInfluenceType;
        this.ids = jSONArray;
    }

    public OSInfluence(String string2) throws JSONException {
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"jsonString");
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("influence_channel");
        String string4 = jSONObject.getString("influence_type");
        String string5 = jSONObject.getString("influence_ids");
        this.influenceChannel = OSInfluenceChannel.Companion.fromString(string3);
        this.influenceType = OSInfluenceType.Companion.fromString(string4);
        Intrinsics.checkExpressionValueIsNotNull((Object)string5, (String)"ids");
        boolean bl = ((CharSequence)string5).length() == 0;
        JSONArray jSONArray = bl ? null : new JSONArray(string5);
        this.ids = jSONArray;
    }

    public final OSInfluence copy() {
        return new OSInfluence(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (true ^ Intrinsics.areEqual((Object)this.getClass(), (Object)object.getClass())) {
                return false;
            }
            OSInfluence oSInfluence = (OSInfluence)object;
            return this.influenceChannel == oSInfluence.influenceChannel && this.influenceType == oSInfluence.influenceType;
        }
        return false;
    }

    public final String getDirectId() throws JSONException {
        JSONArray jSONArray = this.ids;
        String string2 = null;
        if (jSONArray != null) {
            int n = jSONArray.length();
            string2 = null;
            if (n > 0) {
                string2 = jSONArray.getString(0);
            }
        }
        return string2;
    }

    public final JSONArray getIds() {
        return this.ids;
    }

    public final OSInfluenceChannel getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final OSInfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return 31 * this.influenceChannel.hashCode() + this.influenceType.hashCode();
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(OSInfluenceType oSInfluenceType) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)oSInfluenceType), (String)"<set-?>");
        this.influenceType = oSInfluenceType;
    }

    public final String toJSONString() throws JSONException {
        JSONObject jSONObject = new JSONObject().put("influence_channel", (Object)this.influenceChannel.toString()).put("influence_type", (Object)this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String string2 = jSONArray != null ? String.valueOf((Object)jSONArray) : "";
        String string3 = jSONObject.put("influence_ids", (Object)string2).toString();
        Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"JSONObject()\n           \u2026)\n            .toString()");
        return string3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionInfluence{influenceChannel=");
        stringBuilder.append((Object)this.influenceChannel);
        stringBuilder.append(", influenceType=");
        stringBuilder.append((Object)this.influenceType);
        stringBuilder.append(", ids=");
        stringBuilder.append((Object)this.ids);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

