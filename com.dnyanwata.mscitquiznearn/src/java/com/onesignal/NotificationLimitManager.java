/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.Context
 *  android.database.Cursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.service.notification.StatusBarNotification
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package com.onesignal;

import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class NotificationLimitManager {
    private static final int MAX_NUMBER_OF_NOTIFICATIONS_INT = 49;
    static final String MAX_NUMBER_OF_NOTIFICATIONS_STR = Integer.toString((int)49);

    NotificationLimitManager() {
    }

    static void clearOldestOverLimit(Context context, int n) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationLimitManager.clearOldestOverLimitStandard(context, n);
                return;
            }
            NotificationLimitManager.clearOldestOverLimitFallback(context, n);
            return;
        }
        catch (Throwable throwable) {
            NotificationLimitManager.clearOldestOverLimitFallback(context, n);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void clearOldestOverLimitFallback(Context context, int n) {
        block9 : {
            Cursor cursor;
            OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance(context);
            cursor = null;
            String[] arrstring = new String[]{"android_notification_id"};
            String string2 = OneSignalDbHelper.recentUninteractedWithNotificationsWhere().toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(NotificationLimitManager.getMaxNumberOfNotificationsString());
            stringBuilder.append(n);
            cursor = oneSignalDbHelper.query("notification", arrstring, string2, null, null, null, "_id", stringBuilder.toString());
            int n2 = cursor.getCount();
            int n3 = NotificationLimitManager.getMaxNumberOfNotificationsInt();
            int n4 = n + (n2 - n3);
            if (n4 < 1) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                return;
            }
            try {
                while (cursor.moveToNext()) {
                    OneSignal.removeNotification(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    if (--n4 > 0) continue;
                }
            }
            catch (Throwable throwable) {
                try {
                    OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error clearing oldest notifications over limit! ", throwable);
                }
                finally {
                    if (cursor == null || cursor.isClosed()) break block9;
                }
            }
            if (cursor == null || cursor.isClosed()) break block9;
            cursor.close();
        }
    }

    static void clearOldestOverLimitStandard(Context context, int n) throws Throwable {
        StatusBarNotification[] arrstatusBarNotification = OneSignalNotificationManager.getActiveNotifications(context);
        int n2 = n + (arrstatusBarNotification.length - NotificationLimitManager.getMaxNumberOfNotificationsInt());
        if (n2 < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : arrstatusBarNotification) {
            if (NotificationLimitManager.isGroupSummary(statusBarNotification)) continue;
            treeMap.put((Object)statusBarNotification.getNotification().when, (Object)statusBarNotification.getId());
        }
        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            OneSignal.removeNotification((Integer)((Map.Entry)iterator.next()).getValue());
            if (--n2 > 0) continue;
        }
    }

    private static int getMaxNumberOfNotificationsInt() {
        return 49;
    }

    private static String getMaxNumberOfNotificationsString() {
        return MAX_NUMBER_OF_NOTIFICATIONS_STR;
    }

    static boolean isGroupSummary(StatusBarNotification statusBarNotification) {
        return (512 & statusBarNotification.getNotification().flags) != 0;
    }
}

