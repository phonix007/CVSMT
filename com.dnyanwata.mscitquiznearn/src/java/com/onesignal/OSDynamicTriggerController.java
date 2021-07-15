/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.TimerTask
 */
package com.onesignal;

import com.onesignal.OSDynamicTriggerTimer;
import com.onesignal.OSInAppMessageController;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

class OSDynamicTriggerController {
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999L;
    private static final double REQUIRED_ACCURACY = 0.3;
    private static Date sessionLaunchTime = new Date();
    private final OSDynamicTriggerControllerObserver observer;
    private final ArrayList<String> scheduledMessages = new ArrayList();

    OSDynamicTriggerController(OSDynamicTriggerControllerObserver oSDynamicTriggerControllerObserver) {
        this.observer = oSDynamicTriggerControllerObserver;
    }

    private static boolean evaluateTimeIntervalWithOperator(double d, double d2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        int n = 2.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[oSTriggerOperator.ordinal()];
        boolean bl = true;
        switch (n) {
            default: {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to apply an invalid operator on a time-based in-app-message trigger: ");
                stringBuilder.append(oSTriggerOperator.toString());
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                return false;
            }
            case 6: {
                return bl ^ OSDynamicTriggerController.roughlyEqual(d, d2);
            }
            case 5: {
                return OSDynamicTriggerController.roughlyEqual(d, d2);
            }
            case 4: {
                if (!(d2 >= d)) {
                    if (OSDynamicTriggerController.roughlyEqual(d, d2)) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
            case 3: {
                if (d2 > d) {
                    return bl;
                }
                return false;
            }
            case 2: {
                if (!(d2 <= d)) {
                    if (OSDynamicTriggerController.roughlyEqual(d, d2)) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
            case 1: 
        }
        if (d2 < d) {
            return bl;
        }
        return false;
    }

    static void resetSessionLaunchTime() {
        sessionLaunchTime = new Date();
    }

    private static boolean roughlyEqual(double d, double d2) {
        return Math.abs((double)(d - d2)) < 0.3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean dynamicTriggerShouldFire(OSTrigger oSTrigger) {
        ArrayList<String> arrayList;
        if (oSTrigger.value == null) {
            return false;
        }
        ArrayList<String> arrayList2 = arrayList = this.scheduledMessages;
        synchronized (arrayList2) {
            long l;
            block11 : {
                long l2;
                long l3;
                block13 : {
                    block9 : {
                        Date date;
                        block12 : {
                            block10 : {
                                if (!(oSTrigger.value instanceof Number)) {
                                    return false;
                                }
                                int n = 2.$SwitchMap$com$onesignal$OSTrigger$OSTriggerKind[oSTrigger.kind.ordinal()];
                                if (n == 1) break block9;
                                if (n == 2) break block10;
                                l = 0L;
                                break block11;
                            }
                            if (OneSignal.getInAppMessageController().isInAppMessageShowing()) {
                                return false;
                            }
                            date = OneSignal.getInAppMessageController().lastTimeInAppDismissed;
                            if (date != null) break block12;
                            l = 999999L;
                            break block11;
                        }
                        l2 = new Date().getTime();
                        l3 = date.getTime();
                        break block13;
                    }
                    l2 = new Date().getTime();
                    l3 = sessionLaunchTime.getTime();
                }
                l = l2 - l3;
            }
            final String string2 = oSTrigger.triggerId;
            long l4 = (long)(1000.0 * ((Number)oSTrigger.value).doubleValue());
            if (OSDynamicTriggerController.evaluateTimeIntervalWithOperator(l4, l, oSTrigger.operatorType)) {
                this.observer.messageDynamicTriggerCompleted(string2);
                return true;
            }
            long l5 = l4 - l;
            if (l5 <= 0L) {
                return false;
            }
            if (this.scheduledMessages.contains((Object)string2)) {
                return false;
            }
            OSDynamicTriggerTimer.scheduleTrigger(new TimerTask(){

                public void run() {
                    OSDynamicTriggerController.this.scheduledMessages.remove((Object)string2);
                    OSDynamicTriggerController.this.observer.messageTriggerConditionChanged();
                }
            }, string2, l5);
            this.scheduledMessages.add((Object)string2);
            return false;
        }
    }

    static interface OSDynamicTriggerControllerObserver {
        public void messageDynamicTriggerCompleted(String var1);

        public void messageTriggerConditionChanged();
    }

}

