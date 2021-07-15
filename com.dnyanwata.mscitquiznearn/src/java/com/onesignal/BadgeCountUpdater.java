/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.database.Cursor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.service.notification.StatusBarNotification
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.NotificationLimitManager;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.ShortcutBadger;

class BadgeCountUpdater {
    private static int badgesEnabled = -1;

    BadgeCountUpdater() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean areBadgeSettingsEnabled(Context context) {
        int n = badgesEnabled;
        if (n != -1) {
            boolean bl = false;
            if (n != 1) return bl;
            return true;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData;
            if (bundle != null) {
                int n2 = "DISABLE".equals((Object)bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
                badgesEnabled = n2;
            } else {
                badgesEnabled = 1;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            badgesEnabled = 0;
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", nameNotFoundException);
        }
        int n3 = badgesEnabled;
        boolean bl = false;
        if (n3 != 1) return bl;
        return true;
    }

    private static boolean areBadgesEnabled(Context context) {
        return BadgeCountUpdater.areBadgeSettingsEnabled(context) && OSUtils.areNotificationsEnabled(context);
    }

    static void update(OneSignalDb oneSignalDb, Context context) {
        if (!BadgeCountUpdater.areBadgesEnabled(context)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            BadgeCountUpdater.updateStandard(context);
            return;
        }
        BadgeCountUpdater.updateFallback(oneSignalDb, context);
    }

    static void updateCount(int n, Context context) {
        if (!BadgeCountUpdater.areBadgeSettingsEnabled(context)) {
            return;
        }
        try {
            ShortcutBadger.applyCountOrThrow(context, n);
        }
        catch (ShortcutBadgeException shortcutBadgeException) {}
    }

    private static void updateFallback(OneSignalDb oneSignalDb, Context context) {
        Cursor cursor = oneSignalDb.query("notification", null, OneSignalDbHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, NotificationLimitManager.MAX_NUMBER_OF_NOTIFICATIONS_STR);
        int n = cursor.getCount();
        cursor.close();
        BadgeCountUpdater.updateCount(n, context);
    }

    private static void updateStandard(Context context) {
        StatusBarNotification[] arrstatusBarNotification = OneSignalNotificationManager.getActiveNotifications(context);
        int n = arrstatusBarNotification.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (NotificationLimitManager.isGroupSummary(arrstatusBarNotification[i])) continue;
            ++n2;
        }
        BadgeCountUpdater.updateCount(n2, context);
    }
}

