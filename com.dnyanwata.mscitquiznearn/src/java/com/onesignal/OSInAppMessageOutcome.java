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

public class OSInAppMessageOutcome {
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private String name;
    private boolean unique;
    private float weight;

    OSInAppMessageOutcome(JSONObject jSONObject) throws JSONException {
        this.name = jSONObject.getString(OUTCOME_NAME);
        float f = jSONObject.has(OUTCOME_WEIGHT) ? (float)jSONObject.getDouble(OUTCOME_WEIGHT) : 0.0f;
        this.weight = f;
        boolean bl = jSONObject.has(OUTCOME_UNIQUE) && jSONObject.getBoolean(OUTCOME_UNIQUE);
        this.unique = bl;
    }

    public String getName() {
        return this.name;
    }

    public float getWeight() {
        return this.weight;
    }

    public boolean isUnique() {
        return this.unique;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setUnique(boolean bl) {
        this.unique = bl;
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OUTCOME_NAME, (Object)this.name);
            jSONObject.put(OUTCOME_WEIGHT, (double)this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.unique);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessageOutcome{name='");
        stringBuilder.append(this.name);
        stringBuilder.append('\'');
        stringBuilder.append(", weight=");
        stringBuilder.append(this.weight);
        stringBuilder.append(", unique=");
        stringBuilder.append(this.unique);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

