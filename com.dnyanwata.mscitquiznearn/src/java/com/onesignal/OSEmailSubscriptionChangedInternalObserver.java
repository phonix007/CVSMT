/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.OSEmailSubscriptionState;
import com.onesignal.OSEmailSubscriptionStateChanges;
import com.onesignal.OneSignal;

class OSEmailSubscriptionChangedInternalObserver {
    OSEmailSubscriptionChangedInternalObserver() {
    }

    static void fireChangesToPublicObserver(OSEmailSubscriptionState oSEmailSubscriptionState) {
        OSEmailSubscriptionStateChanges oSEmailSubscriptionStateChanges = new OSEmailSubscriptionStateChanges(OneSignal.lastEmailSubscriptionState, (OSEmailSubscriptionState)oSEmailSubscriptionState.clone());
        if (OneSignal.getEmailSubscriptionStateChangesObserver().notifyChange(oSEmailSubscriptionStateChanges)) {
            OneSignal.lastEmailSubscriptionState = (OSEmailSubscriptionState)oSEmailSubscriptionState.clone();
            OneSignal.lastEmailSubscriptionState.persistAsFrom();
        }
    }

    void changed(OSEmailSubscriptionState oSEmailSubscriptionState) {
        OSEmailSubscriptionChangedInternalObserver.fireChangesToPublicObserver(oSEmailSubscriptionState);
    }
}

