/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSNotification;
import com.onesignal.OSNotificationController;
import com.onesignal.OSTimeoutHandler;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotificationReceivedEvent {
    private static final long PROCESS_NOTIFICATION_TIMEOUT = 25000L;
    private final OSNotificationController controller;
    private boolean isComplete = false;
    private final OSNotification notification;
    private final OSTimeoutHandler timeoutHandler;
    private final Runnable timeoutRunnable;

    OSNotificationReceivedEvent(OSNotificationController oSNotificationController, OSNotification oSNotification) {
        Runnable runnable;
        OSTimeoutHandler oSTimeoutHandler;
        this.notification = oSNotification;
        this.controller = oSNotificationController;
        this.timeoutHandler = oSTimeoutHandler = OSTimeoutHandler.getTimeoutHandler();
        this.timeoutRunnable = runnable = new Runnable(){

            public void run() {
                OneSignal.Log(OneSignal.LOG_LEVEL.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
                OSNotificationReceivedEvent oSNotificationReceivedEvent = OSNotificationReceivedEvent.this;
                oSNotificationReceivedEvent.complete(oSNotificationReceivedEvent.getNotification());
            }
        };
        oSTimeoutHandler.startTimeout(25000L, runnable);
    }

    static boolean isRunningOnMainThread() {
        return OSUtils.isRunningOnMainThread();
    }

    private void processNotification(OSNotification oSNotification) {
        OSNotificationController oSNotificationController = this.controller;
        OSNotification oSNotification2 = this.notification.copy();
        OSNotification oSNotification3 = oSNotification != null ? oSNotification.copy() : null;
        oSNotificationController.processNotification(oSNotification2, oSNotification3);
    }

    public void complete(final OSNotification oSNotification) {
        OSNotificationReceivedEvent oSNotificationReceivedEvent = this;
        synchronized (oSNotificationReceivedEvent) {
            this.timeoutHandler.destroyTimeout(this.timeoutRunnable);
            if (this.isComplete) {
                OneSignal.onesignalLog(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationReceivedEvent already completed");
                return;
            }
            this.isComplete = true;
            if (OSNotificationReceivedEvent.isRunningOnMainThread()) {
                new Thread(new Runnable(){

                    public void run() {
                        OSNotificationReceivedEvent.this.processNotification(oSNotification);
                    }
                }, "OS_COMPLETE_NOTIFICATION").start();
                return;
            }
            this.processNotification(oSNotification);
            return;
        }
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notification", (Object)this.notification.toJSONObject());
            jSONObject.put("isComplete", this.isComplete);
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationReceivedEvent{isComplete=");
        stringBuilder.append(this.isComplete);
        stringBuilder.append(", notification=");
        stringBuilder.append((Object)this.notification);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

}

