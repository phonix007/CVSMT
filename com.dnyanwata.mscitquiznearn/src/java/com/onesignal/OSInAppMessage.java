/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.ParseException
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSInAppMessageRedisplayStats;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignalSimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessage {
    private static final String DISPLAY_DURATION = "displayDuration";
    private static final String END_TIME = "end_time";
    private static final String HAS_LIQUID = "has_liquid";
    private static final String IAM_ID = "id";
    private static final String IAM_REDISPLAY_STATS = "redisplay";
    private static final String IAM_TRIGGERS = "triggers";
    private static final String IAM_VARIANTS = "variants";
    private boolean actionTaken;
    private Set<String> clickedClickIds;
    private double displayDuration;
    private boolean displayedInSession = false;
    private Date endTime;
    private boolean hasLiquid;
    boolean isPreview;
    public String messageId;
    private OSInAppMessageRedisplayStats redisplayStats = new OSInAppMessageRedisplayStats();
    private boolean triggerChanged = false;
    public ArrayList<ArrayList<OSTrigger>> triggers;
    public HashMap<String, HashMap<String, String>> variants;

    OSInAppMessage(String string2, Set<String> set, boolean bl, OSInAppMessageRedisplayStats oSInAppMessageRedisplayStats) {
        this.messageId = string2;
        this.clickedClickIds = set;
        this.displayedInSession = bl;
        this.redisplayStats = oSInAppMessageRedisplayStats;
    }

    OSInAppMessage(JSONObject jSONObject) throws JSONException {
        this.messageId = jSONObject.getString(IAM_ID);
        this.variants = this.parseVariants(jSONObject.getJSONObject(IAM_VARIANTS));
        this.triggers = this.parseTriggerJson(jSONObject.getJSONArray(IAM_TRIGGERS));
        this.clickedClickIds = new HashSet();
        this.endTime = this.parseEndTimeJson(jSONObject);
        if (jSONObject.has(HAS_LIQUID)) {
            this.hasLiquid = jSONObject.getBoolean(HAS_LIQUID);
        }
        if (jSONObject.has(IAM_REDISPLAY_STATS)) {
            this.redisplayStats = new OSInAppMessageRedisplayStats(jSONObject.getJSONObject(IAM_REDISPLAY_STATS));
        }
    }

    OSInAppMessage(boolean bl) {
        this.isPreview = bl;
    }

    private Date parseEndTimeJson(JSONObject jSONObject) {
        String string2;
        try {
            string2 = jSONObject.getString(END_TIME);
        }
        catch (JSONException jSONException) {}
        if (string2.equals((Object)"null")) {
            return null;
        }
        try {
            Date date = OneSignalSimpleDateFormat.iso8601Format().parse(string2);
            return date;
        }
        catch (ParseException parseException) {
            parseException.printStackTrace();
        }
        return null;
    }

    private HashMap<String, HashMap<String, String>> parseVariants(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(string2);
            HashMap hashMap2 = new HashMap();
            Iterator iterator2 = jSONObject2.keys();
            while (iterator2.hasNext()) {
                String string3 = (String)iterator2.next();
                hashMap2.put((Object)string3, (Object)jSONObject2.getString(string3));
            }
            hashMap.put((Object)string2, (Object)hashMap2);
        }
        return hashMap;
    }

    void addClickId(String string2) {
        this.clickedClickIds.add((Object)string2);
    }

    void clearClickIds() {
        this.clickedClickIds.clear();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            OSInAppMessage oSInAppMessage = (OSInAppMessage)object;
            return this.messageId.equals((Object)oSInAppMessage.messageId);
        }
        return false;
    }

    Set<String> getClickedClickIds() {
        return this.clickedClickIds;
    }

    double getDisplayDuration() {
        return this.displayDuration;
    }

    boolean getHasLiquid() {
        return this.hasLiquid;
    }

    OSInAppMessageRedisplayStats getRedisplayStats() {
        return this.redisplayStats;
    }

    public int hashCode() {
        return this.messageId.hashCode();
    }

    boolean isClickAvailable(String string2) {
        return true ^ this.clickedClickIds.contains((Object)string2);
    }

    public boolean isDisplayedInSession() {
        return this.displayedInSession;
    }

    public boolean isFinished() {
        if (this.endTime == null) {
            return false;
        }
        Date date = new Date();
        return this.endTime.before(date);
    }

    boolean isTriggerChanged() {
        return this.triggerChanged;
    }

    protected ArrayList<ArrayList<OSTrigger>> parseTriggerJson(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); ++i) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int j = 0; j < jSONArray2.length(); ++j) {
                arrayList2.add((Object)new OSTrigger(jSONArray2.getJSONObject(j)));
            }
            arrayList.add((Object)arrayList2);
        }
        return arrayList;
    }

    void setDisplayDuration(double d) {
        this.displayDuration = d;
    }

    public void setDisplayedInSession(boolean bl) {
        this.displayedInSession = bl;
    }

    void setHasLiquid(boolean bl) {
        this.hasLiquid = bl;
    }

    void setRedisplayStats(int n, long l) {
        this.redisplayStats = new OSInAppMessageRedisplayStats(n, l);
    }

    void setTriggerChanged(boolean bl) {
        this.triggerChanged = bl;
    }

    boolean takeActionAsUnique() {
        if (this.actionTaken) {
            return false;
        }
        this.actionTaken = true;
        return true;
    }

    JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IAM_ID, (Object)this.messageId);
            JSONObject jSONObject2 = new JSONObject();
            for (String string2 : this.variants.keySet()) {
                HashMap hashMap = (HashMap)this.variants.get((Object)string2);
                JSONObject jSONObject3 = new JSONObject();
                for (String string3 : hashMap.keySet()) {
                    jSONObject3.put(string3, hashMap.get((Object)string3));
                }
                jSONObject2.put(string2, (Object)jSONObject3);
            }
            jSONObject.put(IAM_VARIANTS, (Object)jSONObject2);
            jSONObject.put(DISPLAY_DURATION, this.displayDuration);
            jSONObject.put(IAM_REDISPLAY_STATS, (Object)this.redisplayStats.toJSONObject());
            JSONArray jSONArray = new JSONArray();
            for (ArrayList arrayList : this.triggers) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    jSONArray2.put((Object)((OSTrigger)iterator.next()).toJSONObject());
                }
                jSONArray.put((Object)jSONArray2);
            }
            jSONObject.put(IAM_TRIGGERS, (Object)jSONArray);
            if (this.endTime != null) {
                jSONObject.put(END_TIME, (Object)OneSignalSimpleDateFormat.iso8601Format().format(this.endTime));
            }
            jSONObject.put(HAS_LIQUID, this.hasLiquid);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSInAppMessage{messageId='");
        stringBuilder.append(this.messageId);
        stringBuilder.append('\'');
        stringBuilder.append(", variants=");
        stringBuilder.append(this.variants);
        stringBuilder.append(", triggers=");
        stringBuilder.append(this.triggers);
        stringBuilder.append(", clickedClickIds=");
        stringBuilder.append(this.clickedClickIds);
        stringBuilder.append(", redisplayStats=");
        stringBuilder.append((Object)this.redisplayStats);
        stringBuilder.append(", displayDuration=");
        stringBuilder.append(this.displayDuration);
        stringBuilder.append(", displayedInSession=");
        stringBuilder.append(this.displayedInSession);
        stringBuilder.append(", triggerChanged=");
        stringBuilder.append(this.triggerChanged);
        stringBuilder.append(", actionTaken=");
        stringBuilder.append(this.actionTaken);
        stringBuilder.append(", isPreview=");
        stringBuilder.append(this.isPreview);
        stringBuilder.append(", endTime=");
        stringBuilder.append((Object)this.endTime);
        stringBuilder.append(", hasLiquid=");
        stringBuilder.append(this.hasLiquid);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

