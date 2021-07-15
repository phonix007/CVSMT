/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONObject
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OSNotification;
import com.onesignal.OSNotificationGenerationJob;
import com.onesignal.OSNotificationReceivedEvent;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONObject;

public class OSNotificationController {
    private static final String EXTENSION_SERVICE_META_DATA_TAG_NAME = "com.onesignal.NotificationServiceExtension";
    private boolean fromBackgroundLogic;
    private final OSNotificationGenerationJob notificationJob;
    private boolean restoring;

    OSNotificationController(Context context, JSONObject jSONObject, boolean bl, boolean bl2, Long l) {
        this.restoring = bl;
        this.fromBackgroundLogic = bl2;
        this.notificationJob = this.createNotificationJobFromCurrent(context, jSONObject, l);
    }

    OSNotificationController(OSNotificationGenerationJob oSNotificationGenerationJob, boolean bl, boolean bl2) {
        this.restoring = bl;
        this.fromBackgroundLogic = bl2;
        this.notificationJob = oSNotificationGenerationJob;
    }

    private OSNotificationGenerationJob createNotificationJobFromCurrent(Context context, JSONObject jSONObject, Long l) {
        OSNotificationGenerationJob oSNotificationGenerationJob = new OSNotificationGenerationJob(context);
        oSNotificationGenerationJob.setJsonPayload(jSONObject);
        oSNotificationGenerationJob.setShownTimeStamp(l);
        oSNotificationGenerationJob.setRestoring(this.restoring);
        return oSNotificationGenerationJob;
    }

    private void notDisplayNotificationLogic(OSNotification oSNotification) {
        this.notificationJob.setNotification(oSNotification);
        if (this.restoring) {
            NotificationBundleProcessor.markNotificationAsDismissed(this.notificationJob);
            return;
        }
        this.notificationJob.getNotification().setAndroidNotificationId(-1);
        NotificationBundleProcessor.processNotification(this.notificationJob, true, false);
        OneSignal.handleNotificationReceived(this.notificationJob);
    }

    static void setupNotificationServiceExtension(Context context) {
        String string2 = OSUtils.getManifestMeta(context, EXTENSION_SERVICE_META_DATA_TAG_NAME);
        if (string2 == null) {
            OneSignal.onesignalLog(OneSignal.LOG_LEVEL.VERBOSE, "No class found, not setting up OSRemoteNotificationReceivedHandler");
            return;
        }
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Found class: ");
        stringBuilder.append(string2);
        stringBuilder.append(", attempting to call constructor");
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        try {
            Object object = Class.forName((String)string2).newInstance();
            if (object instanceof OneSignal.OSRemoteNotificationReceivedHandler && OneSignal.remoteNotificationReceivedHandler == null) {
                OneSignal.setRemoteNotificationReceivedHandler((OneSignal.OSRemoteNotificationReceivedHandler)object);
                return;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            return;
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
    }

    public OSNotificationGenerationJob getNotificationJob() {
        return this.notificationJob;
    }

    public OSNotificationReceivedEvent getNotificationReceivedEvent() {
        return new OSNotificationReceivedEvent(this, this.notificationJob.getNotification());
    }

    public boolean isFromBackgroundLogic() {
        return this.fromBackgroundLogic;
    }

    public boolean isRestoring() {
        return this.restoring;
    }

    void processNotification(OSNotification oSNotification, OSNotification oSNotification2) {
        if (oSNotification2 != null) {
            if (!OSUtils.isStringNotEmpty(oSNotification2.getBody())) {
                this.notDisplayNotificationLogic(oSNotification);
            } else {
                this.notificationJob.setNotification(oSNotification2);
                NotificationBundleProcessor.processJobForDisplay(this, this.fromBackgroundLogic);
            }
            if (this.restoring) {
                OSUtils.sleep(100);
                return;
            }
        } else {
            this.notDisplayNotificationLogic(oSNotification);
        }
    }

    public void setFromBackgroundLogic(boolean bl) {
        this.fromBackgroundLogic = bl;
    }

    public void setRestoring(boolean bl) {
        this.restoring = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationController{notificationJob=");
        stringBuilder.append((Object)this.notificationJob);
        stringBuilder.append(", isRestoring=");
        stringBuilder.append(this.restoring);
        stringBuilder.append(", isBackgroundLogic=");
        stringBuilder.append(this.fromBackgroundLogic);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

