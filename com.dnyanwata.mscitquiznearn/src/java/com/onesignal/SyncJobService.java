/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.content.Context
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.OSSyncService;
import com.onesignal.OneSignal;

public class SyncJobService
extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        OSSyncService.getInstance().doBackgroundSync((Context)this, (Runnable)new OSSyncService.LollipopSyncRunnable(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean bl = OSSyncService.getInstance().stopSyncBgThread();
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SyncJobService onStopJob called, system conditions not available reschedule: ");
        stringBuilder.append(bl);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        return bl;
    }
}

