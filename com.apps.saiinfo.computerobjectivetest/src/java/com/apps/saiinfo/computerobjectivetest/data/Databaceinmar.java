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
import com.apps.saiinfo.computerobjectivetest.source.Questionsinmar;
import java.util.ArrayList;
import java.util.List;

public class Databaceinmar
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest6";
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

    public Databaceinmar(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsinmar("1. \u0930\u093f\u091d\u094b\u0932\u094d\u092f\u0941\u0936\u0928 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u091a\u094d\u092f\u093e \u0938\u094d\u0915\u094d\u0930\u0940\u0928\u0935\u0930\u0940\u0932 \u092a\u094d\u0930\u0924\u093f\u092e\u093e\u0902\u091a\u0940 \u0924\u0940\u0915\u094d\u0937\u094d\u0923\u0924\u093e \u0935 \u0938\u094d\u092a\u0937\u094d\u091f\u0924\u093e \u0920\u0930\u0935\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsinmar("2. \u092b\u094d\u0932\u0945\u091f\u092c\u0947\u0921 \u0906\u0923\u093f \u092a\u094b\u0930\u094d\u091f\u0947\u092c\u0932 _______\u091a\u0947 \u0926\u094b\u0928 \u092a\u094d\u0930\u0915\u093e\u0930 \u0906\u0939\u0947\u0924.", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0938\u094d\u0915\u0945\u0928\u0930", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u092e\u093e\u0909\u0938", "\u0935\u093e\u092f\u0930\u0932\u0947\u0938 \u0915\u0940\u092c\u094b\u0930\u094d\u0921", "\u092a\u094d\u0932\u0949\u091f\u0930\u094d\u0938", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0938\u094d\u0915\u0945\u0928\u0930"));
        this.addQuestion(new Questionsinmar("3. \u0938\u094d\u0915\u094d\u0930\u0940\u0928\u0935\u0930\u0940\u0932 \u090f\u0915 \u0938\u0930\u094d\u0935\u093e\u0924 \u0932\u0939\u093e\u0928 \u092f\u0941\u0928\u093f\u091f \u091c\u094b \u0915\u0940 \u0911\u0928 \u0911\u092b \u0915\u0930\u0942 \u0936\u0915\u0924\u093e, \u0935 \u091c\u094b \u092a\u094d\u0930\u0924\u094d\u092f\u0947\u0915 \u090f\u0915\u093e \u0921\u0949\u091f\u0938\u094d \u091a\u094d\u092f\u093e \u0935\u0947\u0917\u0933\u094d\u092f\u093e \u0936\u0947\u0921\u092a\u093e\u0938\u0942\u0928 \u092e\u0949\u0928\u093f\u091f\u0930\u0935\u0930 \u0907\u092e\u0947\u091c\u0947\u0938 \u092c\u0928\u0935\u0924\u094b \u0924\u094d\u092f\u093e\u0932\u093e ______ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u0915\u0945\u092e\u0947\u0930\u093e", "\u092a\u093f\u0915\u094d\u0938\u0947\u0932", "\u0925\u0930\u094d\u092e\u0932 \u092a\u094d\u0930\u093f\u0902\u091f\u0930\u094d\u0938", "\u0935\u094d\u0939\u0949\u0907\u0938 \u0913\u0935\u0930 \u0906\u092f \u092a\u0940", "\u092a\u093f\u0915\u094d\u0938\u0947\u0932"));
        this.addQuestion(new Questionsinmar("4. \u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u092f\u0941\u091c\u0930 \u090f\u0928\u094d\u0935\u094d\u0939\u093e\u092f\u0930\u092e\u0947\u0902\u091f \u092e\u0927\u094d\u092f\u0947 \u0915\u094b\u0923\u0924\u0947 \u0909\u092a\u0915\u0930\u0923 \u092a\u094d\u0930\u092e\u093e\u0923\u093f\u0924 \u0928\u093f\u0930\u094d\u0926\u0947\u0936\u0915 \u0909\u092a\u0915\u0930\u0923 \u092e\u094d\u0939\u0923\u0942\u0928 \u0935\u093e\u092a\u0930\u0932\u0947 \u091c\u093e\u0924\u0947.", "\u091f\u094d\u0930\u0945\u0915\u092c\u0949\u0932", "\u091c\u0949\u092f\u0938\u094d\u091f\u093f\u0915", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u092e\u093e\u0909\u0938", "\u092e\u093e\u0909\u0938"));
        this.addQuestion(new Questionsinmar("5. \u0915\u0902\u091f\u094d\u0930\u094b\u0932 \u0915\u0940 \u0938\u093e\u0930\u0916\u094d\u092f\u093e \u0915\u0940\u091c\u094d \u091c\u094d\u092f\u093e \u0926\u0941\u0938\u0931\u094d\u092f\u093e \u0915\u0940\u091c\u094d \u0938\u094b\u092c\u0924 \u090f\u0915\u0924\u094d\u0930 \u092f\u0947\u090a\u0928 \u0915\u0943\u0924\u0940 \u0915\u0930\u0924\u093e\u0924 \u0924\u094d\u092f\u093e\u0902\u0928\u093e _____ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u092b\u0902\u0928\u094d\u0936\u0928 \u0915\u0940\u091c", "\u0915\u0949\u092e\u094d\u092c\u093f\u0928\u0947\u0936\u0928 \u0915\u0940\u091c", "\u0938\u094d\u092a\u0947\u0936\u0932\u092a\u0930\u094d\u092a\u094b\u0938 \u0915\u0940\u091c", "\u091f\u093e\u0907\u092a\u0930\u093e\u092f\u091f\u0930 \u0915\u0940\u091c", "\u0915\u0949\u092e\u094d\u092c\u093f\u0928\u0947\u0936\u0928 \u0915\u0940\u091c"));
        this.addQuestion(new Questionsinmar("6. \u0915\u093f\u092c\u094b\u0930\u094d\u0921\u0935\u0930\u0940\u0932 0 \u0924\u0947 9 \u0905\u0936\u0940 \u0932\u0947\u092c\u0932 \u0905\u0938\u0932\u0947\u0932\u094d\u092f\u093e \u0915\u0940\u091c\u094d \u0928\u093e ______ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u092b\u0902\u0928\u094d\u0936\u0928 \u0915\u0940\u091c", "\u0928\u094d\u092f\u0942\u092e\u0947\u0930\u093f\u0915 \u0915\u0940\u091c", "\u0938\u094d\u092a\u0947\u0936\u0932\u092a\u0930\u094d\u092a\u094b\u0938 \u0915\u0940\u091c", "\u091f\u093e\u0907\u092a\u0930\u093e\u092f\u091f\u0930 \u0915\u0940\u091c", "\u0928\u094d\u092f\u0942\u092e\u0947\u0930\u093f\u0915 \u0915\u0940\u091c"));
        this.addQuestion(new Questionsinmar("7. \u0915\u093f\u092c\u094b\u0930\u094d\u0921\u0935\u0930\u0940\u0932 _____ \u0915\u0940\u091c \u0938\u094d\u0915\u094d\u0930\u0940\u0928\u0935\u0930\u0940\u0932 \u0915\u0930\u094d\u0938\u0930 \u0915\u093f\u0902\u0935\u093e \u0907\u0928\u094d\u0938\u0930\u094d\u0936\u0928 \u092a\u0949\u0907\u0902\u091f \u0928\u093f\u092f\u0902\u0924\u094d\u0930\u093f\u0924 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0932\u094d\u092f\u093e \u091c\u093e\u0924\u093e\u0924.", "\u090f\u0938\u094d\u0915\u0947\u092a", "\u092b\u0902\u0915\u094d\u0936\u0928", "\u091f\u0949\u0917\u0932", "\u0928\u0947\u0935\u094d\u0939\u093f\u0917\u0947\u0936\u0928", "\u0928\u0947\u0935\u094d\u0939\u093f\u0917\u0947\u0936\u0928"));
        this.addQuestion(new Questionsinmar("8. \u0906\u092f\u0915\u0949\u0928\u094d\u0938 \u0939\u0947 \u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u0911\u092c\u094d\u091c\u0947\u0915\u094d\u091f \u0905\u0938\u0942\u0928 \u092c\u0931\u094d\u092f\u093e\u091a\u0935\u0947\u0933\u093e \u0924\u0947 \u0935\u093e\u092a\u0930\u0932\u0940 \u091c\u093e\u0923\u093e\u0930\u0940 \u090f\u092a\u094d\u0932\u093f\u0915\u0947\u0936\u0928\u094d\u0938 \u0928\u093f\u0930\u094d\u0926\u0947\u0936\u093f\u0924 \u0915\u0930\u0924\u093e\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsinmar("9. ______ \u0939\u0947 \u092a\u093e\u0930\u0902\u092a\u093e\u0930\u093f\u0915 \u0915\u0945\u092e\u0947\u0930\u093e \u0938\u093e\u0930\u0916\u0947\u091a \u0905\u0938\u0924\u093e\u0924, \u092b\u0915\u094d\u0924 \u0924\u094d\u092f\u093e\u0924\u0940\u0932 \u092a\u094d\u0930\u0924\u093f\u092e\u093e \u092e\u093e\u0924\u094d\u0930 \u0921\u093f\u091c\u093f\u091f\u0932 \u0930\u093f\u0924\u0940\u0928\u0947 \u0930\u0947\u0915\u0949\u0930\u094d\u0921 \u0915\u0947\u0932\u094d\u092f\u093e \u091c\u093e\u0924\u093e\u0924.", "\u090f\u0928\u093e\u0932\u0949\u0917 \u0915\u0945\u092e\u0947\u0930\u093e", "\u0938\u093f\u092e\u094d\u092a\u0932 \u0915\u0945\u092e\u0947\u0930\u093e", "\u0921\u093f\u091c\u093f\u091f\u0932 \u0915\u0945\u092e\u0947\u0930\u093e", "\u0939\u093e\u092f\u092c\u094d\u0930\u0940\u0921 \u0915\u0945\u092e\u0947\u0930\u093e", "\u0921\u093f\u091c\u093f\u091f\u0932 \u0915\u0945\u092e\u0947\u0930\u093e"));
        this.addQuestion(new Questionsinmar("10. \u092a\u0930\u094d\u0938\u0928\u0932 \u0921\u093f\u091c\u093f\u091f\u0932 \u0905\u0938\u093f\u0938\u094d\u091f\u0902\u091f \u0939\u0947 \u0938\u0930\u094d\u0935\u093e\u0924 \u092e\u094b\u0920\u094d\u092f\u093e \u092a\u094d\u0930\u092e\u093e\u0923\u093e\u0924 \u0935\u093e\u092a\u0930\u0932\u0947 \u091c\u093e\u0923\u093e\u0930\u0947 \u0939\u0901\u0928\u094d\u0921\u0939\u0947\u0932\u094d\u0921 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938 \u0906\u0939\u0947\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsinmar("11. \u0915\u0945\u092a\u094d\u0938 \u0932\u0949\u0915, \u0928\u092e \u0932\u0949\u0915, \u0938\u094d\u0915\u094d\u0930\u094b\u0932 \u0932\u0949\u0915 \u0915\u0940\u091c \u092f\u093e\u0902\u0928\u093e ________ \u0905\u0938\u0947\u0939\u0940 \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u091f\u0949\u0917\u0932 \u0915\u0940\u091c", "\u092b\u0902\u0915\u094d\u0936\u0928 \u0915\u0940\u091c", "\u0928\u094d\u092f\u0942\u092e\u0947\u0930\u093f\u0915 \u0915\u0940\u091c", "\u0938\u094d\u092a\u0947\u0936\u0932 \u0915\u0940\u091c", "\u091f\u0949\u0917\u0932 \u0915\u0940\u091c"));
        this.addQuestion(new Questionsinmar("12. _____ \u0909\u092a\u0915\u0930\u0923\u093e\u091a\u093e \u0909\u092a\u092f\u094b\u0917 \u0924\u0941\u092e\u091a\u093e \u0906\u0935\u093e\u091c \u0930\u0947\u0915\u0949\u0930\u094d\u0921 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0915\u0947\u0932\u093e \u091c\u093e\u0924\u094b.", "\u0938\u094d\u0915\u0945\u0928\u0930", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092b\u094b\u0928", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u0938\u094d\u092a\u093f\u0915\u0930", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092b\u094b\u0928"));
        this.addQuestion(new Questionsinmar("13. \u0935\u094d\u0939\u0949\u0907\u0938 \u0930\u0947\u0915\u0917\u094d\u0928\u093f\u0936\u0928 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u091a\u0947 \u0911\u092a\u0930\u0947\u0936\u0928 \u0928\u093f\u092f\u0902\u0924\u094d\u0930\u093f\u0924 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0906\u0923\u093f \u0921\u0949\u0915\u094d\u092f\u0941\u092e\u0947\u0902\u091f \u0928\u093f\u0930\u094d\u092e\u093e\u0923 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u094d\u0939\u0949\u0907\u0938 \u0915\u092e\u093e\u0902\u0921 \u0938\u094d\u0935\u093f\u0915\u093e\u0930\u0924\u093e\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsinmar("14. \u092b\u0945\u0915\u094d\u0938 \u092e\u0936\u0940\u0928\u094d\u0938 \u091f\u0947\u0932\u093f\u092b\u094b\u0928 \u0932\u093e\u0907\u0928\u094d\u0938\u0926\u094d\u0935\u093e\u0930\u093e \u092a\u094d\u0930\u0924\u093f\u092e\u093e \u092a\u093e\u0920\u0935\u093f\u0924\u093e\u0924 \u0935 \u0917\u094d\u0930\u0939\u0923 \u0915\u0930\u0924\u093e\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsinmar("15. \u091c\u0930 \u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u090f\u0915 \u092b\u093e\u0907\u0932 \u091c\u094d\u092f\u093e\u091a\u0940 \u0938\u093e\u0907\u091c 1.50 MB \u0906\u0939\u0947, \u0935 \u0924\u0940 \u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u092a\u0947\u0928 \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939\u0935\u0930 \u0915\u0949\u092a\u0940 \u0915\u0930\u093e\u092f\u091a\u0940 \u0906\u0939\u0947. \u092a\u0923 \u0924\u0941\u092e\u091a\u094d\u092f\u093e \u092a\u0947\u0928 \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939\u0935\u0930 \u092b\u094d\u0930\u0940 \u0938\u094d\u092a\u0947\u0938 1.00 MB \u0906\u0939\u0947. \u0924\u0930 \u092f\u093e \u0935\u0947\u0933\u0940 \u0924\u0941\u092e\u094d\u0939\u0940 \u0915\u094b\u0923\u0924\u0940 \u092f\u0941\u091f\u0940\u0932\u093f\u091f\u0940 \u0935\u093e\u092a\u0930\u093e\u0932.", "\u092b\u093e\u0907\u0932 \u0921\u093f\u0932\u0940\u091f \u0915\u0930\u0923\u0947", "\u092b\u093e\u0907\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0938 \u0915\u0930\u0923\u0947", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0915\u094d\u0932\u0940\u0928 \u0915\u0930\u0923\u0947", "\u0938\u0917\u0933\u0947 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e \u0905\u0928\u0907\u0902\u0938\u094d\u091f\u093e\u0932 \u0915\u0930\u0923\u0947", "\u092b\u093e\u0907\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0938 \u0915\u0930\u0923\u0947"));
    }

    public void addQuestion(Questionsinmar questionsinmar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsinmar.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsinmar.getANSWER());
        contentValues.put(KEY_OPTA, questionsinmar.getOptionA());
        contentValues.put(KEY_OPTB, questionsinmar.getOptionB());
        contentValues.put(KEY_OPTC, questionsinmar.getOptionC());
        contentValues.put(KEY_OPTD, questionsinmar.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsinmar> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsinmar questionsinmar = new Questionsinmar();
                questionsinmar.setId(cursor.getInt(0));
                questionsinmar.setQUESTION(cursor.getString(1));
                questionsinmar.setANSWER(cursor.getString(2));
                questionsinmar.setOptionA(cursor.getString(3));
                questionsinmar.setOptionB(cursor.getString(4));
                questionsinmar.setOptionC(cursor.getString(5));
                questionsinmar.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsinmar);
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

