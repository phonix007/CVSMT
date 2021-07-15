/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  androidx.legacy.content.WakefulBroadcastReceiver
 *  com.onesignal.BundleCompat
 *  com.onesignal.BundleCompatFactory
 *  com.onesignal.FCMIntentService
 *  com.onesignal.NotificationBundleProcessor
 *  com.onesignal.NotificationBundleProcessor$ProcessBundleReceiverCallback
 *  com.onesignal.NotificationBundleProcessor$ProcessedBundleResult
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onesignal.BundleCompat;
import com.onesignal.BundleCompatBundle;
import com.onesignal.BundleCompatFactory;
import com.onesignal.FCMIntentJobService;
import com.onesignal.FCMIntentService;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;

public class FCMBroadcastReceiver
extends WakefulBroadcastReceiver {
    private static final String FCM_RECEIVE_ACTION = "com.google.android.c2dm.intent.RECEIVE";
    private static final String FCM_TYPE = "gcm";
    private static final String MESSAGE_TYPE_EXTRA_KEY = "message_type";

    private static boolean isFCMMessage(Intent intent) {
        boolean bl;
        block2 : {
            block3 : {
                boolean bl2 = FCM_RECEIVE_ACTION.equals((Object)intent.getAction());
                bl = false;
                if (!bl2) break block2;
                String string = intent.getStringExtra(MESSAGE_TYPE_EXTRA_KEY);
                if (string == null) break block3;
                boolean bl3 = FCM_TYPE.equals((Object)string);
                bl = false;
                if (!bl3) break block2;
            }
            bl = true;
        }
        return bl;
    }

    private static void processOrderBroadcast(final Context context, Intent intent, final Bundle bundle, final NotificationBundleProcessor.ProcessBundleReceiverCallback processBundleReceiverCallback) {
        if (!FCMBroadcastReceiver.isFCMMessage(intent)) {
            processBundleReceiverCallback.onBundleProcessed(null);
        }
        NotificationBundleProcessor.processBundleFromReceiver((Context)context, (Bundle)bundle, (NotificationBundleProcessor.ProcessBundleReceiverCallback)new NotificationBundleProcessor.ProcessBundleReceiverCallback(){

            public void onBundleProcessed(NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
                if (processedBundleResult != null && processedBundleResult.processed()) {
                    processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
                    return;
                }
                FCMBroadcastReceiver.startFCMService(context, bundle);
                processBundleReceiverCallback.onBundleProcessed(processedBundleResult);
            }
        });
    }

    private void setAbort() {
        if (this.isOrderedBroadcast()) {
            this.abortBroadcast();
            this.setResultCode(-1);
        }
    }

    private static BundleCompat setCompatBundleForServer(Bundle bundle, BundleCompat bundleCompat) {
        bundleCompat.putString("json_payload", NotificationBundleProcessor.bundleAsJSONObject((Bundle)bundle).toString());
        bundleCompat.putLong("timestamp", Long.valueOf((long)(OneSignal.getTime().getCurrentTimeMillis() / 1000L)));
        return bundleCompat;
    }

    private void setSuccessfulResultCode() {
        if (this.isOrderedBroadcast()) {
            this.setResultCode(-1);
        }
    }

    static void startFCMService(Context context, Bundle bundle) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("startFCMService from: ");
        stringBuilder.append((Object)context);
        stringBuilder.append(" and bundle: ");
        stringBuilder.append((Object)bundle);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        if (!NotificationBundleProcessor.hasRemoteResource((Bundle)bundle)) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"startFCMService with no remote resources, no need for services");
            NotificationBundleProcessor.processFromFCMIntentService((Context)context, (BundleCompat)FCMBroadcastReceiver.setCompatBundleForServer(bundle, BundleCompatFactory.getInstance()));
            return;
        }
        boolean bl = Integer.parseInt((String)bundle.getString("pri", "0")) > 9;
        if (!bl && Build.VERSION.SDK_INT >= 26) {
            FCMBroadcastReceiver.startFCMServiceWithJobIntentService(context, bundle);
            return;
        }
        try {
            FCMBroadcastReceiver.startFCMServiceWithWakefulService(context, bundle);
            return;
        }
        catch (IllegalStateException illegalStateException) {
            if (Build.VERSION.SDK_INT >= 21) {
                FCMBroadcastReceiver.startFCMServiceWithJobIntentService(context, bundle);
                return;
            }
            throw illegalStateException;
        }
    }

    private static void startFCMServiceWithJobIntentService(Context context, Bundle bundle) {
        BundleCompat bundleCompat = FCMBroadcastReceiver.setCompatBundleForServer(bundle, BundleCompatFactory.getInstance());
        Intent intent = new Intent(context, FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable)bundleCompat.getBundle());
        FCMIntentJobService.enqueueWork(context, intent);
    }

    private static void startFCMServiceWithWakefulService(Context context, Bundle bundle) {
        ComponentName componentName = new ComponentName(context.getPackageName(), FCMIntentService.class.getName());
        BundleCompat bundleCompat = FCMBroadcastReceiver.setCompatBundleForServer(bundle, new BundleCompatBundle());
        FCMBroadcastReceiver.startWakefulService((Context)context, (Intent)new Intent().replaceExtras((Bundle)bundleCompat.getBundle()).setComponent(componentName));
    }

    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            if ("google.com/iid".equals((Object)bundle.getString("from"))) {
                return;
            }
            OneSignal.initWithContext((Context)context);
            FCMBroadcastReceiver.processOrderBroadcast(context, intent, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(){

                public void onBundleProcessed(NotificationBundleProcessor.ProcessedBundleResult processedBundleResult) {
                    if (processedBundleResult == null) {
                        FCMBroadcastReceiver.this.setSuccessfulResultCode();
                        return;
                    }
                    if (!processedBundleResult.isDup && !processedBundleResult.isWorkManagerProcessing) {
                        FCMBroadcastReceiver.this.setSuccessfulResultCode();
                        return;
                    }
                    FCMBroadcastReceiver.this.setAbort();
                }
            });
        }
    }

}

