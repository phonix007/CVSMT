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
import com.apps.saiinfo.computerobjectivetest.source.Questionsnet;
import java.util.ArrayList;
import java.util.List;

public class Databacenet
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest39";
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

    public Databacenet(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsnet("1. The Internet is used for following purposes.", "Sending Email", "Chatting", "Online Shopping", "All of these", "All of these"));
        this.addQuestion(new Questionsnet("2. Refer the image No.1 given below. These are the applications which you can use to _____", "Edit image files", "View web pages", "Manage large database", "Create document templates", "View web pages"));
        this.addQuestion(new Questionsnet("3. IM stands for Infrared Message.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionsnet("4. What is mandatory to make online electricity payment?", "PAN Card", "Yahoo Messenger", "Online Bank Account", "None of these", "Online Bank Account"));
        this.addQuestion(new Questionsnet("5. Following are the examples of eCommerce, EXCEPT", "Purchase a book on the internet", "Reserve a hotel room over the internet", "Pay electricity bill Online", "Sending an email to your friend", "Sending an email to your friend"));
        this.addQuestion(new Questionsnet("6. If you want to use internet on your personal computer. To connect to the internet, you needs to find an ______", "E-mail Program", "User Interface", "Antivirus Program", "Internet Service Provider", "Internet Service Provider"));
        this.addQuestion(new Questionsnet("7. Every day, you receive email massages from unknown senders. What is the term for this type of security threat?", "fishing", "Spam", "Spoofing", "None of these", "Spam"));
        this.addQuestion(new Questionsnet("8. A browser is a program that is used to access the Internet.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsnet("9. ____ is an extension of email that allows two or more people to contact each other via direct, live communication.", "Personal Messaging", "Unicode Messaging", "Simple Messaging", "Instant Messaging", "Instant Messaging"));
        this.addQuestion(new Questionsnet("10. Refer the image No.2 given below. Which part of the given image defines top level domain?", "http", "www", "mkcl", "org", "org"));
        this.addQuestion(new Questionsnet("11. Using the internet, you can buy things online.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsnet("12. Following are the examples of browsers, EXCEPT", "Google Chrome", "Mozilla Firefox", "Microsoft Word", "Internet Explorer", "Microsoft Word"));
        this.addQuestion(new Questionsnet("13. Using google search engine, you can search information in any language other than English such as Marathi, Hindi etc.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsnet("14. B2C, B2B and C2C are types of _____", "E-mail", "E-Commerce", "E-Post", "E-Blogs", "E-Commerce"));
        this.addQuestion(new Questionsnet("15. Refer the image No.3 given below. Which of the following statement about the given image is true?", "Advantages of the internet", "Basic parts of URL", "Basic parts of ISP", "None of these", "Basic parts of URL"));
    }

    public void addQuestion(Questionsnet questionsnet) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsnet.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsnet.getANSWER());
        contentValues.put(KEY_OPTA, questionsnet.getOptionA());
        contentValues.put(KEY_OPTB, questionsnet.getOptionB());
        contentValues.put(KEY_OPTC, questionsnet.getOptionC());
        contentValues.put(KEY_OPTD, questionsnet.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsnet> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsnet questionsnet = new Questionsnet();
                questionsnet.setId(cursor.getInt(0));
                questionsnet.setQUESTION(cursor.getString(1));
                questionsnet.setANSWER(cursor.getString(2));
                questionsnet.setOptionA(cursor.getString(3));
                questionsnet.setOptionB(cursor.getString(4));
                questionsnet.setOptionC(cursor.getString(5));
                questionsnet.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsnet);
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

