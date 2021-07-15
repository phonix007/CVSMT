/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.service.notification.StatusBarNotification
 *  android.text.TextUtils
 *  androidx.work.ExistingWorkPolicy
 *  androidx.work.ListenableWorker
 *  androidx.work.ListenableWorker$Result
 *  androidx.work.OneTimeWorkRequest
 *  androidx.work.OneTimeWorkRequest$Builder
 *  androidx.work.Operation
 *  androidx.work.WorkManager
 *  androidx.work.WorkRequest
 *  androidx.work.WorkRequest$Builder
 *  androidx.work.Worker
 *  androidx.work.WorkerParameters
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.concurrent.TimeUnit
 */
package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.NotificationLimitManager;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class OSNotificationRestoreWorkManager {
    static final String[] COLUMNS_FOR_RESTORE = new String[]{"notification_id", "android_notification_id", "full_data", "created_time"};
    static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final int DELAY_BETWEEN_NOTIFICATION_RESTORES_MS = 200;
    private static final String NOTIFICATION_RESTORE_WORKER_IDENTIFIER = NotificationRestoreWorker.class.getCanonicalName();
    public static boolean restored;

    OSNotificationRestoreWorkManager() {
    }

    public static void beginEnqueueingWork(Context context, boolean bl) {
        int n = bl ? 15 : 0;
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay((long)n, TimeUnit.SECONDS)).build();
        WorkManager.getInstance((Context)context).enqueueUniqueWork(NOTIFICATION_RESTORE_WORKER_IDENTIFIER, ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void queryAndRestoreNotificationsAndBadgeCount(Context context, OneSignalDbHelper oneSignalDbHelper, StringBuilder stringBuilder) {
        block5 : {
            Cursor cursor;
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Querying DB for notifications to restore: ");
            stringBuilder2.append(stringBuilder.toString());
            OneSignal.Log(lOG_LEVEL, stringBuilder2.toString());
            cursor = null;
            try {
                cursor = oneSignalDbHelper.query("notification", COLUMNS_FOR_RESTORE, stringBuilder.toString(), null, null, null, "_id DESC", NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
                OSNotificationRestoreWorkManager.showNotificationsFromCursor(context, cursor, 200);
                BadgeCountUpdater.update(oneSignalDbHelper, context);
            }
            catch (Throwable throwable) {
                try {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error restoring notification records! ", throwable);
                }
                finally {
                    if (cursor == null || cursor.isClosed()) break block5;
                }
            }
            if (cursor == null || cursor.isClosed()) break block5;
            cursor.close();
        }
    }

    static void showNotificationsFromCursor(Context context, Cursor cursor, int n) {
        if (!cursor.moveToFirst()) {
            return;
        }
        do {
            OSNotificationWorkManager.beginEnqueueingWork(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), true, cursor.getLong(cursor.getColumnIndex("created_time")), false);
            if (n <= 0) continue;
            OSUtils.sleep(n);
        } while (cursor.moveToNext());
    }

    private static void skipVisibleNotifications(Context context, StringBuilder stringBuilder) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        StatusBarNotification[] arrstatusBarNotification = OneSignalNotificationManager.getActiveNotifications(context);
        if (arrstatusBarNotification.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int n = arrstatusBarNotification.length;
        for (int i = 0; i < n; ++i) {
            arrayList.add((Object)arrstatusBarNotification[i].getId());
        }
        stringBuilder.append(" AND android_notification_id NOT IN (");
        stringBuilder.append(TextUtils.join((CharSequence)",", (Iterable)arrayList));
        stringBuilder.append(")");
    }

}

