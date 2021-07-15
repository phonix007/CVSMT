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

public class NewHtcHomeBadger
implements Badger {
    public static final String COUNT = "count";
    public static final String EXTRA_COMPONENT = "com.htc.launcher.extra.COMPONENT";
    public static final String EXTRA_COUNT = "com.htc.launcher.extra.COUNT";
    public static final String INTENT_SET_NOTIFICATION = "com.htc.launcher.action.SET_NOTIFICATION";
    public static final String INTENT_UPDATE_SHORTCUT = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String PACKAGENAME = "packagename";

    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        Intent intent = new Intent(INTENT_SET_NOTIFICATION);
        intent.putExtra(EXTRA_COMPONENT, componentName.flattenToShortString());
        intent.putExtra(EXTRA_COUNT, n);
        Intent intent2 = new Intent(INTENT_UPDATE_SHORTCUT);
        intent2.putExtra(PACKAGENAME, componentName.getPackageName());
        intent2.putExtra(COUNT, n);
        if (!BroadcastHelper.canResolveBroadcast((Context)context, (Intent)intent) && !BroadcastHelper.canResolveBroadcast((Context)context, (Intent)intent2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unable to resolve intent: ");
            stringBuilder.append(intent2.toString());
            throw new ShortcutBadgeException(stringBuilder.toString());
        }
        context.sendBroadcast(intent);
        context.sendBroadcast(intent2);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.htc.launcher"});
    }
}

