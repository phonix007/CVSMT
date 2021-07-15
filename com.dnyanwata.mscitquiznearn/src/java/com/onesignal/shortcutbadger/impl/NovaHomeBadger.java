/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.net.Uri
 *  com.onesignal.shortcutbadger.Badger
 *  com.onesignal.shortcutbadger.ShortcutBadgeException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;

public class NovaHomeBadger
implements Badger {
    private static final String CONTENT_URI = "content://com.teslacoilsw.notifier/unread_count";
    private static final String COUNT = "count";
    private static final String TAG = "tag";

    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(componentName.getPackageName());
        stringBuilder.append("/");
        stringBuilder.append(componentName.getClassName());
        contentValues.put(TAG, stringBuilder.toString());
        contentValues.put(COUNT, Integer.valueOf((int)n));
        context.getContentResolver().insert(Uri.parse((String)CONTENT_URI), contentValues);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.teslacoilsw.launcher"});
    }
}

