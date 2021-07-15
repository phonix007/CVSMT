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
import com.apps.saiinfo.computerobjectivetest.source.Questionssh;
import java.util.ArrayList;
import java.util.List;

public class Databacesh
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest16";
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

    public Databacesh(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssh("1. ____ \u092f\u0939 \u090f\u0915 \u0938\u092e\u0915\u0947\u0902\u0926\u094d\u0930\u0940 \u0935\u0932\u092f \u0939\u094b\u0924\u093e \u0939\u0948 l", "\u0938\u0947\u0915\u094d\u091f\u0930", "\u091f\u094d\u0930\u0945\u0915", "\u0935\u0930\u094d\u0924\u0941\u0933", "\u0930\u093e\u0909\u0902\u0921", "\u091f\u094d\u0930\u0945\u0915"));
        this.addQuestion(new Questionssh("2. _____ \u092f\u0939 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u092e\u0947\u092e\u0930\u0940 \u0915\u0947 \u090f\u0915\u0915 \u0939\u0948 l", "\u0915\u093f\u0932\u094b\u0917\u094d\u0930\u0945\u092e", "\u092e\u0940\u091f\u0930", "\u0915\u093f\u0932\u094b\u092c\u093e\u0908\u091f\u094d\u0938", "\u0938\u0947\u0932\u094d\u0938\u093f\u0905\u0938", "\u0915\u093f\u0932\u094b\u092c\u093e\u0908\u091f\u094d\u0938"));
        this.addQuestion(new Questionssh("3. \u0928\u093f\u092e\u094d\u0928\u0932\u093f\u0916\u093f\u0924 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u094c\u0928 \u0938\u093e \u0909\u092a\u0915\u0930\u0923 \u090f\u0915 \u092a\u094b\u0930\u094d\u091f\u0947\u092c\u0932 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0928\u0939\u0940 \u0939\u0948?", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092b\u094d\u0932\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0930\u0945\u092e \u091a\u093f\u092a\u094d\u0938", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915"));
        this.addQuestion(new Questionssh("4. \u0938\u0940.\u0921\u0940. \u0906\u0930 \u0921\u092c\u094d\u0932\u094d\u092f\u0942. CD-RW \u092f\u093e\u0928\u093f _______", "\u0938\u0940.\u0921\u0940. \u0930\u0947\u0915\u0949\u0930\u094d\u0921\u0947\u092c\u0932", "\u0938\u0940.\u0921\u0940. \u0930\u093f\u0938\u093f\u0935\u094d\u0939\u0930", "\u0938\u0940.\u0921\u0940. \u0930\u0928\u0930", "\u0938\u0940.\u0921\u0940. \u0930\u093f\u0930\u093e\u092f\u091f\u0947\u092c\u0932", "\u0938\u0940.\u0921\u0940. \u0930\u093f\u0930\u093e\u092f\u091f\u0947\u092c\u0932"));
        this.addQuestion(new Questionssh("5. \u092a\u094d\u0930\u093e\u092f\u092e\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0935\u094d\u0939\u094b\u0932\u0945\u091f\u093e\u0907\u0932 \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssh("6. \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915 \u091f\u094d\u0930\u0945\u0915 ________ \u0928\u093e\u092e \u0915\u0947 \u0917\u094b\u0932\u093e\u0915\u093e\u0930 \u0906\u0915\u093e\u0930\u094b \u0915\u0947 \u091f\u0941\u0915\u0921\u094b \u092e\u0947\u0902 \u0935\u093f\u092d\u093e\u091c\u093f\u0924 \u0939\u094b\u0924\u093e \u0939\u0948 l", "\u0930\u093e\u0909\u0902\u0921", "\u091f\u094d\u0930\u0945\u0915", "\u0938\u0947\u0915\u094d\u091f\u0930", "\u0917\u094b\u0932\u093e\u0915\u093e\u0930", "\u0938\u0947\u0915\u094d\u091f\u0930"));
        this.addQuestion(new Questionssh("7. \u092c\u093e\u092f\u0928\u0930\u0940 \u0928\u0902\u092c\u0930\u093f\u0902\u0917 \u092e\u0947\u0902 0 \u0914\u0930 1 \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915 \u0915\u094b \u090f\u0915 \u092c\u093f\u091f \u0915\u0939\u093e \u091c\u093e\u0924\u093e \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssh("8. _____ \u092c\u093f\u091f\u094d\u0938 \u092e\u093f\u0932 \u0915\u0947 \u090f\u0915 \u092c\u093e\u0908\u091f \u092c\u0928\u0924\u093e \u0939\u0948 l", "\u091a\u093e\u0930", "\u091b\u0939", "\u0906\u0920", "\u092c\u093e\u0930\u0939", "\u0906\u0920"));
        this.addQuestion(new Questionssh("9. \u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0928\u0949\u0928\u0935\u094d\u0939\u094b\u0932\u0945\u091f\u093e\u0907\u0932 \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssh("10. _____ \u092f\u0939 \u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923 \u0938\u0947 \u091c\u093e\u0928\u0915\u093e\u0930\u0940 \u090f\u0915\u094d\u0938\u0947\u0938 \u0915\u0930\u0928\u0947 \u0915\u0940 \u092a\u094d\u0930\u0915\u094d\u0930\u093f\u092f\u093e \u0939\u0948 l", "\u0932\u093f\u0916\u0928\u093e (Writing)", "\u0938\u0941\u0928\u0928\u093e (Listening)", "\u092a\u0922\u0928\u093e (Reading)", "\u092c\u094b\u0932\u0928\u093e (Speaking)", "\u092a\u0922\u0928\u093e (Reading)"));
        this.addQuestion(new Questionssh("11. \u0915\u093f\u0938\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u092f\u0941\u0928\u093f\u091f \u0915\u0940 \u0915\u094d\u0937\u092e\u0924\u093e \u0938\u093e\u0927\u093e\u0930\u0923\u0924: \u092c\u093e\u0908\u091f\u094d\u0938 \u092e\u0947\u0902 \u092e\u093e\u092a\u0940 \u091c\u093e\u0924\u0940 \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssh("12. \u0938\u0940.\u0921\u0940. \u0930\u0949\u092e CD-ROM \u092f\u093e\u0928\u093f ______", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0935\u0928\u094d\u0938 \u092e\u0947\u092e\u0930\u0940", "\u0938\u0947\u0928\u094d\u091f\u094d\u0930\u0932 \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940", "\u0915\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915 \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940 \u092e\u0947\u092e\u0930\u0940"));
        this.addQuestion(new Questionssh("13. ____ \u0907\u0938 \u092a\u094d\u0930\u0915\u093e\u0930 \u0915\u0947 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923 \u092e\u0947\u0902 \u0939\u093f\u0932\u0928\u0947\u0935\u093e\u0932\u0947 \u092d\u093e\u0917 \u0928\u0939\u0940 \u0939\u094b\u0924\u0947?", "\u092b\u094d\u0932\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0938\u0949\u0932\u093f\u0921 \u0938\u094d\u091f\u0947\u091f", "\u0938\u0949\u0932\u093f\u0921 \u0938\u094d\u091f\u0947\u091f"));
        this.addQuestion(new Questionssh("14. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u092a\u0930 \u0927\u094d\u0935\u0928\u0940 \u091a\u0932\u093e\u0928\u0947 \u0914\u0930 \u0909\u0938\u0947 \u0938\u0941\u0928\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0906\u092a\u0915\u094b ______ \u0915\u0940 \u0906\u0935\u0936\u094d\u092f\u0915\u0924\u093e \u0939\u094b\u0924\u0940 \u0939\u0948 l", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092b\u094b\u0928", "\u0938\u093e\u0909\u0902\u0921\u0915\u093e\u0930\u094d\u0921 \u0914\u0930 \u0938\u094d\u092a\u093f\u0915\u0930\u094d\u0938", "\u092a\u094d\u0930\u093f\u0902\u091f\u0930", "\u0938\u094d\u0915\u0945\u0928\u0930", "\u0938\u093e\u0909\u0902\u0921\u0915\u093e\u0930\u094d\u0921 \u0914\u0930 \u0938\u094d\u092a\u093f\u0915\u0930\u094d\u0938"));
        this.addQuestion(new Questionssh("15. \u0921\u093f\u091c\u093f\u091f\u0932 \u0938\u093f\u0938\u094d\u091f\u0940\u092e \u092e\u0947\u0902 \u0938\u0947\u0902 \u0938\u092c\u0938\u0947 \u091b\u094b\u091f\u093e \u092f\u0941\u0928\u093f\u091f \u092f\u093e\u0928\u093f ______", "\u091f\u0947\u0915\u094d\u0938\u094d\u091f", "\u0915\u0945\u0930\u0945\u0915\u094d\u091f\u0930", "\u092c\u093f\u091f", "\u092e\u0947\u0917\u093e \u092c\u093e\u0907\u091f", "\u092c\u093f\u091f"));
    }

    public void addQuestion(Questionssh questionssh) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssh.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssh.getANSWER());
        contentValues.put(KEY_OPTA, questionssh.getOptionA());
        contentValues.put(KEY_OPTB, questionssh.getOptionB());
        contentValues.put(KEY_OPTC, questionssh.getOptionC());
        contentValues.put(KEY_OPTD, questionssh.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssh> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssh questionssh = new Questionssh();
                questionssh.setId(cursor.getInt(0));
                questionssh.setQUESTION(cursor.getString(1));
                questionssh.setANSWER(cursor.getString(2));
                questionssh.setOptionA(cursor.getString(3));
                questionssh.setOptionB(cursor.getString(4));
                questionssh.setOptionC(cursor.getString(5));
                questionssh.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssh);
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

