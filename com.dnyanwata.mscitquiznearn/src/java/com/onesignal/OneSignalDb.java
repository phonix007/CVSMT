/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.SQLException
 *  java.lang.Object
 *  java.lang.String
 */
package com.onesignal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;

public interface OneSignalDb {
    public void delete(String var1, String var2, String[] var3);

    public void insert(String var1, String var2, ContentValues var3);

    public void insertOrThrow(String var1, String var2, ContentValues var3) throws SQLException;

    public Cursor query(String var1, String[] var2, String var3, String[] var4, String var5, String var6, String var7);

    public Cursor query(String var1, String[] var2, String var3, String[] var4, String var5, String var6, String var7, String var8);

    public int update(String var1, ContentValues var2, String var3, String[] var4);
}

