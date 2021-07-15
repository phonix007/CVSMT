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
import com.apps.saiinfo.computerobjectivetest.source.Questionshunit;
import java.util.ArrayList;
import java.util.List;

public class Databacehunit
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest36";
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

    public Databacehunit(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionshunit("1. ____ \u0939\u092e\u093e\u0930\u0940 \u0906\u0935\u093e\u091c \u0938\u0947 \u0928\u093f\u0930\u094d\u092e\u093f\u0924 \u0938\u093f\u0917\u094d\u0930\u0932 \u0915\u093e \u092a\u094d\u0930\u0915\u093e\u0930 \u0939\u0948\u0902 l", "\u092c\u093e\u092f\u0928\u0930\u0940", "\u0921\u093f\u091c\u093f\u091f\u0932", "\u0905\u0945\u0928\u093e\u0932\u0949\u0917", "\u0939\u093e\u092f\u092c\u094d\u0930\u0940\u0921", "\u0905\u0945\u0928\u093e\u0932\u0949\u0917"));
        this.addQuestion(new Questionshunit("2. \u0928\u0940\u091a\u0947 \u0926\u0940 \u0917\u0908 \u0907\u092e\u0947\u091c \u0915\u094d\u0930.1 \u0926\u0947\u0916\u0947\u0902 l \u0926\u093f\u090f \u0917\u090f \u091a\u093f\u0924\u094d\u0930 \u0915\u093e \u0928\u093e\u092e \u092a\u0939\u091a\u093e\u0928\u0947\u0902 l", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0921\u093f.\u0935\u094d\u0939\u0940.\u0921\u0940. \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939", "\u092e\u0926\u0930\u092c\u094b\u0930\u094d\u0921", "\u0930\u0945\u092e", "\u092e\u0926\u0930\u092c\u094b\u0930\u094d\u0921"));
        this.addQuestion(new Questionshunit("3. \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947 \u0915\u094c\u0928\u0938\u093e \u0915\u093e\u092e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u0926\u094d\u0935\u093e\u0930\u093e \u0928\u0939\u0940 \u0915\u093f\u092f\u093e \u091c\u093e\u0924\u093e?", "\u0907\u0928\u092a\u0941\u091f\u093f\u0902\u0917", "\u0915\u0902\u091f\u094d\u0930\u094b\u0932\u093f\u0902\u0917", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u093f\u0902\u0917", "\u0938\u092e\u091d\u0928\u093e", "\u0938\u092e\u091d\u0928\u093e"));
        this.addQuestion(new Questionshunit("4. ____ \u0907\u0938\u0947 \u091b\u094b\u0921, \u092c\u093e\u0915\u0940 \u0938\u092d\u0940 \u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0915\u0947 \u092a\u094d\u0930\u0915\u093e\u0930 \u0939\u0948\u0902 l", "\u091f\u0945\u092c\u094d\u0932\u0947\u091f", "\u0932\u0945\u092a\u091f\u0949\u092a", "\u092a\u094d\u0930\u093e\u092f\u092e\u0930\u0940 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938", "\u092a\u094d\u0930\u093e\u092f\u092e\u0930\u0940 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938"));
        this.addQuestion(new Questionshunit("5. \u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0938\u0947\u0915\u0902\u0926, \u0928\u0945\u0928\u094b\u0938\u0947\u0915\u0902\u0926, \u0914\u0930 \u092a\u093f\u0915\u094b\u0938\u0947\u0915\u0902\u0926 \u092f\u0939 \u092a\u094d\u0930\u093f\u0902\u091f\u0947\u0921 \u0906\u0909\u091f\u092a\u0941\u091f \u0915\u093e \u092e\u093e\u092a\u0928 \u0915\u0930\u0928\u0947 \u0915\u0940 \u0907\u0915\u093e\u0907\u092f\u093e\u0902 \u0939\u0948\u0902 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0917\u0932\u0924"));
        this.addQuestion(new Questionshunit("6. \u0928\u0940\u091a\u0947 \u0926\u0940 \u0917\u0908 \u0907\u092e\u0947\u091c \u0915\u094d\u0930.2 \u0926\u0947\u0916\u0947\u0902 l \u0926\u093f\u090f \u0917\u090f \u091a\u093f\u0924\u094d\u0930 \u0915\u093e \u0928\u093e\u092e \u092a\u0939\u091a\u093e\u0928\u0947\u0902 l", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092a\u094d\u0930\u093f\u0902\u091f\u0930", "\u092e\u0949\u0928\u093f\u091f\u0930", "\u0938\u0947\u0902\u091f\u094d\u0930\u0932 \u092a\u094d\u0930\u094b\u0938\u0947\u0938\u093f\u0902\u0917 \u092f\u0941\u0928\u093f\u091f", "\u0938\u0947\u0902\u091f\u094d\u0930\u0932 \u092a\u094d\u0930\u094b\u0938\u0947\u0938\u093f\u0902\u0917 \u092f\u0941\u0928\u093f\u091f"));
        this.addQuestion(new Questionshunit("7. \u0907\u0938 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938 \u092e\u0947\u0902, \u0907\u0928\u092a\u0941\u091f \u0914\u0930 \u0906\u0909\u091f\u092a\u0941\u091f \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938\u0947\u0938 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f \u0915\u0947 \u092c\u093e\u0939\u0930 \u0938\u094d\u0925\u093f\u0924 \u0939\u094b\u0924\u0947 \u0939\u0948\u0902 l", "\u0938\u094d\u092e\u093e\u0930\u094d\u091f\u092b\u094b\u0928\u094d\u0938", "\u0932\u0945\u092a\u091f\u0949\u092a \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938", "\u092a\u0930\u094d\u0938\u0928\u0932 \u0921\u093f\u091c\u093f\u091f\u0932 \u0905\u0938\u093f\u0938\u094d\u091f\u0902\u091f", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938"));
        this.addQuestion(new Questionshunit("8. \u0930\u0945\u092e \u092f\u0939 \u0905\u0932\u094d\u092a\u0915\u093e\u0932\u093f\u0915 \u0924\u0925\u093e \u0905\u0938\u094d\u0925\u093f\u0930 \u0938\u094d\u0935\u0930\u0942\u092a \u0915\u093e \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u092e\u093e\u0928\u093e \u091c\u093e\u0924\u093e \u0939\u0948\u0902 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionshunit("9. ____ \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092e\u0947\u0902 \u0938\u093f\u0930\u094d\u092b \u0926\u094b \u0905\u0902\u0915 \u0936\u093e\u092e\u093f\u0932 \u0939\u094b\u0924\u0947 \u0939\u0948\u0902, 0 \u0914\u0930 1", "\u0921\u0947\u0938\u093f\u092e\u0932", "\u092c\u093e\u092f\u0928\u0930\u0940", "\u0905\u0945\u0928\u093e\u0932\u0949\u0917", "\u0939\u093e\u092f\u092c\u094d\u0930\u0940\u0921", "\u092c\u093e\u092f\u0928\u0930\u0940"));
        this.addQuestion(new Questionshunit("10. \u0928\u0940\u091a\u0947 \u0926\u0940 \u0917\u0908 \u0907\u092e\u0947\u091c \u0915\u094d\u0930.3 \u0926\u0947\u0916\u0947\u0902 l \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947 \u0915\u094c\u0928 \u0938\u093e \u092a\u094b\u0930\u094d\u091f \u091b\u0935\u093f \u092e\u0947\u0902 \u0926\u093f\u0916\u093e\u092f\u093e \u0917\u092f\u093e \u0939\u0948\u0902 l", "\u092b\u093e\u092f\u0930\u0935\u093e\u092f\u0930", "\u092f\u0941\u090f\u0938\u092c\u0940", "\u090f\u092e\u0906\u092f\u0921\u0940\u0906\u092f MIDI", "\u090f\u091a\u0921\u0940\u090f\u092e\u0906\u092f HDMI", "\u092f\u0941\u090f\u0938\u092c\u0940"));
        this.addQuestion(new Questionshunit("11. \u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938 \u092e\u0947\u0902 \u092a\u093e\u0935\u0930 \u0938\u092a\u094d\u0932\u093e\u092f \u092f\u0941\u0928\u093f\u091f \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f \u0915\u0947 \u0905\u0902\u0926\u0930 \u0939\u094b\u0924\u093e \u0939\u0948\u0902 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionshunit("12. \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u092e\u0947\u0902 \u0938\u0947\u0902 _____ \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0915\u093e \u0915\u093e\u0930\u094d\u092f \u0928\u093f\u092f\u0902\u0924\u094d\u0930\u093f\u0924 \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0909\u092a\u092f\u094b\u0917 \u092e\u0947\u0902 \u0932\u093e\u092f\u093e \u091c\u093e\u0924\u093e \u0939\u0948\u0902 l", "\u092e\u093e\u0909\u0938", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930", "\u0905\u0915\u094d\u0938\u0947\u0938\u0930\u0940\u091c", "\u0939\u0947\u0921\u092b\u094b\u0928", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930"));
        this.addQuestion(new Questionshunit("13. \u0907\u0938 \u092a\u094d\u0930\u0915\u093e\u0930 \u0915\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u090f\u0915 \u092a\u0924\u0932\u0947 \u0938\u094d\u0932\u0945\u092c \u091c\u0948\u0938\u093e \u091c\u094b \u0932\u0917\u092d\u0917 \u092e\u0949\u0928\u093f\u091f\u0930\u0939\u0940 \u0939\u094b\u0924\u093e \u0939\u0948, \u091c\u093f\u0938\u092e\u0947\u0902 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f \u092e\u0949\u0928\u093f\u091f\u0930 \u0915\u0947 \u092a\u0940\u091b\u0947 \u0938\u094d\u0925\u093f\u0924 \u0939\u094b\u0924\u093e \u0939\u0948\u0902 l", "\u091f\u0945\u092c\u094d\u0932\u0947\u091f", "\u0932\u0945\u092a\u091f\u0949\u092a", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a", "\u0938\u0941\u092a\u0930 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930", "\u091f\u0945\u092c\u094d\u0932\u0947\u091f"));
        this.addQuestion(new Questionshunit("14. \u0928\u0940\u091a\u0947 \u0926\u0940 \u0917\u0908 \u0907\u092e\u0947\u091c \u0915\u094d\u0930.4 \u0926\u0947\u0916\u0947\u0902l  \u0907\u0938 \u092d\u093e\u0917 \u092e\u0947\u0902 \u0938\u094d\u091f\u094b\u0905\u0930 \u0915\u093f\u092f\u093e \u0917\u092f\u093e \u0921\u0947\u091f\u093e \u091c\u092c \u0924\u0915 \u092a\u093e\u0935\u0930 \u0911\u0928 \u0930\u0939\u0924\u093e \u0939\u0948 \u0924\u092c \u0924\u0915 \u0939\u0940 \u0909\u092a\u0932\u092c\u094d\u0927 \u0930\u0939\u0924\u093e \u0939\u0948\u0902 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionshunit("15. ____ \u091c\u094b \u0939\u0945\u0928\u094d\u0921\u0939\u0947\u0932\u094d\u0921 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938 \u0915\u0947 \u0928\u093e\u092e \u0938\u0947 \u092d\u0940 \u091c\u093e\u0928\u0947 \u091c\u093e\u0924\u0947 \u0939\u0948, \u0906\u0915\u093e\u0930 \u092e\u0947\u0902 \u0938\u092c\u0938\u0947 \u091b\u094b\u091f\u0947 \u0939\u094b\u0924\u0947 \u0939\u0948, \u0914\u0930 \u091c\u093f\u0928\u0915\u0940 \u0930\u091a\u0928\u093e \u090f\u0915 \u0939\u093e\u0925 \u0915\u0940 \u0939\u0925\u0947\u0932\u0940 \u092a\u0930 \u0906\u0930\u093e\u092e \u0938\u0947\u0902 \u0930\u0916 \u092a\u093e\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0915\u0940 \u0917\u0908 \u0939\u0948\u0902 |", "\u0932\u0945\u092a\u091f\u0949\u092a", "\u0938\u094d\u092e\u093e\u0930\u094d\u091f\u092b\u094b\u0928\u094d\u0938", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938", "\u092e\u0949\u0928\u093f\u091f\u0930", "\u0938\u094d\u092e\u093e\u0930\u094d\u091f\u092b\u094b\u0928\u094d\u0938"));
    }

    public void addQuestion(Questionshunit questionshunit) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionshunit.getQUESTION());
        contentValues.put(KEY_ANSWER, questionshunit.getANSWER());
        contentValues.put(KEY_OPTA, questionshunit.getOptionA());
        contentValues.put(KEY_OPTB, questionshunit.getOptionB());
        contentValues.put(KEY_OPTC, questionshunit.getOptionC());
        contentValues.put(KEY_OPTD, questionshunit.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionshunit> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionshunit questionshunit = new Questionshunit();
                questionshunit.setId(cursor.getInt(0));
                questionshunit.setQUESTION(cursor.getString(1));
                questionshunit.setANSWER(cursor.getString(2));
                questionshunit.setOptionA(cursor.getString(3));
                questionshunit.setOptionB(cursor.getString(4));
                questionshunit.setOptionC(cursor.getString(5));
                questionshunit.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionshunit);
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
