/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  java.lang.Object
 *  java.util.List
 */
package com.onesignal.shortcutbadger.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

public class BroadcastHelper {
    public static boolean canResolveBroadcast(Context context, Intent intent) {
        List list = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        boolean bl = false;
        if (list != null) {
            int n = list.size();
            bl = false;
            if (n > 0) {
                bl = true;
            }
        }
        return bl;
    }
}

