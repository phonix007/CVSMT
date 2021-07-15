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
import com.apps.saiinfo.computerobjectivetest.source.Questionsintm;
import java.util.ArrayList;
import java.util.List;

public class Databaceintm
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest40";
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

    public Databaceintm(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsintm("1. \u0908-\u092e\u0947\u0932 \u0938\u0902\u0926\u0947\u0936\u093e\u091a\u0947 \u0924\u0940\u0928 \u092e\u0939\u0924\u094d\u0935\u093e\u091a\u0947 \u092d\u093e\u0917 \u092e\u094d\u0939\u0923\u091c\u0947 _______", "TCP/IP, \u0921\u094b\u092e\u0947\u0928 \u0935 ISP", "\u0921\u0947\u0938\u094d\u091f\u093f\u0928\u0947\u0936\u0928 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0935 \u0938\u0947\u0902\u091f\u0930", "\u0939\u0947\u0921\u0930 \u092e\u0945\u0938\u0947\u091c \u0935 \u0938\u093f\u0917\u094d\u0928\u0947\u091a\u0930", "\u0939\u0947\u0921\u0930 \u092b\u0941\u091f\u0930 \u0935 \u092e\u0945\u0938\u0947\u091c", "\u0939\u0947\u0921\u0930 \u092e\u0945\u0938\u0947\u091c \u0935 \u0938\u093f\u0917\u094d\u0928\u0947\u091a\u0930"));
        this.addQuestion(new Questionsintm("2. \u092f\u0942.\u0906\u0930.\u090f\u0932. (URL) \u092e\u094d\u0939\u0923\u091c\u0947 ________", "\u092f\u0941\u0928\u093f\u0935\u094d\u0939\u0930\u094d\u0938\u0932 \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930", "\u092f\u0941\u0928\u093f\u092b\u0949\u0930\u094d\u092e \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930", "\u092f\u0941\u0928\u093f\u092f\u0928 \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0928\u093e\u0939\u0940", "\u092f\u0941\u0928\u093f\u092b\u0949\u0930\u094d\u092e \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930"));
        this.addQuestion(new Questionsintm("3. http://www.mkcl.org \u092f\u093e\u0938\u093e\u0930\u0916\u093e \u0905\u0945\u0921\u094d\u0930\u0947\u0938 \u0924\u0941\u092e\u094d\u0939\u0940 \u091f\u093e\u0908\u092a \u0915\u0930\u0924\u093e \u0924\u0947\u0935\u094d\u0939\u093e \u092f\u093e\u092e\u0927\u094d\u092f\u0947 .org \u091a\u093e \u0905\u0930\u094d\u0925 \u0915\u093e\u092f \u0939\u094b\u0924\u094b ?", "\u0913\u0930\u093f\u091c\u0928\u0932 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u0915\u092e\u0930\u094d\u0936\u093f\u092f\u0932 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u0911\u0930\u094d\u0917\u0928\u093e\u092f\u091d\u0947\u0936\u0928 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u090f\u091c\u094d\u092f\u0941\u0915\u0947\u0936\u0928 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u0911\u0930\u094d\u0917\u0928\u093e\u092f\u091d\u0947\u0936\u0928 \u0935\u0947\u092c\u0938\u093e\u0908\u091f"));
        this.addQuestion(new Questionsintm("4. \u0907\u0902\u091f\u0930\u0928\u0947\u091f \u092e\u0927\u094d\u092f\u0947 www \u092e\u094d\u0939\u0923\u091c\u0947 ________", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093f\u0921\u094d\u0925 \u0935\u0947\u092c", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093e\u0908\u0921 \u0935\u0947\u092c", "\u0935\u093e\u0908\u0921 \u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u0947\u092c", "\u0935\u093e\u0908\u0921 \u0935\u093f\u0921\u094d\u0925 \u0935\u0947\u092c", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093e\u0908\u0921 \u0935\u0947\u092c"));
        this.addQuestion(new Questionsintm("5. .com \u092e\u0927\u0941\u0928 \u0915\u0941\u0920\u0932\u094d\u092f\u093e \u092a\u094d\u0930\u0915\u093e\u0930\u091a\u094d\u092f\u093e \u0938\u0902\u0915\u0947\u0924\u0938\u094d\u0925\u0933\u091a\u093e \u092c\u094b\u0927 \u0939\u094b\u0924\u094b.", "\u0915\u093e\u0930\u094d\u0917\u094b", "\u0915\u0902\u092a\u0928\u0940", "\u0915\u0949\u092e\u094d\u092a\u094d\u0932\u0947\u0915\u094d\u0938", "\u0915\u092e\u0930\u094d\u0936\u093f\u092f\u0932", "\u0915\u092e\u0930\u094d\u0936\u093f\u092f\u0932"));
        this.addQuestion(new Questionsintm("6. \u0935\u0947\u092c \u0938\u094d\u092a\u094d\u0930\u093e\u092f\u0921\u0930\u094d\u0938 \u0935 \u0915\u094d\u0930\u0949\u0932\u0930\u094d\u0938 \u0939\u0940 ________ \u092f\u093e\u091a\u0940 \u0909\u0926\u093e\u0939\u0930\u0923\u0947 \u0906\u0939\u0947\u0924.", "\u092c\u094d\u0930\u093e\u0909\u091c\u0930", "\u0938\u0930\u094d\u091a \u0907\u0902\u091c\u093f\u0928", "\u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e", "\u092b\u094d\u0932\u0947\u092e\u094d\u0938", "\u0938\u0930\u094d\u091a \u0907\u0902\u091c\u093f\u0928"));
        this.addQuestion(new Questionsintm("7. \u0907\u0902\u091f\u0930\u0928\u0947\u091f\u091a\u094d\u092f\u093e \u092e\u093e\u0927\u094d\u092f\u092e\u093e\u0924\u0942\u0928 \u0926\u0941\u0938\u0931\u094d\u092f\u093e \u0935\u094d\u092f\u0915\u094d\u0924\u0940\u091a\u094d\u092f\u093e \u092e\u0947\u0932 \u092c\u0949\u0915\u094d\u0938\u0932\u093e \u0938\u0902\u0926\u0947\u0936 \u092a\u093e\u0920\u0935\u0923\u0947 \u092e\u094d\u0939\u0923\u091c\u0947 _______", "\u0907 \u092c\u093f\u091d\u0928\u0947\u0938", "\u0907 \u0932\u0947\u091f\u0930\u094d\u0938", "\u0908-\u092e\u0947\u0932", "\u0938\u093e\u092f\u092c\u0930 \u092e\u0947\u0932", "\u0908-\u092e\u0947\u0932"));
        this.addQuestion(new Questionsintm("8. .gov, .edu, .com, .net \u090f\u0915\u094d\u0938\u094d\u091f\u0947\u0928\u094d\u0936\u0928\u094d\u0938 \u0928\u093e ___________ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u092e\u0947\u0932 \u091f\u0942 \u090f\u0921\u094d\u0930\u0947\u0938", "\u0921\u094b\u092e\u0947\u0928 \u0915\u094b\u0921\u094d\u0938", "\u0908-\u092e\u0947\u0932 \u091f\u093e\u0930\u094d\u0917\u0947\u091f\u094d\u0938", "DNSs", "\u0921\u094b\u092e\u0947\u0928 \u0915\u094b\u0921\u094d\u0938"));
        this.addQuestion(new Questionsintm("9. \u092e\u0947\u0932 \u0935\u093e\u092a\u0930\u0923\u093e\u0930\u0947 \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915\u093e\u091a\u093e \u0907 \u092e\u0947\u0932 \u090f\u0921\u094d\u0930\u0947\u0938 ________ \u0905\u0938\u0924\u094b.", "\u0935\u0947\u0917\u0933\u093e", "\u0938\u093e\u0930\u0916\u093e", "\u0938\u0930\u094d\u0935\u093e\u0902\u0938\u093e\u0920\u0940 \u092e\u093f\u0933\u0942\u0928 \u090f\u0915", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0928\u093e\u0939\u0940", "\u0935\u0947\u0917\u0933\u093e"));
        this.addQuestion(new Questionsintm("10. \u090d\u092a\u0932\u0947\u091f\u0938\u094d \u0939\u0947 _____ \u0932\u0901\u0917\u094d\u0935\u0947\u091c \u092e\u0927\u094d\u092f\u0947 \u0932\u093f\u0939\u093f\u0932\u0947 \u0917\u0947\u0932\u0947\u0932\u0947 \u0935\u093f\u0936\u0947\u0937 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0906\u0939\u0947\u0924.", "\u091c\u093e\u0935\u093e", "\u090f\u091a\u091f\u0940\u090f\u092e\u090f\u0932 (HTML)", "\u0932\u093f\u0928\u0915\u094d\u0938", "\u090f\u091a\u091f\u0940\u091f\u0940\u092a\u0940 (HTTP)", "\u091c\u093e\u0935\u093e"));
        this.addQuestion(new Questionsintm("11. \u0916\u093e\u0932\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u093e \u0935\u0947\u092c \u0905\u0945\u0921\u094d\u0930\u0947\u0938 \u0938\u092c\u0933 (Valid) \u0906\u0939\u0947.", "www@bbc@news", "www.bbc.co.in", "www@bbc.co.uk", "wwwbbcuk", "www.bbc.co.in"));
        this.addQuestion(new Questionsintm("12. \u090f\u092b \u091f\u0940 \u092a\u0940 (FTP) \u092e\u094d\u0939\u0923\u091c\u0947 ________", "\u092b\u093f\u0932\u094d\u0921 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091c\u0947\u0915\u094d\u091f", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092b\u0930\u094d\u0938\u094d\u091f \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932"));
        this.addQuestion(new Questionsintm("13. \u0935\u093f\u0935\u093f\u0927 \u090f\u092e\u094d\u092a\u094d\u0932\u094b\u092f\u0930\u094d\u0938\u0928\u093e \u0924\u0941\u092e\u091a\u0940 \u0913\u0933\u0916 \u0915\u0930\u0942\u0928 \u0926\u0947\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 ________ \u0924\u0941\u092e\u094d\u0939\u0940 \u0935\u093e\u092a\u0930\u0942 \u0936\u0915\u0924\u093e.", "\u092e\u0945\u0915\u0945 \u092b\u0947", "\u0932\u093f\u0902\u0915\u094d\u0921 \u0907\u0928", "\u092f\u093e\u0924\u094d\u0930\u093e", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0938\u0930\u094d\u0935", "\u0932\u093f\u0902\u0915\u094d\u0921 \u0907\u0928"));
        this.addQuestion(new Questionsintm("14. \u0916\u093e\u0932\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u093e \u092e\u0947\u0932 \u0905\u0945\u0921\u094d\u0930\u0947\u0938 \u0938\u092c\u0933 (Valid) \u0906\u0939\u0947.", "jeo.bloggs.freemail.com", "jeo.bloggs@freemail.com", "jeo.bloggs@www@freemail.com", "@freemail.com", "jeo.bloggs@freemail.com"));
        this.addQuestion(new Questionsintm("15. \u0907-\u092e\u0947\u0932 \u092e\u094d\u0939\u0923\u091c\u0947 ________", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u0945\u0938\u0947\u091c", "\u0907\u0902\u091f\u0947\u0930\u0928\u0947\u091f \u092e\u0945\u0938\u0947\u091c", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u092e\u0947\u0932", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u0947\u0932", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u0947\u0932"));
    }

    public void addQuestion(Questionsintm questionsintm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsintm.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsintm.getANSWER());
        contentValues.put(KEY_OPTA, questionsintm.getOptionA());
        contentValues.put(KEY_OPTB, questionsintm.getOptionB());
        contentValues.put(KEY_OPTC, questionsintm.getOptionC());
        contentValues.put(KEY_OPTD, questionsintm.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsintm> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsintm questionsintm = new Questionsintm();
                questionsintm.setId(cursor.getInt(0));
                questionsintm.setQUESTION(cursor.getString(1));
                questionsintm.setANSWER(cursor.getString(2));
                questionsintm.setOptionA(cursor.getString(3));
                questionsintm.setOptionB(cursor.getString(4));
                questionsintm.setOptionC(cursor.getString(5));
                questionsintm.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsintm);
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

