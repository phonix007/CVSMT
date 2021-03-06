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
import com.apps.saiinfo.computerobjectivetest.source.Questionssecmar;
import java.util.ArrayList;
import java.util.List;

public class Databacesecmar
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest15";
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

    public Databacesecmar(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssecmar("1. \u0930\u0945\u092e, \u0930\u0949\u092e \u0906\u0923\u093f \u092b\u094d\u0932\u0945\u0936 \u0939\u0947 _____ \u091a\u0947 \u092c\u0939\u0941\u092a\u0930\u093f\u091a\u093f\u0924 \u092a\u094d\u0930\u0915\u093e\u0930 \u0906\u0939\u0947\u0924.", "\u092e\u0947\u092e\u0930\u0940 \u091a\u093f\u092a\u094d\u0938", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u0907\u0928\u092a\u0941\u091f \u0909\u092a\u0915\u0930\u0923\u0947", "\u0906\u0909\u091f\u092a\u0941\u091f \u0909\u092a\u0915\u0930\u0923\u0947", "\u092e\u0947\u092e\u0930\u0940 \u091a\u093f\u092a\u094d\u0938"));
        this.addQuestion(new Questionssecmar("2. \u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u0915\u0945\u0930\u0947\u0915\u094d\u091f\u0930 \u0930\u0947\u0915\u0917\u094d\u0928\u093f\u0936\u0928 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0935 \u0911\u092a\u094d\u091f\u093f\u0915\u0932 \u092e\u093e\u0930\u094d\u0915 \u0930\u0947\u0915\u0917\u094d\u0928\u093f\u0936\u0928 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u0939\u0940 \u0926\u094b\u0928\u094d\u0939\u0940\u0939\u0940 \u0928\u093e\u0935\u0947 \u090f\u0915\u093e\u091a \u0909\u092a\u0915\u0930\u0923\u093e\u091a\u0940 \u0906\u0939\u0947\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u091a\u0942\u0915"));
        this.addQuestion(new Questionssecmar("3. \u0916\u093e\u0932\u0940\u0932\u092a\u0948\u0915\u0940 ______ \u0939\u0940 \u0938\u094b\u0921\u0942\u0928 \u0907\u0924\u0930 \u0938\u0930\u094d\u0935 \u0909\u091a\u094d\u091a \u0915\u094d\u0937\u092e\u0924\u0947\u091a\u094d\u092f\u093e \u0939\u093e\u092f \u0915\u0945\u092a\u0947\u0938\u093f\u091f\u0940 \u0921\u093f\u0938\u094d\u0915\u0938 \u0906\u0939\u0947\u0924.", "\u0939\u093e\u092f \u090f\u092b. \u0921\u0940. \u0921\u093f\u0938\u094d\u0915", "\u0921\u094d\u0930\u093e\u092f\u0935\u094d\u0939\u0930\u094d\u0938", "\u0938\u0941\u092a\u0930 \u0921\u093f\u0938\u094d\u0915", "\u091d\u093f\u092a \u0921\u093f\u0938\u094d\u0915", "\u0921\u094d\u0930\u093e\u092f\u0935\u094d\u0939\u0930\u094d\u0938"));
        this.addQuestion(new Questionssecmar("4. \u090f\u0915 \u092b\u094b\u091f\u094b \u0907\u0932\u0947\u0915\u094d\u091f\u094d\u0930\u093f\u0915 \u0938\u094d\u0915\u0945\u0928\u0930 \u091c\u094b \u092a\u094d\u0930\u0915\u094d\u0930\u093f\u092f\u093e \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u092c\u093e\u0930\u0915\u094b\u0921 \u0935\u093e\u091a\u0924\u094b \u0924\u094d\u092f\u093e\u0932\u093e _____ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u092c\u093e\u0930\u0915\u094b\u0921 \u0930\u0940\u0921\u0930", "\u0921\u0949\u091f \u092a\u093f\u091a", "\u092a\u094d\u0932\u0945\u091f\u092b\u0949\u0930\u094d\u092e \u0938\u094d\u0915\u0945\u0928\u0930", "\u0925\u093f\u0928 \u092b\u093f\u0932\u094d\u092e \u091f\u094d\u0930\u093e\u0928\u094d\u0938\u093f\u0938\u094d\u091f\u0930 \u092e\u0949\u0928\u093f\u091f\u0930", "\u092c\u093e\u0930\u0915\u094b\u0921 \u0930\u0940\u0921\u0930"));
        this.addQuestion(new Questionssecmar("5. \u0930\u093f\u0921 \u0913\u0928\u094d\u0932\u0940, \u0930\u093e\u0907\u091f \u0935\u0928\u094d\u0938 \u0906\u0923\u093f \u0930\u093f\u0930\u093e\u092f\u091f\u0947\u092c\u0932 \u0939\u0947 \u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915\u091a\u0947 \u0924\u0940\u0928 \u092e\u0941\u0932\u092d\u0942\u0924 \u092a\u094d\u0930\u0915\u093e\u0930 \u0906\u0939\u0947\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionssecmar("6. \u090f\u0915 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938 \u091c\u0938\u0947 \u0915\u0940 \u0921\u093f\u091c\u093f\u091f\u0932 \u0915\u0945\u092e\u0947\u0930\u093e \u0915\u093f\u0902\u0935\u093e \u0921\u093f\u091c\u093f\u091f\u0932 \u0935\u094d\u0939\u093f\u0921\u093f\u0913 \u0915\u0945\u092e\u0947\u0930\u093e \u091c\u094b \u092a\u094d\u0930\u093e\u0930\u0902\u092d\u093f\u0915 \u0907\u092e\u0947\u091c\u0947\u0938 \u092c\u0928\u0935\u0924\u094b \u0915\u093f\u0902\u0935\u093e \u0915\u0945\u092a\u094d\u091a\u0930 \u0915\u0930\u0924\u094b, \u0924\u094d\u092f\u093e\u0932\u093e ______ \u092e\u094d\u0939\u0923\u0924\u093e\u0924.", "\u0907\u0928\u092a\u0941\u091f", "\u0915\u094d\u0932\u0945\u0930\u093f\u091f\u0940", "\u0907\u092e\u0947\u091c \u0915\u0945\u092a\u094d\u091a\u0930\u093f\u0902\u0917 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938", "\u092e\u094d\u092f\u0941\u091d\u093f\u0915\u0932 \u0907\u0928\u094d\u0938\u091f\u094d\u0930\u0941\u092e\u0947\u0902\u091f \u0921\u093f\u091c\u093f\u091f\u0932 \u0907\u0902\u091f\u0930\u092b\u0947\u0938", "\u0907\u092e\u0947\u091c \u0915\u0945\u092a\u094d\u091a\u0930\u093f\u0902\u0917 \u0921\u093f\u0935\u094d\u0939\u093e\u0907\u0938"));
        this.addQuestion(new Questionssecmar("7. \u092a\u094d\u0930\u093f\u0902\u091f\u0930\u091a\u0947 \u0930\u093f\u091d\u094b\u0932\u094d\u092f\u0942\u0936\u0928 \u0920\u0930\u0935\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 ______ \u092f\u093e \u092e\u0947\u091c\u0930\u092e\u0947\u0902\u091f\u091a\u093e \u0909\u092a\u092f\u094b\u0917 \u0915\u0947\u0932\u093e \u091c\u093e\u0924\u094b.", "\u090f.\u092a\u0940.\u0906\u092f. (api)", "\u0938\u0940.\u092a\u0940.\u0906\u092f. (cpi)", "\u0921\u0940.\u092a\u0940.\u0906\u092f. (dpi)", "\u092c\u0940.\u092a\u0940.\u0906\u092f. (bpi)", "\u0921\u0940.\u092a\u0940.\u0906\u092f. (dpi)"));
        this.addQuestion(new Questionssecmar("8. \u092a\u0941\u0922\u0947 \u0926\u093f\u0932\u0947\u0932\u0947 \u092e\u0947\u092e\u0930\u0940\u091a\u0947 \u090f\u0915\u0915 \u092f\u0941\u0928\u093f\u091f \u0906\u0939\u0947\u0924, ______ \u0936\u093f\u0935\u093e\u092f.", "\u0928\u0945\u0928\u094b \u092c\u093e\u0908\u091f (NB)", "\u092e\u0947\u0917\u093e \u092c\u093e\u0908\u091f (MB)", "\u0917\u093f\u0917\u093e \u092c\u093e\u0908\u091f (GB)", "\u092c\u093e\u0908\u091f (Byte)", "\u0928\u0945\u0928\u094b \u092c\u093e\u0908\u091f (NB)"));
        this.addQuestion(new Questionssecmar("9. \u092e\u094b\u0920\u0947 \u0906\u0930\u093e\u0916\u0921\u0947 \u092a\u094d\u0930\u093f\u0902\u091f \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u0938\u094d\u0924\u0941\u0936\u093e\u0938\u094d\u0924\u094d\u0930\u091c\u094d\u091e \u0938\u0930\u094d\u0935\u0938\u093e\u0927\u093e\u0930\u0923\u092a\u0923\u0947 \u092f\u093e\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u093e \u092a\u094d\u0930\u093f\u0902\u091f\u0930 \u0935\u093e\u092a\u0930\u0923\u094d\u092f\u093e\u091a\u0940 \u0936\u0915\u094d\u092f\u0924\u093e \u0905\u0938\u0947\u0932.", "\u0907\u0902\u0915\u091c\u0947\u091f \u092a\u094d\u0930\u093f\u0902\u091f\u0930\u094d\u0938", "\u0921\u0949\u091f \u092e\u0945\u091f\u094d\u0930\u093f\u0915\u094d\u0938 \u092a\u094d\u0930\u093f\u0902\u091f\u0930\u094d\u0938", "\u092a\u094d\u0932\u0949\u091f\u0930\u094d\u0938", "\u0932\u0947\u0938\u0930 \u092a\u094d\u0930\u093f\u0902\u091f\u0930\u094d\u0938", "\u092a\u094d\u0932\u0949\u091f\u0930\u094d\u0938"));
        this.addQuestion(new Questionssecmar("10. _____ \u0939\u0947 \u0921\u0947\u091f\u093e \u0935 \u092a\u094d\u0930\u094b\u0917\u094d\u0930\u0945\u092e\u094d\u0938 \u0938\u094d\u091f\u094b\u0905\u0930 \u0915\u0930\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u0935\u093e\u092a\u0930\u0924\u093e\u0924.", "\u0930\u093f\u0938\u093e\u092f\u0915\u0932 \u092c\u0940\u0928", "\u0906\u092f\u0915\u0949\u0928\u094d\u0938", "\u092e\u0947\u0928\u094d\u092f\u0942\u091c", "\u092b\u093e\u0908\u0932", "\u092b\u093e\u0908\u0932"));
        this.addQuestion(new Questionssecmar("11. \u0906\u092a\u0932\u093e \u0906\u0935\u093e\u091c \u0905\u0945\u0928\u093e\u0932\u0949\u0917 \u0938\u093f\u0917\u094d\u0928\u0932 \u0924\u092f\u093e\u0930 \u0915\u0930\u0924\u094b, \u091c\u0947 \u0935\u093f\u0935\u093f\u0927 \u0938\u0942\u0930 \u0938\u094d\u0935\u0930\u092e\u093e\u0928 \u0906\u0923\u093f \u0927\u094d\u0935\u0928\u093f\u092e\u093e\u0928 \u0926\u0930\u094d\u0936\u0935\u093f\u0923\u094d\u092f\u093e\u0938\u093e\u0920\u0940 \u092c\u0926\u0932\u0924\u093e\u0924.", "\u092c\u0930\u094b\u092c\u0930", "\u091a\u0942\u0915", "", "", "\u092c\u0930\u094b\u092c\u0930"));
        this.addQuestion(new Questionssecmar("12. \u092c\u0939\u0941\u0924\u093e\u0902\u0936 \u092e\u093e\u092f\u0915\u094d\u0930\u094b\u0915\u0902\u092a\u094d\u092f\u0941\u091f\u0930 \u0938\u093f\u0938\u094d\u091f\u093f\u092e\u092e\u0927\u094d\u092f\u0947 \u0907\u0902\u091f\u0930\u094d\u0928\u0932 \u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915 \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939 _____ \u092f\u093e \u0928\u093e\u0935\u093e\u0928\u0947 \u0905\u0938\u0924\u094b.", "\u0908 (E) \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939", "\u090f\u092b (F) \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939", "\u0938\u0940 (C) \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939", "\u092c\u093e\u0939\u094d\u092f \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939", "\u0938\u0940 (C) \u0921\u094d\u0930\u093e\u0908\u0935\u094d\u0939"));
        this.addQuestion(new Questionssecmar("13. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u0947 \u092a\u094b\u0930\u094d\u091f\u0947\u092c\u0932 \u0938\u094d\u091f\u094b\u0930\u0947\u091c \u0909\u092a\u0915\u0930\u0923 \u0906\u0939\u0947?", "\u0921\u093f\u091c\u093f\u091f\u0932 \u0935\u094d\u0939\u0930\u094d\u0938\u091f\u093e\u0907\u0932 \u0921\u093f\u0938\u094d\u0915", "\u0921\u093f\u091c\u093f\u091f\u0932 \u0938\u094d\u0915\u0945\u0928\u0930", "\u0921\u093f\u091c\u093f\u091f\u0932 \u0915\u093f\u092c\u094b\u0930\u094d\u0921", "\u092c\u093e\u0930 \u0915\u094b\u0921 \u0938\u094d\u0915\u0945\u0928\u0930", "\u0921\u093f\u091c\u093f\u091f\u0932 \u0935\u094d\u0939\u0930\u094d\u0938\u091f\u093e\u0907\u0932 \u0921\u093f\u0938\u094d\u0915"));
        this.addQuestion(new Questionssecmar("14. \u092a\u0941\u0922\u0940\u0932\u092a\u0948\u0915\u0940 \u0915\u094b\u0923\u0924\u0947 \u0909\u092a\u0915\u0930\u0923 \u092e\u094b\u0920\u094d\u092f\u093e \u092a\u094d\u0930\u092e\u093e\u0923\u093e\u0924\u0940\u0932 \u0921\u0947\u091f\u093e \u0938\u0902\u0915\u0932\u093f\u0924 \u0915\u0930\u0941 \u0936\u0915\u0924\u094b?", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915", "\u092b\u094d\u0932\u0949\u092a\u0940 \u0921\u093f\u0938\u094d\u0915", "\u0915\u0949\u092e\u094d\u092a\u0945\u0915\u094d\u091f \u0921\u093f\u0938\u094d\u0915", "\u0938\u094d\u0915\u0945\u0928\u0930", "\u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915"));
        this.addQuestion(new Questionssecmar("15. \u0939\u093e\u0930\u094d\u0921 \u0921\u093f\u0938\u094d\u0915\u091a\u094d\u092f\u093e \u092a\u0943\u0937\u094d\u0920\u092d\u093e\u0917\u093e\u0935\u0930 \u0913\u0930\u0916\u0921\u093e \u092f\u0947\u0924\u094b \u0906\u0923\u093f \u0915\u093e\u0939\u0940 \u0915\u093f\u0902\u0935\u093e \u0938\u0902\u092a\u0942\u0930\u094d\u0923 \u0921\u0947\u091f\u093e \u0928\u0937\u094d\u091f \u0939\u094b\u0924\u094b \u091c\u0947\u0935\u094d\u0939\u093e _____ \u0939\u094b\u0924\u0947.", "\u091f\u094d\u0930\u0945\u0915 \u0915\u094d\u0930\u0945\u0936", "\u0938\u0947\u0915\u094d\u091f\u0930 \u0915\u094d\u0930\u0945\u0936", "\u0939\u0947\u0921 \u0915\u094d\u0930\u0945\u0936", "\u0938\u093f\u0932\u093f\u0902\u0921\u0930 \u0915\u094d\u0930\u0945\u0936", "\u0939\u0947\u0921 \u0915\u094d\u0930\u0945\u0936"));
    }

    public void addQuestion(Questionssecmar questionssecmar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssecmar.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssecmar.getANSWER());
        contentValues.put(KEY_OPTA, questionssecmar.getOptionA());
        contentValues.put(KEY_OPTB, questionssecmar.getOptionB());
        contentValues.put(KEY_OPTC, questionssecmar.getOptionC());
        contentValues.put(KEY_OPTD, questionssecmar.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssecmar> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssecmar questionssecmar = new Questionssecmar();
                questionssecmar.setId(cursor.getInt(0));
                questionssecmar.setQUESTION(cursor.getString(1));
                questionssecmar.setANSWER(cursor.getString(2));
                questionssecmar.setOptionA(cursor.getString(3));
                questionssecmar.setOptionB(cursor.getString(4));
                questionssecmar.setOptionC(cursor.getString(5));
                questionssecmar.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssecmar);
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

