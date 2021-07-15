/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.app.job.JobService
 *  android.os.PersistableBundle
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;

abstract class OneSignalJobServiceBase
extends JobService {
    OneSignalJobServiceBase() {
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new Runnable(){

            public void run() {
                OneSignalJobServiceBase.this.startProcessing(this, jobParameters);
                OneSignalJobServiceBase.this.jobFinished(jobParameters, false);
            }
        }, "OS_JOBSERVICE_BASE").start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    abstract void startProcessing(JobService var1, JobParameters var2);

}

