/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.work.Data
 *  androidx.work.Data$Builder
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
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Set
 *  java.util.UUID
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationController;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

class OSNotificationWorkManager {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    private static Set<String> notificationIds = OSUtils.newConcurrentSet();

    OSNotificationWorkManager() {
    }

    static boolean addNotificationIdProcessed(String string2) {
        if (OSUtils.isStringNotEmpty(string2)) {
            if (notificationIds.contains((Object)string2)) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OSNotificationWorkManager notification with notificationId: ");
                stringBuilder.append(string2);
                stringBuilder.append(" already queued");
                OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
                return false;
            }
            notificationIds.add((Object)string2);
        }
        return true;
    }

    static void beginEnqueueingWork(Context context, String string2, int n, String string3, boolean bl, long l, boolean bl2) {
        Data data = new Data.Builder().putInt(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, n).putString(JSON_PAYLOAD_WORKER_DATA_PARAM, string3).putLong(TIMESTAMP_WORKER_DATA_PARAM, l).putBoolean(IS_RESTORING_WORKER_DATA_PARAM, bl).build();
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest)((OneTimeWorkRequest.Builder)new OneTimeWorkRequest.Builder(NotificationWorker.class).setInputData(data)).build();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationWorkManager enqueueing notification work with notificationId: ");
        stringBuilder.append(string2);
        stringBuilder.append(" and jsonPayload: ");
        stringBuilder.append(string3);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        WorkManager.getInstance((Context)context).enqueueUniqueWork(string2, ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
    }

    static void removeNotificationIdProcessed(String string2) {
        if (OSUtils.isStringNotEmpty(string2)) {
            notificationIds.remove((Object)string2);
        }
    }

}

