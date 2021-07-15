/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient
 *  com.google.android.gms.ads.identifier.AdvertisingIdClient$Info
 *  com.onesignal.AdvertisingIdentifierProvider
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.AdvertisingIdentifierProvider;
import com.onesignal.OneSignal;

class AdvertisingIdProviderGPS
implements AdvertisingIdentifierProvider {
    private static String lastValue;

    AdvertisingIdProviderGPS() {
    }

    static String getLastValue() {
        return lastValue;
    }

    public String getIdentifier(Context context) {
        try {
            AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo((Context)context);
            lastValue = info.isLimitAdTrackingEnabled() ? "OptedOut" : info.getId();
            String string = lastValue;
            return string;
        }
        catch (Throwable throwable) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.INFO, (String)"Error getting Google Ad id: ", (Throwable)throwable);
            return null;
        }
    }
}

