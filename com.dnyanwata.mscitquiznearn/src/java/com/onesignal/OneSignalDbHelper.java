/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteCantOpenDatabaseException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  com.onesignal.OSLogger
 *  com.onesignal.OneSignal
 *  com.onesignal.OneSignal$LOG_LEVEL
 *  com.onesignal.OneSignalDb
 *  com.onesignal.OneSignalPrefs
 *  com.onesignal.outcomes.data.OSOutcomeTableProvider
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.onesignal.OSLogWrapper;
import com.onesignal.OSLogger;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalDb;
import com.onesignal.OneSignalPrefs;
import com.onesignal.outcomes.data.OSOutcomeTableProvider;
import java.util.ArrayList;

class OneSignalDbHelper
extends SQLiteOpenHelper
implements OneSignalDb {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    static final int DATABASE_VERSION = 8;
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final Object LOCK = new Object();
    protected static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    protected static final String[] SQL_INDEX_ENTRIES = new String[]{"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private static OSLogger logger = new OSLogWrapper();
    private static OSOutcomeTableProvider outcomeTableProvider = new OSOutcomeTableProvider();
    private static OneSignalDbHelper sInstance;

    OneSignalDbHelper(Context context) {
        super(context, DATABASE_NAME, null, OneSignalDbHelper.getDbVersion());
    }

    private static int getDbVersion() {
        return 8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OneSignalDbHelper getInstance(Context context) {
        Object object;
        if (sInstance != null) return sInstance;
        Object object2 = object = LOCK;
        synchronized (object2) {
            if (sInstance != null) return sInstance;
            sInstance = new OneSignalDbHelper(context.getApplicationContext());
            return sInstance;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private SQLiteDatabase getSQLiteDatabase() {
        Object object;
        void var2_4;
        Object object2 = object = LOCK;
        // MONITORENTER : object2
        SQLiteDatabase sQLiteDatabase = this.getWritableDatabase();
        // MONITOREXIT : object2
        return sQLiteDatabase;
        catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
            throw var2_4;
        }
        catch (SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {
            throw var2_4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private SQLiteDatabase getSQLiteDatabaseWithRetries() {
        Object object;
        Object object2 = object = LOCK;
        // MONITORENTER : object2
        int n = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.getSQLiteDatabase();
            // MONITOREXIT : object2
            return sQLiteDatabase;
        }
        catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {}
        catch (SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException) {}
        finally {
            Throwable throwable;
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void internalOnUpgrade(SQLiteDatabase var1_1, int var2_2) {
        block8 : {
            var4_3 = this;
            // MONITORENTER : var4_3
            if (var2_2 >= 2) ** GOTO lbl6
            OneSignalDbHelper.upgradeToV2(var1_1);
lbl6: // 2 sources:
            if (var2_2 < 3) {
                OneSignalDbHelper.upgradeToV3(var1_1);
            }
            if (var2_2 < 4) {
                OneSignalDbHelper.upgradeToV4(var1_1);
            }
            if (var2_2 < 5) {
                OneSignalDbHelper.upgradeToV5(var1_1);
            }
            if (var2_2 == 5) {
                OneSignalDbHelper.upgradeFromV5ToV6(var1_1);
            }
            if (var2_2 < 7) {
                OneSignalDbHelper.upgradeToV7(var1_1);
            }
            if (var2_2 >= 8) break block8;
            this.upgradeToV8(var1_1);
            return;
        }
        // MONITOREXIT : var4_3
    }

    static StringBuilder recentUninteractedWithNotificationsWhere() {
        long l = OneSignal.getTime().getCurrentTimeMillis() / 1000L;
        long l2 = l - 604800L;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("created_time > ");
        stringBuilder.append(l2);
        stringBuilder.append(" AND ");
        stringBuilder.append("dismissed");
        stringBuilder.append(" = 0 AND ");
        stringBuilder.append("opened");
        stringBuilder.append(" = 0 AND ");
        stringBuilder.append("is_summary");
        stringBuilder.append(" = 0");
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        if (OneSignalPrefs.getBool((String)OneSignalPrefs.PREFS_ONESIGNAL, (String)"OS_RESTORE_TTL_FILTER", (boolean)true)) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(" AND expire_time > ");
            stringBuilder3.append(l);
            stringBuilder2.append(stringBuilder3.toString());
        }
        return stringBuilder2;
    }

    private static void safeExecSQL(SQLiteDatabase sQLiteDatabase, String string2) {
        try {
            sQLiteDatabase.execSQL(string2);
            return;
        }
        catch (SQLiteException sQLiteException) {
            sQLiteException.printStackTrace();
            return;
        }
    }

    private static void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) {
        outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private static void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private static void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private static void upgradeToV4(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private static void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        OneSignalDbHelper.upgradeFromV5ToV6(sQLiteDatabase);
    }

    private static void upgradeToV7(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper.safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        OneSignalDbHelper oneSignalDbHelper = this;
        synchronized (oneSignalDbHelper) {
            outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
            outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public void delete(String var1_1, String var2_2, String[] var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CATCHBLOCK]], but top level block is 13[CATCHBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void insert(String var1_1, String var2_2, ContentValues var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CATCHBLOCK]], but top level block is 13[CATCHBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void insertOrThrow(String var1_1, String var2_2, ContentValues var3_3) throws SQLException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [12[CATCHBLOCK]], but top level block is 13[CATCHBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
        sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
        sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        sQLiteDatabase.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        String[] arrstring = SQL_INDEX_ENTRIES;
        int n = arrstring.length;
        for (int i = 0; i < n; ++i) {
            sQLiteDatabase.execSQL(arrstring[i]);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
        OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.WARN, (String)"SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                arrayList.add((Object)cursor.getString(0));
            }
            for (String string2 : arrayList) {
                if (string2.startsWith("sqlite_")) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DROP TABLE IF EXISTS ");
                stringBuilder.append(string2);
                sQLiteDatabase.execSQL(stringBuilder.toString());
            }
            this.onCreate(sQLiteDatabase);
            return;
        }
        finally {
            cursor.close();
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
        OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.DEBUG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OneSignal Database onUpgrade from: ");
        stringBuilder.append(n);
        stringBuilder.append(" to: ");
        stringBuilder.append(n2);
        OneSignal.Log((OneSignal.LOG_LEVEL)lOG_LEVEL, (String)stringBuilder.toString());
        try {
            this.internalOnUpgrade(sQLiteDatabase, n);
            return;
        }
        catch (SQLiteException sQLiteException) {
            OneSignal.Log((OneSignal.LOG_LEVEL)OneSignal.LOG_LEVEL.ERROR, (String)"Error in upgrade, migration may have already run! Skipping!", (Throwable)sQLiteException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cursor query(String string2, String[] arrstring, String string3, String[] arrstring2, String string4, String string5, String string6) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return this.getSQLiteDatabaseWithRetries().query(string2, arrstring, string3, arrstring2, string4, string5, string6);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cursor query(String string2, String[] arrstring, String string3, String[] arrstring2, String string4, String string5, String string6, String string7) {
        Object object;
        Object object2 = object = LOCK;
        synchronized (object2) {
            return this.getSQLiteDatabaseWithRetries().query(string2, arrstring, string3, arrstring2, string4, string5, string6, string7);
        }
    }

    void setOutcomeTableProvider(OSOutcomeTableProvider oSOutcomeTableProvider) {
        outcomeTableProvider = oSOutcomeTableProvider;
    }

    /*
     * Exception decompiling
     */
    public int update(String var1_1, ContentValues var2_2, String var3_3, String[] var4_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Backjump on non jumping statement [15] lbl30 : af: try { 4[TRYBLOCK]

        // org.benf.cfr.reader.b.a.a.b.g$1.a(Cleaner.java:44)
        // org.benf.cfr.reader.b.a.a.b.g$1.a(Cleaner.java:22)
        // org.benf.cfr.reader.util.d.c.d(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.b.a.a.b.g.a(Cleaner.java:54)
        // org.benf.cfr.reader.b.a.a.b.ao.a(RemoveDeterministicJumps.java:38)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:443)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }
}

