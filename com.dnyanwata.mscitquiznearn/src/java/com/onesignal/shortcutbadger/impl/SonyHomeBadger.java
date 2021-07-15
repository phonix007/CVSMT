/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.AsyncQueryHandler
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.net.Uri
 *  android.os.Looper
 *  com.onesignal.shortcutbadger.Badger
 *  com.onesignal.shortcutbadger.ShortcutBadgeException
 *  com.onesignal.shortcutbadger.impl.SonyHomeBadger$1
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Looper;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger
implements Badger {
    private static final String INTENT_ACTION = "com.sonyericsson.home.action.UPDATE_BADGE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";
    private static final String INTENT_EXTRA_MESSAGE = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
    private static final String INTENT_EXTRA_SHOW_MESSAGE = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
    private static final String PROVIDER_COLUMNS_ACTIVITY_NAME = "activity_name";
    private static final String PROVIDER_COLUMNS_BADGE_COUNT = "badge_count";
    private static final String PROVIDER_COLUMNS_PACKAGE_NAME = "package_name";
    private static final String PROVIDER_CONTENT_URI = "content://com.sonymobile.home.resourceprovider/badge";
    private static final String SONY_HOME_PROVIDER_NAME = "com.sonymobile.home.resourceprovider";
    private final Uri BADGE_CONTENT_URI = Uri.parse((String)"content://com.sonymobile.home.resourceprovider/badge");
    private AsyncQueryHandler mQueryHandler;

    private ContentValues createContentValues(int n, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PROVIDER_COLUMNS_BADGE_COUNT, Integer.valueOf((int)n));
        contentValues.put(PROVIDER_COLUMNS_PACKAGE_NAME, componentName.getPackageName());
        contentValues.put(PROVIDER_COLUMNS_ACTIVITY_NAME, componentName.getClassName());
        return contentValues;
    }

    private static void executeBadgeByBroadcast(Context context, ComponentName componentName, int n) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGE_NAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        intent.putExtra(INTENT_EXTRA_MESSAGE, String.valueOf((int)n));
        boolean bl = n > 0;
        intent.putExtra(INTENT_EXTRA_SHOW_MESSAGE, bl);
        context.sendBroadcast(intent);
    }

    private void executeBadgeByContentProvider(Context context, ComponentName componentName, int n) {
        if (n < 0) {
            return;
        }
        ContentValues contentValues = this.createContentValues(n, componentName);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.mQueryHandler == null) {
                this.mQueryHandler = new 1(this, context.getApplicationContext().getContentResolver());
            }
            this.insertBadgeAsync(contentValues);
            return;
        }
        this.insertBadgeSync(context, contentValues);
    }

    private void insertBadgeAsync(ContentValues contentValues) {
        this.mQueryHandler.startInsert(0, null, this.BADGE_CONTENT_URI, contentValues);
    }

    private void insertBadgeSync(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.BADGE_CONTENT_URI, contentValues);
    }

    private static boolean sonyBadgeContentProviderExists(Context context) {
        ProviderInfo providerInfo = context.getPackageManager().resolveContentProvider(SONY_HOME_PROVIDER_NAME, 0);
        boolean bl = false;
        if (providerInfo != null) {
            bl = true;
        }
        return bl;
    }

    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        if (SonyHomeBadger.sonyBadgeContentProviderExists(context)) {
            this.executeBadgeByContentProvider(context, componentName, n);
            return;
        }
        SonyHomeBadger.executeBadgeByBroadcast(context, componentName, n);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }
}

