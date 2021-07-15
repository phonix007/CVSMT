/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.onesignal.outcomes.data;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.onesignal.influence.domain.OSInfluenceChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\t"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeTableProvider;", "", "()V", "upgradeCacheOutcomeTableRevision1To2", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "upgradeOutcomeTableRevision1To2", "upgradeOutcomeTableRevision2To3", "onesignal_release"}, k=1, mv={1, 1, 16})
public final class OSOutcomeTableProvider {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void upgradeCacheOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkParameterIsNotNull((Object)sQLiteDatabase, (String)"db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("INSERT INTO cached_unique_outcome(");
                stringBuilder.append("_id,name,channel_influence_id");
                stringBuilder.append(")");
                stringBuilder.append(" SELECT ");
                stringBuilder.append("_id,name,notification_id");
                stringBuilder.append(" FROM ");
                stringBuilder.append("cached_unique_outcome_notification");
                stringBuilder.append(";");
                sQLiteDatabase.execSQL(stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("UPDATE cached_unique_outcome SET channel_type = '");
                stringBuilder2.append(OSInfluenceChannel.NOTIFICATION.toString());
                stringBuilder2.append("';");
                sQLiteDatabase.execSQL(stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("DROP TABLE ");
                stringBuilder3.append("cached_unique_outcome_notification");
                stringBuilder3.append(';');
                sQLiteDatabase.execSQL(stringBuilder3.toString());
            }
            catch (SQLiteException sQLiteException) {
                sQLiteException.printStackTrace();
            }
        }
        catch (Throwable throwable2) {}
        sQLiteDatabase.execSQL("COMMIT;");
        return;
        sQLiteDatabase.execSQL("COMMIT;");
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void upgradeOutcomeTableRevision1To2(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkParameterIsNotNull((Object)sQLiteDatabase, (String)"db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CREATE TEMPORARY TABLE outcome_backup(");
                stringBuilder.append("_id,session,notification_ids,name,timestamp");
                stringBuilder.append(");");
                sQLiteDatabase.execSQL(stringBuilder.toString());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("INSERT INTO outcome_backup SELECT ");
                stringBuilder2.append("_id,session,notification_ids,name,timestamp");
                stringBuilder2.append(" FROM outcome;");
                sQLiteDatabase.execSQL(stringBuilder2.toString());
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("INSERT INTO outcome (");
                stringBuilder3.append("_id,session,notification_ids,name,timestamp");
                stringBuilder3.append(", weight) SELECT ");
                stringBuilder3.append("_id,session,notification_ids,name,timestamp");
                stringBuilder3.append(", 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL(stringBuilder3.toString());
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            }
            catch (SQLiteException sQLiteException) {
                sQLiteException.printStackTrace();
            }
        }
        catch (Throwable throwable2) {}
        sQLiteDatabase.execSQL("COMMIT;");
        return;
        sQLiteDatabase.execSQL("COMMIT;");
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void upgradeOutcomeTableRevision2To3(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkParameterIsNotNull((Object)sQLiteDatabase, (String)"db");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_id,name,timestamp,notification_ids,weight");
        stringBuilder.append(",");
        stringBuilder.append("notification_influence_type");
        String string2 = stringBuilder.toString();
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("ALTER TABLE outcome RENAME TO ");
                stringBuilder2.append("outcome_aux");
                stringBuilder2.append(";");
                sQLiteDatabase.execSQL(stringBuilder2.toString());
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("INSERT INTO outcome(");
                stringBuilder3.append(string2);
                stringBuilder3.append(")");
                stringBuilder3.append(" SELECT ");
                stringBuilder3.append("_id,name,timestamp,notification_ids,weight,session");
                stringBuilder3.append(" FROM ");
                stringBuilder3.append("outcome_aux");
                stringBuilder3.append(";");
                sQLiteDatabase.execSQL(stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("DROP TABLE ");
                stringBuilder4.append("outcome_aux");
                stringBuilder4.append(';');
                sQLiteDatabase.execSQL(stringBuilder4.toString());
            }
            catch (SQLiteException sQLiteException) {
                sQLiteException.printStackTrace();
            }
        }
        catch (Throwable throwable2) {}
        sQLiteDatabase.execSQL("COMMIT;");
        return;
        sQLiteDatabase.execSQL("COMMIT;");
        throw throwable2;
    }
}

