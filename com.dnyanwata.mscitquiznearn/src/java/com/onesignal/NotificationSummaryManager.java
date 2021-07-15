/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.GenerateNotification;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalDbHelper;
import com.onesignal.OneSignalNotificationManager;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationSummaryManager {
    NotificationSummaryManager() {
    }

    static void clearNotificationOnSummaryClick(Context context, OneSignalDbHelper oneSignalDbHelper, String string2) {
        Integer n = NotificationSummaryManager.getSummaryNotificationId(oneSignalDbHelper, string2);
        boolean bl = string2.equals((Object)OneSignalNotificationManager.getGrouplessSummaryKey());
        NotificationManager notificationManager = OneSignalNotificationManager.getNotificationManager(context);
        Integer n2 = OneSignalNotificationManager.getMostRecentNotifIdFromGroup(oneSignalDbHelper, string2, bl);
        if (n2 != null) {
            if (OneSignal.getClearGroupSummaryClick()) {
                if (bl) {
                    n = OneSignalNotificationManager.getGrouplessSummaryId();
                }
                if (n != null) {
                    notificationManager.cancel(n.intValue());
                    return;
                }
            } else {
                OneSignal.removeNotification(n2);
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static Integer getSummaryNotificationId(OneSignalDb oneSignalDb, String string2) {
        Cursor cursor;
        Cursor cursor2;
        block10 : {
            Cursor cursor3;
            block9 : {
                String[] arrstring = new String[]{string2};
                cursor = null;
                cursor3 = oneSignalDb.query("notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", arrstring, null, null, null);
                boolean bl = cursor3.moveToFirst();
                cursor = null;
                if (bl) break block9;
                cursor3.close();
                if (cursor3 == null) return null;
                if (cursor3.isClosed()) return null;
                cursor3.close();
                return null;
            }
            try {
                cursor = Integer.valueOf((int)cursor3.getInt(cursor3.getColumnIndex("android_notification_id")));
                cursor3.close();
                if (cursor3 == null) return cursor;
            }
            catch (Throwable throwable) {
                Cursor cursor4 = cursor;
                cursor = cursor3;
                cursor2 = cursor4;
            }
            if (cursor3.isClosed()) return cursor;
            cursor3.close();
            return cursor;
            break block10;
            catch (Throwable throwable) {
                cursor2 = null;
            }
        }
        try {
            void var4_8;
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error getting android notification id for summary notification group: ");
            stringBuilder.append(string2);
            OneSignal.Log(lOG_LEVEL, stringBuilder.toString(), (Throwable)var4_8);
            cursor = cursor2;
            return cursor;
        }
        finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    private static Cursor internalUpdateSummaryNotificationAfterChildRemoved(Context context, OneSignalDb oneSignalDb, String string2, boolean bl) {
        Cursor cursor;
        Long l;
        block7 : {
            cursor = oneSignalDb.query("notification", new String[]{"android_notification_id", "created_time"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{string2}, null, null, "_id DESC");
            int n = cursor.getCount();
            if (n == 0) {
                cursor.close();
                Integer n2 = NotificationSummaryManager.getSummaryNotificationId(oneSignalDb, string2);
                if (n2 == null) {
                    return cursor;
                }
                OneSignalNotificationManager.getNotificationManager(context).cancel(n2.intValue());
                ContentValues contentValues = new ContentValues();
                String string3 = bl ? "dismissed" : "opened";
                contentValues.put(string3, Integer.valueOf((int)1));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("android_notification_id = ");
                stringBuilder.append((Object)n2);
                oneSignalDb.update("notification", contentValues, stringBuilder.toString(), null);
                return cursor;
            }
            if (n == 1) {
                cursor.close();
                if (NotificationSummaryManager.getSummaryNotificationId(oneSignalDb, string2) == null) {
                    return cursor;
                }
                NotificationSummaryManager.restoreSummary(context, string2);
                return cursor;
            }
            try {
                cursor.moveToFirst();
                l = cursor.getLong(cursor.getColumnIndex("created_time"));
                cursor.close();
                if (NotificationSummaryManager.getSummaryNotificationId(oneSignalDb, string2) != null) break block7;
                return cursor;
            }
            catch (JSONException jSONException) {}
        }
        OSNotificationGenerationJob oSNotificationGenerationJob = new OSNotificationGenerationJob(context);
        oSNotificationGenerationJob.setRestoring(true);
        oSNotificationGenerationJob.setShownTimeStamp(l);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grp", (Object)string2);
        oSNotificationGenerationJob.setJsonPayload(jSONObject);
        GenerateNotification.updateSummaryNotification(oSNotificationGenerationJob);
        return cursor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void restoreSummary(Context context, String string2) {
        block5 : {
            Cursor cursor;
            OneSignalDbHelper oneSignalDbHelper = OneSignalDbHelper.getInstance(context);
            String[] arrstring = new String[]{string2};
            cursor = null;
            try {
                cursor = oneSignalDbHelper.query("notification", OSNotificationRestoreWorkManager.COLUMNS_FOR_RESTORE, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", arrstring, null, null, null);
                OSNotificationRestoreWorkManager.showNotificationsFromCursor(context, cursor, 0);
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

    static void updatePossibleDependentSummaryOnDismiss(Context context, OneSignalDb oneSignalDb, int n) {
        String[] arrstring = new String[]{"group_id"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android_notification_id = ");
        stringBuilder.append(n);
        Cursor cursor = oneSignalDb.query("notification", arrstring, stringBuilder.toString(), null, null, null, null);
        if (cursor.moveToFirst()) {
            String string2 = cursor.getString(cursor.getColumnIndex("group_id"));
            cursor.close();
            if (string2 != null) {
                NotificationSummaryManager.updateSummaryNotificationAfterChildRemoved(context, oneSignalDb, string2, true);
                return;
            }
        } else {
            cursor.close();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void updateSummaryNotificationAfterChildRemoved(Context context, OneSignalDb oneSignalDb, String string2, boolean bl) {
        Cursor cursor;
        try {
            cursor = NotificationSummaryManager.internalUpdateSummaryNotificationAfterChildRemoved(context, oneSignalDb, string2, bl);
        }
        catch (Throwable throwable) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", throwable);
            return;
        }
        if (cursor == null || cursor.isClosed()) return;
        cursor.close();
    }
}

