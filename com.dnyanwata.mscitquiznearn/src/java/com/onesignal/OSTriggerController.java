/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.onesignal.OSDynamicTriggerController
 *  com.onesignal.OSDynamicTriggerController$OSDynamicTriggerControllerObserver
 *  com.onesignal.OSInAppMessage
 *  java.lang.Double
 *  java.lang.NoSuchFieldError
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.DecimalFormat
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.onesignal;

import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSInAppMessage;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class OSTriggerController {
    OSDynamicTriggerController dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers = new ConcurrentHashMap();

    OSTriggerController(OSDynamicTriggerController.OSDynamicTriggerControllerObserver oSDynamicTriggerControllerObserver) {
        this.dynamicTriggerController = new OSDynamicTriggerController(oSDynamicTriggerControllerObserver);
    }

    private boolean evaluateAndTriggers(ArrayList<OSTrigger> arrayList) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (this.evaluateTrigger((OSTrigger)iterator.next())) continue;
            return false;
        }
        return true;
    }

    private boolean evaluateTrigger(OSTrigger oSTrigger) {
        if (oSTrigger.kind == OSTrigger.OSTriggerKind.UNKNOWN) {
            return false;
        }
        if (oSTrigger.kind != OSTrigger.OSTriggerKind.CUSTOM) {
            return this.dynamicTriggerController.dynamicTriggerShouldFire(oSTrigger);
        }
        OSTrigger.OSTriggerOperator oSTriggerOperator = oSTrigger.operatorType;
        Object object = this.triggers.get((Object)oSTrigger.property);
        if (object == null) {
            if (oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return true;
            }
            OSTrigger.OSTriggerOperator oSTriggerOperator2 = OSTrigger.OSTriggerOperator.NOT_EQUAL_TO;
            boolean bl = false;
            if (oSTriggerOperator == oSTriggerOperator2) {
                Object object2 = oSTrigger.value;
                bl = false;
                if (object2 != null) {
                    bl = true;
                }
            }
            return bl;
        }
        if (oSTriggerOperator == OSTrigger.OSTriggerOperator.EXISTS) {
            return true;
        }
        if (oSTriggerOperator == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
            return false;
        }
        if (oSTriggerOperator == OSTrigger.OSTriggerOperator.CONTAINS) {
            boolean bl = object instanceof Collection;
            boolean bl2 = false;
            if (bl) {
                boolean bl3 = ((Collection)object).contains(oSTrigger.value);
                bl2 = false;
                if (bl3) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        if (object instanceof String && oSTrigger.value instanceof String && this.triggerMatchesStringValue((String)oSTrigger.value, (String)object, oSTriggerOperator)) {
            return true;
        }
        if (oSTrigger.value instanceof Number && object instanceof Number && this.triggerMatchesNumericValue((Number)oSTrigger.value, (Number)object, oSTriggerOperator)) {
            return true;
        }
        return this.triggerMatchesFlex(oSTrigger.value, object, oSTriggerOperator);
    }

    private boolean triggerMatchesFlex(Object object, Object object2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        if (object == null) {
            return false;
        }
        if (oSTriggerOperator.checksEquality()) {
            String string2 = object.toString();
            String string3 = object2.toString();
            if (object2 instanceof Number) {
                string3 = new DecimalFormat("0.#").format(object2);
            }
            return this.triggerMatchesStringValue(string2, string3, oSTriggerOperator);
        }
        if (object2 instanceof String && object instanceof Number) {
            return this.triggerMatchesNumericValueFlex((Number)object, (String)object2, oSTriggerOperator);
        }
        return false;
    }

    private boolean triggerMatchesNumericValue(Number number, Number number2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        double d = number.doubleValue();
        double d2 = number2.doubleValue();
        int n = 1.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[oSTriggerOperator.ordinal()];
        boolean bl = true;
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                double d3 = d2 DCMPL d;
                if (d3 <= 0) {
                    if (d3 == false) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
            case 8: {
                if (!(d2 < d)) {
                    if (d2 == d) {
                        return bl;
                    }
                    bl = false;
                }
                return bl;
            }
            case 7: {
                if (d2 > d) {
                    return bl;
                }
                return false;
            }
            case 6: {
                if (d2 < d) {
                    return bl;
                }
                return false;
            }
            case 3: 
            case 4: 
            case 5: {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to use an invalid operator with a numeric value: ");
                stringBuilder.append(oSTriggerOperator.toString());
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                return false;
            }
            case 2: {
                if (d2 != d) {
                    return bl;
                }
                return false;
            }
            case 1: 
        }
        if (d2 == d) {
            return bl;
        }
        return false;
    }

    private boolean triggerMatchesNumericValueFlex(Number number, String string2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        double d;
        try {
            d = Double.parseDouble((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.triggerMatchesNumericValue(number.doubleValue(), d, oSTriggerOperator);
    }

    private boolean triggerMatchesStringValue(String string2, String string3, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        int n = 1.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[oSTriggerOperator.ordinal()];
        if (n != 1) {
            if (n != 2) {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to use an invalid operator for a string trigger comparison: ");
                stringBuilder.append(oSTriggerOperator.toString());
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                return false;
            }
            return true ^ string2.equals((Object)string3);
        }
        return string2.equals((Object)string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void addTriggers(Map<String, Object> map) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap = this.triggers;
        synchronized (concurrentHashMap2) {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                Object object = map.get((Object)string2);
                this.triggers.put((Object)string2, object);
            }
            return;
        }
    }

    boolean evaluateMessageTriggers(OSInAppMessage oSInAppMessage) {
        if (oSInAppMessage.triggers.size() == 0) {
            return true;
        }
        Iterator iterator = oSInAppMessage.triggers.iterator();
        while (iterator.hasNext()) {
            if (!this.evaluateAndTriggers((ArrayList<OSTrigger>)((ArrayList)iterator.next()))) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Object getTriggerValue(String string2) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap = this.triggers;
        synchronized (concurrentHashMap2) {
            if (!this.triggers.containsKey((Object)string2)) return null;
            return this.triggers.get((Object)string2);
        }
    }

    public ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    boolean isTriggerOnMessage(OSInAppMessage oSInAppMessage, Collection<String> collection) {
        if (oSInAppMessage.triggers == null) {
            return false;
        }
        for (String string2 : collection) {
            Iterator iterator = oSInAppMessage.triggers.iterator();
            while (iterator.hasNext()) {
                for (OSTrigger oSTrigger : (ArrayList)iterator.next()) {
                    if (!string2.equals((Object)oSTrigger.property) && !string2.equals((Object)oSTrigger.triggerId)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    boolean messageHasOnlyDynamicTriggers(OSInAppMessage oSInAppMessage) {
        if (oSInAppMessage.triggers != null) {
            if (oSInAppMessage.triggers.isEmpty()) {
                return false;
            }
            Iterator iterator = oSInAppMessage.triggers.iterator();
            while (iterator.hasNext()) {
                for (OSTrigger oSTrigger : (ArrayList)iterator.next()) {
                    if (oSTrigger.kind != OSTrigger.OSTriggerKind.CUSTOM && oSTrigger.kind != OSTrigger.OSTriggerKind.UNKNOWN) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void removeTriggersForKeys(Collection<String> collection) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap = this.triggers;
        synchronized (concurrentHashMap2) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                this.triggers.remove((Object)string2);
            }
            return;
        }
    }

}

