/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  com.amazon.device.messaging.ADMMessageHandlerJobBase
 *  com.onesignal.ADMMessageHandlerJob$onMessage
 *  com.onesignal.ADMMessageHandlerJob$onMessage$bundleReceiverCallback
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.ADMMessageHandlerJob;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorADM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv={1, 0, 3}, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "()V", "onMessage", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", "error", "onUnregistered", "registrationId", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class ADMMessageHandlerJob
extends ADMMessageHandlerJobBase {
    protected void onMessage(Context context, Intent intent) {
        Bundle bundle = intent != null ? intent.getExtras() : null;
        NotificationBundleProcessor.processBundleFromReceiver(context, bundle, new NotificationBundleProcessor.ProcessBundleReceiverCallback(bundle, context){
            final /* synthetic */ Bundle $bundle;
            final /* synthetic */ Context $context;
            {
                this.$bundle = bundle;
                this.$context = context;
            }

            public void onBundleProcessed(com.onesignal.NotificationBundleProcessor$ProcessedBundleResult processedBundleResult) {
                if (processedBundleResult != null && processedBundleResult.processed()) {
                    return;
                }
                org.json.JSONObject jSONObject = NotificationBundleProcessor.bundleAsJSONObject(this.$bundle);
                Intrinsics.checkExpressionValueIsNotNull((Object)jSONObject, (String)"NotificationBundleProces\u2026undleAsJSONObject(bundle)");
                com.onesignal.OSNotification oSNotification = new com.onesignal.OSNotification(jSONObject);
                com.onesignal.OSNotificationGenerationJob oSNotificationGenerationJob = new com.onesignal.OSNotificationGenerationJob(this.$context);
                oSNotificationGenerationJob.setJsonPayload(jSONObject);
                oSNotificationGenerationJob.setContext(this.$context);
                oSNotificationGenerationJob.setNotification(oSNotification);
                NotificationBundleProcessor.processJobForDisplay(oSNotificationGenerationJob, true);
            }
        });
    }

    protected void onRegistered(Context context, String string) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM registration ID: ");
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        PushRegistratorADM.fireCallback(string);
    }

    protected void onRegistrationError(Context context, String string) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM:onRegistrationError: ");
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
        if (Intrinsics.areEqual((Object)"INVALID_SENDER", (Object)string)) {
            OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        PushRegistratorADM.fireCallback(null);
    }

    protected void onUnregistered(Context context, String string) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.INFO;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ADM:onUnregistered: ");
        stringBuilder.append(string);
        OneSignal.Log(lOG_LEVEL, stringBuilder.toString());
    }
}

