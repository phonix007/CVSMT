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
 *  com.apps.saiinfo.computerobjectivetest.source.Questionsunit
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
import com.apps.saiinfo.computerobjectivetest.source.Questionsunit;
import java.util.ArrayList;
import java.util.List;

public class Databaceunit
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest30";
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

    public Databaceunit(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsunit("1. ______ type of signal created by our voices.", "Binary", "Digital", "Analog", "Hybrid", "Analog"));
        this.addQuestion(new Questionsunit("2. Refer the image No.1 given below. Identify the name of the given image.", "Hard Disk", "DVD Drive", "Motherboard", "RAM", "Motherboard"));
        this.addQuestion(new Questionsunit("3. Which operation is not performed by the computer.", "Inputting", "Controlling", "Processing", "Understanding", "Understanding"));
        this.addQuestion(new Questionsunit("4. Following are the types of microcomputer, EXCEPT ____", "Tablet", "Laptops", "Primary Systems", "Desktop System", "Primary Systems"));
        this.addQuestion(new Questionsunit("5. Microseconds, Nanoseconds and Picoseconds are measurement units of printed outputs.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionsunit("6. Refer the image No.2 given below. Identify the name of the given image.", "Hard Disk", "DVD Drive", "Motherboard", "Central Processing Unit", "Central Processing Unit"));
        this.addQuestion(new Questionsunit("7. With these systems, input and output devices are located outside the  system unit.", "PDAs", "Laptops", "Smartphones", "Desktop Systems", "Desktop Systems"));
        this.addQuestion(new Questionsunit("8. RAM is considered temporary or volatile storage.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsunit("9. The ______ system consists of only two digits, 0 and 1.", "Digital", "Binary", "Analog", "Decimal", "Binary"));
        this.addQuestion(new Questionsunit("10. Refer the image No.3 given below. Which of the following port is shown in the given below image No.3?", "PS2", "USB", "MIDI", "HDMI", "USB"));
        this.addQuestion(new Questionsunit("11. Desktop computers have a Power Supply Unit located within the system unit.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsunit("12. ____ Hardware component is used to control the operation of a computer system.", "Mouse", "Processor", "Accessories", "Headphone", "Processor"));
        this.addQuestion(new Questionsunit("13. This type of computer is a thin slab that is almost all monitors with the system unit located behind the monitor.", "Tablet", "Laptops", "Desktop System", "None of these", "Tablet"));
        this.addQuestion(new Questionsunit("14. Refer the image No.4 given below. Data stored in this part is only there while the power is on.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsunit("15. _____ also known as handheld computers, are the smallest and are designed to comfortably fit into the palm of one hand.", "Laptops", "Smartphones", "Desktop Computer", "None of these", "Smartphones"));
    }

    public void addQuestion(Questionsunit questionsunit) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsunit.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsunit.getANSWER());
        contentValues.put(KEY_OPTA, questionsunit.getOptionA());
        contentValues.put(KEY_OPTB, questionsunit.getOptionB());
        contentValues.put(KEY_OPTC, questionsunit.getOptionC());
        contentValues.put(KEY_OPTD, questionsunit.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsunit> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsunit questionsunit = new Questionsunit();
                questionsunit.setId(cursor.getInt(0));
                questionsunit.setQUESTION(cursor.getString(1));
                questionsunit.setANSWER(cursor.getString(2));
                questionsunit.setOptionA(cursor.getString(3));
                questionsunit.setOptionB(cursor.getString(4));
                questionsunit.setOptionC(cursor.getString(5));
                questionsunit.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsunit);
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

