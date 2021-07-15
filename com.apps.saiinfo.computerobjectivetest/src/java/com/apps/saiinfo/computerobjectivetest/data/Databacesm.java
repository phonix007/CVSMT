/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.apps.saiinfo.computerobjectivetest.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.apps.saiinfo.computerobjectivetest.source.Questionssm;
import java.util.ArrayList;
import java.util.List;

public class Databacesm
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest13";
    private static final int DATABASE_VERSION = 1;
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_ID = "id";
    private static final String KEY_OPTA = "opta";
    private static final String KEY_OPTB = "optb";
    private static final String KEY_OPTC = "optc";
    private static final String KEY_OPTD = "optd";
    private static final String KEY_QUESION = "question";
    private static final String TABLE_QUESTION = "question";
    private SQLiteDatabase myDatabase;

    public Databacesm(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssm("1. ______ \u0939\u0947 \u090f\u0915 \u0938\u092e\u0915\u0947\u0902\u0926\u094d\u0930\u0940 \u0935\u0932\u092f \u0905\u0938\u0924\u0947.", "\u0938\u0947\u0915\u094d\u091f\u0930", "\u091f\u094d\u0930\u0945\u0915", "\u0935\u0930\u094d\u0924\u0941\u0933", "\u0930\u093e\u0909\u0902\u0921", "\u091f\u094d\u0930\u0945\u0915"));
        this.addQuestion(new Questionssm("2. ______ \u0939\u0947 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u092e\u0947\u092e\u0930\u0940\u091a\u0947 \u090f\u0915\u0915 \u0906\u0939\u0947.", "\u0915\u093f\u0932\u094b\u0917\u094d\u0930\u0945\u092e", "\u092e\u0940\u091f\u0930", "\u0915\u093f\u0932\u094b\u092c\u093e\u0908\u091f\u094d\u0938", "\u0938\u0947\u0932\u094d\u0938\u093f\u0905\u0938", "\u0915\u093f\u0932\u094b\u092c\u093e\u0908\u091f\u094d\u0938"));
        this.addQuestion(new Questionssm("3. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u0947 \u0909\u092a\u0915\u0930\u0923 \u0939\u0947 \u090f\u0915 \u092a\u094b\u0930\u094d\u091f\u0947\u092c\u0932 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0928\u093e\u0939\u0940.", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092b\u094d\u0932\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0930\u0945\u092e \u091a\u093f\u092a\u094d\u0938", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915"));
        this.addQuestion(new Questionssm("4. \u0938\u0940.\u0921\u0940. \u0906\u0930 \u0921\u092c\u094d\u0932\u094d\u092f\u0942. CD-RW \u092e\u094d\u0939\u0923\u091c\u0947 ______", "\u0938\u0940.\u0921\u0940. \u0930\u0947\u0915\u0949\u0930\u094d\u0921\u0947\u092c\u0932", "\u0938\u0940.\u0921\u0940. \u0930\u093f\u0938\u093f\u0935\u094d\u0939\u0930", "\u0938\u0940.\u0921\u0940. \u0930\u0928\u0930", "\u0938\u0940.\u0921\u0940. \u0930\u093f\u0930\u093e\u092f\u091f\u0947\u092c\u0932", "\u0938\u0940.\u0921\u0940. \u0930\u093f\u0930\u093e\u092f\u091f\u0947\u092c\u0932"));
        this.addQuestion(new Questionssm("5. \u092a\u094d\u0930\u093e\u092f\u092e\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0939\u0947 \u0935\u094d\u0939\u094b\u0932\u0945\u091f\u093e\u0907\u0932 \u0905\u0938\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionssm("6. \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915 \u091f\u094d\u0930\u0945\u0915 \u0939\u093e ________ \u0928\u093e\u0935\u093e\u091a\u094d\u092f\u093e \u0917\u094b\u0932\u093e\u0915\u093e\u0930 \u092a\u093e\u091a\u0930\u0940\u091a\u094d\u092f\u093e \u0906\u0915\u093e\u0930\u093e\u091a\u094d\u092f\u093e \u0924\u0941\u0915\u0921\u094d\u092f\u093e\u0902\u092e\u0927\u094d\u092f\u0947 \u0935\u093f\u092d\u093e\u0917\u0932\u0947\u0932\u093e \u0905\u0938\u0924\u094b.", "\u0930\u093e\u0909\u0902\u0921", "\u091f\u094d\u0930\u0945\u0915", "\u0938\u0947\u0915\u094d\u091f\u0930", "\u0935\u0930\u094d\u0924\u0941\u0933", "\u0938\u0947\u0915\u094d\u091f\u0930"));
        this.addQuestion(new Questionssm("7. \u092c\u093e\u092f\u0928\u0930\u0940 \u0928\u0902\u092c\u0930\u093f\u0902\u0917\u092e\u0927\u094d\u092f\u0947 0 \u0935 1 \u0932\u093e \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915\u0940 \u090f\u0915 \u092c\u093f\u091f \u092e\u094d\u0939\u091f\u0932\u0947 \u091c\u093e\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionssm("8. _____ \u092c\u093f\u091f\u094d\u0938 \u092e\u093f\u0933\u0942\u0928 \u090f\u0915 \u092c\u093e\u0908\u091f \u092c\u0928\u0924\u094b.", "\u091a\u093e\u0930", "\u0938\u0939\u093e", "\u0906\u0920", "\u092c\u093e\u0930\u093e", "\u0906\u0920"));
        this.addQuestion(new Questionssm("9. \u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0939\u0947 \u0928\u0949\u0928\u0935\u094d\u0939\u094b\u0932\u0945\u091f\u093e\u0907\u0932 \u0905\u0938\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionssm("10. _____ \u0939\u0940 \u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923\u093e\u0924\u0942\u0928 \u092e\u093e\u0939\u093f\u0924\u0940 \u090f\u0915\u094d\u0938\u0947\u0938 \u0915\u0930\u0923\u094d\u092f\u093e\u091a\u0940 \u092a\u094d\u0930\u0915\u094d\u0930\u093f\u092f\u093e \u0906\u0939\u0947.", "\u0932\u093f\u0939\u093f\u0923\u0947 (Writing)", "\u0910\u0915\u0923\u0947 (Listening)", "\u0935\u093e\u091a\u0923\u0947 (Reading)", "\u092c\u094b\u0932\u0923\u0947 (Speaking)", "\u0935\u093e\u091a\u0923\u0947 (Reading)"));
        this.addQuestion(new Questionssm("11. \u090f\u0916\u093e\u0926\u094d\u092f\u093e \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u092f\u0941\u0928\u093f\u091f\u091a\u0940 \u0915\u094d\u0937\u092e\u0924\u093e \u0938\u0930\u094d\u0935\u0938\u093e\u0927\u093e\u0930\u0923\u0924: \u092c\u093e\u0908\u091f\u094d\u0938 \u092e\u0927\u094d\u092f\u0947 \u092e\u094b\u091c\u0932\u0940 \u091c\u093e\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionssm("12. \u0938\u0940.\u0921\u0940. \u0930\u0949\u092e CD-ROM \u092e\u094d\u0939\u0923\u091c\u0947 ______", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0935\u0928\u094d\u0938 \u092e\u0947\u092e\u0930\u0940", "\u0938\u0947\u0928\u094d\u091f\u094d\u0930\u0932 \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940", "\u0915\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940"));
        this.addQuestion(new Questionssm("13. ____ \u0939\u094d\u092f\u093e \u092a\u094d\u0930\u0915\u093e\u0930\u091a\u094d\u092f\u093e \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923\u093e\u0924 \u0939\u0932\u0923\u093e\u0930\u0947 \u092d\u093e\u0917 \u0928\u0938\u0924\u093e\u0924.", "\u092b\u094d\u0932\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0938\u0949\u0932\u093f\u0921 \u0938\u094d\u091f\u0947\u091f", "\u0938\u0949\u0932\u093f\u0921 \u0938\u094d\u091f\u0947\u091f"));
        this.addQuestion(new Questionssm("14. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u092e\u0927\u0942\u0928 \u0906\u0935\u093e\u091c \u091a\u093e\u0932\u0942 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0906\u0923\u093f \u0924\u094b \u0910\u0915\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0924\u0941\u092e\u091a\u094d\u092f\u093e\u0915\u0921\u0947 \u0939\u0947 \u0905\u0938\u093e\u0935\u0947 \u0932\u093e\u0917\u0924\u0947.", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092b\u094b\u0928", "\u0938\u093e\u0909\u0902\u0921\u0915\u093e\u0930\u094d\u0921 \u0906\u0923\u093f \u0938\u094d\u092a\u093f\u0915\u0930\u094d\u0938", "\u092a\u094d\u0930\u093f\u0902\u091f\u0930", "\u0938\u094d\u0915\u0945\u0928\u0930", "\u0938\u093e\u0909\u0902\u0921\u0915\u093e\u0930\u094d\u0921 \u0906\u0923\u093f \u0938\u094d\u092a\u093f\u0915\u0930\u094d\u0938"));
        this.addQuestion(new Questionssm("15. \u0921\u093f\u091c\u093f\u091f\u0932 \u0938\u093f\u0938\u094d\u091f\u0940\u092e\u092e\u0927\u0940\u0932 \u0938\u0930\u094d\u0935\u093e\u0924 \u091b\u094b\u091f\u0947 \u090f\u0915\u0915 \u092e\u094d\u0939\u0923\u091c\u0947 _____", "\u091f\u0947\u0915\u094d\u0938\u094d\u091f", "\u0915\u0945\u0930\u0945\u0915\u094d\u091f\u0930", "\u092c\u093f\u091f", "\u092e\u0947\u0917\u093e \u092c\u093e\u0907\u091f", "\u092c\u093f\u091f"));
    }

    public void addQuestion(Questionssm questionssm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssm.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssm.getANSWER());
        contentValues.put(KEY_OPTA, questionssm.getOptionA());
        contentValues.put(KEY_OPTB, questionssm.getOptionB());
        contentValues.put(KEY_OPTC, questionssm.getOptionC());
        contentValues.put(KEY_OPTD, questionssm.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssm> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssm questionssm = new Questionssm();
                questionssm.setId(cursor.getInt(0));
                questionssm.setQUESTION(cursor.getString(1));
                questionssm.setANSWER(cursor.getString(2));
                questionssm.setOptionA(cursor.getString(3));
                questionssm.setOptionB(cursor.getString(4));
                questionssm.setOptionC(cursor.getString(5));
                questionssm.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssm);
            } while (cursor.moveToNext());
        }
        return arrayList;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.myDatabase = sQLiteDatabase;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS question ( id INTEGER PRIMARY KEY AUTOINCREMENT, question TEXT, answer TEXT, opta TEXT, optb TEXT, optc TEXT, optd TEXT)");
        this.addQuestions();
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n, int n2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS question");
        this.onCreate(sQLiteDatabase);
    }

    public int rowCount() {
        return this.getWritableDatabase().rawQuery("SELECT  * FROM question", null).getCount();
    }
}

