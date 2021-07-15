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

import com.onesignal.OSPermissionState;
import org.json.JSONObject;

public class OSPermissionStateChanges {
    private OSPermissionState from;
    private OSPermissionState to;

    public OSPermissionStateChanges(OSPermissionState oSPermissionState, OSPermissionState oSPermissionState2) {
        this.from = oSPermissionState;
        this.to = oSPermissionState2;
    }

    public OSPermissionState getFrom() {
        return this.from;
    }

    public OSPermissionState getTo() {
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

