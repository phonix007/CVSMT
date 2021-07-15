/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Timer
 *  java.util.TimerTask
 */
package com.onesignal;

import com.onesignal.OneSignal;
import java.util.Timer;
import java.util.TimerTask;

class OSDynamicTriggerTimer {
    OSDynamicTriggerTimer() {
    }

    static void scheduleTrigger(TimerTask timerTask, String string2, long l) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("scheduleTrigger: ");
        stringBuilder.append(string2);
        stringBuilder.append(" delay: ");
        stringBuilder.append(l);
        OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("trigger_timer:");
        stringBuilder2.append(string2);
        new Timer(stringBuilder2.toString()).schedule(timerTask, l);
    }
}

