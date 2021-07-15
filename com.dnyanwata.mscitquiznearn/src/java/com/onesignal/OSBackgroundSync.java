/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.Iterator
 *  java.util.List
 */
package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.AndroidSupportV4Compat;
import com.onesignal.OneSignal;
import java.util.Iterator;
import java.util.List;

abstract class OSBackgroundSync {
    protected static final Object LOCK = new Object();
    protected boolean needsJobReschedule = false;
    private Thread syncBgThread;

    OSBackgroundSync() {
    }

    private boolean hasBootPermission(Context context) {
        return AndroidSupportV4Compat.ContextCompat.checkSelfPermission(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private boolean isJobIdRunning(Context context) {
        Iterator iterator = ((JobScheduler)context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (iterator.hasNext()) {
            Thread thread;
            if (((JobInfo)iterator.next()).getId() != this.getSyncTaskId() || (thread = this.syncBgThread) == null || !thread.isAlive()) continue;
            return true;
        }
        return false;
    }

    private void scheduleSyncServiceAsAlarm(Context context, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" scheduleServiceSyncTask:atTime: ");
        stringBuilder.append(l);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        PendingIntent pendingIntent = this.syncServicePendingIntent(context);
        ((AlarmManager)context.getSystemService("alarm")).set(0, l + (l + OneSignal.getTime().getCurrentTimeMillis()), pendingIntent);
    }

    private void scheduleSyncServiceAsJob(Context context, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSBackgroundSync scheduleSyncServiceAsJob:atTime: ");
        stringBuilder.append(l);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (this.isJobIdRunning(context)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.VERBOSE, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.needsJobReschedule = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(this.getSyncTaskId(), new ComponentName(context, this.getSyncServiceJobClass()));
        builder.setMinimumLatency(l).setRequiredNetworkType(1);
        if (this.hasBootPermission(context)) {
            builder.setPersisted(true);
        }
        JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        try {
            int n = jobScheduler.schedule(builder.build());
            OneSignal.LOG_LEVEL lOG_LEVEL2 = OneSignal.LOG_LEVEL.INFO;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("OSBackgroundSync scheduleSyncServiceAsJob:result: ");
            stringBuilder2.append(n);
            OneSignal.Log(lOG_LEVEL2, stringBuilder2.toString());
            return;
        }
        catch (NullPointerException nullPointerException) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", nullPointerException);
            return;
        }
    }

    private PendingIntent syncServicePendingIntent(Context context) {
        return PendingIntent.getService((Context)context, (int)this.getSyncTaskId(), (Intent)new Intent(context, this.getSyncServicePendingIntentClass()), (int)134217728);
    }

    private static boolean useJob() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void cancelBackgroundSyncTask(Context context) {
        Object object;
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(" cancel background sync");
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (OSBackgroundSync.useJob()) {
                ((JobScheduler)context.getSystemService("jobscheduler")).cancel(this.getSyncTaskId());
            } else {
                ((AlarmManager)context.getSystemService("alarm")).cancel(this.syncServicePendingIntent(context));
            }
            return;
        }
    }

    void doBackgroundSync(Context context, Runnable runnable) {
        Thread thread;
        OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSBackground sync, calling initWithContext");
        OneSignal.initWithContext(context);
        this.syncBgThread = thread = new Thread(runnable, this.getSyncTaskThreadId());
        thread.start();
    }

    protected abstract Class getSyncServiceJobClass();

    protected abstract Class getSyncServicePendingIntentClass();

    protected abstract int getSyncTaskId();

    protected abstract String getSyncTaskThreadId();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void scheduleBackgroundSyncTask(Context context, long l) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (OSBackgroundSync.useJob()) {
                this.scheduleSyncServiceAsJob(context, l);
            } else {
                this.scheduleSyncServiceAsAlarm(context, l);
            }
            return;
        }
    }

    protected abstract void scheduleSyncTask(Context var1);

    boolean stopSyncBgThread() {
        Thread thread = this.syncBgThread;
        if (thread == null) {
            return false;
        }
        if (!thread.isAlive()) {
            return false;
        }
        this.syncBgThread.interrupt();
        return true;
    }
}

