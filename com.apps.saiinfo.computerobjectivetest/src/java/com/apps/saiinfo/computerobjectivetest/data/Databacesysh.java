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
 *  com.apps.saiinfo.computerobjectivetest.source.Questionssysh
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
import com.apps.saiinfo.computerobjectivetest.source.Questionssysh;
import java.util.ArrayList;
import java.util.List;

public class Databacesysh
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest34";
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

    public Databacesysh(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssysh("1. \u091c\u0940 \u092f\u0941 \u0906\u092f (GUI) \u092f\u093e\u0928\u093f _______", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u0947\u0938\u094d\u091f", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u092f\u0941\u0928\u093f\u092f\u0928 \u0907\u0902\u091f\u0930\u092b\u0947\u0938", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u092b\u0947\u0938", "\u0917\u094d\u0930\u0947\u091f\u0930 \u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u092b\u0947\u0938", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u092b\u0947\u0938"));
        this.addQuestion(new Questionssysh("2. ____ \u092f\u0939 \u0906\u092e\u0924\u094c\u0930 \u092a\u0930 \u0907\u0938\u094d\u0924\u0947\u092e\u093e\u0932 \u0915\u0940 \u091c\u093e\u0928\u0947\u0935\u093e\u0932\u0940 \u0905\u0945\u092a\u094d\u0932\u093f\u0915\u0947\u0936\u0928\u094d\u0938 \u0926\u0930\u094d\u0936\u093e\u0928\u0947\u0935\u093e\u0932\u0947 \u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u0911\u092c\u094d\u091c\u0947\u0915\u094d\u091f\u0938\u094d \u0939\u0948 l", "\u0906\u092f\u0915\u0949\u0928\u094d\u0938", "\u091c\u0940\u092f\u0941\u0906\u092f", "\u0921\u094d\u0930\u093e\u092f\u0935\u094d\u0939\u0930\u094d\u0938", "\u0935\u093f\u0902\u0921\u094b\u091c \u090f\u0928\u091f\u0940", "\u0906\u092f\u0915\u0949\u0928\u094d\u0938"));
        this.addQuestion(new Questionssysh("3. ______ \u092f\u0939 \u0921\u0947\u091f\u093e \u0914\u0930 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0938\u094d\u091f\u094b\u0905\u0930 \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0907\u0938\u094d\u0924\u0947\u092e\u093e\u0932 \u0939\u094b\u0924\u0947 \u0939\u0948 l", "\u092b\u094b\u0932\u094d\u0921\u0930", "\u092b\u093e\u0908\u0932", "\u0930\u093f\u0938\u093e\u092f\u0915\u0932 \u092c\u0940\u0928", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u092b\u093e\u0908\u0932"));
        this.addQuestion(new Questionssysh("4. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0936\u0941\u0930\u0942 \u0915\u0930\u0928\u093e \u092f\u093e \u092b\u093f\u0930 \u0938\u0947 \u0936\u0941\u0930\u0942 \u0915\u0930\u0928\u093e \u0907\u0938\u0947 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0915\u093e ________ \u0915\u0930\u0928\u093e \u0915\u0939\u0924\u0947 \u0939\u0948 l", "\u092c\u0941\u091f\u093f\u0902\u0917", "\u0915\u0949\u092a\u093f\u0902\u0917", "\u092a\u0947\u0938\u094d\u091f\u093f\u0902\u0917", "\u092e\u0932\u094d\u091f\u093f\u091f\u093e\u0938\u094d\u0915\u093f\u0902\u0917", "\u092c\u0941\u091f\u093f\u0902\u0917"));
        this.addQuestion(new Questionssysh("5. \u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930 \u0915\u094b \u0939\u092e\u0947\u0936\u093e \u0938\u0940.\u092a\u0940.\u092f\u0941. \u0915\u0939\u0924\u0947 \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssysh("6. _____ \u0915\u094b \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0915\u0945\u092c\u093f\u0928\u0947\u091f \u092f\u093e \u091a\u0949\u0938\u0940 \u092d\u0940 \u0915\u0939\u093e \u091c\u093e\u0924\u093e \u0939\u0948 l", "\u092e\u0949\u0928\u093f\u091f\u0930", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f"));
        this.addQuestion(new Questionssysh("7. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0938\u0930\u094d\u0935\u0938\u093e\u092e\u093e\u0928\u094d\u092f \u0915\u0940\u092c\u094b\u0930\u094d\u0921 \u0915\u093e \u092e\u0941\u0932\u092d\u0942\u0924 \u0915\u093e\u0930\u094d\u092f \u092a\u093f\u092f\u093e\u0928\u094b \u091c\u0948\u0938\u0947 \u0938\u0902\u0917\u0940\u0924 \u092c\u091c\u093e\u0928\u093e \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0917\u0932\u0924"));
        this.addQuestion(new Questionssysh("8. \u0935\u093f\u0902\u0921\u094b\u091c \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092e\u0947\u0902 \u0938\u094d\u0915\u094d\u0930\u0940\u0928 \u0915\u0947 \u0915\u093f\u0938\u0940 \u092d\u0940 \u0939\u093f\u0938\u094d\u0938\u0947 \u0924\u0915 \u0906\u0938\u093e\u0928\u0940 \u0938\u0947 \u092a\u0939\u0942\u0901\u091a\u0928\u0947 \u092e\u0947\u0902 ____ \u0915\u093e \u092a\u094d\u0930\u092f\u094b\u0917 \u0939\u094b\u0924\u093e \u0939\u0948 l", "\u092e\u093e\u0909\u0938", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u091c\u0949\u092f\u0938\u094d\u091f\u093f\u0915", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u092e\u093e\u0909\u0938"));
        this.addQuestion(new Questionssysh("9. _____ \u092f\u0939 \u090f\u0915 \u092c\u093e\u0930 \u092e\u0947\u0902 \u090f\u0915 \u0938\u0947\u0902 \u0905\u0927\u093f\u0915 \u0905\u0945\u092a\u094d\u0932\u093f\u0915\u0947\u0936\u0928 \u091a\u0932\u093e\u0928\u0947 \u0915\u0940 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0915\u0940 \u0915\u094d\u0937\u092e\u0924\u093e \u0939\u0948 l", "\u092c\u0941\u091f\u093f\u0902\u0917", "\u0915\u0949\u092a\u093f\u0902\u0917", "\u092a\u0947\u0938\u094d\u091f\u093f\u0902\u0917", "\u092e\u0932\u094d\u091f\u093f\u091f\u093e\u0938\u094d\u0915\u093f\u0902\u0917", "\u092e\u0932\u094d\u091f\u093f\u091f\u093e\u0938\u094d\u0915\u093f\u0902\u0917"));
        this.addQuestion(new Questionssysh("10. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0915\u0940 \u0907\u0902\u091f\u0930\u094d\u0928\u0932 \u092e\u0947\u092e\u0930\u0940 \u091a\u093f\u092a\u094d\u0938 \u0915\u0947 \u0938\u094d\u0935\u0930\u0941\u092a \u092e\u0947\u0902 \u092e\u0926\u0930\u092c\u094b\u0930\u094d\u0921\u092a\u0930 \u0939\u094b\u0924\u0940 \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssysh("11. \u091a\u0940\u0928\u0940 \u0914\u0930 \u091c\u092a\u093e\u0928\u0940 \u091c\u0948\u0938\u0947 \u0906\u0902\u0924\u0930\u0930\u093e\u0937\u094d\u091f\u094d\u0930\u0940\u092f \u092d\u093e\u0937\u093e\u0902\u0913\u0902 \u0915\u0947 \u0932\u093f\u090f \u0924\u0948\u092f\u093e\u0930 \u0915\u093f\u092f\u093e \u0917\u092f\u093e 16 \u092c\u0940\u091f \u0915\u094b\u0921 \u092f\u093e\u0928\u093f ______", "ASCII", "EBCDIC", "\u092f\u0941\u0928\u093f\u0915\u094b\u0921", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u092f\u0941\u0928\u093f\u0915\u094b\u0921"));
        this.addQuestion(new Questionssysh("12. \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923 \u092f\u0939 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u092e\u093f\u0921\u093f\u092f\u093e \u0938\u0947 \u0921\u0947\u091f\u093e \u0914\u0930 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e \u0930\u093f\u0921 \u0915\u0930\u0928\u0947\u0935\u093e\u0932\u0947 \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssysh("13. \u092c\u0901\u0915 \u092e\u0947\u0902 \u091a\u0947\u0915 \u0938\u0947\u0902 \u0921\u0947\u091f\u093e \u0930\u0940\u0921 \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u090f\u092e\u0906\u092f\u0906\u0930\u0938\u0940 \u0915\u093e \u0909\u092a\u092f\u094b\u0917 \u0939\u094b \u0938\u0915\u0924\u093e \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionssysh("14. \u0930\u0949\u092e, \u0930\u0945\u092e, \u0938\u0940\u092a\u0940\u092f\u0942 \u092f\u0939 \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u093f\u0938\u092e\u0947\u0902 \u0939\u094b\u0924\u0947 \u0939\u0948 l", "\u090f\u090f\u0932\u092f\u0941", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092e\u0926\u0930\u092c\u094b\u0930\u094d\u0921", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915", "\u092e\u0926\u0930\u092c\u094b\u0930\u094d\u0921"));
        this.addQuestion(new Questionssysh("15. \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u094c\u0928 \u0938\u0940 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0928\u0939\u0940 \u0939\u0948 l", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u090f\u0915\u094d\u0938\u092a\u094d\u0932\u094b\u0905\u0930\u0930", "\u092e\u0945\u0915 \u0913\u090f\u0938", "\u092f\u0941\u0928\u093f\u0915\u094d\u0938", "\u0935\u093f\u0902\u0921\u094b\u091c 7", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u090f\u0915\u094d\u0938\u092a\u094d\u0932\u094b\u0905\u0930\u0930"));
    }

    public void addQuestion(Questionssysh questionssysh) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssysh.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssysh.getANSWER());
        contentValues.put(KEY_OPTA, questionssysh.getOptionA());
        contentValues.put(KEY_OPTB, questionssysh.getOptionB());
        contentValues.put(KEY_OPTC, questionssysh.getOptionC());
        contentValues.put(KEY_OPTD, questionssysh.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssysh> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssysh questionssysh = new Questionssysh();
                questionssysh.setId(cursor.getInt(0));
                questionssysh.setQUESTION(cursor.getString(1));
                questionssysh.setANSWER(cursor.getString(2));
                questionssysh.setOptionA(cursor.getString(3));
                questionssysh.setOptionB(cursor.getString(4));
                questionssysh.setOptionC(cursor.getString(5));
                questionssysh.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssysh);
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

