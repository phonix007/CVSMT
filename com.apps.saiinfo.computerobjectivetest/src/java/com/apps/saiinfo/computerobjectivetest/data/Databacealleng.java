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
import com.apps.saiinfo.computerobjectivetest.source.Questionsalleng;
import java.util.ArrayList;
import java.util.List;

public class Databacealleng
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest47";
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

    public Databacealleng(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsalleng("1. The last part of the domain name following the dot (.) is called as _____", "Top-level domain", "DNS", "Domain Codes", "Mail to address", "Top-level domain"));
        this.addQuestion(new Questionsalleng("2. Rules for exchanging data between computers are called ______", "Procedures", "Protocol", "Program", "Language", "Protocol"));
        this.addQuestion(new Questionsalleng("3. You have a modem connected to your computer. You have installed an e-mail program on your computer. What do you need in order to send an e-mail massage?", "Printer", "Microphone", "Web cam", "Internet Connection", "Internet Connection"));
        this.addQuestion(new Questionsalleng("4. ______ Internet service is used for uploading and downloading files.", "File Transfer Protocol (FTP)", "Hyper Text Markup Language (HTML)", "World Wide Web (WWW)", "Java", "File Transfer Protocol (FTP)"));
        this.addQuestion(new Questionsalleng("5. You can use facebook to do all the following, EXCEPT", "Search your friends", "Chat with online friends", "To pay electricity bill online", "Share photos online", "To pay electricity bill online"));
        this.addQuestion(new Questionsalleng("6. All web addresses start with which of the following?", "http://", "smtp://", "url://", ".com", "http://"));
        this.addQuestion(new Questionsalleng("7. ______ are specialized programs designed to make computing easier.", "Kernels", "Utilities", "Advanced Software", "Graphic Software", "Utilities"));
        this.addQuestion(new Questionsalleng("8. Which of the following components is used to store data?", "Input Device", "Output Device", "Memory", "CPU", "Memory"));
        this.addQuestion(new Questionsalleng("9. When two pieces of data are compared to see whether one is equal to (=), less than (<), or greater than (>) the other, then it is a ______", "Arithmatic Operation", "Logical Operation", "Mathematical Operation", "Graphical Operation", "Logical Operation"));
        this.addQuestion(new Questionsalleng("10. Grocery stores use bar-code scanners to read UPCs on products.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsalleng("11. The Function keys on the keyboard of the computer ______", "Keyboard shortcuts for specific tasks", "Cancle selection or procedures", "Enter numbers and arithmetic symbols", "Control the insertion point on the screen", "Keyboard shortcuts for specific tasks"));
        this.addQuestion(new Questionsalleng("12. _____ Device is used to transfer real pictures or documents into a computer generated file.", "Printer", "Scanner", "Keyboard", "Plotter", "Scanner"));
        this.addQuestion(new Questionsalleng("13. Media, Capacity, Storage Devices and Access speed are some important characteristics of ______", "Mouse", "Keyboard", "Monitor", "Secondary Storage", "Secondary Storage"));
        this.addQuestion(new Questionsalleng("14. Which technology is used in Compact Disc ?", "Mechanical", "Electrical", "Optical", "Laser", "Laser"));
        this.addQuestion(new Questionsalleng("15. You want to purchase mobile phone on flipkart.com website. Referring to the above scenario, you are using _____ activity of the internet.", "Messengers", "E-Commerce", "E-Communication", "Social Networking", "E-Commerce"));
    }

    public void addQuestion(Questionsalleng questionsalleng) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsalleng.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsalleng.getANSWER());
        contentValues.put(KEY_OPTA, questionsalleng.getOptionA());
        contentValues.put(KEY_OPTB, questionsalleng.getOptionB());
        contentValues.put(KEY_OPTC, questionsalleng.getOptionC());
        contentValues.put(KEY_OPTD, questionsalleng.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsalleng> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsalleng questionsalleng = new Questionsalleng();
                questionsalleng.setId(cursor.getInt(0));
                questionsalleng.setQUESTION(cursor.getString(1));
                questionsalleng.setANSWER(cursor.getString(2));
                questionsalleng.setOptionA(cursor.getString(3));
                questionsalleng.setOptionB(cursor.getString(4));
                questionsalleng.setOptionC(cursor.getString(5));
                questionsalleng.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsalleng);
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

