/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Builder
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.Context
 *  android.database.Cursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.service.notification.StatusBarNotification
 *  androidx.core.app.NotificationCompat
 *  androidx.core.app.NotificationManagerCompat
 *  com.onesignal.NotificationLimitManager
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package com.onesignal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.onesignal.NotificationLimitManager;
import com.onesignal.OneSignalDbHelper;
import java.util.ArrayList;

public class OneSignalNotificationManager {
    private static final int GROUPLESS_SUMMARY_ID = -718463522;
    private static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";

    public static boolean areNotificationsEnabled(Context context, String string2) {
        block4 : {
            boolean bl;
            block6 : {
                block5 : {
                    if (!NotificationManagerCompat.from((Context)context).areNotificationsEnabled()) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT < 26) break block4;
                    NotificationChannel notificationChannel = OneSignalNotificationManager.getNotificationManager(context).getNotificationChannel(string2);
                    if (notificationChannel == null) break block5;
                    int n = notificationChannel.getImportance();
                    bl = false;
                    if (n == 0) break block6;
                }
                bl = true;
            }
            return bl;
        }
        return true;
    }

    static void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> arrayList) {
        for (StatusBarNotification statusBarNotification : arrayList) {
            Notification.Builder builder = Build.VERSION.SDK_INT >= 24 ? Notification.Builder.recoverBuilder((Context)context, (Notification)statusBarNotification.getNotification()) : new Notification.Builder(context);
            Notification notification = builder.setGroup(GROUPLESS_SUMMARY_KEY).build();
            NotificationManagerCompat.from((Context)context).notify(statusBarNotification.getId(), notification);
        }
    }

    static ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : OneSignalNotificationManager.getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean bl = NotificationLimitManager.isGroupSummary((StatusBarNotification)statusBarNotification);
            boolean bl2 = notification.getGroup() == null || notification.getGroup().equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey());
            if (bl || !bl2) continue;
            arrayList.add((Object)statusBarNotification);
        }
        return arrayList;
    }

    static StatusBarNotification[] getActiveNotifications(Context context) {
        StatusBarNotification[] arrstatusBarNotification;
        arrstatusBarNotification = new StatusBarNotification[]{};
        try {
            arrstatusBarNotification = OneSignalNotificationManager.getNotificationManager(context).getActiveNotifications();
        }
        catch (Throwable throwable) {}
        return arrstatusBarNotification;
    }

    static Integer getGrouplessNotifsCount(Context context) {
        StatusBarNotification[] arrstatusBarNotification = OneSignalNotificationManager.getActiveNotifications(context);
        int n = arrstatusBarNotification.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            StatusBarNotification statusBarNotification = arrstatusBarNotification[i];
            if (NotificationCompat.isGroupSummary((Notification)statusBarNotification.getNotification()) || !GROUPLESS_SUMMARY_KEY.equals((Object)statusBarNotification.getNotification().getGroup())) continue;
            ++n2;
        }
        return n2;
    }

    static int getGrouplessSummaryId() {
        return -718463522;
    }

    static String getGrouplessSummaryKey() {
        return GROUPLESS_SUMMARY_KEY;
    }

    static Integer getMostRecentNotifIdFromGroup(OneSignalDbHelper oneSignalDbHelper, String string2, boolean bl) {
        String string3 = bl ? "group_id IS NULL" : "group_id = ?";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(" AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        String string4 = stringBuilder.toString();
        String[] arrstring = bl ? null : new String[]{string2};
        Cursor cursor = oneSignalDbHelper.query("notification", null, string4, arrstring, null, null, "created_time DESC", "1");
        if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        Integer n = cursor.getInt(cursor.getColumnIndex("android_notification_id"));
        cursor.close();
        return n;
    }

    static NotificationManager getNotificationManager(Context context) {
        return (NotificationManager)context.getSystemService("notification");
    }
}

