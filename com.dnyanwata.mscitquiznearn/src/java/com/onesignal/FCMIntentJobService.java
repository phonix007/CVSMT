/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  com.onesignal.JobIntentService
 *  com.onesignal.NotificationBundleProcessor
 *  com.onesignal.NotificationBundleProcessor$ProcessBundleReceiverCallback
 *  com.onesignal.NotificationBundleProcessor$ProcessedBundleResult
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.JobIntentService;
import com.onesignal.NotificationBundleProcessor;

public class FCMIntentJobService
extends JobIntentService {
    public static final String BUNDLE_EXTRA = "Bundle:Parcelable:Extras";
    private static final int JOB_ID = 123890;

    public static void enqueueWork(Context context, Intent intent) {
        FCMIntentJobService.enqueueWork((Context)context, FCMIntentJobService.class, (int)123890, (Intent)intent, (boolean)false);
    }

    protected void onHandleWork(Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle == null) {
            return;
        }
        NotificationBundleProcessor.processBundleFromReceiver((Context)this, (Bundle)bundle, (NotificationBundleProcessor.ProcessBundleReceiverCallback)new NotificationBundleProcessor.ProcessBundleReceiverCallback(){

            public void onBundleProcessed(NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
            }
        });
    }

}

