/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.BundleCompat;
import com.onesignal.GenerateNotification;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSNotificationController;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSReceiveReceiptController;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationBundleProcessor {
    private static final String ANDROID_NOTIFICATION_ID = "android_notif_id";
    static final String DEFAULT_ACTION = "__DEFAULT__";
    private static final String IAM_PREVIEW_KEY = "os_in_app_message_preview_id";
    public static final String PUSH_ADDITIONAL_DATA_KEY = "a";
    public static final String PUSH_MINIFIED_BUTTONS_LIST = "o";
    public static final String PUSH_MINIFIED_BUTTON_ICON = "p";
    public static final String PUSH_MINIFIED_BUTTON_ID = "i";
    public static final String PUSH_MINIFIED_BUTTON_TEXT = "n";

    NotificationBundleProcessor() {
    }

    static JSONObject bundleAsJSONObject(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String string2 : bundle.keySet()) {
            try {
                jSONObject.put(string2, bundle.get(string2));
            }
            catch (JSONException jSONException) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("bundleAsJSONObject error for key: ");
                stringBuilder.append(string2);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), jSONException);
            }
        }
        return jSONObject;
    }

    static JSONObject getCustomJSONObject(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    static boolean hasRemoteResource(Bundle bundle) {
        return NotificationBundleProcessor.isBuildKeyRemote(bundle, "licon") || NotificationBundleProcessor.isBuildKeyRemote(bundle, "bicon") || bundle.getString("bg_img", null) != null;
        {
        }
    }

    private static boolean inAppMessagePreviewHandled(ProcessedBundleResult processedBundleResult, Bundle bundle) {
        String string2 = NotificationBundleProcessor.inAppPreviewPushUUID(NotificationBundleProcessor.bundleAsJSONObject(bundle));
        if (string2 != null) {
            if (OneSignal.isAppActive()) {
                processedBundleResult.inAppPreviewShown = true;
                OneSignal.getInAppMessageController().displayPreviewMessage(string2);
            }
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    static String inAppPreviewPushUUID(JSONObject var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl22.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    private static boolean isBuildKeyRemote(Bundle bundle, String string2) {
        String string3 = bundle.getString(string2, "").trim();
        return string3.startsWith("http://") || string3.startsWith("https://");
        {
        }
    }

    static void markNotificationAsDismissed(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (oSNotificationGenerationJob.getAndroidIdWithoutCreate() == -1) {
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Marking restored or disabled notifications as dismissed: ");
        stringBuilder.append(oSNotificationGenerationJob.toString());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("android_notification_id = ");
        stringBuilder2.append(oSNotificationGenerationJob.getAndroidIdWithoutCreate());
        String string2 = stringBuilder2.toString();
        OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance(oSNotificationGenerationJob.getContext());
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", Integer.valueOf((int)1));
        oneSignalDbHelper.update("notification", contentValues, string2, null);
        BadgeCountUpdater.update(oneSignalDbHelper, oSNotificationGenerationJob.getContext());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void maximizeButtonsFromBundle(Bundle bundle) {
        JSONObject jSONObject;
        int n;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        if (!bundle.containsKey(PUSH_MINIFIED_BUTTONS_LIST)) {
            return;
        }
        try {
            jSONObject2 = new JSONObject(bundle.getString("custom"));
            jSONObject = jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY) ? jSONObject2.getJSONObject(PUSH_ADDITIONAL_DATA_KEY) : new JSONObject();
            jSONArray = new JSONArray(bundle.getString(PUSH_MINIFIED_BUTTONS_LIST));
            bundle.remove(PUSH_MINIFIED_BUTTONS_LIST);
            n = 0;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
        do {
            if (n < jSONArray.length()) {
                String string2;
                JSONObject jSONObject3 = jSONArray.getJSONObject(n);
                String string3 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_TEXT);
                jSONObject3.remove(PUSH_MINIFIED_BUTTON_TEXT);
                if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ID)) {
                    string2 = jSONObject3.getString(PUSH_MINIFIED_BUTTON_ID);
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_ID);
                } else {
                    string2 = string3;
                }
                jSONObject3.put("id", (Object)string2);
                jSONObject3.put("text", (Object)string3);
                if (jSONObject3.has(PUSH_MINIFIED_BUTTON_ICON)) {
                    jSONObject3.put("icon", (Object)jSONObject3.getString(PUSH_MINIFIED_BUTTON_ICON));
                    jSONObject3.remove(PUSH_MINIFIED_BUTTON_ICON);
                }
            } else {
                jSONObject.put("actionButtons", (Object)jSONArray);
                jSONObject.put("actionId", (Object)DEFAULT_ACTION);
                if (!jSONObject2.has(PUSH_ADDITIONAL_DATA_KEY)) {
                    jSONObject2.put(PUSH_ADDITIONAL_DATA_KEY, (Object)jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
                return;
            }
            ++n;
        } while (true);
    }

    static JSONArray newJsonArray(JSONObject jSONObject) {
        return new JSONArray().put((Object)jSONObject);
    }

    static void processBundleFromReceiver(Context context, Bundle bundle, ProcessBundleReceiverCallback processBundleReceiverCallback) {
        ProcessedBundleResult processedBundleResult = new ProcessedBundleResult();
        if (!OSNotificationFormatHelper.isOneSignalBundle(bundle)) {
            processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            return;
        }
        processedBundleResult.isOneSignalPayload = true;
        NotificationBundleProcessor.maximizeButtonsFromBundle(bundle);
        if (NotificationBundleProcessor.inAppMessagePreviewHandled(processedBundleResult, bundle)) {
            processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            return;
        }
        NotificationBundleProcessor.startNotificationProcessing(context, bundle, processedBundleResult, new NotificationProcessingCallback(processedBundleResult, processBundleReceiverCallback){
            final /* synthetic */ ProcessBundleReceiverCallback val$bundleReceiverCallback;
            final /* synthetic */ ProcessedBundleResult val$bundleResult;
            {
                this.val$bundleResult = processedBundleResult;
                this.val$bundleReceiverCallback = processBundleReceiverCallback;
            }

            public void onResult(boolean bl) {
                if (!bl) {
                    this.val$bundleResult.isDup = true;
                }
                this.val$bundleReceiverCallback.onBundleProcessed(this.val$bundleResult);
            }
        });
    }

    private static void processCollapseKey(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (oSNotificationGenerationJob.isRestoring()) {
            return;
        }
        if (oSNotificationGenerationJob.getJsonPayload().has("collapse_key")) {
            if ("do_not_collapse".equals((Object)oSNotificationGenerationJob.getJsonPayload().optString("collapse_key"))) {
                return;
            }
            String string2 = oSNotificationGenerationJob.getJsonPayload().optString("collapse_key");
            Cursor cursor = OneSignalDbHelper.getInstance(oSNotificationGenerationJob.getContext()).query("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{string2}, null, null, null);
            if (cursor.moveToFirst()) {
                oSNotificationGenerationJob.setAndroidIdWithoutOverriding(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
            }
            cursor.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void processFromFCMIntentService(Context context, BundleCompat bundleCompat) {
        OneSignal.initWithContext(context);
        try {
            String string2 = bundleCompat.getString("json_payload");
            if (string2 == null) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: ");
                stringBuilder.append((Object)bundleCompat);
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                return;
            }
            JSONObject jSONObject = new JSONObject(string2);
            boolean bl = bundleCompat.getBoolean("is_restoring", false);
            long l = bundleCompat.getLong("timestamp");
            boolean bl2 = NotificationBundleProcessor.inAppPreviewPushUUID(jSONObject) != null;
            int n = bundleCompat.containsKey(ANDROID_NOTIFICATION_ID) ? bundleCompat.getInt(ANDROID_NOTIFICATION_ID) : 0;
            OSNotificationDataController.InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback = new OSNotificationDataController.InvalidOrDuplicateNotificationCallback(bl, bl2, jSONObject, context, n, string2, l){
                final /* synthetic */ Context val$context;
                final /* synthetic */ int val$finalAndroidNotificationId;
                final /* synthetic */ boolean val$isIamPreview;
                final /* synthetic */ boolean val$isRestoring;
                final /* synthetic */ JSONObject val$jsonPayload;
                final /* synthetic */ String val$jsonStrPayload;
                final /* synthetic */ long val$shownTimeStamp;
                {
                    this.val$isRestoring = bl;
                    this.val$isIamPreview = bl2;
                    this.val$jsonPayload = jSONObject;
                    this.val$context = context;
                    this.val$finalAndroidNotificationId = n;
                    this.val$jsonStrPayload = string2;
                    this.val$shownTimeStamp = l;
                }

                public void onResult(boolean bl) {
                    if (!this.val$isRestoring && !this.val$isIamPreview && bl) {
                        return;
                    }
                    String string2 = OSNotificationFormatHelper.getOSNotificationIdFromJson(this.val$jsonPayload);
                    OSNotificationWorkManager.beginEnqueueingWork(this.val$context, string2, this.val$finalAndroidNotificationId, this.val$jsonStrPayload, this.val$isRestoring, this.val$shownTimeStamp, false);
                    if (this.val$isRestoring) {
                        OSUtils.sleep(100);
                    }
                }
            };
            OneSignal.notValidOrDuplicated(jSONObject, invalidOrDuplicateNotificationCallback);
            return;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return;
        }
    }

    static int processJobForDisplay(OSNotificationController oSNotificationController, boolean bl) {
        return NotificationBundleProcessor.processJobForDisplay(oSNotificationController, false, bl);
    }

    static int processJobForDisplay(OSNotificationController oSNotificationController, boolean bl, boolean bl2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting processJobForDisplay opened: ");
        stringBuilder.append(bl);
        stringBuilder.append(" fromBackgroundLogic: ");
        stringBuilder.append(bl2);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        OSNotificationGenerationJob oSNotificationGenerationJob = oSNotificationController.getNotificationJob();
        NotificationBundleProcessor.processCollapseKey(oSNotificationGenerationJob);
        int n = oSNotificationGenerationJob.getAndroidIdWithoutCreate();
        boolean bl3 = NotificationBundleProcessor.shouldDisplayNotif(oSNotificationGenerationJob);
        boolean bl4 = false;
        if (bl3) {
            n = oSNotificationGenerationJob.getAndroidId();
            if (bl2 && OneSignal.shouldFireForegroundHandlers()) {
                oSNotificationController.setFromBackgroundLogic(false);
                OneSignal.fireForegroundHandlers(oSNotificationController);
                return n;
            }
            bl4 = GenerateNotification.displayNotificationFromJsonPayload(oSNotificationGenerationJob);
        }
        if (!oSNotificationGenerationJob.isRestoring() && !oSNotificationGenerationJob.isIamPreview()) {
            NotificationBundleProcessor.processNotification(oSNotificationGenerationJob, bl, bl4);
            OSNotificationWorkManager.removeNotificationIdProcessed(OSNotificationFormatHelper.getOSNotificationIdFromJson(oSNotificationController.getNotificationJob().getJsonPayload()));
            OneSignal.handleNotificationReceived(oSNotificationGenerationJob);
        }
        return n;
    }

    static int processJobForDisplay(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl) {
        return NotificationBundleProcessor.processJobForDisplay(new OSNotificationController(oSNotificationGenerationJob, oSNotificationGenerationJob.isRestoring(), true), false, bl);
    }

    static void processNotification(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl, boolean bl2) {
        NotificationBundleProcessor.saveNotification(oSNotificationGenerationJob, bl);
        if (!bl2) {
            NotificationBundleProcessor.markNotificationAsDismissed(oSNotificationGenerationJob);
            return;
        }
        String string2 = oSNotificationGenerationJob.getApiNotificationId();
        OSReceiveReceiptController.getInstance().sendReceiveReceipt(string2);
        OneSignal.getSessionManager().onNotificationReceived(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void saveNotification(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl) {
        int n;
        ContentValues contentValues;
        Context context;
        JSONObject jSONObject;
        OneSignalDbHelper oneSignalDbHelper;
        block9 : {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Saving Notification job: ");
            stringBuilder.append(oSNotificationGenerationJob.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
            context = oSNotificationGenerationJob.getContext();
            jSONObject = oSNotificationGenerationJob.getJsonPayload();
            try {
                JSONObject jSONObject2 = NotificationBundleProcessor.getCustomJSONObject(oSNotificationGenerationJob.getJsonPayload());
                oneSignalDbHelper = OneSignalDbHelper.getInstance(oSNotificationGenerationJob.getContext());
                boolean bl2 = oSNotificationGenerationJob.isNotificationToDisplay();
                n = 1;
                if (bl2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("android_notification_id = ");
                    stringBuilder2.append(oSNotificationGenerationJob.getAndroidIdWithoutCreate());
                    String string2 = stringBuilder2.toString();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("dismissed", Integer.valueOf((int)n));
                    oneSignalDbHelper.update("notification", contentValues2, string2, null);
                    BadgeCountUpdater.update(oneSignalDbHelper, context);
                }
                contentValues = new ContentValues();
                contentValues.put("notification_id", jSONObject2.optString(PUSH_MINIFIED_BUTTON_ID));
                if (jSONObject.has("grp")) {
                    contentValues.put("group_id", jSONObject.optString("grp"));
                }
                if (!jSONObject.has("collapse_key") || "do_not_collapse".equals((Object)jSONObject.optString("collapse_key"))) break block9;
                contentValues.put("collapse_id", jSONObject.optString("collapse_key"));
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                return;
            }
        }
        if (!bl) {
            n = 0;
        }
        contentValues.put("opened", Integer.valueOf((int)n));
        if (!bl) {
            contentValues.put("android_notification_id", Integer.valueOf((int)oSNotificationGenerationJob.getAndroidIdWithoutCreate()));
        }
        if (oSNotificationGenerationJob.getTitle() != null) {
            contentValues.put("title", oSNotificationGenerationJob.getTitle().toString());
        }
        if (oSNotificationGenerationJob.getBody() != null) {
            contentValues.put("message", oSNotificationGenerationJob.getBody().toString());
        }
        contentValues.put("expire_time", Long.valueOf((long)(jSONObject.optLong("google.sent_time", OneSignal.getTime().getCurrentThreadTimeMillis()) / 1000L + (long)jSONObject.optInt("google.ttl", 259200))));
        contentValues.put("full_data", jSONObject.toString());
        oneSignalDbHelper.insertOrThrow("notification", null, contentValues);
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Notification saved values: ");
        stringBuilder.append(contentValues.toString());
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (bl) return;
        {
            BadgeCountUpdater.update(oneSignalDbHelper, context);
            return;
        }
    }

    private static boolean shouldDisplayNotif(OSNotificationGenerationJob oSNotificationGenerationJob) {
        boolean bl;
        block5 : {
            block4 : {
                if (oSNotificationGenerationJob.isIamPreview() && Build.VERSION.SDK_INT <= 18) {
                    return false;
                }
                if (oSNotificationGenerationJob.hasExtender()) break block4;
                boolean bl2 = OSUtils.isStringNotEmpty(oSNotificationGenerationJob.getJsonPayload().optString("alert"));
                bl = false;
                if (!bl2) break block5;
            }
            bl = true;
        }
        return bl;
    }

    private static void startNotificationProcessing(Context context, Bundle bundle, ProcessedBundleResult processedBundleResult, NotificationProcessingCallback notificationProcessingCallback) {
        JSONObject jSONObject = NotificationBundleProcessor.bundleAsJSONObject(bundle);
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        boolean bl = bundle.getBoolean("is_restoring", false);
        boolean bl2 = Integer.parseInt((String)bundle.getString("pri", "0")) > 9;
        OSNotificationDataController.InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback = new OSNotificationDataController.InvalidOrDuplicateNotificationCallback(bl, context, bundle, notificationProcessingCallback, jSONObject, l, bl2, processedBundleResult){
            final /* synthetic */ Bundle val$bundle;
            final /* synthetic */ ProcessedBundleResult val$bundleResult;
            final /* synthetic */ Context val$context;
            final /* synthetic */ boolean val$isHighPriority;
            final /* synthetic */ boolean val$isRestoring;
            final /* synthetic */ JSONObject val$jsonPayload;
            final /* synthetic */ NotificationProcessingCallback val$notificationProcessingCallback;
            final /* synthetic */ long val$timestamp;
            {
                this.val$isRestoring = bl;
                this.val$context = context;
                this.val$bundle = bundle;
                this.val$notificationProcessingCallback = notificationProcessingCallback;
                this.val$jsonPayload = jSONObject;
                this.val$timestamp = l;
                this.val$isHighPriority = bl2;
                this.val$bundleResult = processedBundleResult;
            }

            public void onResult(boolean bl) {
                if (!this.val$isRestoring && bl) {
                    OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("startNotificationProcessing returning, with context: ");
                    stringBuilder.append((Object)this.val$context);
                    stringBuilder.append(" and bundle: ");
                    stringBuilder.append((Object)this.val$bundle);
                    OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                    this.val$notificationProcessingCallback.onResult(false);
                    return;
                }
                String string2 = OSNotificationFormatHelper.getOSNotificationIdFromJson(this.val$jsonPayload);
                int n = this.val$bundle.containsKey("android_notif_id") ? this.val$bundle.getInt("android_notif_id") : 0;
                OSNotificationWorkManager.beginEnqueueingWork(this.val$context, string2, n, this.val$jsonPayload.toString(), this.val$isRestoring, this.val$timestamp, this.val$isHighPriority);
                this.val$bundleResult.isWorkManagerProcessing = true;
                this.val$notificationProcessingCallback.onResult(true);
            }
        };
        OneSignal.notValidOrDuplicated(jSONObject, invalidOrDuplicateNotificationCallback);
    }

    static interface NotificationProcessingCallback {
        public void onResult(boolean var1);
    }

    static interface ProcessBundleReceiverCallback {
        public void onBundleProcessed(ProcessedBundleResult var1);
    }

    static class ProcessedBundleResult {
        boolean inAppPreviewShown;
        boolean isDup;
        boolean isOneSignalPayload;
        boolean isWorkManagerProcessing;

        ProcessedBundleResult() {
        }

        boolean processed() {
            return !this.isOneSignalPayload || this.isDup || this.inAppPreviewShown || this.isWorkManagerProcessing;
            {
            }
        }
    }

}

