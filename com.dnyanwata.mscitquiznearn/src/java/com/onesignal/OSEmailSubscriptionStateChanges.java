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

import com.onesignal.OSEmailSubscriptionState;
import org.json.JSONException;
import org.json.JSONObject;

public class OSEmailSubscriptionStateChanges {
    private OSEmailSubscriptionState from;
    private OSEmailSubscriptionState to;

    public OSEmailSubscriptionStateChanges(OSEmailSubscriptionState oSEmailSubscriptionState, OSEmailSubscriptionState oSEmailSubscriptionState2) {
        this.from = oSEmailSubscriptionState;
        this.to = oSEmailSubscriptionState2;
    }

    public OSEmailSubscriptionState getFrom() {
        return this.from;
    }

    public OSEmailSubscriptionState getTo() {
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

