/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.OSSMSSubscriptionState;
import com.onesignal.OSSMSSubscriptionStateChanges;
import com.onesignal.OneSignal;

class OSSMSSubscriptionChangedInternalObserver {
    OSSMSSubscriptionChangedInternalObserver() {
    }

    static void fireChangesToPublicObserver(OSSMSSubscriptionState oSSMSSubscriptionState) {
        OSSMSSubscriptionStateChanges oSSMSSubscriptionStateChanges = new OSSMSSubscriptionStateChanges(OneSignal.lastSMSSubscriptionState, (OSSMSSubscriptionState)oSSMSSubscriptionState.clone());
        if (OneSignal.getSMSSubscriptionStateChangesObserver().notifyChange(oSSMSSubscriptionStateChanges)) {
            OneSignal.lastSMSSubscriptionState = (OSSMSSubscriptionState)oSSMSSubscriptionState.clone();
            OneSignal.lastSMSSubscriptionState.persistAsFrom();
        }
    }

    void changed(OSSMSSubscriptionState oSSMSSubscriptionState) {
        OSSMSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(oSSMSSubscriptionState);
    }
}

