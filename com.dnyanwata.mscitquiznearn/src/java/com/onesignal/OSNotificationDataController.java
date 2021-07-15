/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  com.onesignal.BackgroundRunnable
 *  com.onesignal.BadgeCountUpdater
 *  com.onesignal.NotificationSummaryManager
 *  com.onesignal.OSBackgroundManager
 *  com.onesignal.OSLogger
 *  com.onesignal.OSNotificationDataController$InvalidOrDuplicateNotificationCallback
 *  com.onesignal.OSNotificationFormatHelper
 *  com.onesignal.OSNotificationWorkManager
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalNotificationManager
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.BackgroundRunnable;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.NotificationSummaryManager;
import com.onesignal.OSBackgroundManager;
import com.onesignal.OSLogger;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OSNotificationFormatHelper;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

class OSNotificationDataController
extends OSBackgroundManager {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800L;
    private static final String OS_NOTIFICATIONS_THREAD = "OS_NOTIFICATIONS_THREAD";
    private final OneSignalDbHelper dbHelper;
    private final OSLogger logger;

    public OSNotificationDataController(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger) {
        this.dbHelper = oneSignalDbHelper;
        this.logger = oSLogger;
    }

    private void cleanNotificationCache() {
        this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

            public void run() {
                super.run();
                String[] arrstring = new String[]{String.valueOf((long)(OneSignal.getTime().getCurrentTimeMillis() / 1000L - 604800L))};
                OSNotificationDataController.this.dbHelper.delete("notification", "created_time < ?", arrstring);
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    private void isDuplicateNotification(final String string2, final InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if (string2 != null && !"".equals((Object)string2)) {
            if (!OSNotificationWorkManager.addNotificationIdProcessed((String)string2)) {
                this.logger.debug("Notification notValidOrDuplicated with id duplicated");
                invalidOrDuplicateNotificationCallback.onResult(true);
                return;
            }
            this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

                public void run() {
                    super.run();
                    String[] arrstring = new String[]{"notification_id"};
                    boolean bl = true;
                    String[] arrstring2 = new String[bl];
                    arrstring2[0] = string2;
                    Cursor cursor = OSNotificationDataController.this.dbHelper.query("notification", arrstring, "notification_id = ?", arrstring2, null, null, null);
                    boolean bl2 = cursor.moveToFirst();
                    cursor.close();
                    if (bl2) {
                        OSLogger oSLogger = OSNotificationDataController.this.logger;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of ");
                        stringBuilder.append(string2);
                        oSLogger.debug(stringBuilder.toString());
                    } else {
                        bl = false;
                    }
                    invalidOrDuplicateNotificationCallback.onResult(bl);
                }
            }, OS_NOTIFICATIONS_THREAD);
            return;
        }
        invalidOrDuplicateNotificationCallback.onResult(false);
    }

    void cleanOldCachedData() {
        this.cleanNotificationCache();
    }

    void clearOneSignalNotifications(final WeakReference<Context> weakReference) {
        this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

            public void run() {
                super.run();
                Context context = (Context)weakReference.get();
                if (context == null) {
                    return;
                }
                NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager((Context)context);
                String[] arrstring = new String[]{"android_notification_id"};
                Cursor cursor = OSNotificationDataController.this.dbHelper.query("notification", arrstring, "dismissed = 0 AND opened = 0", null, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        notificationManager.cancel(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    } while (cursor.moveToNext());
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", Integer.valueOf((int)1));
                OSNotificationDataController.this.dbHelper.update("notification", contentValues, "opened = 0", null);
                BadgeCountUpdater.updateCount((int)0, (Context)context);
                cursor.close();
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    void notValidOrDuplicated(JSONObject jSONObject, InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        String string2 = OSNotificationFormatHelper.getOSNotificationIdFromJson((JSONObject)jSONObject);
        if (string2 == null) {
            this.logger.debug("Notification notValidOrDuplicated with id null");
            invalidOrDuplicateNotificationCallback.onResult(true);
            return;
        }
        this.isDuplicateNotification(string2, invalidOrDuplicateNotificationCallback);
    }

    void removeGroupedNotifications(final String string2, final WeakReference<Context> weakReference) {
        this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

            public void run() {
                super.run();
                Context context = (Context)weakReference.get();
                if (context == null) {
                    return;
                }
                NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager((Context)context);
                String[] arrstring = new String[]{"android_notification_id"};
                String[] arrstring2 = new String[]{string2};
                Cursor cursor = OSNotificationDataController.this.dbHelper.query("notification", arrstring, "group_id = ? AND dismissed = 0 AND opened = 0", arrstring2, null, null, null);
                while (cursor.moveToNext()) {
                    int n = cursor.getInt(cursor.getColumnIndex("android_notification_id"));
                    if (n == -1) continue;
                    notificationManager.cancel(n);
                }
                cursor.close();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", Integer.valueOf((int)1));
                OSNotificationDataController.this.dbHelper.update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", arrstring2);
                BadgeCountUpdater.update((OneSignalDb)OSNotificationDataController.this.dbHelper, (Context)context);
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

    void removeNotification(final int n, final WeakReference<Context> weakReference) {
        this.runRunnableOnThread((Runnable)new BackgroundRunnable(){

            public void run() {
                super.run();
                Context context = (Context)weakReference.get();
                if (context == null) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("android_notification_id = ");
                stringBuilder.append(n);
                stringBuilder.append(" AND ");
                stringBuilder.append("opened");
                stringBuilder.append(" = 0 AND ");
                stringBuilder.append("dismissed");
                stringBuilder.append(" = 0");
                String string2 = stringBuilder.toString();
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", Integer.valueOf((int)1));
                if (OSNotificationDataController.this.dbHelper.update("notification", contentValues, string2, null) > 0) {
                    NotificationSummaryManager.updatePossibleDependentSummaryOnDismiss((Context)context, (OneSignalDb)OSNotificationDataController.this.dbHelper, (int)n);
                }
                BadgeCountUpdater.update((OneSignalDb)OSNotificationDataController.this.dbHelper, (Context)context);
                OneSignalNotificationManager.getNotificationManager((Context)context).cancel(n);
            }
        }, OS_NOTIFICATIONS_THREAD);
    }

}

