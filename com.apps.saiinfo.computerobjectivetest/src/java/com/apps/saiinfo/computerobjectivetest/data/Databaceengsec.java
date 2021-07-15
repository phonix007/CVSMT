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
import com.apps.saiinfo.computerobjectivetest.source.Questionsengsec;
import java.util.ArrayList;
import java.util.List;

public class Databaceengsec
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest11";
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

    public Databaceengsec(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsengsec("1. Hard disk store and organize files using all the following, EXCEPT____", "Track", "Sectors", "Cylinders", "Paths", "Paths"));
        this.addQuestion(new Questionsengsec("2. Secondary Storage Provides Permanent or Non volatile storage.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsengsec("3. Refer the image No.1 given below. Data stored in this part is only there while the power is on.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionsengsec("4. The actual physical material that holds the data and programs in a storage device is called as ____", "Media", "Sequential storage", "Direct storage", "None of these", "Media"));
        this.addQuestion(new Questionsengsec("5. USB Drives are also known as Flash Drives.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsengsec("6. An external hard disk ____", "Is heavy", "Is hard to remove", "Usually connects to a USB or Firewire port", "Cannot be used in addition to an internal hard disk", "Usually connects to a USB or Firewire port"));
        this.addQuestion(new Questionsengsec("7. Optical Disk use these to represent data.", "Analog Signals", "Pits and lands", "Digital beams", "Magnetic charge", "Pits and lands"));
        this.addQuestion(new Questionsengsec("8. Refer the image No.2 given below. Output of an image of these device is often called as Hardcopy.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsengsec("9. Smartphones are uses ______ storage technologies.", "Flash Drive", "Optical Drive", "Flash Memory Card", "Solid State Drive", "Flash Memory Card"));
        this.addQuestion(new Questionsengsec("10. Refer the image No.3 given below. Identify the name of the given image.", "RAM", "Hard Disk", "Printer", "Scanner", "RAM"));
        this.addQuestion(new Questionsengsec("11. Microseconds, Nanoseconds and Picoseconds are measurement units of printed outputs.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionsengsec("12. Refer the image No.4 given below. Identify the name of the given image.", "RAM", "Motherboard", "CD ROM", "Hard Disk", "Hard Disk"));
        this.addQuestion(new Questionsengsec("13. RAM is considered temporary or volatile storage.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsengsec("14. Media are the actual physical material that holds the data and programs.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsengsec("15. Data stored in this type of memory cannot be changed.", "RAM", "ROM", "Flash Memory", "Virtual Memory", "ROM"));
    }

    public void addQuestion(Questionsengsec questionsengsec) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsengsec.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsengsec.getANSWER());
        contentValues.put(KEY_OPTA, questionsengsec.getOptionA());
        contentValues.put(KEY_OPTB, questionsengsec.getOptionB());
        contentValues.put(KEY_OPTC, questionsengsec.getOptionC());
        contentValues.put(KEY_OPTD, questionsengsec.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsengsec> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsengsec questionsengsec = new Questionsengsec();
                questionsengsec.setId(cursor.getInt(0));
                questionsengsec.setQUESTION(cursor.getString(1));
                questionsengsec.setANSWER(cursor.getString(2));
                questionsengsec.setOptionA(cursor.getString(3));
                questionsengsec.setOptionB(cursor.getString(4));
                questionsengsec.setOptionC(cursor.getString(5));
                questionsengsec.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsengsec);
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

