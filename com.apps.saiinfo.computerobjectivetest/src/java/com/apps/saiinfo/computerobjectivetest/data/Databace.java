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
import com.apps.saiinfo.computerobjectivetest.source.Questions;
import java.util.ArrayList;
import java.util.List;

public class Databace
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest";
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

    public Databace(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questions("1. Which of these is not an input device?", "Keyboard", "Monitor", "Mouse", "Scanner", "Monitor"));
        this.addQuestion(new Questions("2. Which of the following key is not a toggle key?", "Caps Lock", "Num Lock", "Control", "Scroll Lock", "Control"));
        this.addQuestion(new Questions("3. The keyboard keys that have arrows on them are called _______", "Numeric Keys", "Navigation Keys", "Function Keys", "Toggle Keys", "Navigation Keys"));
        this.addQuestion(new Questions("4. Touch surface is a pointing type device.", "True", "False", "", "", "True"));
        this.addQuestion(new Questions("5. _____ Devices translate what people understand into a form that computers can process.", "Input", "Output", "Hardware", "None of these", "Input"));
        this.addQuestion(new Questions("6. _____ is a light-sensitive pen like device.", "Joystick", "Scanner", "Light Pen", "Touch Screen", "Light Pen"));
        this.addQuestion(new Questions("7. The keyboard keys that are labelled F1, F2 and so on are called _____", "Typewriter Keys", "Numeric Keys", "Navigation Keys", "Function Keys", "Function Keys"));
        this.addQuestion(new Questions("8. The functions of a mouse and a trackball are different.", "True", "False", "", "", "False"));
        this.addQuestion(new Questions("9. Output of an image through a printer is often called _____", "Softcopy", "Hardcopy", "All of these", "None of these", "Hardcopy"));
        this.addQuestion(new Questions("10. The most important characteristic of a monitor is its _____", "Dot Pitch", "Resolution", "Clarity", "Pixel", "Clarity"));
        this.addQuestion(new Questions("11. Printers can be connected to a computer for producing output on a paper.", "True", "False", "", "", "True"));
        this.addQuestion(new Questions("12. Ink-Jet, Laser and Thermal are common types of _____", "Keyboard", "Monitor", "Joystick", "Printer", "Printer"));
        this.addQuestion(new Questions("13. This type of mouse emit and senses light to detect mouse movement.", "Mechanical", "Optical", "Trackpad", "Pointing Stick", "Optical"));
        this.addQuestion(new Questions("14. A _____ is a pen like device commonly used with tablet PCs and PDAs.", "Joystick", "Mouse", "Stylus", "Scanner", "Stylus"));
        this.addQuestion(new Questions("15. Warm boot and cold boot are the two ways to _____ a computer.", "Restore", "Start or Restart", "Lock", "Log off", "Start or Restart"));
    }

    public void addQuestion(Questions questions) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questions.getQUESTION());
        contentValues.put(KEY_ANSWER, questions.getANSWER());
        contentValues.put(KEY_OPTA, questions.getOptionA());
        contentValues.put(KEY_OPTB, questions.getOptionB());
        contentValues.put(KEY_OPTC, questions.getOptionC());
        contentValues.put(KEY_OPTD, questions.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questions> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questions questions = new Questions();
                questions.setId(cursor.getInt(0));
                questions.setQUESTION(cursor.getString(1));
                questions.setANSWER(cursor.getString(2));
                questions.setOptionA(cursor.getString(3));
                questions.setOptionB(cursor.getString(4));
                questions.setOptionC(cursor.getString(5));
                questions.setOptionD(cursor.getString(6));
                arrayList.add((Object)questions);
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

