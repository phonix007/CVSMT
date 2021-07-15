/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.onesignal.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.List;

public interface Badger {
    public void executeBadge(Context var1, ComponentName var2, int var3) throws ShortcutBadgeException;

    public List<String> getSupportLaunchers();
}

