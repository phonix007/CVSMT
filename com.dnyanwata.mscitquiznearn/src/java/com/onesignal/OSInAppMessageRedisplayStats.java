/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageRedisplayStats {
    private static final String DISPLAY_DELAY = "delay";
    private static final String DISPLAY_LIMIT = "limit";
    private long displayDelay = 0L;
    private int displayLimit = 1;
    private int displayQuantity = 0;
    private long lastDisplayTime = -1L;
    private boolean redisplayEnabled = false;

    OSInAppMessageRedisplayStats() {
    }

    OSInAppMessageRedisplayStats(int n, long l) {
        this.displayQuantity = n;
        this.lastDisplayTime = l;
    }

    OSInAppMessageRedisplayStats(JSONObject jSONObject) throws JSONException {
        this.redisplayEnabled = true;
        Object object = jSONObject.get(DISPLAY_LIMIT);
        Object object2 = jSONObject.get(DISPLAY_DELAY);
        if (object instanceof Integer) {
            this.displayLimit = (Integer)object;
        }
        if (object2 instanceof Long) {
            this.displayDelay = (Long)object2;
            return;
        }
        if (object2 instanceof Integer) {
            this.displayDelay = ((Integer)object2).intValue();
        }
    }

    long getDisplayDelay() {
        return this.displayDelay;
    }

    int getDisplayLimit() {
        return this.displayLimit;
    }

    int getDisplayQuantity() {
        return this.displayQuantity;
    }

    long getLastDisplayTime() {
        return this.lastDisplayTime;
    }

    void incrementDisplayQuantity() {
        this.displayQuantity = 1 + this.displayQuantity;
    }

    boolean isDelayTimeSatisfied() {
        if (this.lastDisplayTime < 0L) {
            return true;
        }
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        long l2 = l - this.lastDisplayTime;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessage lastDisplayTime: ");
        stringBuilder.append(this.lastDisplayTime);
        stringBuilder.append(" currentTimeInSeconds: ");
        stringBuilder.append(l);
        stringBuilder.append(" diffInSeconds: ");
        stringBuilder.append(l2);
        stringBuilder.append(" displayDelay: ");
        stringBuilder.append(this.displayDelay);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        return l2 >= this.displayDelay;
    }

    public boolean isRedisplayEnabled() {
        return this.redisplayEnabled;
    }

    void setDisplayDelay(long l) {
        this.displayDelay = l;
    }

    void setDisplayLimit(int n) {
        this.displayLimit = n;
    }

    void setDisplayQuantity(int n) {
        this.displayQuantity = n;
    }

    void setDisplayStats(OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        this.setLastDisplayTime(oSInAppMessageRedisplayStats.getLastDisplayTime());
        this.setDisplayQuantity(oSInAppMessageRedisplayStats.getDisplayQuantity());
    }

    void setLastDisplayTime(long l) {
        this.lastDisplayTime = l;
    }

    boolean shouldDisplayAgain() {
        boolean bl = this.displayQuantity < this.displayLimit;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessage shouldDisplayAgain: ");
        stringBuilder.append(bl);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        return bl;
    }

    JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DISPLAY_LIMIT, this.displayLimit);
            jSONObject.put(DISPLAY_DELAY, this.displayDelay);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessageDisplayStats{lastDisplayTime=");
        stringBuilder.append(this.lastDisplayTime);
        stringBuilder.append(", displayQuantity=");
        stringBuilder.append(this.displayQuantity);
        stringBuilder.append(", displayLimit=");
        stringBuilder.append(this.displayLimit);
        stringBuilder.append(", displayDelay=");
        stringBuilder.append(this.displayDelay);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

