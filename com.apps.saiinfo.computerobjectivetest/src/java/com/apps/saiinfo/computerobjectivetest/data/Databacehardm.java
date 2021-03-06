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
import com.apps.saiinfo.computerobjectivetest.source.Questionshardm;
import java.util.ArrayList;
import java.util.List;

public class Databacehardm
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest22";
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

    public Databacehardm(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionshardm("1. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u093e \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0938\u0949\u092b\u094d\u091f\u0935\u0947\u0905\u0930 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u091a\u093e \u092a\u094d\u0930\u0915\u093e\u0930 \u0928\u093e\u0939\u0940 \u0906\u0939\u0947?", "\u092f\u0941\u091f\u0940\u0932\u093f\u091f\u0940\u091c\u094d", "\u0938\u0947\u0915\u094d\u091f\u0930\u094d\u0938", "\u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0921\u094d\u0930\u093e\u092f\u0935\u094d\u0939\u0930\u094d\u0938", "\u092d\u093e\u0937\u093e \u0905\u0928\u0941\u0935\u093e\u0926\u0915", "\u0938\u0947\u0915\u094d\u091f\u0930\u094d\u0938"));
        this.addQuestion(new Questionshardm("2. \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u091a\u0947 \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u0947 \u0915\u093e\u0930\u094d\u092f \u0928\u0938\u0924\u0947?", "\u0938\u0902\u0938\u093e\u0927\u0928\u093e\u0902\u091a\u0947 \u0935\u094d\u092f\u0935\u0938\u094d\u0925\u093e\u092a\u0928", "\u0930\u0928\u093f\u0902\u0917 \u0905\u0945\u092a\u094d\u0932\u093f\u0915\u0947\u0936\u0928", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0935\u093e\u092a\u0930\u0923\u094d\u092f\u093e\u091a\u0940 \u0938\u0902\u0927\u0940 \u0909\u092a\u0932\u092c\u094d\u0927 \u0915\u0930\u0942\u0928 \u0926\u0947\u0923\u0947", "\u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u092b\u0947\u0938 \u0909\u092a\u0932\u092c\u094d\u0927 \u0915\u0930\u0942\u0928 \u0926\u0947\u0923\u0947", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0935\u093e\u092a\u0930\u0923\u094d\u092f\u093e\u091a\u0940 \u0938\u0902\u0927\u0940 \u0909\u092a\u0932\u092c\u094d\u0927 \u0915\u0930\u0942\u0928 \u0926\u0947\u0923\u0947"));
        this.addQuestion(new Questionshardm("3. \u091f\u094d\u0930\u092c\u0932\u0936\u0942\u091f\u093f\u0902\u0917 \u0915\u093f\u0902\u0935\u093e ______ \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0939\u0947 \u0938\u092e\u0938\u094d\u092f\u093e \u0913\u0933\u0916\u0942\u0928 \u0924\u094d\u092f\u093e \u0926\u0941\u0930\u0941\u0938\u094d\u0924 \u0915\u0930\u0924\u093e\u0924.", "\u092c\u0945\u0915\u0905\u092a", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u094d\u0938", "\u0921\u093e\u092f\u0917\u094d\u0928\u094b\u0938\u094d\u091f\u093f\u0915", "\u092b\u094b\u091f\u094b \u090f\u0921\u093f\u091f\u093f\u0902\u0917", "\u0921\u093e\u092f\u0917\u094d\u0928\u094b\u0938\u094d\u091f\u093f\u0915"));
        this.addQuestion(new Questionshardm("4. \u0905\u0928\u0947\u0915 \u0905\u0945\u092a\u094d\u0932\u093f\u0915\u0947\u0936\u0928 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938\u092e\u0927\u094d\u092f\u0947 \u0939\u0947 \u0935\u0948\u0936\u093f\u0937\u094d\u091f\u094d\u092f \u092e\u093e\u0939\u093f\u0924\u0940 \u0909\u092a\u0932\u092c\u094d\u0927 \u0915\u0930\u0942\u0928 \u0926\u0947\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0915\u093f\u0902\u0935\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u0932\u093e \u092a\u0941\u0930\u0935\u093f\u0932\u0947\u0932\u094d\u092f\u093e \u092e\u093e\u0939\u093f\u0924\u0940\u091a\u094d\u092f\u093e \u0935\u093f\u0928\u0902\u0924\u0940\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0932\u0947 \u091c\u093e\u0924\u0947.", "\u092e\u0947\u0928\u094d\u092f\u0941\u091c", "\u0906\u092f\u0915\u0949\u0928\u094d\u0938", "\u0935\u093f\u0902\u0921\u094b\u091c", "\u0921\u093e\u092f\u0932\u0949\u0917 \u092c\u0949\u0915\u094d\u0938", "\u0921\u093e\u092f\u0932\u0949\u0917 \u092c\u0949\u0915\u094d\u0938"));
        this.addQuestion(new Questionshardm("5. \u0935\u093f\u0902\u0921\u094b\u091c \u0913\u0902\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u092e\u0927\u094d\u092f\u0947 \u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u092b\u0947\u0938 \u0909\u092a\u0932\u092c\u094d\u0927 \u0928\u093e\u0939\u0940.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u091a\u0942\u0915"));
        this.addQuestion(new Questionshardm("6. \u0916\u093e\u0932\u0940\u0932 \u092f\u0941\u091f\u0940\u0932\u093f\u091f\u0940 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0935\u093f\u0902\u0921\u094b\u091c \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u092e\u0927\u094d\u092f\u0947 \u0909\u092a\u0932\u092c\u094d\u0927 \u0906\u0939\u0947\u0924 \u0915\u0947\u0935\u0933 \u0939\u0947 \u0938\u094b\u0921\u0942\u0928", "\u092c\u0945\u0915\u0905\u092a", "\u0905\u0945\u0928\u094d\u091f\u0940\u0935\u094d\u0939\u093e\u092f\u0930\u0938", "HP \u0921\u0947\u0938\u094d\u0915\u091c\u0947\u091f", "\u092b\u093e\u0908\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0936\u0928", "HP \u0921\u0947\u0938\u094d\u0915\u091c\u0947\u091f"));
        this.addQuestion(new Questionshardm("7. \u091f\u094d\u0930\u092c\u0932\u0936\u0941\u091f\u0940\u0902\u0917 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u0935 \u0938\u0949\u092b\u094d\u091f\u0935\u0947\u0905\u0930 \u092f\u093e \u0926\u094b\u0918\u093e\u0902\u092e\u0927\u0940\u0932 \u0938\u092e\u0938\u094d\u092f\u093e \u0913\u0933\u0916\u0924\u0947 \u0935 \u0936\u0915\u094d\u092f\u0924\u094b \u0924\u0947 \u0938\u0941\u0927\u093e\u0930\u0923\u094d\u092f\u093e\u091a\u093e \u092a\u094d\u0930\u092f\u0924\u094d\u0928 \u0915\u0930\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionshardm("8. _____ \u0939\u0947 \u0913\u0930\u093f\u091c\u0928\u0932(\u092e\u0942\u0933) \u092b\u093e\u0908\u0932\u094d\u0938 \u0916\u0930\u093e\u092c \u091d\u093e\u0932\u094d\u092f\u093e\u0938 \u0915\u093f\u0902\u0935\u093e \u0939\u0930\u0935\u093f\u0932\u094d\u092f\u093e\u0938 \u0935\u093e\u092a\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u092b\u093e\u0908\u0932\u094d\u0938\u091a\u094d\u092f\u093e \u092a\u094d\u0930\u0924\u0940 \u0909\u092a\u0932\u092c\u094d\u0927 \u0915\u0930\u0942\u0928 \u0926\u0947\u0924\u093e\u0924.", "\u092c\u0945\u0915\u0905\u092a", "\u0905\u0928\u0907\u0902\u0938\u094d\u091f\u093e\u0901\u0932", "\u092b\u093e\u0908\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0936\u0928", "\u0921\u093f\u0938\u094d\u0915 \u0915\u094d\u0932\u093f\u0928\u0905\u092a", "\u092c\u0945\u0915\u0905\u092a"));
        this.addQuestion(new Questionshardm("9. \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e \u0939\u0940 \u092f\u0941\u091c\u0930 \u0907\u0902\u091f\u0930\u092b\u0947\u0938 \u092a\u0941\u0930\u0935\u0924\u0947, \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0930\u093f\u0938\u094b\u0930\u094d\u0938\u0947\u0938 \u0928\u093f\u092f\u0902\u0924\u094d\u0930\u093f\u0924 \u0915\u0930\u0924\u0947 \u0906\u0923\u093f \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u093e\u092e\u094d\u0938 \u091a\u093e\u0932\u0935\u093f\u0924\u0947.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionshardm("10. \u0906\u092a\u0923 \u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a\u0935\u0930 \u092a\u093e\u0939\u0924\u094b \u0924\u094d\u092f\u093e \u0911\u092c\u094d\u091c\u0947\u0915\u094d\u091f\u0938\u094d \u091a\u094d\u092f\u093e \u0932\u0939\u093e\u0928, \u091a\u093f\u0924\u094d\u0930\u092e\u092f \u0938\u093e\u0926\u0930\u0940\u0915\u0930\u0923\u093e\u0932\u093e ____ \u092e\u094d\u0939\u091f\u0932\u0947 \u091c\u093e\u0924\u0947.", "\u0906\u092f\u0915\u0949\u0928\u094d\u0938", "\u0921\u093f\u0938\u094d\u092a\u094d\u0932\u0947", "\u092e\u0947\u0928\u094d\u092f\u0941\u091c", "\u092a\u0949\u0907\u0902\u091f\u0930", "\u0906\u092f\u0915\u0949\u0928\u094d\u0938"));
        this.addQuestion(new Questionshardm("11. \u0938\u094d\u091f\u0945\u0928\u094d\u0921 \u0905\u0932\u094b\u0928 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u094d\u0938\u0928\u093e _______ \u0905\u0938\u0947\u0939\u0940 \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u0928\u0947\u091f\u0935\u0930\u094d\u0915 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e", "\u092f\u0941\u091c\u0930 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e", "\u092f\u0941\u0928\u093f\u092f\u0928 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e", "\u0921\u0947\u0938\u094d\u0915\u091f\u0949\u092a \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e"));
        this.addQuestion(new Questionshardm("12. \u0938\u0930\u094d\u0935\u093e\u0924 \u0905\u0927\u093f\u0915 \u0935\u093e\u092a\u0930\u0932\u0940 \u091c\u093e\u0923\u093e\u0930\u0940 \u092a\u0930\u094d\u0938\u0928\u0932 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0911\u092a\u0930\u0947\u091f\u093f\u0902\u0917 \u0938\u093f\u0938\u094d\u091f\u093f\u092e ___ \u0939\u0940 \u0906\u0939\u0947.", "\u0932\u093f\u0928\u0915\u094d\u0938", "\u0935\u093f\u0902\u0921\u094b\u091c", "\u0928\u0947\u091f\u0935\u0947\u0905\u0930", "\u092f\u093e\u092a\u0948\u0915\u0940 \u0938\u0930\u094d\u0935", "\u0935\u093f\u0902\u0921\u094b\u091c"));
        this.addQuestion(new Questionshardm("13. \u0939\u093e\u0930\u094d\u0921\u0935\u0947\u0905\u0930 \u092e\u0927\u0940\u0932 _____ \u0918\u091f\u0915 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u091a\u0947 \u0915\u093e\u0930\u094d\u092f \u0928\u093f\u092f\u0902\u0924\u094d\u0930\u093f\u0924 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0932\u093e \u091c\u093e\u0924\u094b.", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u0939\u0947\u0921\u092b\u094b\u0928", "\u0905\u0915\u094d\u0938\u0947\u0938\u0930\u0940\u091c", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930", "\u092a\u094d\u0930\u094b\u0938\u0947\u0938\u0930"));
        this.addQuestion(new Questionshardm("14. \u090f\u0915\u093e \u092b\u093e\u0908\u0932\u091a\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0906\u0935\u0936\u094d\u092f\u0915\u0924\u093e \u0915\u092e\u0940 \u0915\u0930\u0923\u094d\u092f\u093e\u091a\u094d\u092f\u093e \u092a\u094d\u0930\u0915\u094d\u0930\u093f\u092f\u0947\u0932\u093e ________ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u092b\u093e\u0908\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0936\u0928", "\u092b\u093e\u0908\u0932 \u092e\u0949\u0921\u093f\u092b\u093f\u0915\u0947\u0936\u0928", "\u092b\u093e\u0908\u0932 \u0905\u0938\u094b\u0938\u093f\u090f\u0936\u0928", "\u092b\u093e\u0908\u0932 \u0921\u093f\u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0936\u0928", "\u092b\u093e\u0908\u0932 \u0915\u0949\u092e\u094d\u092a\u094d\u0930\u0947\u0936\u0928"));
        this.addQuestion(new Questionshardm("15. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u0947 \u090f\u0915 \u0905\u0945\u092a\u094d\u0932\u093f\u0915\u0947\u0936\u0928 \u0938\u0949\u092b\u094d\u091f\u0935\u0947\u0905\u0930\u091a\u0947 \u0909\u0926\u093e\u0939\u0930\u0923 \u0928\u093e\u0939\u0940?", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0938\u0949\u092b\u094d\u091f \u0935\u0930\u094d\u0921", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0938\u0949\u092b\u094d\u091f \u090f\u0915\u094d\u0938\u0947\u0932", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0938\u0949\u092b\u094d\u091f \u0935\u093f\u0902\u0921\u094b\u091c", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0938\u0949\u092b\u094d\u091f \u092a\u093e\u0935\u0930\u092a\u0949\u0907\u0902\u091f", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0938\u0949\u092b\u094d\u091f \u0935\u093f\u0902\u0921\u094b\u091c"));
    }

    public void addQuestion(Questionshardm questionshardm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionshardm.getQUESTION());
        contentValues.put(KEY_ANSWER, questionshardm.getANSWER());
        contentValues.put(KEY_OPTA, questionshardm.getOptionA());
        contentValues.put(KEY_OPTB, questionshardm.getOptionB());
        contentValues.put(KEY_OPTC, questionshardm.getOptionC());
        contentValues.put(KEY_OPTD, questionshardm.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionshardm> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionshardm questionshardm = new Questionshardm();
                questionshardm.setId(cursor.getInt(0));
                questionshardm.setQUESTION(cursor.getString(1));
                questionshardm.setANSWER(cursor.getString(2));
                questionshardm.setOptionA(cursor.getString(3));
                questionshardm.setOptionB(cursor.getString(4));
                questionshardm.setOptionC(cursor.getString(5));
                questionshardm.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionshardm);
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

