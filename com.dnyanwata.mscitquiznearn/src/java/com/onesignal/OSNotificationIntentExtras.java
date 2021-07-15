/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.onesignal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv={1, 0, 3}, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2={"Lcom/onesignal/OSNotificationIntentExtras;", "", "dataArray", "Lorg/json/JSONArray;", "jsonData", "Lorg/json/JSONObject;", "(Lorg/json/JSONArray;Lorg/json/JSONObject;)V", "getDataArray", "()Lorg/json/JSONArray;", "setDataArray", "(Lorg/json/JSONArray;)V", "getJsonData", "()Lorg/json/JSONObject;", "setJsonData", "(Lorg/json/JSONObject;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSNotificationIntentExtras {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public OSNotificationIntentExtras(JSONArray jSONArray, JSONObject jSONObject) {
        this.dataArray = jSONArray;
        this.jsonData = jSONObject;
    }

    public static /* synthetic */ OSNotificationIntentExtras copy$default(OSNotificationIntentExtras oSNotificationIntentExtras, JSONArray jSONArray, JSONObject jSONObject, int n, Object object) {
        if ((n & 1) != 0) {
            jSONArray = oSNotificationIntentExtras.dataArray;
        }
        if ((n & 2) != 0) {
            jSONObject = oSNotificationIntentExtras.jsonData;
        }
        return oSNotificationIntentExtras.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final OSNotificationIntentExtras copy(JSONArray jSONArray, JSONObject jSONObject) {
        return new OSNotificationIntentExtras(jSONArray, jSONObject);
    }

    public boolean equals(Object object) {
        block2 : {
            block3 : {
                if (this == object) break block2;
                if (!(object instanceof OSNotificationIntentExtras)) break block3;
                OSNotificationIntentExtras oSNotificationIntentExtras = (OSNotificationIntentExtras)object;
                if (Intrinsics.areEqual((Object)this.dataArray, (Object)oSNotificationIntentExtras.dataArray) && Intrinsics.areEqual((Object)this.jsonData, (Object)oSNotificationIntentExtras.jsonData)) break block2;
            }
            return false;
        }
        return true;
    }

    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public int hashCode() {
        JSONArray jSONArray = this.dataArray;
        int n = jSONArray != null ? jSONArray.hashCode() : 0;
        int n2 = n * 31;
        JSONObject jSONObject = this.jsonData;
        int n3 = 0;
        if (jSONObject != null) {
            n3 = jSONObject.hashCode();
        }
        return n2 + n3;
    }

    public final void setDataArray(JSONArray jSONArray) {
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        this.jsonData = jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationIntentExtras(dataArray=");
        stringBuilder.append((Object)this.dataArray);
        stringBuilder.append(", jsonData=");
        stringBuilder.append((Object)this.jsonData);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

