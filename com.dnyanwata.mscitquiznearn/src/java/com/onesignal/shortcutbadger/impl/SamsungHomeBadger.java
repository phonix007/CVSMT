/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  com.onesignal.shortcutbadger.Badger
 *  com.onesignal.shortcutbadger.ShortcutBadgeException
 *  com.onesignal.shortcutbadger.util.CloseHelper
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.List
 */
package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.onesignal.shortcutbadger.Badger;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.util.CloseHelper;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger
implements Badger {
    private static final String[] CONTENT_PROJECTION = new String[]{"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger;

    public SamsungHomeBadger() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.defaultBadger = new DefaultBadger();
        }
    }

    private ContentValues getContentValues(ComponentName componentName, int n, boolean bl) {
        ContentValues contentValues = new ContentValues();
        if (bl) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf((int)n));
        return contentValues;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void executeBadge(Context context, ComponentName componentName, int n) throws ShortcutBadgeException {
        Cursor cursor;
        block4 : {
            DefaultBadger defaultBadger = this.defaultBadger;
            if (defaultBadger != null && defaultBadger.isSupported(context)) {
                this.defaultBadger.executeBadge(context, componentName, n);
                return;
            }
            Uri uri = Uri.parse((String)CONTENT_URI);
            ContentResolver contentResolver = context.getContentResolver();
            cursor = null;
            try {
                String[] arrstring = CONTENT_PROJECTION;
                String[] arrstring2 = new String[]{componentName.getPackageName()};
                cursor = contentResolver.query(uri, arrstring, "package=?", arrstring2, null);
                if (cursor == null) break block4;
                String string2 = componentName.getClassName();
                boolean bl = false;
                while (cursor.moveToNext()) {
                    int n2 = cursor.getInt(0);
                    ContentValues contentValues = this.getContentValues(componentName, n, false);
                    String[] arrstring3 = new String[]{String.valueOf((int)n2)};
                    contentResolver.update(uri, contentValues, "_id=?", arrstring3);
                    if (!string2.equals((Object)cursor.getString(cursor.getColumnIndex("class")))) continue;
                    bl = true;
                }
                if (bl) break block4;
                contentResolver.insert(uri, this.getContentValues(componentName, n, true));
            }
            catch (Throwable throwable) {
                CloseHelper.close(cursor);
                throw throwable;
            }
        }
        CloseHelper.close((Cursor)cursor);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList((Object[])new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }
}

