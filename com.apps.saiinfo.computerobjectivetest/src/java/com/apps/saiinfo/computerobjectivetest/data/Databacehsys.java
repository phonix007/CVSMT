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
import com.apps.saiinfo.computerobjectivetest.source.Questionshsys;
import java.util.ArrayList;
import java.util.List;

public class Databacehsys
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest35";
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

    public Databacehsys(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionshsys("1. _____ \u092f\u0939 \u090f\u0915\u094d\u0938\u091f\u0930\u094d\u0928\u0932 \u0921\u093f\u0935\u094d\u0939\u093e\u092f\u0938\u0947\u0938 \u0938\u093f\u0938\u094d\u091f\u0940\u092e \u092f\u0941\u0928\u093f\u091f \u0915\u094b \u091c\u094b\u0921\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0932\u0917\u0928\u0947\u0935\u093e\u0932\u093e \u090f\u0915 \u0938\u0949\u0915\u0947\u091f \u0939\u0948 l", "\u0930\u0945\u092e", "\u092a\u094b\u0930\u094d\u091f", "\u0930\u0949\u092e", "\u092b\u094d\u0932\u0945\u0936", "\u092a\u094b\u0930\u094d\u091f"));
        this.addQuestion(new Questionshsys("2. \u0928\u093f\u092e\u094d\u0928 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u094d\u092f\u093e \u0938\u092c\u0938\u0947 \u091b\u094b\u091f\u093e \u0939\u0948 l", "\u092a\u0940\u0921\u0940\u090f \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f", "\u0928\u094b\u091f\u092c\u0941\u0915 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f", "\u091f\u0945\u092c\u094d\u0932\u0947\u091f \u092a\u0940\u0938\u0940\u091c\u094d", "\u092a\u0940\u0921\u0940\u090f \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f"));
        this.addQuestion(new Questionshsys("3. \u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938 \u0915\u094b \u092c\u093f\u091c\u0932\u0940 \u0938\u092a\u094d\u0932\u093e\u092f \u0938\u0902\u091a \u092a\u0949\u0935\u0930 \u0938\u092a\u094d\u0932\u093e\u092f \u092f\u0941\u0928\u093f\u091f \u0939\u094b\u0924\u093e \u0939\u0948, \u091c\u094b \u0909\u0928\u0915\u0947 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f \u0915\u0947 \u0905\u0902\u0926\u0930 \u0939\u094b\u0924\u093e \u0939\u0948 l", "\u0938\u0939\u0940", "\u0917\u0932\u0924", "", "", "\u0938\u0939\u0940"));
        this.addQuestion(new Questionshsys("4. \u0906\u092a\u0915\u094b \u0906\u092a\u0915\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0926\u0941\u0938\u0930\u0947 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0938\u0947 \u091c\u094b\u0921\u0928\u093e \u0939\u0948, \u092f\u0939 \u0938\u092e\u092f \u0927\u094d\u092f\u093e\u0928 \u092e\u0947\u0902 \u0930\u0916\u0924\u0947 \u0939\u0941\u090f \u0906\u092a\u0915\u094b \u0915\u094c\u0928 \u0938\u0947 \u0915\u093e\u0930\u094d\u0921 \u0915\u0940 \u091c\u0930\u0941\u0930\u0924 \u0939\u0948, \u0935\u094b \u092a\u0939\u091a\u093e\u0928\u0947?", "\u0938\u093e\u0909\u0902\u0921 \u0915\u093e\u0930\u094d\u0921", "\u092a\u0940\u0938\u0940 \u0915\u093e\u0930\u094d\u0921", "\u0928\u0947\u091f\u0935\u0930\u094d\u0915 \u0907\u0902\u091f\u0930\u092b\u0947\u0938 \u0915\u093e\u0930\u094d\u0921", "\u091f\u0940.\u0935\u094d\u0939\u0940. \u091f\u094d\u092f\u0941\u0928\u0930 \u0915\u093e\u0930\u094d\u0921", "\u0928\u0947\u091f\u0935\u0930\u094d\u0915 \u0907\u0902\u091f\u0930\u092b\u0947\u0938 \u0915\u093e\u0930\u094d\u0921"));
        this.addQuestion(new Questionshsys("5. \u0906\u092a\u0915\u0947 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u092a\u0930 \u0938\u0902\u0917\u0940\u0924 \u0938\u0941\u0928\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0906\u092a\u0915\u094b \u0907\u0928\u092e\u0947 \u0938\u0947\u0902 \u0915\u093f\u0938\u0915\u0940 \u091c\u0930\u0941\u0930\u0924 \u092a\u0921\u0947\u0917\u0940?", "\u0938\u093e\u0909\u0902\u0921 \u0915\u093e\u0930\u094d\u0921", "\u0928\u0947\u091f\u0935\u0930\u094d\u0915 \u0915\u093e\u0930\u094d\u0921", "\u091c\u0949\u092f\u0938\u094d\u091f\u093f\u0915", "\u092e\u094b\u0921\u0947\u092e \u0915\u093e\u0930\u094d\u0921", "\u0938\u093e\u0909\u0902\u0921 \u0915\u093e\u0930\u094d\u0921"));
        this.addQuestion(new Questionshsys("6. ____ \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u092a\u0930 \u0938\u094d\u0925\u093f\u0924 \u0918\u091f\u0915\u094b\u0902 \u0915\u0947 \u092c\u0940\u091a \u0915\u093e \u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u0949\u0928\u093f\u0915 \u092e\u093e\u0930\u094d\u0917 \u0939\u0948 l", "\u092a\u094b\u0930\u094d\u091f", "\u092c\u0938", "\u0938\u094d\u0932\u0949\u091f", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092c\u0938"));
        this.addQuestion(new Questionshsys("7. 32 \u092c\u093f\u091f \u0935\u0930\u094d\u0921 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 ______ \u092c\u093e\u0908\u091f\u094d\u0938 \u090f\u0915 \u0939\u0940 \u0938\u092e\u092f \u092e\u0947\u0902 \u090f\u0915\u094d\u0938\u0947\u0938 \u0915\u0930 \u0938\u0915\u0924\u093e \u0939\u0948 l", "\u091a\u093e\u0930 (4)", "\u0906\u0920 (8)", "\u0938\u094b\u0932\u0939 (16)", "\u092c\u0924\u094d\u0924\u0940\u0938 (32)", "\u091a\u093e\u0930 (4)"));
        this.addQuestion(new Questionshsys("8. _____ \u0907\u0938 \u092a\u094d\u0930\u0915\u093e\u0930 \u0915\u0947 \u092e\u0947\u092e\u0930\u0940 \u092e\u0947\u0902 \u0938\u094d\u091f\u094b\u0905\u0930 \u0915\u093f\u092f\u093e \u0939\u0941\u0906 \u0921\u0947\u091f\u093e \u092c\u0926\u0932\u093e \u0928\u0939\u0940 \u091c\u093e \u0938\u0915\u0924\u093e l", "\u092b\u094d\u0932\u0945\u0936 \u092e\u0947\u092e\u0930\u0940", "\u0935\u094d\u0939\u0930\u094d\u091a\u094d\u092f\u0941\u0905\u0932 \u092e\u0947\u092e\u0930\u0940", "\u0930\u0945\u092e", "\u0930\u0949\u092e", "\u0930\u0949\u092e"));
        this.addQuestion(new Questionshsys("9. \u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092a\u094d\u0930\u094b\u092a\u0947\u0938\u0930 \u0915\u0947 \u0926\u094b \u092e\u0941\u0916\u094d\u092f \u0915\u093e\u092e\u094d\u092a\u094b\u0928\u0902\u091f\u0938\u094d \u0915\u094c\u0928 \u0938\u0947 \u0939\u0948 ?", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f, \u090f\u0930\u0947\u0925\u0947\u092e\u0945\u091f\u093f\u0915 \u0932\u0949\u091c\u093f\u0915\u0932 \u092f\u0941\u0928\u093f\u091f", "\u0915\u0902\u091f\u094d\u0930\u094b\u0932 \u092f\u0941\u0928\u093f\u091f, \u090f\u0930\u0947\u0925\u0947\u092e\u0945\u091f\u093f\u0915 \u0932\u0949\u091c\u093f\u0915\u0932 \u092f\u0941\u0928\u093f\u091f", "\u0915\u0902\u091f\u094d\u0930\u094b\u0932 \u092f\u0941\u0928\u093f\u091f, \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f", "\u0907\u0928\u092e\u0947\u0902 \u0938\u0947\u0902 \u0928\u0939\u0940", "\u0915\u0902\u091f\u094d\u0930\u094b\u0932 \u092f\u0941\u0928\u093f\u091f, \u090f\u0930\u0947\u0925\u0947\u092e\u0945\u091f\u093f\u0915 \u0932\u0949\u091c\u093f\u0915\u0932 \u092f\u0941\u0928\u093f\u091f"));
        this.addQuestion(new Questionshsys("10. \u092e\u0941\u0916\u094d\u092f \u092c\u094b\u0930\u094d\u0921 \u0905\u0925\u0935\u093e \u092e\u0926\u0930\u092c\u094b\u0930\u094d\u0921 \u0915\u094b ____ \u092d\u0940 \u0915\u0939\u0924\u0947 \u0939\u0948 l", "\u092b\u0930\u094d\u0938\u094d\u091f \u092c\u094b\u0930\u094d\u0921", "\u0915\u0902\u091f\u094d\u0930\u094b\u0932 \u092c\u094b\u0930\u094d\u0921", "\u092c\u094b\u0930\u094d\u0921 \u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092c\u094b\u0930\u094d\u0921", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092c\u094b\u0930\u094d\u0921"));
        this.addQuestion(new Questionshsys("11. \u0928\u093f\u092e\u094d\u0928\u0932\u093f\u0916\u093f\u0924 \u092e\u0947\u0902 \u0938\u0947\u0902 \u0915\u094c\u0928 \u0938\u093e \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e \u090f\u0915 \u092f\u0941\u091f\u0940\u0932\u093f\u091f\u0940 \u0928\u0939\u0940 \u0939\u0948 ?", "\u090f\u092e. \u090f\u0938. \u092a\u0947\u0902\u091f", "\u0921\u093f\u0938\u094d\u0915 \u0915\u094d\u0932\u093f\u0928\u0905\u092a", "\u0921\u093f\u0938\u094d\u0915 \u0915\u0945\u0936\u093f\u0902\u0917", "\u092b\u093e\u0908\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0936\u0928", "\u090f\u092e. \u090f\u0938. \u092a\u0947\u0902\u091f"));
        this.addQuestion(new Questionshsys("12. ____ \u092f\u0939 \u0921\u0947\u091f\u093e \u092a\u094d\u0930\u094b\u0938\u0947\u0938\u093f\u0902\u0917 \u092f\u0941\u0928\u093f\u091f \u0939\u0948 l", "\u0930\u0945\u092e", "\u0930\u0949\u092e", "\u0938\u0940 \u092a\u0940 \u092f\u0941", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0938\u0940 \u092a\u0940 \u092f\u0941"));
        this.addQuestion(new Questionshsys("13. \u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930 \u0914\u0930 \u092e\u0947\u092e\u0930\u0940 \u092f\u0939 _____ \u0915\u0947 \u092e\u0941\u0916\u094d\u092f \u0918\u091f\u0915 \u0939\u0948 ?", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a", "\u0907\u0928\u092a\u0941\u091f \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938", "\u0906\u0909\u091f\u092a\u0941\u091f \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f", "\u0938\u093f\u0938\u094d\u091f\u093f\u092e \u092f\u0941\u0928\u093f\u091f"));
        this.addQuestion(new Questionshsys("14. \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u092e\u0947\u0902 \u0938\u0947\u0902 _____ \u0918\u091f\u0915 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0915\u093e \u0915\u093e\u0930\u094d\u092f \u0928\u093f\u092f\u0902\u0924\u094d\u0930\u093f\u0924 \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0907\u0938\u094d\u0924\u0947\u092e\u093e\u0932 \u0939\u094b\u0924\u093e \u0939\u0948 l", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u0939\u0947\u0921\u092b\u094b\u0928", "\u0905\u0915\u094d\u0938\u0947\u0938\u0930\u0940\u091c", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930"));
        this.addQuestion(new Questionshsys("15. \u091c\u093e\u0928\u0915\u093e\u0930\u0940 \u092e\u0947\u0902 \u090f\u0915\u094d\u0938\u0947\u0938 \u092e\u093f\u0932\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0915\u0940 \u0938\u0947\u091f\u093f\u0902\u0917\u094d\u091c \u092c\u0926\u0932\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0914\u0930 \u0909\u0938\u092e\u0947 \u091c\u092e\u093e \u091c\u093e\u0928\u0915\u093e\u0930\u0940 \u0915\u094b \u0922\u0941\u0901\u0922\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f \u0911\u0928\u0932\u093e\u0908\u0928 \u0939\u0947\u0932\u094d\u092a \u0915\u0947 \u0932\u093f\u090f \u0914\u0930 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0936\u091f \u0921\u093e\u0909\u0928 \u0915\u0930\u0928\u0947 \u0915\u0947 \u0932\u093f\u090f _______ \u0906\u091c\u094d\u091e\u093e\u0935\u0932\u0940 \u092a\u094d\u0930\u0926\u0930\u094d\u0936\u093f\u0924 \u0915\u0930\u0924\u093e \u0939\u0948 l", "\u091c\u0940\u092f\u0941\u0906\u092f", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a", "\u0938\u094d\u091f\u093e\u0930\u094d\u091f \u092c\u091f\u0928", "\u0906\u092f\u0915\u0949\u0928", "\u0938\u094d\u091f\u093e\u0930\u094d\u091f \u092c\u091f\u0928"));
    }

    public void addQuestion(Questionshsys questionshsys) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionshsys.getQUESTION());
        contentValues.put(KEY_ANSWER, questionshsys.getANSWER());
        contentValues.put(KEY_OPTA, questionshsys.getOptionA());
        contentValues.put(KEY_OPTB, questionshsys.getOptionB());
        contentValues.put(KEY_OPTC, questionshsys.getOptionC());
        contentValues.put(KEY_OPTD, questionshsys.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionshsys> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionshsys questionshsys = new Questionshsys();
                questionshsys.setId(cursor.getInt(0));
                questionshsys.setQUESTION(cursor.getString(1));
                questionshsys.setANSWER(cursor.getString(2));
                questionshsys.setOptionA(cursor.getString(3));
                questionshsys.setOptionB(cursor.getString(4));
                questionshsys.setOptionC(cursor.getString(5));
                questionshsys.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionshsys);
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

