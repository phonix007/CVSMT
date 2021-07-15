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
import com.apps.saiinfo.computerobjectivetest.source.Questionsallm;
import java.util.ArrayList;
import java.util.List;

public class Databaceallm
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest49";
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

    public Databaceallm(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsallm("1. \u0928\u094b\u091f\u092c\u0941\u0915 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f\u094d\u0938\u0928\u093e \u092c\u0939\u0941\u0924\u0947\u0915 \u0935\u0947\u0933\u093e _______ \u092e\u094d\u0939\u091f\u0932\u0947 \u091c\u093e\u0924\u0947.", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a", "\u0932\u0945\u092a\u091f\u0949\u092a", "\u092a\u0940\u0921\u0940\u090f", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0938\u0930\u094d\u0935", "\u0932\u0945\u092a\u091f\u0949\u092a"));
        this.addQuestion(new Questionsallm("2. \u092e\u0949\u0928\u093f\u091f\u0930\u091a\u094d\u092f\u093e \u0938\u094d\u0915\u094d\u0930\u0940\u0928\u0935\u0930\u0940\u0932 \u090f\u0916\u093e\u0926\u094d\u092f\u093e \u092a\u094d\u0930\u0924\u093f\u092e\u0947\u091a\u094d\u092f\u093e \u0906\u0909\u091f\u092a\u0941\u091f\u0932\u093e \u0928\u0947\u0939\u092e\u0940 ________ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u0938\u0949\u092b\u094d\u091f\u0915\u0949\u092a\u0940", "\u0939\u093e\u0930\u094d\u0921\u0915\u0949\u092a\u0940", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0938\u0930\u094d\u0935", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0928\u093e\u0939\u0940", "\u0938\u0949\u092b\u094d\u091f\u0915\u0949\u092a\u0940"));
        this.addQuestion(new Questionsallm("3. \u0921\u0949\u091f\u092e\u0945\u091f\u094d\u0930\u0940\u0915\u094d\u0938 \u092a\u094d\u0930\u093f\u0902\u091f\u0930 \u0924\u094d\u0930\u093e\u0938\u091c\u0928\u0915 \u0906\u0935\u093e\u091c \u0915\u0930\u0924\u093e\u0924 ?", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0941\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsallm("4. \u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a\u0935\u0930 \u0926\u093f\u0938\u0923\u093e\u0931\u094d\u092f\u093e \u092e\u093e\u0909\u0938 \u092a\u0949\u0907\u0902\u091f\u0930\u0932\u093e ______ \u0939\u0947\u0939\u0940 \u0928\u093e\u0935 \u0906\u0939\u0947.", "\u0915\u0940 \u092a\u0949\u0907\u0902\u091f\u0930", "\u0921\u093f\u0938\u094d\u092a\u094d\u0932\u0947 \u092a\u0949\u0907\u0902\u091f\u0930", "\u092e\u093e\u0909\u0938 \u092a\u0949\u0907\u0902\u091f\u0930", "\u0905\u0945\u0930\u094b \u092a\u0949\u0907\u0902\u091f\u0930", "\u0905\u0945\u0930\u094b \u092a\u0949\u0907\u0902\u091f\u0930"));
        this.addQuestion(new Questionsallm("5. _____ \u0939\u0947 \u0915\u0902\u092e\u094d\u092a\u094b\u0928\u0902\u091f \u0921\u0947\u091f\u093e \u0938\u094d\u091f\u094b\u0905\u0930 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0924\u093e\u0924.", "\u0930\u0945\u092e", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092b\u094d\u0932\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0930\u0945\u092e"));
        this.addQuestion(new Questionsallm("6. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0921\u0947\u091f\u093e \u092a\u094d\u0930\u094b\u0938\u0947\u0938\u093f\u0902\u0917 \u092f\u0941\u0928\u093f\u091f \u0915\u094b\u0923\u0924\u0947 ?", "\u0930\u0945\u092e", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0938\u0940\u092a\u0940\u092f\u0941", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0938\u0940\u092a\u0940\u092f\u0941"));
        this.addQuestion(new Questionsallm("7. ASCII, EBCDIC \u0906\u0923\u093f \u092f\u0941\u0928\u093f\u0915\u094b\u0921 \u0939\u094d\u092f\u093e \u092c\u093e\u092f\u0928\u0930\u0940 \u0915\u094b\u0921\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0906\u0939\u0947\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0941\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsallm("8. _____ \u0939\u0947 \u092e\u0947\u092e\u0930\u0940\u091a\u0947 \u092f\u0941\u0928\u093f\u091f \u0906\u0939\u0947.", "\u0930\u0945\u092e", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0938\u0940\u092a\u0940\u092f\u0941", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0930\u0945\u092e"));
        this.addQuestion(new Questionsallm("9. _____ \u0939\u0947 \u0935\u0947\u092c \u0930\u093f\u0938\u094b\u0930\u094d\u0938\u0928\u093e \u090f\u0915\u094d\u0938\u0947\u0938 \u0909\u092a\u0932\u092c\u094d\u0927 \u0915\u0930\u0923\u093e\u0930\u0947 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0906\u0939\u0947\u0924.", "\u0938\u0930\u094d\u091a \u0907\u0902\u091c\u093f\u0928", "\u092c\u094d\u0930\u093e\u0909\u091c\u0930\u094d\u0938", "\u0935\u0947\u092c \u0938\u093e\u0907\u091f\u0938\u094d", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0928\u093e\u0939\u0940", "\u092c\u094d\u0930\u093e\u0909\u091c\u0930\u094d\u0938"));
        this.addQuestion(new Questionsallm("10. \u0932\u094b\u0915\u092a\u094d\u0930\u093f\u092f \u0905\u0936\u093e \u091a\u0945\u091f \u0938\u0930\u094d\u0935\u093f\u0938\u0932\u093e ______ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0930\u093f\u0915\u094d\u0935\u0947\u0938\u094d\u091f \u091a\u0945\u091f", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0930\u093f\u0932\u0940\u091c \u091a\u0945\u091f", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0930\u093f\u091f\u0930\u094d\u0928 \u091a\u0945\u091f", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0930\u093f\u0932\u0947 \u091a\u0945\u091f", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0930\u093f\u0932\u0947 \u091a\u0945\u091f"));
        this.addQuestion(new Questionsallm("11. _____ \u0939\u0940 \u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923\u093e\u0924 \u092e\u093e\u0939\u093f\u0924\u0940 \u0938\u093e\u0920\u0935\u093f\u0923\u094d\u092f\u093e\u091a\u0940 \u092a\u094d\u0930\u0915\u094d\u0930\u093f\u092f\u093e \u0906\u0939\u0947.", "\u0935\u093e\u091a\u0923\u0947 (Reading)", "\u0932\u093f\u0939\u093f\u0923\u0947 (Writing)", "\u092c\u094b\u0932\u0923\u0947 (Speaking)", "\u0910\u0915\u0923\u0947 (Listening)", "\u0932\u093f\u0939\u093f\u0923\u0947 (Writing)"));
        this.addQuestion(new Questionsallm("12. _____ \u091a\u093e \u0909\u092a\u092f\u094b\u0917 \u0935\u0947\u092c \u092a\u0947\u091c\u0947\u0938 \u092c\u0918\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0939\u094b\u0924\u094b.", "\u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930", "\u0938\u0930\u094d\u091a \u0907\u0902\u091c\u093f\u0928", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0915\u0928\u0947\u0915\u094d\u091f\u093f\u0935\u093f\u091f\u0940", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u090f\u0915\u094d\u0938\u092a\u094d\u0932\u094b\u0930\u0930", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u090f\u0915\u094d\u0938\u092a\u094d\u0932\u094b\u0930\u0930"));
        this.addQuestion(new Questionsallm("13. \u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u090f\u0916\u093e\u0926\u094d\u092f\u093e \u0935\u0947\u092c\u0938\u093e\u0908\u091f\u0932\u093e \u092d\u0947\u091f \u0926\u094d\u092f\u093e\u092f\u091a\u0940 \u0905\u0938\u0924\u0947 \u0924\u0947\u0935\u094d\u0939\u093e \u0924\u0941\u092e\u094d\u0939\u0940 \u0924\u094d\u092f\u093e \u0935\u0947\u092c\u0938\u093e\u0908\u091f\u091a\u093e \u092a\u0924\u094d\u0924\u093e \u0915\u093f\u0902\u0935\u093e \u092f\u0941\u0906\u0930\u090f\u0932 _____ \u092e\u0927\u094d\u092f\u0947 \u091f\u093e\u0907\u092a \u0915\u0930\u0942 \u0936\u0915\u0924\u093e.", "\u091f\u093e\u0938\u094d\u0915 \u092c\u093e\u0930", "\u0935\u093f\u0902\u0921\u094b \u092c\u093e\u0930", "\u090f\u0921\u094d\u0930\u0947\u0938 \u092c\u093e\u0930", "\u0938\u093e\u0907\u0921 \u092c\u093e\u0930", "\u090f\u0921\u094d\u0930\u0947\u0938 \u092c\u093e\u0930"));
        this.addQuestion(new Questionsallm("14. \u0935\u0947\u092c \u092a\u0947\u091c\u092e\u0927\u094d\u092f\u0947 \u0924\u0941\u092e\u091a\u094d\u092f\u093e \u092e\u093e\u0909\u0938\u091a\u093e \u092a\u0949\u0907\u0902\u091f\u0930 \u090f\u0916\u093e\u0926\u094d\u092f\u093e \u0932\u093f\u0902\u0915\u0935\u0930 \u0917\u0947\u0932\u094d\u092f\u093e\u0928\u0902\u0924\u0930 \u092e\u093e\u0909\u0938 \u092a\u0949\u0907\u0902\u091f\u0930\u091a\u0947 \u0930\u0941\u092a\u093e\u0902\u0924\u0930 \u090f\u0915\u093e \u0939\u093e\u0924\u093e\u091a\u094d\u092f\u093e \u091a\u093f\u0928\u094d\u0939\u093e\u092e\u0927\u094d\u092f\u0947 \u0939\u094b\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0941\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsallm("15. _____ \u0939\u0940 \u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093e\u0907\u0921 \u0935\u0947\u092c\u0938\u093e\u0920\u0940 \u0905\u0945\u0928\u093f\u092e\u0947\u0936\u0928 \u0935 \u0917\u0947\u092e\u094d\u0938 \u0932\u093f\u0939\u093f\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0923\u094d\u092f\u093e\u0924 \u092f\u0947\u0923\u093e\u0930\u0940 \u0928\u0935\u0940\u0928 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0932\u0901\u0917\u094d\u0935\u0947\u091c \u0906\u0939\u0947.", "\u091c\u093e\u0935\u093e", "\u0938\u0940", "\u0938\u0940 ++", "\u090f\u091a\u091f\u0940\u090f\u092e\u090f\u0932 (HTML)", "\u091c\u093e\u0935\u093e"));
    }

    public void addQuestion(Questionsallm questionsallm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsallm.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsallm.getANSWER());
        contentValues.put(KEY_OPTA, questionsallm.getOptionA());
        contentValues.put(KEY_OPTB, questionsallm.getOptionB());
        contentValues.put(KEY_OPTC, questionsallm.getOptionC());
        contentValues.put(KEY_OPTD, questionsallm.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsallm> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsallm questionsallm = new Questionsallm();
                questionsallm.setId(cursor.getInt(0));
                questionsallm.setQUESTION(cursor.getString(1));
                questionsallm.setANSWER(cursor.getString(2));
                questionsallm.setOptionA(cursor.getString(3));
                questionsallm.setOptionB(cursor.getString(4));
                questionsallm.setOptionC(cursor.getString(5));
                questionsallm.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsallm);
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

