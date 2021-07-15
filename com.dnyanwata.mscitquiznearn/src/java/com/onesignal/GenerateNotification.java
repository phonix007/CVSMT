/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.R
 *  android.R$drawable
 *  android.app.Notification
 *  android.app.PendingIntent
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.service.notification.StatusBarNotification
 *  android.widget.RemoteViews
 *  androidx.core.app.NotificationCompat
 *  androidx.core.app.NotificationCompat$Builder
 *  androidx.core.app.NotificationCompat$Extender
 *  androidx.core.app.NotificationCompat$InboxStyle
 *  androidx.core.app.NotificationCompat$Style
 *  androidx.core.app.NotificationManagerCompat
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.math.BigInteger
 *  java.net.URL
 *  java.net.URLConnection
 *  java.security.SecureRandom
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.NotificationDismissReceiver;
import com.onesignal.NotificationLimitManager;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSThrowable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import com.onesignal.R;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class GenerateNotification {
    public static final String BUNDLE_KEY_ACTION_ID = "actionId";
    public static final String BUNDLE_KEY_ANDROID_NOTIFICATION_ID = "androidNotificationId";
    public static final String BUNDLE_KEY_ONESIGNAL_DATA = "onesignalData";
    public static final String OS_SHOW_NOTIFICATION_THREAD = "OS_SHOW_NOTIFICATION_THREAD";
    private static Resources contextResources;
    private static Context currentContext;
    private static Class<?> notificationDismissedClass;
    private static Class<?> notificationOpenedClass;
    private static String packageName;

    static {
        notificationOpenedClass = NotificationOpenedReceiver.class;
        notificationDismissedClass = NotificationDismissReceiver.class;
        contextResources = null;
        currentContext = null;
        packageName = null;
    }

    GenerateNotification() {
    }

    private static void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            GenerateNotification.addCustomAlertButtons(jSONObject, list, list2);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", throwable);
        }
        if (list.size() == 0 || list.size() < 3) {
            list.add((Object)OSUtils.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok"));
            list2.add((Object)"__DEFAULT__");
        }
    }

    private static void addBackgroundImage(JSONObject jSONObject, NotificationCompat.Builder builder) throws Throwable {
        JSONObject jSONObject2;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT < 16) {
            return;
        }
        String string = jSONObject.optString("bg_img", null);
        if (string != null) {
            jSONObject2 = new JSONObject(string);
            bitmap = GenerateNotification.getBitmap(jSONObject2.optString("img", null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = GenerateNotification.getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            int n;
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(R.id.os_bgimage_notif_title, GenerateNotification.getTitle(jSONObject));
            remoteViews.setTextViewText(R.id.os_bgimage_notif_body, (CharSequence)jSONObject.optString("alert"));
            GenerateNotification.setTextColor(remoteViews, jSONObject2, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            GenerateNotification.setTextColor(remoteViews, jSONObject2, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            String string2 = jSONObject2 != null && jSONObject2.has("img_align") ? jSONObject2.getString("img_align") : ((n = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", packageName)) != 0 ? contextResources.getString(n) : null);
            if ("right".equals((Object)string2)) {
                remoteViews.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bitmap);
            }
            builder.setContent(remoteViews);
            builder.setStyle(null);
        }
    }

    private static void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
        if (!jSONObject2.has("a")) {
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
        if (!jSONObject3.has("actionButtons")) {
            return;
        }
        JSONArray jSONArray = jSONObject3.optJSONArray("actionButtons");
        for (int i = 0; i < jSONArray.length(); ++i) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            list.add((Object)jSONObject4.optString("text"));
            list2.add((Object)jSONObject4.optString("id"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void addNotificationActionButtons(JSONObject jSONObject, NotificationCompat.Builder builder, int n, String string) {
        JSONArray jSONArray;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (!jSONObject2.has("a")) {
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (!jSONObject3.has("actionButtons")) {
                return;
            }
            jSONArray = jSONObject3.getJSONArray("actionButtons");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
        for (int i = 0; i < jSONArray.length(); ++i) {
            JSONObject jSONObject4 = jSONArray.optJSONObject(i);
            JSONObject jSONObject5 = new JSONObject(jSONObject.toString());
            Intent intent = GenerateNotification.getNewBaseIntent(n);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            intent.setAction(stringBuilder.toString());
            intent.putExtra("action_button", true);
            jSONObject5.put(BUNDLE_KEY_ACTION_ID, (Object)jSONObject4.optString("id"));
            intent.putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject5.toString());
            if (string != null) {
                intent.putExtra("summary", string);
            } else if (jSONObject.has("grp")) {
                intent.putExtra("grp", jSONObject.optString("grp"));
            }
            PendingIntent pendingIntent = GenerateNotification.getNewActionPendingIntent(n, intent);
            int n2 = jSONObject4.has("icon") ? GenerateNotification.getResourceIcon(jSONObject4.optString("icon")) : 0;
            builder.addAction(n2, (CharSequence)jSONObject4.optString("text"), pendingIntent);
        }
    }

    private static void addXiaomiSettings(OneSignalNotificationBuilder oneSignalNotificationBuilder, Notification notification) {
        if (!oneSignalNotificationBuilder.hasLargeIcon) {
            return;
        }
        try {
            Object object = Class.forName((String)"android.app.MiuiNotification").newInstance();
            Field field = object.getClass().getDeclaredField("customizedIcon");
            field.setAccessible(true);
            field.set(object, (Object)true);
            Field field2 = notification.getClass().getField("extraNotification");
            field2.setAccessible(true);
            field2.set((Object)notification, object);
        }
        catch (Throwable throwable) {}
    }

    private static void applyNotificationExtender(OSNotificationGenerationJob oSNotificationGenerationJob, NotificationCompat.Builder builder) {
        if (!oSNotificationGenerationJob.hasExtender()) {
            return;
        }
        try {
            Field field = NotificationCompat.Builder.class.getDeclaredField("mNotification");
            field.setAccessible(true);
            Notification notification = (Notification)field.get((Object)builder);
            oSNotificationGenerationJob.setOrgFlags(notification.flags);
            oSNotificationGenerationJob.setOrgSound(notification.sound);
            builder.extend(oSNotificationGenerationJob.getNotification().getNotificationExtender());
            Notification notification2 = (Notification)field.get((Object)builder);
            Field field2 = NotificationCompat.Builder.class.getDeclaredField("mContentText");
            field2.setAccessible(true);
            CharSequence charSequence = (CharSequence)field2.get((Object)builder);
            Field field3 = NotificationCompat.Builder.class.getDeclaredField("mContentTitle");
            field3.setAccessible(true);
            CharSequence charSequence2 = (CharSequence)field3.get((Object)builder);
            oSNotificationGenerationJob.setOverriddenBodyFromExtender(charSequence);
            oSNotificationGenerationJob.setOverriddenTitleFromExtender(charSequence2);
            if (!oSNotificationGenerationJob.isRestoring()) {
                oSNotificationGenerationJob.setOverriddenFlags(notification2.flags);
                oSNotificationGenerationJob.setOverriddenSound(notification2.sound);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static int convertOSToAndroidPriority(int n) {
        if (n > 9) {
            return 2;
        }
        if (n > 7) {
            return 1;
        }
        if (n > 4) {
            return 0;
        }
        if (n > 2) {
            return -1;
        }
        return -2;
    }

    private static Intent createBaseSummaryIntent(int n, JSONObject jSONObject, String string) {
        return GenerateNotification.getNewBaseIntent(n).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("summary", string);
    }

    private static void createGenericPendingIntentsForGroup(NotificationCompat.Builder builder, JSONObject jSONObject, String string, int n) {
        SecureRandom secureRandom = new SecureRandom();
        builder.setContentIntent(GenerateNotification.getNewActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseIntent(n).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString()).putExtra("grp", string)));
        builder.setDeleteIntent(GenerateNotification.getNewDismissActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseDismissIntent(n).putExtra("grp", string)));
        builder.setGroup(string);
        try {
            builder.setGroupAlertBehavior(1);
        }
        catch (Throwable throwable) {}
    }

    private static Notification createGenericPendingIntentsForNotif(NotificationCompat.Builder builder, JSONObject jSONObject, int n) {
        SecureRandom secureRandom = new SecureRandom();
        builder.setContentIntent(GenerateNotification.getNewActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseIntent(n).putExtra(BUNDLE_KEY_ONESIGNAL_DATA, jSONObject.toString())));
        builder.setDeleteIntent(GenerateNotification.getNewDismissActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseDismissIntent(n)));
        return builder.build();
    }

    private static void createGrouplessSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob, int n) {
        NotificationCompat.Builder builder;
        int n2;
        String string;
        JSONObject jSONObject = oSNotificationGenerationJob.getJsonPayload();
        SecureRandom secureRandom = new SecureRandom();
        String string2 = OneSignalNotificationManager.getGrouplessSummaryKey();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);
        stringBuilder.append(" new messages");
        string = stringBuilder.toString();
        n2 = OneSignalNotificationManager.getGrouplessSummaryId();
        PendingIntent pendingIntent = GenerateNotification.getNewActionPendingIntent(secureRandom.nextInt(), GenerateNotification.createBaseSummaryIntent(n2, jSONObject, string2));
        PendingIntent pendingIntent2 = GenerateNotification.getNewDismissActionPendingIntent(secureRandom.nextInt(), GenerateNotification.getNewBaseDismissIntent(0).putExtra("summary", string2));
        builder = GenerateNotification.getBaseOneSignalNotificationBuilder((OSNotificationGenerationJob)oSNotificationGenerationJob).compatBuilder;
        if (oSNotificationGenerationJob.getOverriddenSound() != null) {
            builder.setSound(oSNotificationGenerationJob.getOverriddenSound());
        }
        if (oSNotificationGenerationJob.getOverriddenFlags() != null) {
            builder.setDefaults(oSNotificationGenerationJob.getOverriddenFlags().intValue());
        }
        builder.setContentIntent(pendingIntent).setDeleteIntent(pendingIntent2).setContentTitle(currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo())).setContentText((CharSequence)string).setNumber(n).setSmallIcon(GenerateNotification.getDefaultSmallIconId()).setLargeIcon(GenerateNotification.getDefaultLargeIcon()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(string2).setGroupSummary(true);
        try {
            builder.setGroupAlertBehavior(1);
        }
        catch (Throwable throwable) {}
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        inboxStyle.setBigContentTitle((CharSequence)string);
        builder.setStyle((NotificationCompat.Style)inboxStyle);
        Notification notification = builder.build();
        NotificationManagerCompat.from((Context)currentContext).notify(n2, notification);
    }

    private static Notification createSingleNotificationBeforeSummaryBuilder(OSNotificationGenerationJob oSNotificationGenerationJob, NotificationCompat.Builder builder) {
        boolean bl = Build.VERSION.SDK_INT > 17 && Build.VERSION.SDK_INT < 24 && !oSNotificationGenerationJob.isRestoring();
        if (bl && oSNotificationGenerationJob.getOverriddenSound() != null && !oSNotificationGenerationJob.getOverriddenSound().equals((Object)oSNotificationGenerationJob.getOrgSound())) {
            builder.setSound(null);
        }
        Notification notification = builder.build();
        if (bl) {
            builder.setSound(oSNotificationGenerationJob.getOverriddenSound());
        }
        return notification;
    }

    private static void createSummaryIdDatabaseEntry(OneSignalDbHelper oneSignalDbHelper, String string, int n) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf((int)n));
        contentValues.put("group_id", string);
        contentValues.put("is_summary", Integer.valueOf((int)1));
        oneSignalDbHelper.insertOrThrow("notification", null, contentValues);
    }

    /*
     * Exception decompiling
     */
    private static void createSummaryNotification(OSNotificationGenerationJob var0, OneSignalNotificationBuilder var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl419.1 : ILOAD : trying to set 1 previously set to 0
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

    static boolean displayNotificationFromJsonPayload(OSNotificationGenerationJob oSNotificationGenerationJob) {
        GenerateNotification.setStatics(oSNotificationGenerationJob.getContext());
        GenerateNotification.isRunningOnMainThreadCheck();
        return GenerateNotification.showNotification(oSNotificationGenerationJob);
    }

    /*
     * Exception decompiling
     */
    private static BigInteger getAccentColor(JSONObject var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl30.1 : ACONST_NULL : trying to set 1 previously set to 0
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
    private static OneSignalNotificationBuilder getBaseOneSignalNotificationBuilder(OSNotificationGenerationJob var0) {
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

    private static Bitmap getBitmap(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim();
        if (!string2.startsWith("http://") && !string2.startsWith("https://")) {
            return GenerateNotification.getBitmapFromAssetsOrResourceName(string);
        }
        return GenerateNotification.getBitmapFromURL(string2);
    }

    /*
     * Exception decompiling
     */
    private static Bitmap getBitmapFromAssetsOrResourceName(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl68.1 : ALOAD_1 : trying to set 1 previously set to 0
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

    private static Bitmap getBitmapFromURL(String string) {
        try {
            Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(string).openConnection().getInputStream());
            return bitmap;
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Could not download image!", throwable);
            return null;
        }
    }

    private static Bitmap getDefaultLargeIcon() {
        return GenerateNotification.resizeBitmapForLargeIconArea(GenerateNotification.getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    private static int getDefaultSmallIconId() {
        int n = GenerateNotification.getDrawableId("ic_stat_onesignal_default");
        if (n != 0) {
            return n;
        }
        int n2 = GenerateNotification.getDrawableId("corona_statusbar_icon_default");
        if (n2 != 0) {
            return n2;
        }
        int n3 = GenerateNotification.getDrawableId("ic_os_notification_fallback_white_24dp");
        if (n3 != 0) {
            return n3;
        }
        return 17301598;
    }

    private static int getDrawableId(String string) {
        return contextResources.getIdentifier(string, "drawable", packageName);
    }

    private static Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = GenerateNotification.getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = GenerateNotification.getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return GenerateNotification.resizeBitmapForLargeIconArea(bitmap);
    }

    private static PendingIntent getNewActionPendingIntent(int n, Intent intent) {
        return PendingIntent.getActivity((Context)currentContext, (int)n, (Intent)intent, (int)134217728);
    }

    private static Intent getNewBaseDismissIntent(int n) {
        return new Intent(currentContext, notificationDismissedClass).putExtra(BUNDLE_KEY_ANDROID_NOTIFICATION_ID, n).putExtra("dismissed", true);
    }

    private static Intent getNewBaseIntent(int n) {
        return new Intent(currentContext, notificationOpenedClass).putExtra(BUNDLE_KEY_ANDROID_NOTIFICATION_ID, n).addFlags(603979776);
    }

    private static PendingIntent getNewDismissActionPendingIntent(int n, Intent intent) {
        return PendingIntent.getBroadcast((Context)currentContext, (int)n, (Intent)intent, (int)134217728);
    }

    private static int getResourceIcon(String string) {
        if (string == null) {
            return 0;
        }
        String string2 = string.trim();
        if (!OSUtils.isValidResourceName(string2)) {
            return 0;
        }
        int n = GenerateNotification.getDrawableId(string2);
        if (n != 0) {
            return n;
        }
        try {
            int n2 = R.drawable.class.getField(string).getInt(null);
            return n2;
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    private static int getSmallIconId(JSONObject jSONObject) {
        int n = GenerateNotification.getResourceIcon(jSONObject.optString("sicon", null));
        if (n != 0) {
            return n;
        }
        return GenerateNotification.getDefaultSmallIconId();
    }

    private static CharSequence getTitle(JSONObject jSONObject) {
        String string = jSONObject.optString("title", null);
        if (string != null) {
            return string;
        }
        return currentContext.getPackageManager().getApplicationLabel(currentContext.getApplicationInfo());
    }

    static void isRunningOnMainThreadCheck() {
        if (!OSUtils.isRunningOnMainThread()) {
            return;
        }
        throw new OSThrowable.OSMainThreadException("Process for showing a notification should never been done on Main Thread!");
    }

    private static boolean isSoundEnabled(JSONObject jSONObject) {
        String string = jSONObject.optString("sound", null);
        return !"null".equals((Object)string) && !"nil".equals((Object)string);
    }

    private static void removeNotifyOptions(NotificationCompat.Builder builder) {
        builder.setOnlyAlertOnce(true).setDefaults(0).setSound(null).setVibrate(null).setTicker(null);
    }

    /*
     * Exception decompiling
     */
    private static Bitmap resizeBitmapForLargeIconArea(Bitmap var0) {
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
     * Exception decompiling
     */
    private static Integer safeGetColorFromHex(JSONObject var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl19.1 : ACONST_NULL : trying to set 1 previously set to 0
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
    private static void setAlertnessOptions(JSONObject var0, NotificationCompat.Builder var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl49 : ALOAD_0 : trying to set 1 previously set to 0
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

    private static void setStatics(Context context) {
        currentContext = context;
        packageName = context.getPackageName();
        contextResources = currentContext.getResources();
    }

    private static void setTextColor(RemoteViews remoteViews, JSONObject jSONObject, int n, String string, String string2) {
        Integer n2 = GenerateNotification.safeGetColorFromHex(jSONObject, string);
        if (n2 != null) {
            remoteViews.setTextColor(n, n2.intValue());
            return;
        }
        int n3 = contextResources.getIdentifier(string2, "color", packageName);
        if (n3 != 0) {
            remoteViews.setTextColor(n, AndroidSupportV4Compat.ContextCompat.getColor(currentContext, n3));
        }
    }

    private static boolean showNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        Notification notification;
        int n = oSNotificationGenerationJob.getAndroidId();
        JSONObject jSONObject = oSNotificationGenerationJob.getJsonPayload();
        String string = jSONObject.optString("grp", null);
        ArrayList<StatusBarNotification> arrayList = new ArrayList<StatusBarNotification>();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = OneSignalNotificationManager.getActiveGrouplessNotifications(currentContext);
            if (string == null && arrayList.size() >= 3) {
                string = OneSignalNotificationManager.getGrouplessSummaryKey();
                OneSignalNotificationManager.assignGrouplessNotifications(currentContext, arrayList);
            }
        }
        OneSignalNotificationBuilder oneSignalNotificationBuilder = GenerateNotification.getBaseOneSignalNotificationBuilder(oSNotificationGenerationJob);
        NotificationCompat.Builder builder = oneSignalNotificationBuilder.compatBuilder;
        GenerateNotification.addNotificationActionButtons(jSONObject, builder, n, null);
        try {
            GenerateNotification.addBackgroundImage(jSONObject, builder);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Could not set background notification image!", throwable);
        }
        GenerateNotification.applyNotificationExtender(oSNotificationGenerationJob, builder);
        if (oSNotificationGenerationJob.isRestoring()) {
            GenerateNotification.removeNotifyOptions(builder);
        }
        int n2 = string != null ? 2 : 1;
        NotificationLimitManager.clearOldestOverLimit(currentContext, n2);
        if (string != null) {
            GenerateNotification.createGenericPendingIntentsForGroup(builder, jSONObject, string, n);
            notification = GenerateNotification.createSingleNotificationBeforeSummaryBuilder(oSNotificationGenerationJob, builder);
            if (Build.VERSION.SDK_INT >= 24 && string.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey())) {
                GenerateNotification.createGrouplessSummaryNotification(oSNotificationGenerationJob, 1 + arrayList.size());
            } else {
                GenerateNotification.createSummaryNotification(oSNotificationGenerationJob, oneSignalNotificationBuilder);
            }
        } else {
            notification = GenerateNotification.createGenericPendingIntentsForNotif(builder, jSONObject, n);
        }
        if (string == null || Build.VERSION.SDK_INT > 17) {
            GenerateNotification.addXiaomiSettings(oneSignalNotificationBuilder, notification);
            NotificationManagerCompat.from((Context)currentContext).notify(n, notification);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return OneSignalNotificationManager.areNotificationsEnabled(currentContext, notification.getChannelId());
        }
        return true;
    }

    static void updateSummaryNotification(OSNotificationGenerationJob oSNotificationGenerationJob) {
        GenerateNotification.setStatics(oSNotificationGenerationJob.getContext());
        GenerateNotification.createSummaryNotification(oSNotificationGenerationJob, null);
    }

    private static class OneSignalNotificationBuilder {
        NotificationCompat.Builder compatBuilder;
        boolean hasLargeIcon;

        private OneSignalNotificationBuilder() {
        }
    }

}

