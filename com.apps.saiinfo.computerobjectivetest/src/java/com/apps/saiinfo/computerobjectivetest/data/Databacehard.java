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
import com.apps.saiinfo.computerobjectivetest.source.Questionshard;
import java.util.ArrayList;
import java.util.List;

public class Databacehard
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest19";
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

    public Databacehard(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionshard("1. Which of the following is not a system software program type?", "Utility", "Sector", "Device Drivers", "Language translators", "Sector"));
        this.addQuestion(new Questionshard("2. Which of the following is not a function of the operating system.", "Managing resources", "Running applications", "Providing Internet access", "Providing a user interface", "Providing Internet access"));
        this.addQuestion(new Questionshard("3. Troubleshooting or ______ programs recognize and correct problems.", "Backup", "Diagnostic", "Disk Cleanup", "Disk Defragment", "Diagnostic"));
        this.addQuestion(new Questionshard("4. In many application programs, this features is used to provide information ro request input.", "Menus", "Icons", "Windows", "Dialog boxes", "Dialog boxes"));
        this.addQuestion(new Questionshard("5. Graphical User Interface is not available in Windows operating system.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionshard("6. Following utility programs are available in Windows operating system, EXCEPT", "Backup", "Antivirus", "HP Desktop", "File Compression", "HP Desktop"));
        this.addQuestion(new Questionshard("7. Troubleshooting programs recognize both hardware and software problems and try to correct them as far as possible.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionshard("8. _____ programs make copies of files to be used in case the originals are lost or damaged.", "Backup", "Troubleshoot", "Disk Cleanup", "Disk Defragment", "Backup"));
        this.addQuestion(new Questionshard("9. Operating System provides the user interface, control the computer's resources, and runs programs.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionshard("10. ______ is controlled by a mouse and changes shape depending upon its current function.", "Icon", "Display", "Menus", "Pointer", "Pointer"));
        this.addQuestion(new Questionshard("11. The disk ______ utility program eliminates unneeded files on your hard disk.", "Backup", "Restore", "Disk Cleanup", "Disk Defragment", "Disk Cleanup"));
        this.addQuestion(new Questionshard("12. The most widely used personal computer operating system is ______", "Linux", "Windows", "Netware", "None of these", "Windows"));
        this.addQuestion(new Questionshard("13. ____ Hardware component is used to control the operation of a computer system.", "Mouse", "Processor", "Accessories", "Headphone", "Processor"));
        this.addQuestion(new Questionshard("14. Process of reducing the storage requirements for a file is called as ____", "File Compression", "File Modification", "File Association", "File Decompression", "File Compression"));
        this.addQuestion(new Questionshard("15. Which one of the following is not an example of application software.", "Microsoft Word", "Microsoft Excel", "Microsoft Windows", " Microsoft Powerpoint", "Microsoft Windows"));
    }

    public void addQuestion(Questionshard questionshard) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionshard.getQUESTION());
        contentValues.put(KEY_ANSWER, questionshard.getANSWER());
        contentValues.put(KEY_OPTA, questionshard.getOptionA());
        contentValues.put(KEY_OPTB, questionshard.getOptionB());
        contentValues.put(KEY_OPTC, questionshard.getOptionC());
        contentValues.put(KEY_OPTD, questionshard.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionshard> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionshard questionshard = new Questionshard();
                questionshard.setId(cursor.getInt(0));
                questionshard.setQUESTION(cursor.getString(1));
                questionshard.setANSWER(cursor.getString(2));
                questionshard.setOptionA(cursor.getString(3));
                questionshard.setOptionB(cursor.getString(4));
                questionshard.setOptionC(cursor.getString(5));
                questionshard.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionshard);
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

