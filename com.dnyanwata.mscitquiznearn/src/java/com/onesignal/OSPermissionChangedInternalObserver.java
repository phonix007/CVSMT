/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package com.onesignal;

import android.content.Context;
import com.onesignal.BadgeCountUpdater;
import com.onesignal.OSPermissionState;
import com.onesignal.OSPermissionStateChanges;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;

class OSPermissionChangedInternalObserver {
    OSPermissionChangedInternalObserver() {
    }

    static void fireChangesToPublicObserver(OSPermissionState oSPermissionState) {
        OSPermissionStateChanges oSPermissionStateChanges = new OSPermissionStateChanges(OneSignal.lastPermissionState, (OSPermissionState)oSPermissionState.clone());
        if (OneSignal.getPermissionStateChangesObserver().notifyChange(oSPermissionStateChanges)) {
            OneSignal.lastPermissionState = (OSPermissionState)oSPermissionState.clone();
            OneSignal.lastPermissionState.persistAsFrom();
        }
    }

    static void handleInternalChanges(OSPermissionState oSPermissionState) {
        if (!oSPermissionState.areNotificationsEnabled()) {
            BadgeCountUpdater.updateCount(0, OneSignal.appContext);
        }
        OneSignalStateSynchronizer.setPermission(OneSignal.areNotificationsEnabledForSubscribedState());
    }

    void changed(OSPermissionState oSPermissionState) {
        OSPermissionChangedInternalObserver.handleInternalChanges(oSPermissionState);
        OSPermissionChangedInternalObserver.fireChangesToPublicObserver(oSPermissionState);
    }
}

