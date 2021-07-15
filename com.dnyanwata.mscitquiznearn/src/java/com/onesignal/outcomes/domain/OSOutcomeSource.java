/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.domain;

import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@SourceDebugExtension(value="SMAP\nOSOutcomeSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSOutcomeSource.kt\ncom/onesignal/outcomes/domain/OSOutcomeSource\n*L\n1#1,35:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "", "directBody", "Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "indirectBody", "(Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;)V", "getDirectBody", "()Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "setDirectBody", "(Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;)V", "getIndirectBody", "setIndirectBody", "toJSONObject", "Lorg/json/JSONObject;", "toString", "", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSOutcomeSource {
    private OSOutcomeSourceBody directBody;
    private OSOutcomeSourceBody indirectBody;

    public OSOutcomeSource(OSOutcomeSourceBody oSOutcomeSourceBody, OSOutcomeSourceBody oSOutcomeSourceBody2) {
        this.directBody = oSOutcomeSourceBody;
        this.indirectBody = oSOutcomeSourceBody2;
    }

    public final OSOutcomeSourceBody getDirectBody() {
        return this.directBody;
    }

    public final OSOutcomeSourceBody getIndirectBody() {
        return this.indirectBody;
    }

    public final OSOutcomeSource setDirectBody(OSOutcomeSourceBody oSOutcomeSourceBody) {
        OSOutcomeSource oSOutcomeSource = this;
        oSOutcomeSource.directBody = oSOutcomeSourceBody;
        return oSOutcomeSource;
    }

    public final void setDirectBody(OSOutcomeSourceBody oSOutcomeSourceBody) {
        this.directBody = oSOutcomeSourceBody;
    }

    public final OSOutcomeSource setIndirectBody(OSOutcomeSourceBody oSOutcomeSourceBody) {
        OSOutcomeSource oSOutcomeSource = this;
        oSOutcomeSource.indirectBody = oSOutcomeSourceBody;
        return oSOutcomeSource;
    }

    public final void setIndirectBody(OSOutcomeSourceBody oSOutcomeSourceBody) {
        this.indirectBody = oSOutcomeSourceBody;
    }

    public final JSONObject toJSONObject() throws JSONException {
        OSOutcomeSourceBody oSOutcomeSourceBody;
        JSONObject jSONObject = new JSONObject();
        OSOutcomeSourceBody oSOutcomeSourceBody2 = this.directBody;
        if (oSOutcomeSourceBody2 != null) {
            jSONObject.put("direct", (Object)oSOutcomeSourceBody2.toJSONObject());
        }
        if ((oSOutcomeSourceBody = this.indirectBody) != null) {
            jSONObject.put("indirect", (Object)oSOutcomeSourceBody.toJSONObject());
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSOutcomeSource{directBody=");
        stringBuilder.append((Object)this.directBody);
        stringBuilder.append(", indirectBody=");
        stringBuilder.append((Object)this.indirectBody);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

