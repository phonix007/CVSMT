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
 *  com.apps.saiinfo.computerobjectivetest.source.Questionssystem
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
import com.apps.saiinfo.computerobjectivetest.source.Questionssystem;
import java.util.ArrayList;
import java.util.List;

public class Databacesystem
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest29";
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

    public Databacesystem(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssystem("1. A ____ is a socket for external devices to connect to the system unit.", "RAM", "Port", "ROM", "Flash", "Port"));
        this.addQuestion(new Questionssystem("2. Which among the following is smallest in size?", "PDA System Unit", "Desktop System Unit", "Notebook System Unit", "Tablet PCs", "PDA System Unit"));
        this.addQuestion(new Questionssystem("3. Desktop computers have a power supply unit located within the system unit.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssystem("4. You want to connect your computer to another computer. referring the above scenario, identify name of the card which you will require.", "Sound Card", "PC Card", "Network Interface Card", "TV Tuner Card", "Network Interface Card"));
        this.addQuestion(new Questionssystem("5. Which of the following will you require to hear music on your computer?", "Sound Card", "Network Card", "Joystick", "Modem Card", "Sound Card"));
        this.addQuestion(new Questionssystem("6. The ____ is the electric pathway between components in the computer.", "Port", "Bus", "Slot", "Hard Disk", "Bus"));
        this.addQuestion(new Questionssystem("7. A 32 -bit word computer can access ____ bytes at a time.", "Four (4)", "Eight (8)", "Sixteen (16)", "Thirty two (32)", "Four (4)"));
        this.addQuestion(new Questionssystem("8. Data stored in this type of memory cannot be changed.", "Flash Memory", "Virtual Memory", "RAM", "ROM", "ROM"));
        this.addQuestion(new Questionssystem("9. Microprocessor has two basic components.", "System Unit, Arithmetic Logical Unit", "Control Unit, Arithmetic Logical Unit", "Control Unit, System Unit", "None of these", "Control Unit, Arithmetic Logical Unit"));
        this.addQuestion(new Questionssystem("10. The Mainboard or Motherboard is also known as ____", "First Board", "Control Board", "Board Processor", "System Board", "System Board"));
        this.addQuestion(new Questionssystem("11. Which of the following program is not a utility?", "MS Paint", "Disk Cleanup", "Disk Caching", "File Compression", "MS Paint"));
        this.addQuestion(new Questionssystem("12. Which of the following is a data processing unit.", "RAM", "ROM", "CPU", "Hard Disk", "CPU"));
        this.addQuestion(new Questionssystem("13. Microprocessor and Memory are the important components of ____", "Desktop", "Input Device", "Output Device", "System Unit", "System Unit"));
        this.addQuestion(new Questionssystem("14. ____ hardware component is used to control the operation of computer system.", "Keyboard", "Headphone", "Accessories", "Processor", "Processor"));
        this.addQuestion(new Questionssystem("15. The ____ display a list of commands that can be used to gain access to information, change hardware settings, find information stored in the computer, get online help and shut down computer.", "GUI", "Desktop", "Start Button", "Icon", "Start Button"));
    }

    public void addQuestion(Questionssystem questionssystem) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssystem.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssystem.getANSWER());
        contentValues.put(KEY_OPTA, questionssystem.getOptionA());
        contentValues.put(KEY_OPTB, questionssystem.getOptionB());
        contentValues.put(KEY_OPTC, questionssystem.getOptionC());
        contentValues.put(KEY_OPTD, questionssystem.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssystem> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssystem questionssystem = new Questionssystem();
                questionssystem.setId(cursor.getInt(0));
                questionssystem.setQUESTION(cursor.getString(1));
                questionssystem.setANSWER(cursor.getString(2));
                questionssystem.setOptionA(cursor.getString(3));
                questionssystem.setOptionB(cursor.getString(4));
                questionssystem.setOptionC(cursor.getString(5));
                questionssystem.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssystem);
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

