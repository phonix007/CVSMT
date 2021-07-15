/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.OSSubscriptionState;
import com.onesignal.OSSubscriptionStateChanges;
import com.onesignal.OneSignal;

class OSSubscriptionChangedInternalObserver {
    OSSubscriptionChangedInternalObserver() {
    }

    static void fireChangesToPublicObserver(OSSubscriptionState oSSubscriptionState) {
        OSSubscriptionStateChanges oSSubscriptionStateChanges = new OSSubscriptionStateChanges(OneSignal.lastSubscriptionState, (OSSubscriptionState)oSSubscriptionState.clone());
        if (OneSignal.getSubscriptionStateChangesObserver().notifyChange(oSSubscriptionStateChanges)) {
            OneSignal.lastSubscriptionState = (OSSubscriptionState)oSSubscriptionState.clone();
            OneSignal.lastSubscriptionState.persistAsFrom();
        }
    }

    public void changed(OSSubscriptionState oSSubscriptionState) {
        OSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(oSSubscriptionState);
    }
}

