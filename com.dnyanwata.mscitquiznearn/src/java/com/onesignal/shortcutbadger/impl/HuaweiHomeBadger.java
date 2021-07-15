/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  com.onesignal.shortcutbadger.Badger
 *  com.onesignal.shortcutbadger.ShortcutBadgeException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class HuaweiHomeBadger
implements Badger {
    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", n);
        context.getContentResolver().call(Uri.parse((String)"content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.huawei.android.launcher"});
    }
}

