/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSSMSSubscriptionState;
import org.json.JSONException;
import org.json.JSONObject;

public class OSSMSSubscriptionStateChanges {
    private OSSMSSubscriptionState from;
    private OSSMSSubscriptionState to;

    public OSSMSSubscriptionStateChanges(OSSMSSubscriptionState oSSMSSubscriptionState, OSSMSSubscriptionState oSSMSSubscriptionState2) {
        this.from = oSSMSSubscriptionState;
        this.to = oSSMSSubscriptionState2;
    }

    public OSSMSSubscriptionState getFrom() {
        return this.from;
    }

    public OSSMSSubscriptionState getTo() {
        return this.to;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", (Object)this.from.toJSONObject());
            jSONObject.put("to", (Object)this.to.toJSONObject());
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return this.toJSONObject().toString();
    }
}

