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
import com.apps.saiinfo.computerobjectivetest.source.Questionsinth;
import java.util.ArrayList;
import java.util.List;

public class Databaceinth
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest43";
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

    public Databaceinth(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsinth("1. \u0908-\u092e\u0947\u0932 \u0938\u0902\u0926\u0947\u0936 \u0915\u0947 \u0924\u0940\u0928 \u092e\u0939\u0924\u094d\u0935\u092a\u0941\u0930\u094d\u0923 \u092d\u093e\u0917 \u0939\u0948 ______", "TCP/IP, \u0921\u094b\u092e\u0947\u0928 \u0914\u0930 ISP", "\u0921\u0947\u0938\u094d\u091f\u093f\u0928\u0947\u0936\u0928 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0914\u0930 \u0938\u0947\u0902\u091f\u0930", "\u0939\u0947\u0921\u0930 \u092e\u0945\u0938\u0947\u091c \u0914\u0930 \u0938\u093f\u0917\u094d\u0928\u0947\u091a\u0930", "\u0939\u0947\u0921\u0930 \u092b\u0941\u091f\u0930 \u0914\u0930 \u092e\u0945\u0938\u0947\u091c", "\u0939\u0947\u0921\u0930 \u092e\u0945\u0938\u0947\u091c \u0914\u0930 \u0938\u093f\u0917\u094d\u0928\u0947\u091a\u0930"));
        this.addQuestion(new Questionsinth("2. \u092f\u0942.\u0906\u0930.\u090f\u0932. (URL) \u092f\u093e\u0928\u093f ________", "\u092f\u0941\u0928\u093f\u0935\u094d\u0939\u0930\u094d\u0938\u0932 \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930", "\u092f\u0941\u0928\u093f\u092b\u0949\u0930\u094d\u092e \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930", "\u092f\u0941\u0928\u093f\u092f\u0928 \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u092f\u0941\u0928\u093f\u092b\u0949\u0930\u094d\u092e \u0930\u093f\u0938\u094b\u0930\u094d\u0938 \u0932\u094b\u0915\u0947\u091f\u0930"));
        this.addQuestion(new Questionsinth("3. http://www.mkcl.org \u091c\u0948\u0938\u093e \u0905\u0945\u0921\u094d\u0930\u0947\u0938 \u091c\u092c \u0906\u092a \u091f\u093e\u0908\u092a \u0915\u0930\u0924\u0947 \u0939\u0948, \u0924\u092c \u0907\u0938\u092e\u0947 .org \u0915\u093e \u0905\u0930\u094d\u0925 \u0915\u094d\u092f\u093e \u0939\u094b\u0924\u093e \u0939\u0948 ?", "\u0913\u0930\u093f\u091c\u0928\u0932 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u0915\u092e\u0930\u094d\u0936\u093f\u092f\u0932 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u0911\u0930\u094d\u0917\u0928\u093e\u092f\u091d\u0947\u0936\u0928 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u090f\u091c\u094d\u092f\u0941\u0915\u0947\u0936\u0928 \u0935\u0947\u092c\u0938\u093e\u0908\u091f", "\u0911\u0930\u094d\u0917\u0928\u093e\u092f\u091d\u0947\u0936\u0928 \u0935\u0947\u092c\u0938\u093e\u0908\u091f"));
        this.addQuestion(new Questionsinth("4. \u0907\u0902\u091f\u0930\u0928\u0947\u091f \u092e\u0947\u0902 www \u092f\u093e\u0928\u093f ________", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093f\u0921\u094d\u0925 \u0935\u0947\u092c", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093e\u0908\u0921 \u0935\u0947\u092c", "\u0935\u093e\u0908\u0921 \u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u0947\u092c", "\u0935\u093e\u0908\u0921 \u0935\u093f\u0921\u094d\u0925 \u0935\u0947\u092c", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093e\u0908\u0921 \u0935\u0947\u092c"));
        this.addQuestion(new Questionsinth("5. .com \u092e\u0947\u0902 \u0915\u093f\u0938 \u092a\u094d\u0930\u0915\u093e\u0930 \u0915\u0940 \u0935\u0947\u092c\u0938\u093e\u0908\u091f \u0915\u093e \u092a\u0924\u093e \u091a\u0932\u0924\u093e \u0939\u0948 ?", "\u0915\u093e\u0930\u094d\u0917\u094b", "\u0915\u0902\u092a\u0928\u0940", "\u0915\u0949\u092e\u094d\u092a\u094d\u0932\u0947\u0915\u094d\u0938", "\u0915\u092e\u0930\u094d\u0936\u093f\u092f\u0932", "\u0915\u092e\u0930\u094d\u0936\u093f\u092f\u0932"));
        this.addQuestion(new Questionsinth("6. \u0935\u0947\u092c \u0938\u094d\u092a\u094d\u0930\u093e\u092f\u0921\u0930\u094d\u0938 \u0914\u0930 \u0915\u094d\u0930\u0949\u0932\u0930\u094d\u0938 \u092f\u0939 _______ \u0915\u0947 \u0909\u0926\u093e\u0939\u0930\u0923 \u0939\u0948 l", "\u092c\u094d\u0930\u093e\u0909\u091c\u0930", "\u0938\u0930\u094d\u091a \u0907\u0902\u091c\u093f\u0928", "\u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e", "\u092b\u094d\u0932\u0947\u092e\u094d\u0938", "\u0938\u0930\u094d\u091a \u0907\u0902\u091c\u093f\u0928"));
        this.addQuestion(new Questionsinth("7. \u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0915\u0947 \u092e\u093e\u0927\u094d\u092f\u092e \u0938\u0947\u0902 \u0926\u0941\u0938\u0930\u0947 \u0935\u094d\u092f\u0915\u094d\u0924\u0940 \u0915\u0947\u092e\u0947\u0932 \u092c\u0949\u0915\u094d\u0938 \u0915\u094b \u0938\u0902\u0926\u0947\u0936 \u092d\u0947\u091c\u0928\u093e \u092f\u093e\u0928\u093f _______", "\u0907 \u092c\u093f\u091d\u0928\u0947\u0938", "\u0907 \u0932\u0947\u091f\u0930\u094d\u0938", "\u0908-\u092e\u0947\u0932", "\u0938\u093e\u092f\u092c\u0930 \u092e\u0947\u0932", "\u0908-\u092e\u0947\u0932"));
        this.addQuestion(new Questionsinth("8. .gov, .edu, .com, .net \u090f\u0915\u094d\u0938\u094d\u091f\u0947\u0928\u094d\u0936\u0928\u094d\u0938 \u0915\u094b ________ \u0915\u0939\u0924\u0947 \u0939\u0948 l", "\u092e\u0947\u0932 \u091f\u0942 \u090f\u0921\u094d\u0930\u0947\u0938", "\u0921\u094b\u092e\u0947\u0928 \u0915\u094b\u0921\u094d\u0938", "\u0908-\u092e\u0947\u0932 \u091f\u093e\u0930\u094d\u0917\u0947\u091f\u094d\u0938", "DNSs", "\u0921\u094b\u092e\u0947\u0928 \u0915\u094b\u0921\u094d\u0938"));
        this.addQuestion(new Questionsinth("9. \u092e\u0947\u0932 \u0907\u0938\u094d\u0924\u0947\u092e\u093e\u0932 \u0915\u0930\u0928\u0947\u0935\u093e\u0932\u0947 \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915 \u0915\u093e \u0907 \u092e\u0947\u0932 \u090f\u0921\u094d\u0930\u0947\u0938 ________ \u0939\u094b\u0924\u093e \u0939\u0948 l", "\u0905\u0932\u0917", "\u090f\u0915 \u091c\u0948\u0938\u093e", "\u0938\u092c\u0915\u093e \u092e\u093f\u0932\u0915\u0947 \u090f\u0915", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u0905\u0932\u0917"));
        this.addQuestion(new Questionsinth("10. \u090d\u092a\u0932\u0947\u091f\u0938\u094d \u092f\u0939 _____ \u0932\u0901\u0917\u094d\u0935\u0947\u091c \u092e\u0947\u0902 \u0932\u093f\u0916\u0947\u0902 \u0917\u090f \u0935\u093f\u0936\u0947\u0937 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0939\u0948 l", "\u091c\u093e\u0935\u093e", "\u090f\u091a\u091f\u0940\u090f\u092e\u090f\u0932 (HTML)", "\u0932\u093f\u0928\u0915\u094d\u0938", "\u090f\u091a\u091f\u0940\u091f\u0940\u092a\u0940 (HTTP)", "\u091c\u093e\u0935\u093e"));
        this.addQuestion(new Questionsinth("11. \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u094c\u0928 \u0938\u093e \u0935\u0947\u092c \u0905\u0945\u0921\u094d\u0930\u0947\u0938 \u0938\u0939\u0940 (Valid) \u0939\u0948 l", "www@bbc@news", "www.bbc.co.in", "www@bbc.co.uk", "wwwbbcuk", "www.bbc.co.in"));
        this.addQuestion(new Questionsinth("12. \u090f\u092b \u091f\u0940 \u092a\u0940 (FTP) \u092f\u093e\u0928\u093f ________", "\u092b\u093f\u0932\u094d\u0921 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091c\u0947\u0915\u094d\u091f", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092b\u0930\u094d\u0938\u094d\u091f \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932"));
        this.addQuestion(new Questionsinth("13. \u0935\u093f\u092d\u093f\u0928\u094d\u0928 \u090f\u092e\u094d\u092a\u094d\u0932\u094b\u092f\u0930\u094d\u0938 \u0915\u094b \u0906\u092a\u0915\u0940 \u092a\u0939\u091a\u093e\u0928 \u0915\u0930\u093e\u0928\u0947 \u0915\u0947 \u0932\u093f\u092f\u0947 _______ \u0906\u092a \u0907\u0938\u094d\u0924\u0947\u092e\u093e\u0932 \u0915\u0930 \u0938\u0915\u0924\u0947 \u0939\u0948 l", "\u092e\u0945\u0915\u0945 \u092b\u0947", "\u0932\u093f\u0902\u0915\u094d\u0921 \u0907\u0928", "\u092f\u093e\u0924\u094d\u0930\u093e", "\u092f\u0947 \u0938\u092d\u0940", "\u0932\u093f\u0902\u0915\u094d\u0921 \u0907\u0928"));
        this.addQuestion(new Questionsinth("14. \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u094c\u0928 \u0938\u093e \u092e\u0947\u0932 \u0905\u0945\u0921\u094d\u0930\u0947\u0938 \u0938\u0939\u0940 (Valid) \u0939\u0948 l", "jeo.bloggs.freemail.com", "jeo.bloggs@freemail.com", "jeo.bloggs@www@freemail.com", "@freemail.com", "jeo.bloggs@freemail.com"));
        this.addQuestion(new Questionsinth("15. \u0907-\u092e\u0947\u0932 \u092f\u093e\u0928\u093f ________", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u0945\u0938\u0947\u091c", "\u0907\u0902\u091f\u0947\u0930\u0928\u0947\u091f \u092e\u0945\u0938\u0947\u091c", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u092e\u0947\u0932", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u0947\u0932", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u0947\u0932"));
    }

    public void addQuestion(Questionsinth questionsinth) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsinth.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsinth.getANSWER());
        contentValues.put(KEY_OPTA, questionsinth.getOptionA());
        contentValues.put(KEY_OPTB, questionsinth.getOptionB());
        contentValues.put(KEY_OPTC, questionsinth.getOptionC());
        contentValues.put(KEY_OPTD, questionsinth.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsinth> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsinth questionsinth = new Questionsinth();
                questionsinth.setId(cursor.getInt(0));
                questionsinth.setQUESTION(cursor.getString(1));
                questionsinth.setANSWER(cursor.getString(2));
                questionsinth.setOptionA(cursor.getString(3));
                questionsinth.setOptionB(cursor.getString(4));
                questionsinth.setOptionC(cursor.getString(5));
                questionsinth.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsinth);
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

