/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSSharedPreferences
 *  dalvik.annotation.SourceDebugExtension
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.onesignal.influence.data;

import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.influence.domain.OSInfluenceType;
import dalvik.annotation.SourceDebugExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

@SourceDebugExtension(value="SMAP\nOSInfluenceDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OSInfluenceDataRepository.kt\ncom/onesignal/influence/data/OSInfluenceDataRepository\n*L\n1#1,206:1\n*E\n")
@Metadata(bv={1, 0, 3}, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nJ\u000e\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\nJ\u0010\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0006J\u000e\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0019J\u000e\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\fR\u0011\u0010 \u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\"\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2={"Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSSharedPreferences;)V", "cachedNotificationOpenId", "", "getCachedNotificationOpenId", "()Ljava/lang/String;", "iamCachedInfluenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "getIamCachedInfluenceType", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "iamIndirectAttributionWindow", "", "getIamIndirectAttributionWindow", "()I", "iamLimit", "getIamLimit", "isDirectInfluenceEnabled", "", "()Z", "isIndirectInfluenceEnabled", "isUnattributedInfluenceEnabled", "lastIAMsReceivedData", "Lorg/json/JSONArray;", "getLastIAMsReceivedData", "()Lorg/json/JSONArray;", "lastNotificationsReceivedData", "getLastNotificationsReceivedData", "notificationCachedInfluenceType", "getNotificationCachedInfluenceType", "notificationIndirectAttributionWindow", "getNotificationIndirectAttributionWindow", "notificationLimit", "getNotificationLimit", "cacheIAMInfluenceType", "", "influenceType", "cacheNotificationInfluenceType", "cacheNotificationOpenId", "id", "saveIAMs", "iams", "saveInfluenceParams", "influenceParams", "Lcom/onesignal/OneSignalRemoteParams$InfluenceParams;", "saveNotifications", "notifications", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSInfluenceDataRepository {
    private final OSSharedPreferences preferences;

    public OSInfluenceDataRepository(OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkParameterIsNotNull((Object)oSSharedPreferences, (String)"preferences");
        this.preferences = oSSharedPreferences;
    }

    public final void cacheIAMInfluenceType(OSInfluenceType oSInfluenceType) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)oSInfluenceType), (String)"influenceType");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", oSInfluenceType.toString());
    }

    public final void cacheNotificationInfluenceType(OSInfluenceType oSInfluenceType) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)oSInfluenceType), (String)"influenceType");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", oSInfluenceType.toString());
    }

    public final void cacheNotificationOpenId(String string2) {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", string2);
    }

    public final String getCachedNotificationOpenId() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", null);
    }

    public final OSInfluenceType getIamCachedInfluenceType() {
        String string2 = OSInfluenceType.UNATTRIBUTED.toString();
        OSSharedPreferences oSSharedPreferences = this.preferences;
        String string3 = oSSharedPreferences.getString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", string2);
        return OSInfluenceType.Companion.fromString(string3);
    }

    public final int getIamIndirectAttributionWindow() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int getIamLimit() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_IAM_LIMIT", 10);
    }

    /*
     * Exception decompiling
     */
    public final JSONArray getLastIAMsReceivedData() throws JSONException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
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
    public final JSONArray getLastNotificationsReceivedData() throws JSONException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
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

    public final OSInfluenceType getNotificationCachedInfluenceType() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        String string2 = oSSharedPreferences.getString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_OUTCOMES_CURRENT_SESSION", OSInfluenceType.UNATTRIBUTED.toString());
        return OSInfluenceType.Companion.fromString(string2);
    }

    public final int getNotificationIndirectAttributionWindow() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    public final int getNotificationLimit() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getInt(oSSharedPreferences.getPreferencesName(), "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    public final boolean isDirectInfluenceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_DIRECT_ENABLED", false);
    }

    public final boolean isIndirectInfluenceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_INDIRECT_ENABLED", false);
    }

    public final boolean isUnattributedInfluenceEnabled() {
        OSSharedPreferences oSSharedPreferences = this.preferences;
        return oSSharedPreferences.getBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_UNATTRIBUTED_ENABLED", false);
    }

    public final void saveIAMs(JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull((Object)jSONArray, (String)"iams");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }

    public final void saveInfluenceParams(OneSignalRemoteParams.InfluenceParams influenceParams) {
        Intrinsics.checkParameterIsNotNull((Object)influenceParams, (String)"influenceParams");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveBool(oSSharedPreferences.getPreferencesName(), "PREFS_OS_DIRECT_ENABLED", influenceParams.isDirectEnabled());
        OSSharedPreferences oSSharedPreferences2 = this.preferences;
        oSSharedPreferences2.saveBool(oSSharedPreferences2.getPreferencesName(), "PREFS_OS_INDIRECT_ENABLED", influenceParams.isIndirectEnabled());
        OSSharedPreferences oSSharedPreferences3 = this.preferences;
        oSSharedPreferences3.saveBool(oSSharedPreferences3.getPreferencesName(), "PREFS_OS_UNATTRIBUTED_ENABLED", influenceParams.isUnattributedEnabled());
        OSSharedPreferences oSSharedPreferences4 = this.preferences;
        oSSharedPreferences4.saveInt(oSSharedPreferences4.getPreferencesName(), "PREFS_OS_NOTIFICATION_LIMIT", influenceParams.getNotificationLimit());
        OSSharedPreferences oSSharedPreferences5 = this.preferences;
        oSSharedPreferences5.saveInt(oSSharedPreferences5.getPreferencesName(), "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", influenceParams.getIndirectNotificationAttributionWindow());
        OSSharedPreferences oSSharedPreferences6 = this.preferences;
        oSSharedPreferences6.saveInt(oSSharedPreferences6.getPreferencesName(), "PREFS_OS_IAM_LIMIT", influenceParams.getIamLimit());
        OSSharedPreferences oSSharedPreferences7 = this.preferences;
        oSSharedPreferences7.saveInt(oSSharedPreferences7.getPreferencesName(), "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", influenceParams.getIndirectIAMAttributionWindow());
    }

    public final void saveNotifications(JSONArray jSONArray) {
        Intrinsics.checkParameterIsNotNull((Object)jSONArray, (String)"notifications");
        OSSharedPreferences oSSharedPreferences = this.preferences;
        oSSharedPreferences.saveString(oSSharedPreferences.getPreferencesName(), "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}

