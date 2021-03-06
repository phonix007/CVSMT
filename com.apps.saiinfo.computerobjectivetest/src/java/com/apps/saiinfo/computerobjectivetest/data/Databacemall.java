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
import com.apps.saiinfo.computerobjectivetest.source.Questionsmall;
import java.util.ArrayList;
import java.util.List;

public class Databacemall
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest50";
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

    public Databacemall(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsmall("1. \u0921\u094b\u092e\u0947\u0928 \u0928\u093e\u0935\u093e\u091a\u094d\u092f\u093e \u0936\u0947\u0935\u091f\u0940 \u0921\u0949\u091f (.) \u0928\u0902\u0924\u0930 \u092f\u0947\u0923\u093e\u0931\u094d\u092f\u093e \u092d\u093e\u0917\u093e\u0932\u093e ____ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u091f\u0949\u092a-\u0932\u0947\u0935\u094d\u0939\u0932 \u0921\u094b\u092e\u0947\u0928", "\u0921\u0940\u090f\u0928\u090f\u0938", "\u0921\u094b\u092e\u0947\u0928 \u0915\u094b\u0921\u094d\u0938", "\u092e\u0947\u0932 \u091f\u0942 \u090f\u0921\u094d\u0930\u0947\u0938", "\u091f\u0949\u092a-\u0932\u0947\u0935\u094d\u0939\u0932 \u0921\u094b\u092e\u0947\u0928"));
        this.addQuestion(new Questionsmall("2. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u094d\u0938 \u092e\u0927\u0940\u0932 \u0921\u0947\u091f\u093e\u091a\u0940 \u0905\u0926\u0932\u093e\u092c\u0926\u0932 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0905\u0938\u0932\u0947\u0932\u094d\u092f\u093e \u0928\u093f\u092f\u092e\u093e\u0902\u0928\u093e ______ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u092a\u094d\u0930\u094b\u0938\u093f\u091c\u0930\u094d\u0938", "\u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932", "\u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e", "\u0932\u0901\u0917\u094d\u0935\u0947\u091c", "\u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932"));
        this.addQuestion(new Questionsmall("3. \u0924\u0941\u092e\u091a\u094d\u092f\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u0932\u093e \u090f\u0915 \u092e\u0949\u0921\u0947\u092e \u091c\u094b\u0921\u0932\u0947\u0932\u0902 \u0906\u0939\u0947, \u0924\u0941\u092e\u094d\u0939\u0940 \u0924\u0941\u092e\u091a\u094d\u092f\u093e \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u0935\u0930 \u090f\u0915 \u0907\u092e\u0947\u0932 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e \u0907\u0902\u0938\u094d\u091f\u093e\u0901\u0932 \u0915\u0947\u0932\u0947\u0932\u093e \u0906\u0939\u0947. \u090f\u0915 \u0907\u092e\u0947\u0932 \u0938\u0902\u0926\u0947\u0936 \u092a\u093e\u0920\u0935\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e \u0915\u093e\u092f \u0906\u0935\u0936\u094d\u092f\u0915 \u0906\u0939\u0947?", "\u092a\u094d\u0930\u093f\u0902\u091f\u0930", "\u092e\u093e\u092f\u0915\u094d\u0930\u094b\u092b\u094b\u0928", "\u0935\u0947\u092c \u0915\u0945\u092e", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0915\u0928\u0947\u0915\u094d\u0936\u0928", "\u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0915\u0928\u0947\u0915\u094d\u0936\u0928"));
        this.addQuestion(new Questionsmall("4. _____ \u0907\u0902\u091f\u0930\u0928\u0947\u091f \u0938\u0947\u0935\u093e \u092b\u093e\u0908\u0932\u094d\u0938 \u0905\u092a\u0932\u094b\u0921 \u0906\u0923\u093f \u0921\u093e\u090a\u0928\u0932\u094b\u0921 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0932\u0940 \u091c\u093e\u0924\u0947.", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932 (FTP)", "\u0935\u0930\u094d\u0932\u094d\u0921 \u0935\u093e\u0907\u0921 \u0935\u0947\u092c (WWW)", "\u0939\u093e\u092f\u092a\u0930 \u091f\u0947\u0915\u094d\u0938\u094d\u091f \u092e\u093e\u0930\u094d\u0915\u0905\u092a \u0932\u0901\u0917\u094d\u0935\u0947\u091c (HTML)", "\u091c\u093e\u0935\u093e (JAVA)", "\u092b\u093e\u0908\u0932 \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u094d\u092b\u0930 \u092a\u094d\u0930\u094b\u091f\u094b\u0915\u0949\u0932 (FTP)"));
        this.addQuestion(new Questionsmall("5. ____ \u0939\u0947 \u0938\u094b\u0921\u0942\u0928, \u0907\u0924\u0930 \u0938\u0930\u094d\u0935 \u0915\u093e\u092e\u093e\u0938\u093e\u0920\u0940 \u0924\u0941\u092e\u094d\u0939\u0940 \u092b\u0947\u0938\u092c\u0941\u0915 \u0935\u093e\u092a\u0930\u0942 \u0936\u0915\u0924\u093e.", "\u0924\u0941\u092e\u091a\u0947 \u092e\u093f\u0924\u094d\u0930 \u0936\u094b\u0927\u093e", "\u0911\u0928\u0932\u093e\u0908\u0928 \u092e\u093f\u0924\u094d\u0930\u093e\u0902\u0938\u094b\u092c\u0924 \u091a\u0945\u091f \u0915\u0930\u0923\u0947", "\u0911\u0928\u0932\u093e\u0908\u0928 \u0935\u0940\u091c\u092c\u093f\u0932 \u092d\u0930\u0923\u0947", "\u0911\u0928\u0932\u093e\u0908\u0928 \u092b\u094b\u091f\u094b \u0936\u0947\u0905\u0930 \u0915\u0930\u0923\u0947", "\u0911\u0928\u0932\u093e\u0908\u0928 \u0935\u0940\u091c\u092c\u093f\u0932 \u092d\u0930\u0923\u0947"));
        this.addQuestion(new Questionsmall("6. \u0938\u0930\u094d\u0935 \u0935\u0947\u092c \u092a\u0924\u094d\u0924\u0947 \u0916\u093e\u0932\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u0936\u093e\u0938\u094b\u092c\u0924 \u0938\u0941\u0930\u0941 \u0939\u094b\u0924\u093e\u0924?", "http://", "smtp://", "url://", ".com", "http://"));
        this.addQuestion(new Questionsmall("7. _____ \u0939\u0947 \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u093f\u0902\u0917 \u0905\u0927\u093f\u0915 \u0938\u0941\u0932\u092d \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0924\u092f\u093e\u0930 \u0915\u0947\u0932\u0947\u0932\u0947 \u0935\u093f\u0936\u0947\u0937 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0906\u0939\u0947\u0924.", "\u0915\u0930\u094d\u0928\u0947\u0932", "\u092f\u0941\u091f\u0940\u0932\u093f\u091f\u0940", "\u0905\u0945\u0921\u0935\u094d\u0939\u093e\u0928\u094d\u0938 \u0938\u0949\u092b\u094d\u091f\u0935\u0947\u0905\u0930", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u094d\u0938 \u0938\u0949\u092b\u094d\u091f\u0935\u0947\u0905\u0930", "\u092f\u0941\u091f\u0940\u0932\u093f\u091f\u0940"));
        this.addQuestion(new Questionsmall("8. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u093e \u092d\u093e\u0917 \u0915\u0949\u092a\u094b\u0928\u0902\u091f \u0921\u0947\u091f\u093e \u0938\u094d\u091f\u094b\u0905\u0930 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0924\u093e\u0924?", "\u0907\u0928\u092a\u0941\u091f \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938", "\u0906\u0909\u091f\u092a\u0941\u091f \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938", "\u092e\u0947\u092e\u0930\u0940", "\u0938\u0940\u092a\u0940\u092f\u0941", "\u092e\u0947\u092e\u0930\u0940"));
        this.addQuestion(new Questionsmall("9. \u091c\u0947\u0935\u094d\u0939\u093e \u0921\u0947\u091f\u093e\u092e\u0927\u0940\u0932 \u0926\u094b\u0928 \u092d\u093e\u0917\u093e\u0902\u091a\u0940, \u0924\u094d\u092f\u093e\u0924\u0940\u0932 \u090f\u0915 \u092d\u093e\u0917 \u0926\u0941\u0938\u0931\u094d\u092f\u093e \u092d\u093e\u0917\u093e\u091a\u094d\u092f\u093e \u092c\u0930\u094b\u092c\u0930 (=) \u0906\u0939\u0947, \u0915\u0940 \u0924\u094d\u092f\u093e\u092a\u0947\u0915\u094d\u0937\u093e \u0915\u092e\u0940 (<) \u0906\u0939\u0947, \u0915\u0940 \u0924\u094d\u092f\u093e\u092a\u0947\u0915\u094d\u0937\u093e \u091c\u093e\u0938\u094d\u0924 (>) \u0906\u0939\u0947, \u0939\u0947 \u092a\u093e\u0939\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0924\u0941\u0932\u0928\u093e \u0915\u0947\u0932\u0940 \u091c\u093e\u0924\u0947, \u0924\u0947\u0935\u094d\u0939\u093e \u0924\u0947 _______ \u0905\u0938\u0924\u0947.", "\u090d\u0930\u0947\u0925\u0947\u092e\u0945\u091f\u093f\u0915 \u0911\u092a\u0930\u0947\u0936\u0928", "\u0932\u0949\u091c\u093f\u0915\u0932 \u0911\u092a\u0930\u0947\u0936\u0928", "\u092e\u0945\u0925\u0947\u092e\u0945\u091f\u093f\u0915\u0932 \u0911\u092a\u0930\u0947\u0936\u0928", "\u0917\u094d\u0930\u093e\u092b\u093f\u0915\u0932 \u0911\u092a\u0930\u0947\u0936\u0928", "\u0932\u0949\u091c\u093f\u0915\u0932 \u0911\u092a\u0930\u0947\u0936\u0928"));
        this.addQuestion(new Questionsmall("10. \u0935\u0938\u094d\u0924\u0942\u0902\u0935\u0930\u0940\u0932 \u092f\u0941\u092a\u0940\u0938\u0940\u091c\u094d \u0935\u093e\u091a\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0926\u0941\u0915\u093e\u0928\u093e\u0902\u092e\u0927\u094d\u092f\u0947 \u092c\u093e\u0930-\u0915\u094b\u0921 \u0938\u094d\u0915\u0945\u0928\u0930\u091a\u093e \u0909\u092a\u092f\u094b\u0917 \u0939\u094b\u0924\u094b.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0941\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionsmall("11. \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u091a\u094d\u092f\u093e \u0915\u093f\u092c\u094b\u0930\u094d\u0921 \u0935\u0930\u0940\u0932 \u092b\u0902\u0915\u094d\u0936\u0928 \u0915\u093f\u091c\u094d ________", "\u0939\u0947 \u0935\u093f\u0936\u0947\u0937 \u0915\u093e\u092e\u093e\u0938\u093e\u0920\u0940 \u0932\u093e\u0917\u0923\u093e\u0930\u0947 \u0915\u093f\u092c\u094b\u0930\u094d\u0921 \u0936\u0949\u0930\u094d\u091f\u0915\u091f \u0906\u0939\u0947\u0924.", "\u0939\u0947 \u0938\u093f\u0932\u0947\u0915\u094d\u0936\u0928 \u0915\u093f\u0902\u0935\u093e \u0915\u093e\u0930\u094d\u092f\u092a\u0926\u094d\u0927\u0924\u0940 \u0930\u0926\u094d\u0926 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0906\u0939\u0947\u0924.", "\u0939\u0947 \u0915\u094d\u0930\u092e\u093e\u0902\u0915 \u0935 \u0905\u0902\u0915\u0917\u0923\u093f\u0924 \u091a\u093f\u0928\u094d\u0939\u0947 \u0932\u093f\u0939\u093f\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0906\u0939\u0947\u0924.", "\u0938\u094d\u0915\u094d\u0930\u0940\u0928\u0935\u0930\u0940\u0932 \u0907\u0928\u094d\u0938\u0930\u094d\u0936\u0928 \u092a\u0949\u0907\u0902\u091f \u0915\u0902\u091f\u094d\u0930\u094b\u0932 \u0915\u0930\u0924\u093e\u0924.", "\u0939\u0947 \u0935\u093f\u0936\u0947\u0937 \u0915\u093e\u092e\u093e\u0938\u093e\u0920\u0940 \u0932\u093e\u0917\u0923\u093e\u0930\u0947 \u0915\u093f\u092c\u094b\u0930\u094d\u0921 \u0936\u0949\u0930\u094d\u091f\u0915\u091f \u0906\u0939\u0947\u0924."));
        this.addQuestion(new Questionsmall("12. \u0935\u093e\u0938\u094d\u0924\u0935\u093f\u0915 \u091a\u093f\u0924\u094d\u0930\u0947 \u0915\u093f\u0902\u0935\u093e \u0921\u0949\u0915\u094d\u092f\u0941\u092e\u0947\u0902\u091f\u0938\u094d \u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930\u0935\u0930\u0940\u0932 \u092b\u093e\u0908\u0932\u091a\u094d\u092f\u093e \u0930\u0941\u092a\u093e\u0924 \u092a\u0930\u093f\u0935\u0930\u094d\u0924\u093f\u0924 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 ______ \u0939\u0947 \u0909\u092a\u0915\u0930\u0923 \u0935\u093e\u092a\u0930\u0924\u093e\u0924.", "\u092a\u094d\u0930\u093f\u0902\u091f\u0930", "\u0938\u094d\u0915\u0945\u0928\u0930", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u092a\u094d\u0932\u0949\u091f\u0930", "\u0938\u094d\u0915\u0945\u0928\u0930"));
        this.addQuestion(new Questionsmall("13. \u092e\u093f\u0921\u093f\u092f\u093e, \u0915\u0945\u092a\u0938\u093f\u091f\u0940, \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938\u0947\u0938 \u0906\u0923\u093f \u090f\u0915\u094d\u0938\u0947\u0938 \u0938\u094d\u092a\u0940\u0921 \u0939\u0940 _____ \u091a\u0940 \u0915\u093e\u0939\u0940 \u092e\u0939\u0924\u094d\u0935\u093e\u091a\u0940 \u0935\u0948\u0936\u093f\u0937\u094d\u091f\u0947 \u0906\u0939\u0947\u0924.", "\u092e\u093e\u0909\u0938", "\u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u092e\u0949\u0928\u093f\u091f\u0930", "\u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c", "\u0938\u0947\u0915\u0902\u0921\u0930\u0940 \u0938\u094d\u091f\u094b\u0930\u0947\u091c"));
        this.addQuestion(new Questionsmall("14. \u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915\u092e\u0927\u094d\u092f\u0947 \u0915\u094b\u0923\u0924\u0940 \u091f\u0947\u0915\u094d\u0928\u094b\u0932\u0949\u091c\u0940 \u0935\u093e\u092a\u0930\u0932\u0940 \u091c\u093e\u0924\u0947 ?", "\u092e\u0947\u0915\u0945\u0928\u093f\u0915\u0932", "\u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u093f\u0915\u0932", "\u0911\u092a\u094d\u091f\u093f\u0915\u0932", "\u0932\u0947\u091c\u0930", "\u0932\u0947\u091c\u0930"));
        this.addQuestion(new Questionsmall("15. \u0924\u0941\u092e\u094d\u0939\u093e\u0932\u093e flipkart.com \u092f\u093e \u0935\u0947\u092c\u0938\u093e\u0908\u091f\u0935\u0930 \u092e\u094b\u092c\u093e\u0908\u0932 \u092b\u094b\u0928 \u0916\u0930\u0947\u0926\u0940 \u0915\u0930\u093e\u092f\u091a\u093e \u0906\u0939\u0947. \u092f\u093e \u092a\u0930\u093f\u0938\u094d\u0925\u093f\u0924\u0940\u091a\u093e \u0935\u093f\u091a\u093e\u0930 \u0915\u0930\u0924\u093e\u0928\u093e \u0924\u0941\u092e\u094d\u0939\u0940 \u0907\u0902\u091f\u0930\u0928\u0947\u091f\u0935\u0930\u0940\u0932 ______ \u0905\u0945\u0915\u094d\u091f\u093f\u0935\u093f\u091f\u0940\u091a\u093e \u0935\u093e\u092a\u0930 \u0915\u0930\u0924 \u0906\u0939\u093e\u0924.", "\u092e\u0945\u0938\u0947\u0902\u091c\u0930\u094d\u0938", "\u0907-\u0915\u0949\u092e\u0930\u094d\u0938", "\u0907-\u0915\u092e\u094d\u092f\u0941\u0928\u093f\u0915\u0947\u0936\u0928", "\u0938\u094b\u0936\u0932 \u0928\u0947\u091f\u0935\u0930\u094d\u0915\u093f\u0902\u0917", "\u0907-\u0915\u0949\u092e\u0930\u094d\u0938"));
    }

    public void addQuestion(Questionsmall questionsmall) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsmall.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsmall.getANSWER());
        contentValues.put(KEY_OPTA, questionsmall.getOptionA());
        contentValues.put(KEY_OPTB, questionsmall.getOptionB());
        contentValues.put(KEY_OPTC, questionsmall.getOptionC());
        contentValues.put(KEY_OPTD, questionsmall.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsmall> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsmall questionsmall = new Questionsmall();
                questionsmall.setId(cursor.getInt(0));
                questionsmall.setQUESTION(cursor.getString(1));
                questionsmall.setANSWER(cursor.getString(2));
                questionsmall.setOptionA(cursor.getString(3));
                questionsmall.setOptionB(cursor.getString(4));
                questionsmall.setOptionC(cursor.getString(5));
                questionsmall.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsmall);
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

