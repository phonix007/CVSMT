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
import com.apps.saiinfo.computerobjectivetest.source.Questionsall;
import java.util.ArrayList;
import java.util.List;

public class Databaceall
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest46";
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

    public Databaceall(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsall("1. Notebook system units are often called as ______", "Desktop", "Laptop", "PDA", "All of these", "Laptop"));
        this.addQuestion(new Questionsall("2. Output of an image on the monitor screen is often called ______", "Softcopy", "Hardcopy", "All of these", "None of these", "Softcopy"));
        this.addQuestion(new Questionsall("3. Dot Matrix printer are sound loudly ?", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsall("4. The mouse pointer seen on the desktop is also called as ______", "Key Pointer", "Display Pointer", "Mouse Pointer", "Aero Pointer", "Aero Pointer"));
        this.addQuestion(new Questionsall("5. _____ is used for store component data.", "RAM", "Hard Disk", "Floppy Disk", "Optical Disk", "RAM"));
        this.addQuestion(new Questionsall("6. Which of the following is a data processing unit ?", "RAM", "Hard Disk", "CPU", "Optical Disk", "CPU"));
        this.addQuestion(new Questionsall("7. ASCII, EBCDIC and unicode are binary coding schemes.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsall("8. _____ is the unit of memory.", "RAM", "Hard Disk", "CPU", "Optical Disk", "RAM"));
        this.addQuestion(new Questionsall("9. _____ are programs that provide access to web resources.", "Search Engine", "Browsers", "Web sites", "None of these", "Browsers"));
        this.addQuestion(new Questionsall("10. A popular chat service is called _____", "Internet Request Chat", "Internet Release Chat", "Internet Return Chat", "Internet Relay Chat", "Internet Relay Chat"));
        this.addQuestion(new Questionsall("11. _____ is the process of saving information to the secondary storage device.", "Reading", "Writing", "Speaking", "Listening", "Writing"));
        this.addQuestion(new Questionsall("12. _____ is used for viewing web pages.", "Computer", "Search Engine", "Internet Connectivity", "Internet Explorer", "Internet Explorer"));
        this.addQuestion(new Questionsall("13. When you want to visit a website, you can type the website address or URL in the _____", "Task Bar", "Window Bar", "Address Bar", "Side Bar", "Address Bar"));
        this.addQuestion(new Questionsall("14.When your mouse pointer goes on the top of the link in the web page, the shape of mouse changes to hand.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsall("15. _____ is the new computer language used to write animation and games for the world wide web.", "Java", "C", "C++", "HTML", "Java"));
    }

    public void addQuestion(Questionsall questionsall) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsall.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsall.getANSWER());
        contentValues.put(KEY_OPTA, questionsall.getOptionA());
        contentValues.put(KEY_OPTB, questionsall.getOptionB());
        contentValues.put(KEY_OPTC, questionsall.getOptionC());
        contentValues.put(KEY_OPTD, questionsall.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsall> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsall questionsall = new Questionsall();
                questionsall.setId(cursor.getInt(0));
                questionsall.setQUESTION(cursor.getString(1));
                questionsall.setANSWER(cursor.getString(2));
                questionsall.setOptionA(cursor.getString(3));
                questionsall.setOptionB(cursor.getString(4));
                questionsall.setOptionC(cursor.getString(5));
                questionsall.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsall);
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

