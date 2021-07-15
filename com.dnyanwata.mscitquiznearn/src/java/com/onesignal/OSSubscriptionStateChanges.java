/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

public class OSSubscriptionStateChanges {
    private OSSubscriptionState from;
    private OSSubscriptionState to;

    public OSSubscriptionStateChanges(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.from = oSSubscriptionState;
        this.to = oSSubscriptionState2;
    }

    public OSSubscriptionState getFrom() {
        return this.from;
    }

    public OSSubscriptionState getTo() {
        return this.to;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", (Object)this.from.toJSONObject());
            jSONObject.put("to", (Object)this.to.toJSONObject());
            return jSONObject;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return this.toJSONObject().toString();
    }
}

