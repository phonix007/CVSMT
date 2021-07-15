/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  androidx.core.app.NotificationManagerCompat
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.NotificationSummaryManager;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSNotificationIntentExtras;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationOpenedProcessor {
    private static final String TAG = "com.onesignal.NotificationOpenedProcessor";

    NotificationOpenedProcessor() {
    }

    /*
     * Exception decompiling
     */
    private static void addChildNotifications(JSONArray var0, String var1, OneSignalDbHelper var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl58 : ALOAD_3 : trying to set 1 previously set to 0
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

    private static void clearStatusBarNotifications(Context context, OneSignalDbHelper oneSignalDbHelper, String string2) {
        if (string2 != null) {
            NotificationSummaryManager.clearNotificationOnSummaryClick(context, oneSignalDbHelper, string2);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && OneSignalNotificationManager.getGrouplessNotifsCount(context) < 1) {
            int n = OneSignalNotificationManager.getGrouplessSummaryId();
            OneSignalNotificationManager.getNotificationManager(context).cancel(n);
        }
    }

    private static void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            NotificationManagerCompat.from((Context)context).cancel(intent.getIntExtra("androidNotificationId", 0));
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    static boolean handleIAMPreviewOpen(Activity activity, JSONObject jSONObject) {
        String string2 = NotificationBundleProcessor.inAppPreviewPushUUID(jSONObject);
        if (string2 == null) {
            return false;
        }
        OneSignal.startOrResumeApp(activity);
        OneSignal.getInAppMessageController().displayPreviewMessage(string2);
        return true;
    }

    private static boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
        {
        }
    }

    private static void markNotificationsConsumed(Context context, Intent intent, OneSignalDbHelper oneSignalDbHelper, boolean bl) {
        String string2;
        String string3 = intent.getStringExtra("summary");
        String[] arrstring = null;
        if (string3 != null) {
            boolean bl2 = string3.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey());
            if (bl2) {
                string2 = "group_id IS NULL";
                arrstring = null;
            } else {
                arrstring = new String[]{string3};
                string2 = "group_id = ?";
            }
            if (!bl && !OneSignal.getClearGroupSummaryClick()) {
                String string4 = String.valueOf((Object)OneSignalNotificationManager.getMostRecentNotifIdFromGroup(oneSignalDbHelper, string3, bl2));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" AND android_notification_id = ?");
                string2 = stringBuilder.toString();
                arrstring = bl2 ? new String[]{string4} : new String[]{string3, string4};
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android_notification_id = ");
            stringBuilder.append(intent.getIntExtra("androidNotificationId", 0));
            string2 = stringBuilder.toString();
        }
        NotificationOpenedProcessor.clearStatusBarNotifications(context, oneSignalDbHelper, string3);
        oneSignalDbHelper.update("notification", NotificationOpenedProcessor.newContentValuesWithConsumed(intent), string2, arrstring);
        BadgeCountUpdater.update(oneSignalDbHelper, context);
    }

    private static ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        boolean bl = intent.getBooleanExtra("dismissed", false);
        Integer n = 1;
        if (bl) {
            contentValues.put("dismissed", n);
            return contentValues;
        }
        contentValues.put("opened", n);
        return contentValues;
    }

    static void processFromContext(Context context, Intent intent) {
        if (!NotificationOpenedProcessor.isOneSignalIntent(intent)) {
            return;
        }
        if (context != null) {
            OneSignal.initWithContext(context.getApplicationContext());
        }
        NotificationOpenedProcessor.handleDismissFromActionButtonPress(context, intent);
        NotificationOpenedProcessor.processIntent(context, intent);
    }

    static void processIntent(Context context, Intent intent) {
        String string2;
        OSNotificationIntentExtras oSNotificationIntentExtras;
        OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance(context);
        String string3 = intent.getStringExtra("summary");
        boolean bl = intent.getBooleanExtra("dismissed", false);
        if (!bl) {
            oSNotificationIntentExtras = NotificationOpenedProcessor.processToOpenIntent(context, intent, oneSignalDbHelper, string3);
            if (oSNotificationIntentExtras == null) {
                return;
            }
        } else {
            oSNotificationIntentExtras = null;
        }
        NotificationOpenedProcessor.markNotificationsConsumed(context, intent, oneSignalDbHelper, bl);
        if (string3 == null && (string2 = intent.getStringExtra("grp")) != null) {
            NotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(context, oneSignalDbHelper, string2, bl);
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("processIntent from context: ");
        stringBuilder.append((Object)context);
        stringBuilder.append(" and intent: ");
        stringBuilder.append((Object)intent);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        if (intent.getExtras() != null) {
            OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("processIntent intent extras: ");
            stringBuilder2.append(intent.getExtras().toString());
            OneSignal.onesignalLog(lOG_LEVEL2, stringBuilder2.toString());
        }
        if (!bl) {
            if (!(context instanceof Activity)) {
                OneSignal.LOG_LEVEL lOG_LEVEL3 = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("NotificationOpenedProcessor processIntent from an non Activity context: ");
                stringBuilder3.append((Object)context);
                OneSignal.onesignalLog(lOG_LEVEL3, stringBuilder3.toString());
                return;
            }
            OneSignal.handleNotificationOpen((Activity)context, oSNotificationIntentExtras.getDataArray(), intent.getBooleanExtra("from_alert", false), OSNotificationFormatHelper.getOSNotificationIdFromJson(oSNotificationIntentExtras.getJsonData()));
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static OSNotificationIntentExtras processToOpenIntent(Context context, Intent intent, OneSignalDbHelper oneSignalDbHelper, String string2) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        block7 : {
            void var6_10;
            block8 : {
                jSONArray = null;
                jSONObject = new JSONObject(intent.getStringExtra("onesignalData"));
                try {
                    if (!(context instanceof Activity)) {
                        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("NotificationOpenedProcessor processIntent from an non Activity context: ");
                        stringBuilder.append((Object)context);
                        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                    } else if (NotificationOpenedProcessor.handleIAMPreviewOpen((Activity)context, jSONObject)) {
                        return null;
                    }
                    jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
                    intent.putExtra("onesignalData", jSONObject.toString());
                    jSONArray = NotificationBundleProcessor.newJsonArray(new JSONObject(intent.getStringExtra("onesignalData")));
                    break block7;
                }
                catch (JSONException jSONException) {
                    break block8;
                }
                catch (JSONException jSONException) {
                    jSONObject = null;
                }
            }
            var6_10.printStackTrace();
        }
        if (string2 == null) return new OSNotificationIntentExtras(jSONArray, jSONObject);
        NotificationOpenedProcessor.addChildNotifications(jSONArray, string2, oneSignalDbHelper);
        return new OSNotificationIntentExtras(jSONArray, jSONObject);
    }
}

