/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  com.amazon.device.messaging.ADMMessageHandlerBase
 *  com.amazon.device.messaging.ADMMessageReceiver
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.onesignal.ADMMessageHandler;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorADM;

public class ADMMessageHandler
extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    protected void onMessage(Intent intent) {
        Context context = this.getApplicationContext();
        Bundle bundle = intent.getExtras();
        NotificationBundleProcessor.processBundleFromReceiver(context, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(this, bundle, context){
            final /* synthetic */ ADMMessageHandler this$0;
            final /* synthetic */ Bundle val$bundle;
            final /* synthetic */ Context val$context;
            {
                this.this$0 = aDMMessageHandler;
                this.val$bundle = bundle;
                this.val$context = context;
            }

            public void onBundleProcessed(com.onesignal.NotificationBundleProcessor$ProcessedBundleResult processedBundleResult) {
                if (processedBundleResult.processed()) {
                    return;
                }
                org.json.JSONObject jSONObject = NotificationBundleProcessor.bundleAsJSONObject(this.val$bundle);
                com.onesignal.OSNotification oSNotification = new com.onesignal.OSNotification(jSONObject);
                com.onesignal.OSNotificationGenerationJob oSNotificationGenerationJob = new com.onesignal.OSNotificationGenerationJob(this.val$context);
                oSNotificationGenerationJob.setJsonPayload(jSONObject);
                oSNotificationGenerationJob.setContext(this.val$context);
                oSNotificationGenerationJob.setNotification(oSNotification);
                NotificationBundleProcessor.processJobForDisplay(oSNotificationGenerationJob, true);
            }
        });
    }

    protected void onRegistered(String string) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM registration ID: ");
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        PushRegistratorADM.fireCallback(string);
    }

    protected void onRegistrationError(String string) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM:onRegistrationError: ");
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if ("INVALID_SENDER".equals((Object)string)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        PushRegistratorADM.fireCallback(null);
    }

    protected void onUnregistered(String string) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM:onUnregistered: ");
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }

    public static class Receiver
    extends ADMMessageReceiver {
        /*
         * Exception decompiling
         */
        public Receiver() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl12 : ILOAD_1 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:919)
            throw new IllegalStateException("Decompilation failed");
        }
    }

}

