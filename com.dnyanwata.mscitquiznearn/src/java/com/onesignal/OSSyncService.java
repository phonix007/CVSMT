/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  com.onesignal.LocationController
 *  com.onesignal.OSBackgroundSync
 *  com.onesignal.OSSyncService$SyncRunnable
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.SyncJobService
 *  com.onesignal.SyncService
 *  java.lang.Class
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 */
package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.LocationController;
import com.onesignal.OSBackgroundSync;
import com.onesignal.OSSyncService;
import com.onesignal.OneSignal;
import com.onesignal.SyncJobService;
import com.onesignal.SyncService;
import java.lang.ref.WeakReference;

class OSSyncService
extends OSBackgroundSync {
    private static final Object INSTANCE_LOCK = new Object();
    private static final long SYNC_AFTER_BG_DELAY_MS = 30000L;
    private static final int SYNC_TASK_ID = 2071862118;
    private static final String SYNC_TASK_THREAD_ID = "OS_SYNCSRV_BG_SYNC";
    private static OSSyncService sInstance;
    private Long nextScheduledSyncTimeMs = 0L;

    OSSyncService() {
    }

    static /* synthetic */ Long access$002(OSSyncService oSSyncService, Long l) {
        oSSyncService.nextScheduledSyncTimeMs = l;
        return l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static OSSyncService getInstance() {
        Object object;
        if (sInstance != null) return sInstance;
        Object object2 = object = INSTANCE_LOCK;
        synchronized (object2) {
            if (sInstance != null) return sInstance;
            sInstance = new OSSyncService();
            return sInstance;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void cancelSyncTask(Context context) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            this.nextScheduledSyncTimeMs = 0L;
            if (LocationController.scheduleUpdate((Context)context)) {
                return;
            }
            this.cancelBackgroundSyncTask(context);
            return;
        }
    }

    protected Class getSyncServiceJobClass() {
        return SyncJobService.class;
    }

    protected Class getSyncServicePendingIntentClass() {
        return SyncService.class;
    }

    protected int getSyncTaskId() {
        return 2071862118;
    }

    protected String getSyncTaskThreadId() {
        return SYNC_TASK_THREAD_ID;
    }

    void scheduleLocationUpdateTask(Context context, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSSyncService scheduleLocationUpdateTask:delayMs: ");
        stringBuilder.append(l);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.scheduleSyncTask(context, l);
    }

    protected void scheduleSyncTask(Context context) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.VERBOSE, (String)"OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        this.scheduleSyncTask(context, 30000L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void scheduleSyncTask(Context context, long l) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (this.nextScheduledSyncTimeMs != 0L && l + OneSignal.getTime().getCurrentTimeMillis() > this.nextScheduledSyncTimeMs) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: ");
                stringBuilder.append((Object)this.nextScheduledSyncTimeMs);
                OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
                return;
            }
            if (l < 5000L) {
                l = 5000L;
            }
            this.scheduleBackgroundSyncTask(context, l);
            this.nextScheduledSyncTimeMs = l + OneSignal.getTime().getCurrentTimeMillis();
            return;
        }
    }

    static class LegacySyncRunnable
    extends SyncRunnable {
        private WeakReference<Service> callerService;

        LegacySyncRunnable(Service service) {
            this.callerService = new WeakReference((Object)service);
        }

        protected void stopSync() {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"LegacySyncRunnable:Stopped");
            if (this.callerService.get() != null) {
                ((Service)this.callerService.get()).stopSelf();
            }
        }
    }

    static class LollipopSyncRunnable
    extends SyncRunnable {
        private JobParameters jobParameters;
        private WeakReference<JobService> jobService;

        LollipopSyncRunnable(JobService jobService, JobParameters jobParameters) {
            this.jobService = new WeakReference((Object)jobService);
            this.jobParameters = jobParameters;
        }

        protected void stopSync() {
            OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("LollipopSyncRunnable:JobFinished needsJobReschedule: ");
            stringBuilder.append(OSSyncService.getInstance().needsJobReschedule);
            OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
            boolean bl = OSSyncService.getInstance().needsJobReschedule;
            OSSyncService.getInstance().needsJobReschedule = false;
            if (this.jobService.get() != null) {
                ((JobService)this.jobService.get()).jobFinished(this.jobParameters, bl);
            }
        }
    }

}

