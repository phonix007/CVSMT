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
import com.apps.saiinfo.computerobjectivetest.source.Questionsseng;
import java.util.ArrayList;
import java.util.List;

public class Databaceseng
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest10";
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

    public Databaceseng(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsseng("1. A ____ is a concentric ring.", "Sector", "Track", "Round", "Oval", "Track"));
        this.addQuestion(new Questionsseng("2. A ____ is a measuring unit of computer memory.", "Kilogram", "Meter", "Kilobytes", "Celsius", "Kilobytes"));
        this.addQuestion(new Questionsseng("3. Which of the following is not a portable storage device.", "Hard Disk", "Floppy Disk", "Optical Disk", "RAM Chips", "Hard Disk"));
        this.addQuestion(new Questionsseng("4. CD-RW stands for _____", "CD Recordable", "CD Receiver", "CD Runner", "CD Rewritable", "CD Rewritable"));
        this.addQuestion(new Questionsseng("5. Primary storage is volatile.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsseng("6. Each track is divided into wedge-shapes section called ___", "Round", "Track", "Sector", "Oval", "Sector"));
        this.addQuestion(new Questionsseng("7. Each 0 and 1 in the binary numbering system is called a bit.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsseng("8. ____ Bits make up a byte.", "Four", "Six", "Eight", "Twelve", "Eight"));
        this.addQuestion(new Questionsseng("9. Secondary storage is non-volatile.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsseng("10. ____ is the process of accessing information from a secondary storage device.", "Writing", "Listening", "Reading", "Speaking", "Reading"));
        this.addQuestion(new Questionsseng("11. Capacity of a storage device is usually measured in terms of bytes.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsseng("12. A CD-ROM stands for ______", "Compact disk read once memory", "Central disk read only memory", "Compact disk read only memory", "Copy disk read only memory", "Compact disk read only memory"));
        this.addQuestion(new Questionsseng("13. This type of storage has no moving parts.", "Floppy disk", "Optical disk", "Hard disk", "Solid state", "Solid state"));
        this.addQuestion(new Questionsseng("14. In order to play and hear sound on a computer, one needs.", "Microphone", "Sound card and Speakers", "Printer", "Scanner", "Sound card and Speakers"));
        this.addQuestion(new Questionsseng("15. The smallest unit in a digital system is a _____", "Text", "Character", "Bit", "Mega Byte", "Bit"));
    }

    public void addQuestion(Questionsseng questionsseng) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsseng.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsseng.getANSWER());
        contentValues.put(KEY_OPTA, questionsseng.getOptionA());
        contentValues.put(KEY_OPTB, questionsseng.getOptionB());
        contentValues.put(KEY_OPTC, questionsseng.getOptionC());
        contentValues.put(KEY_OPTD, questionsseng.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsseng> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsseng questionsseng = new Questionsseng();
                questionsseng.setId(cursor.getInt(0));
                questionsseng.setQUESTION(cursor.getString(1));
                questionsseng.setANSWER(cursor.getString(2));
                questionsseng.setOptionA(cursor.getString(3));
                questionsseng.setOptionB(cursor.getString(4));
                questionsseng.setOptionC(cursor.getString(5));
                questionsseng.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsseng);
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

