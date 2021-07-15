/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

class ImmutableJSONObject {
    private final JSONObject jsonObject;

    public ImmutableJSONObject() {
        this.jsonObject = new JSONObject();
    }

    public ImmutableJSONObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    public long getLong(String string2) throws JSONException {
        return this.jsonObject.getLong(string2);
    }

    public boolean has(String string2) {
        return this.jsonObject.has(string2);
    }

    public Object opt(String string2) {
        return this.jsonObject.opt(string2);
    }

    public boolean optBoolean(String string2) {
        return this.jsonObject.optBoolean(string2);
    }

    public boolean optBoolean(String string2, boolean bl) {
        return this.jsonObject.optBoolean(string2, bl);
    }

    public int optInt(String string2) {
        return this.jsonObject.optInt(string2);
    }

    public int optInt(String string2, int n) {
        return this.jsonObject.optInt(string2, n);
    }

    public JSONObject optJSONObject(String string2) {
        return this.jsonObject.optJSONObject(string2);
    }

    public long optLong(String string2) {
        return this.jsonObject.optLong(string2);
    }

    public String optString(String string2) {
        return this.jsonObject.optString(string2);
    }

    public String optString(String string2, String string3) {
        return this.jsonObject.optString(string2, string3);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImmutableJSONObject{jsonObject=");
        stringBuilder.append((Object)this.jsonObject);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

