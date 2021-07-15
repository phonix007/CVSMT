/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.core.app.NotificationCompat
 *  androidx.core.app.NotificationCompat$Extender
 *  com.onesignal.OSNotification
 */
package com.onesignal;

import androidx.core.app.NotificationCompat;
import com.onesignal.OSNotification;

public class OSMutableNotification
extends OSNotification {
    OSMutableNotification(OSNotification oSNotification) {
        super(oSNotification);
    }

    public void setAndroidNotificationId(int n) {
        super.setAndroidNotificationId(n);
    }

    public void setExtender(NotificationCompat.Extender extender) {
        this.setNotificationExtender(extender);
    }
}

