/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSInAppMessage
 *  com.onesignal.OSInAppMessageController
 *  com.onesignal.OSLogger
 *  com.onesignal.OSTaskController
 *  com.onesignal.OneSignalDbHelper
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal;

import com.onesignal.OSInAppMessage;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSLogger;
import com.onesignal.OSTaskController;
import com.onesignal.OneSignalDbHelper;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageDummyController
extends OSInAppMessageController {
    OSInAppMessageDummyController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger) {
        super(oneSignalDbHelper, oSTaskController, oSLogger);
    }

    void addTriggers(Map<String, Object> map) {
    }

    void cleanCachedInAppMessages() {
    }

    void displayPreviewMessage(String string) {
    }

    OSInAppMessage getCurrentDisplayedInAppMessage() {
        return null;
    }

    Object getTriggerValue(String string) {
        return null;
    }

    public void initRedisplayData(OneSignalDbHelper oneSignalDbHelper) {
    }

    void initWithCachedInAppMessages() {
    }

    boolean isInAppMessageShowing() {
        return false;
    }

    public void messageTriggerConditionChanged() {
    }

    public void messageWasDismissed(OSInAppMessage oSInAppMessage) {
    }

    void onMessageActionOccurredOnMessage(OSInAppMessage oSInAppMessage, JSONObject jSONObject) {
    }

    void onMessageActionOccurredOnPreview(OSInAppMessage oSInAppMessage, JSONObject jSONObject) {
    }

    void receivedInAppMessageJson(JSONArray jSONArray) throws JSONException {
    }

    void removeTriggersForKeys(Collection<String> collection) {
    }

    void setInAppMessagingEnabled(boolean bl) {
    }
}

