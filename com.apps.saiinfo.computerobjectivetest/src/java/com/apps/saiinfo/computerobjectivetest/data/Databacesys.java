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
import com.apps.saiinfo.computerobjectivetest.source.Questionssys;
import java.util.ArrayList;
import java.util.List;

public class Databacesys
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest28";
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

    public Databacesys(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssys("1. GUI stands for _______", "Graphical User Interest", "Graphical Union Interface", "Graphical User Interface", "Greater User Interface", "Graphical User Interface"));
        this.addQuestion(new Questionssys("2. ____ are graphical objects used to represent commonly used application.", "Icons", "GUI", "Drivers", "Windows NT", "Icons"));
        this.addQuestion(new Questionssys("3. ____ are used to store data and programs.", "Folder", "File", "Recycle bin", "None of these", "File"));
        this.addQuestion(new Questionssys("4. Starting or restarting a computer is called _____ the system.", "Booting", "Coping", "Pasting", "Multitasking", "Booting"));
        this.addQuestion(new Questionssys("5. Microprocessor is often called a CPU.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssys("6. ____ is also known as the system cabinet or chassis.", "Monitor", "Keyboard", "System Unit", "None of these", "System Unit"));
        this.addQuestion(new Questionssys("7. Primary function of a common keyboard in a computer is to play music like a piano.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionssys("8. Using ____ you can easily access any part of the screen in the windows operating system.", "Mouse", "Keyboard", "Joystick", "None of these", "Mouse"));
        this.addQuestion(new Questionssys("9. ____ is the ability of the operating system to run more than one application at a time.", "Booting", "Coping", "Pasting", "Multitasking", "Multitasking"));
        this.addQuestion(new Questionssys("10. The internal memory of the computer is present on the motherboard in the form of chips.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssys("11. ____ is a 16-bit code designed to support international languages like chines and japanese.", "ASCII", "EBCDIC", "Unicode", "None of these", "Unicode"));
        this.addQuestion(new Questionssys("12. Storage device are hardware that reads data and programs from storage media.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssys("13. MIRC used for read data on the check in banks.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssys("14. Which of the following holds the ROM, RAM, CPU?", "ALU", "Hard Disk", "Motherboard", "Compact Disk", "Motherboard"));
        this.addQuestion(new Questionssys("15. Which of the following is not an operating system?", "Internet Explorer", "Mac OS", "Unix", "Windows 7", "Internet Explorer"));
    }

    public void addQuestion(Questionssys questionssys) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssys.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssys.getANSWER());
        contentValues.put(KEY_OPTA, questionssys.getOptionA());
        contentValues.put(KEY_OPTB, questionssys.getOptionB());
        contentValues.put(KEY_OPTC, questionssys.getOptionC());
        contentValues.put(KEY_OPTD, questionssys.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssys> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssys questionssys = new Questionssys();
                questionssys.setId(cursor.getInt(0));
                questionssys.setQUESTION(cursor.getString(1));
                questionssys.setANSWER(cursor.getString(2));
                questionssys.setOptionA(cursor.getString(3));
                questionssys.setOptionB(cursor.getString(4));
                questionssys.setOptionC(cursor.getString(5));
                questionssys.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssys);
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

