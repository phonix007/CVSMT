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
import com.apps.saiinfo.computerobjectivetest.source.Questionsint;
import java.util.ArrayList;
import java.util.List;

public class Databaceint
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest37";
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

    public Databaceint(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsint("1. E-mail includes all of the following basic elements ____", "TCP/IP, Domain and ISP", "Destination Device and Center", "Header Massage and Signature", "Header Footer and Massage", "Header Massage and Signature"));
        this.addQuestion(new Questionsint("2. Full form of URL _____", "Universal Resource Locator", "Uniform Resource Locator", "Union Resource Locator", "None of these", "Uniform Resource Locator"));
        this.addQuestion(new Questionsint("3. When you type an address such as http://www.mkcl.org, in this .org indicates ____", "Original Website", "Commercial Website", "Organizational Website", "Education Website", "Organizational Website"));
        this.addQuestion(new Questionsint("4. What does the abbreviation www in internet stand for?", "World Width Web", "World Wide Web", "Wide World Web", "Wide Width Web", "World Wide Web"));
        this.addQuestion(new Questionsint("5. The .com indicates website of ____ type of organization.", "Cargo", "Company", "Complex", "Commercial", "Commercial"));
        this.addQuestion(new Questionsint("6. Web spiders and crawlers are the example of ____", "Browser", "Search Engine", "Programs", "Flems", "Search Engine"));
        this.addQuestion(new Questionsint("7. ____ is the transmission of electric massages over the internet.", "E-Business", "E-Letters", "E-Mail", "Cyber Mail", "E-Mail"));
        this.addQuestion(new Questionsint("8. The extensions .gov, .edu, .com and .net are called _____", "Mail to Address", "Domain Codes", "E-Mail Targets", "DNSs", "Domain Codes"));
        this.addQuestion(new Questionsint("9. E-mail of each user are _____", "Different", "Same", "One for all", "None of these", "Different"));
        this.addQuestion(new Questionsint("10. Applets are the special programs written in _____", "Java", "HTML", "Linux", "HTTP", "Java"));
        this.addQuestion(new Questionsint("11. Which of the following is a valid web address?", "www@bbc@news", "www.bbc.co.in", "www@bbc.co.uk", "wwwbbcuk", "www.bbc.co.in"));
        this.addQuestion(new Questionsint("12. FTP means _______", "Field Transfer Protocol", "File Transfer Project", "File Transfer Protocol", "First Transfer Protocol", "File Transfer Protocol"));
        this.addQuestion(new Questionsint("13. To introduce yourself to various employers, you can use _____", "McAfee", "Linked-In", "Yatra", "All of these", "Linked-In"));
        this.addQuestion(new Questionsint("14. Which of the following is a valid E-mail address?", "jeo.bloggs.freemail.com", "jeo.bloggs@freemail.com", "jeo.bloggs@www@freemail.com", "@freemail.com", "jeo.bloggs@freemail.com"));
        this.addQuestion(new Questionsint("15. What is E-mail?", "Electronic Massage", "Internet Massage", "Internet Mail", "Electronic Mail", "Electronic Mail"));
    }

    public void addQuestion(Questionsint questionsint) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsint.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsint.getANSWER());
        contentValues.put(KEY_OPTA, questionsint.getOptionA());
        contentValues.put(KEY_OPTB, questionsint.getOptionB());
        contentValues.put(KEY_OPTC, questionsint.getOptionC());
        contentValues.put(KEY_OPTD, questionsint.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsint> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsint questionsint = new Questionsint();
                questionsint.setId(cursor.getInt(0));
                questionsint.setQUESTION(cursor.getString(1));
                questionsint.setANSWER(cursor.getString(2));
                questionsint.setOptionA(cursor.getString(3));
                questionsint.setOptionB(cursor.getString(4));
                questionsint.setOptionC(cursor.getString(5));
                questionsint.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsint);
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

