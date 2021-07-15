/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSNotification
 *  com.onesignal.OSNotificationAction
 *  com.onesignal.OSNotificationOpenedResult$1
 *  com.onesignal.OSTimeoutHandler
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$AppEntryAction
 *  com.onesignal.OneSignal$EntryStateListener
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSNotification;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenedResult;
import com.onesignal.OSTimeoutHandler;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

public class OSNotificationOpenedResult
implements OneSignal.EntryStateListener {
    private static final long PROCESS_NOTIFICATION_TIMEOUT = 5000L;
    private OSNotificationAction action;
    private boolean isComplete = false;
    private OSNotification notification;
    private final OSTimeoutHandler timeoutHandler;
    private final Runnable timeoutRunnable;

    public OSNotificationOpenedResult(OSNotification oSNotification, OSNotificationAction oSNotificationAction) {
        OSTimeoutHandler oSTimeoutHandler;
        this.notification = oSNotification;
        this.action = oSNotificationAction;
        this.timeoutHandler = oSTimeoutHandler = OSTimeoutHandler.getTimeoutHandler();
        1 var4_4 = new 1(this);
        this.timeoutRunnable = var4_4;
        oSTimeoutHandler.startTimeout(5000L, (Runnable)var4_4);
    }

    static /* synthetic */ void access$000(OSNotificationOpenedResult oSNotificationOpenedResult, boolean bl) {
        oSNotificationOpenedResult.complete(bl);
    }

    private void complete(boolean bl) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationOpenedResult complete called with opened: ");
        stringBuilder.append(bl);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.timeoutHandler.destroyTimeout(this.timeoutRunnable);
        if (this.isComplete) {
            OneSignal.onesignalLog((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.DEBUG, (String)"OSNotificationOpenedResult already completed");
            return;
        }
        this.isComplete = true;
        if (bl) {
            OneSignal.applicationOpenedByNotification((String)this.notification.getNotificationId());
        }
        OneSignal.removeEntryStateListener((OneSignal.EntryStateListener)this);
    }

    public OSNotificationAction getAction() {
        return this.action;
    }

    public OSNotification getNotification() {
        return this.notification;
    }

    public void onEntryStateChange(OneSignal.AppEntryAction appEntryAction) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationOpenedResult onEntryStateChange called with appEntryState: ");
        stringBuilder.append((Object)appEntryAction);
        OneSignal.onesignalLog((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        this.complete(OneSignal.AppEntryAction.APP_CLOSE.equals((Object)appEntryAction));
    }

    @Deprecated
    public String stringify() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", (Object)this.action.toJSONObject());
            jSONObject.put("notification", (Object)this.notification.toJSONObject());
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        return jSONObject.toString();
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", (Object)this.action.toJSONObject());
            jSONObject.put("notification", (Object)this.notification.toJSONObject());
            return jSONObject;
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSNotificationOpenedResult{notification=");
        stringBuilder.append((Object)this.notification);
        stringBuilder.append(", action=");
        stringBuilder.append((Object)this.action);
        stringBuilder.append(", isComplete=");
        stringBuilder.append(this.isComplete);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

