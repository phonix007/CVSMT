/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  java.lang.String
 */
package com.onesignal;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.FCMIntentService;
import com.onesignal.NotificationBundleProcessor;

public class FCMIntentService
extends IntentService {
    public FCMIntentService() {
        super("FCMIntentService");
        this.setIntentRedelivery(true);
    }

    protected void onHandleIntent(Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle == null) {
            return;
        }
        NotificationBundleProcessor.processBundleFromReceiver((Context)this, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(this, intent){
            final /* synthetic */ FCMIntentService this$0;
            final /* synthetic */ Intent val$intent;
            {
                this.this$0 = fCMIntentService;
                this.val$intent = intent;
            }

            public void onBundleProcessed(com.onesignal.NotificationBundleProcessor$ProcessedBundleResult processedBundleResult) {
                com.onesignal.FCMBroadcastReceiver.completeWakefulIntent((Intent)this.val$intent);
            }
        });
    }
}

