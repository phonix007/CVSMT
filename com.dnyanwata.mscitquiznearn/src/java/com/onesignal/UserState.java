/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.ImmutableJSONObject
 *  com.onesignal.JSONUtils
 *  com.onesignal.LocationController
 *  com.onesignal.LocationController$LocationPoint
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.ImmutableJSONObject;
import com.onesignal.JSONUtils;
import com.onesignal.LocationController;
import com.onesignal.OneSignalPrefs;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserState {
    public static final int DEVICE_TYPE_ANDROID = 1;
    public static final int DEVICE_TYPE_EMAIL = 11;
    public static final int DEVICE_TYPE_FIREOS = 2;
    public static final int DEVICE_TYPE_HUAWEI = 13;
    public static final int DEVICE_TYPE_SMS = 14;
    private static final String[] LOCATION_FIELDS;
    private static final Set<String> LOCATION_FIELDS_SET;
    private static final Object LOCK;
    static final int PUSH_STATUS_FIREBASE_FCM_ERROR_IOEXCEPTION = -11;
    static final int PUSH_STATUS_FIREBASE_FCM_ERROR_MISC_EXCEPTION = -12;
    static final int PUSH_STATUS_FIREBASE_FCM_ERROR_SERVICE_NOT_AVAILABLE = -9;
    static final int PUSH_STATUS_FIREBASE_FCM_INIT_ERROR = -8;
    public static final int PUSH_STATUS_HMS_API_EXCEPTION_OTHER = -27;
    public static final int PUSH_STATUS_HMS_ARGUMENTS_INVALID = -26;
    public static final int PUSH_STATUS_HMS_TOKEN_TIMEOUT = -25;
    static final int PUSH_STATUS_INVALID_FCM_SENDER_ID = -6;
    static final int PUSH_STATUS_MISSING_ANDROID_SUPPORT_LIBRARY = -3;
    static final int PUSH_STATUS_MISSING_FIREBASE_FCM_LIBRARY = -4;
    public static final int PUSH_STATUS_MISSING_HMS_PUSHKIT_LIBRARY = -28;
    static final int PUSH_STATUS_NO_PERMISSION = 0;
    static final int PUSH_STATUS_OUTDATED_ANDROID_SUPPORT_LIBRARY = -5;
    static final int PUSH_STATUS_OUTDATED_GOOGLE_PLAY_SERVICES_APP = -7;
    public static final int PUSH_STATUS_SUBSCRIBED = 1;
    static final int PUSH_STATUS_UNSUBSCRIBE = -2;
    public static final String TAGS = "tags";
    private JSONObject dependValues;
    private String persistKey;
    private JSONObject syncValues;

    static {
        LOCK = new Object();
        Object[] arrobject = new String[]{"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp", "ad_id"};
        LOCATION_FIELDS = arrobject;
        LOCATION_FIELDS_SET = new HashSet((Collection)Arrays.asList((Object[])arrobject));
    }

    UserState(String string2, boolean bl) {
        this.persistKey = string2;
        if (bl) {
            this.loadState();
            return;
        }
        this.dependValues = new JSONObject();
        this.syncValues = new JSONObject();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff((JSONObject)jSONObject, (JSONObject)jSONObject2, (JSONObject)jSONObject3, set);
        }
    }

    /*
     * Exception decompiling
     */
    private Set<String> getGroupChangeFields(UserState var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl40.1 : ACONST_NULL : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    private void loadState() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void putValues(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            Iterator iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                jSONObject.put((String)entry.getKey(), entry.getValue());
            }
            return;
        }
    }

    protected abstract void addDependFields();

    void clearLocation() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"lat", null);
            hashMap.put((Object)"long", null);
            hashMap.put((Object)"loc_acc", null);
            hashMap.put((Object)"loc_type", null);
            hashMap.put((Object)"loc_bg", null);
            hashMap.put((Object)"loc_time_stamp", null);
            this.putValues(this.syncValues, (HashMap<String, Object>)hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put((Object)"loc_bg", null);
            hashMap2.put((Object)"loc_time_stamp", null);
            this.putValues(this.dependValues, (HashMap<String, Object>)hashMap2);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    UserState deepClone(String string2) {
        UserState userState = this.newInstance(string2);
        try {
            userState.dependValues = this.getDependValuesCopy();
            userState.syncValues = this.getSyncValuesCopy();
            return userState;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return userState;
        }
    }

    JSONObject generateJsonDiff(UserState userState, boolean bl) {
        this.addDependFields();
        userState.addDependFields();
        Set<String> set = this.getGroupChangeFields(userState);
        JSONObject jSONObject = UserState.generateJsonDiff(this.syncValues, userState.syncValues, null, set);
        if (!bl && jSONObject.toString().equals((Object)"{}")) {
            return null;
        }
        try {
            if (!jSONObject.has("app_id")) {
                jSONObject.put("app_id", (Object)this.syncValues.optString("app_id"));
            }
            if (this.syncValues.has("email_auth_hash")) {
                jSONObject.put("email_auth_hash", (Object)this.syncValues.optString("email_auth_hash"));
            }
            if (this.syncValues.has("sms_auth_hash")) {
                jSONObject.put("sms_auth_hash", (Object)this.syncValues.optString("sms_auth_hash"));
            }
            if (this.syncValues.has("external_user_id_auth_hash")) {
                jSONObject.put("external_user_id_auth_hash", (Object)this.syncValues.optString("external_user_id_auth_hash"));
                return jSONObject;
            }
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    JSONObject generateJsonDiffFromDependValues(UserState userState, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff((JSONObject)this.dependValues, (JSONObject)userState.dependValues, null, set);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    JSONObject generateJsonDiffFromIntoDependValues(JSONObject jSONObject, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            JSONObject jSONObject2 = this.dependValues;
            return JSONUtils.generateJsonDiff((JSONObject)jSONObject2, (JSONObject)jSONObject, (JSONObject)jSONObject2, set);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    JSONObject generateJsonDiffFromIntoSyncValued(JSONObject jSONObject, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            JSONObject jSONObject2 = this.syncValues;
            return JSONUtils.generateJsonDiff((JSONObject)jSONObject2, (JSONObject)jSONObject, (JSONObject)jSONObject2, set);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    JSONObject generateJsonDiffFromSyncValued(UserState userState, Set<String> set) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return JSONUtils.generateJsonDiff((JSONObject)this.syncValues, (JSONObject)userState.syncValues, null, set);
        }
    }

    public ImmutableJSONObject getDependValues() {
        try {
            ImmutableJSONObject immutableJSONObject = new ImmutableJSONObject(this.getDependValuesCopy());
            return immutableJSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return new ImmutableJSONObject();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    JSONObject getDependValuesCopy() throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return new JSONObject(this.dependValues.toString());
        }
    }

    public ImmutableJSONObject getSyncValues() {
        try {
            ImmutableJSONObject immutableJSONObject = new ImmutableJSONObject(this.getSyncValuesCopy());
            return immutableJSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return new ImmutableJSONObject();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JSONObject getSyncValuesCopy() throws JSONException {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return new JSONObject(this.syncValues.toString());
        }
    }

    abstract boolean isSubscribed();

    /*
     * Exception decompiling
     */
    void mergeTags(JSONObject var1, JSONObject var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32 : ALOAD_1 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    abstract UserState newInstance(String var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void persistState() {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            String string2 = OneSignalPrefs.PREFS_ONESIGNAL;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ONESIGNAL_USERSTATE_SYNCVALYES_");
            stringBuilder.append(this.persistKey);
            OneSignalPrefs.saveString(string2, stringBuilder.toString(), this.syncValues.toString());
            String string3 = OneSignalPrefs.PREFS_ONESIGNAL;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("ONESIGNAL_USERSTATE_DEPENDVALYES_");
            stringBuilder2.append(this.persistKey);
            OneSignalPrefs.saveString(string3, stringBuilder2.toString(), this.dependValues.toString());
            return;
        }
    }

    void persistStateAfterSync(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.dependValues;
            UserState.generateJsonDiff(jSONObject3, jSONObject, jSONObject3, null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.syncValues;
            UserState.generateJsonDiff(jSONObject4, jSONObject2, jSONObject4, null);
            this.mergeTags(jSONObject2, null);
        }
        if (jSONObject != null || jSONObject2 != null) {
            this.persistState();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void putOnDependValues(String string2, Object object) throws JSONException {
        Object object2;
        Object object3 = object2 = LOCK;
        synchronized (object3) {
            this.dependValues.put(string2, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void putOnSyncValues(String string2, Object object) throws JSONException {
        Object object2;
        Object object3 = object2 = LOCK;
        synchronized (object3) {
            this.syncValues.put(string2, object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void removeFromDependValues(String string2) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.dependValues.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void removeFromDependValues(List<String> list) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                this.dependValues.remove(string2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void removeFromSyncValues(String string2) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.syncValues.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void removeFromSyncValues(List<String> list) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                this.syncValues.remove(string2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setDependValues(JSONObject jSONObject) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.dependValues = jSONObject;
            return;
        }
    }

    void setLocation(LocationController.LocationPoint locationPoint) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"lat", (Object)locationPoint.lat);
            hashMap.put((Object)"long", (Object)locationPoint.log);
            hashMap.put((Object)"loc_acc", (Object)locationPoint.accuracy);
            hashMap.put((Object)"loc_type", (Object)locationPoint.type);
            this.putValues(this.syncValues, (HashMap<String, Object>)hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put((Object)"loc_bg", (Object)locationPoint.bg);
            hashMap2.put((Object)"loc_time_stamp", (Object)locationPoint.timeStamp);
            this.putValues(this.dependValues, (HashMap<String, Object>)hashMap2);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setSyncValues(JSONObject jSONObject) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.syncValues = jSONObject;
            return;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserState{persistKey='");
        stringBuilder.append(this.persistKey);
        stringBuilder.append('\'');
        stringBuilder.append(", dependValues=");
        stringBuilder.append((Object)this.dependValues);
        stringBuilder.append(", syncValues=");
        stringBuilder.append((Object)this.syncValues);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

