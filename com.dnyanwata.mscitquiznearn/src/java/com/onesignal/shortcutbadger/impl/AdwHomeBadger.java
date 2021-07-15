/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  com.onesignal.shortcutbadger.Badger
 *  com.onesignal.shortcutbadger.ShortcutBadgeException
 *  com.onesignal.shortcutbadger.util.BroadcastHelper
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.util.BroadcastHelper;
import java.util.Arrays;
import java.util.List;

public class AdwHomeBadger
implements Badger {
    public static final String CLASSNAME = "CNAME";
    public static final String COUNT = "COUNT";
    public static final String INTENT_UPDATE_COUNTER = "org.adw.launcher.counter.SEND";
    public static final String PACKAGENAME = "PNAME";

    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        Intent intent = new Intent(INTENT_UPDATE_COUNTER);
        intent.putExtra(PACKAGENAME, componentName.getPackageName());
        intent.putExtra(CLASSNAME, componentName.getClassName());
        intent.putExtra(COUNT, n);
        if (BroadcastHelper.canResolveBroadcast((Context)context, (Intent)intent)) {
            context.sendBroadcast(intent);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unable to resolve intent: ");
        stringBuilder.append(intent.toString());
        throw new ShortcutBadgeException(stringBuilder.toString());
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }
}

