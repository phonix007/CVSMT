/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OSInAppMessageTag {
    private static final String ADD_TAGS = "adds";
    private static final String REMOVE_TAGS = "removes";
    private JSONObject tagsToAdd;
    private JSONArray tagsToRemove;

    OSInAppMessageTag(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.has(ADD_TAGS) ? jSONObject.getJSONObject(ADD_TAGS) : null;
        this.tagsToAdd = jSONObject2;
        boolean bl = jSONObject.has(REMOVE_TAGS);
        JSONArray jSONArray = null;
        if (bl) {
            jSONArray = jSONObject.getJSONArray(REMOVE_TAGS);
        }
        this.tagsToRemove = jSONArray;
    }

    public JSONObject getTagsToAdd() {
        return this.tagsToAdd;
    }

    public JSONArray getTagsToRemove() {
        return this.tagsToRemove;
    }

    public void setTagsToAdd(JSONObject jSONObject) {
        this.tagsToAdd = jSONObject;
    }

    public void setTagsToRemove(JSONArray jSONArray) {
        this.tagsToRemove = jSONArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray;
            JSONObject jSONObject2 = this.tagsToAdd;
            if (jSONObject2 != null) {
                jSONObject.put(ADD_TAGS, (Object)jSONObject2);
            }
            if ((jSONArray = this.tagsToRemove) == null) return jSONObject;
            {
                jSONObject.put(REMOVE_TAGS, (Object)jSONArray);
                return jSONObject;
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessageTag{adds=");
        stringBuilder.append((Object)this.tagsToAdd);
        stringBuilder.append(", removes=");
        stringBuilder.append((Object)this.tagsToRemove);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

