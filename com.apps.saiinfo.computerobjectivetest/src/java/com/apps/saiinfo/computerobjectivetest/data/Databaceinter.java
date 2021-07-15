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
import com.apps.saiinfo.computerobjectivetest.source.Questionsinter;
import java.util.ArrayList;
import java.util.List;

public class Databaceinter
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest38";
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

    public Databaceinter(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsinter("1. When you want to answer an e-mail massage that you have received on internet, you click on the _____", "Answer Button", "Forward Button", "Reply Button", "Delete Button", "Reply Button"));
        this.addQuestion(new Questionsinter("2. What would you use for immediate, real-time communication with a friend?", "E-Mail", "Instant Massaging", "Use net", "Dry net", "Instant Massaging"));
        this.addQuestion(new Questionsinter("3. Buying and selling goods over the internet is called as _____", "E-Post", "E-Blogs", "E-Commerce", "E-Science", "E-Commerce"));
        this.addQuestion(new Questionsinter("4. When a website developed, the various interlinked files are grouped together. this is achieved using which facility?", "Network", "Hyperlink", "Hypertext", "Orientation", "Hyperlink"));
        this.addQuestion(new Questionsinter("5. Each computer connected to the internet must _____", "Be user friendly", "Have Microsoft Office installed", "Have linux operating system", "Have a unique IP address", "Have a unique IP address"));
        this.addQuestion(new Questionsinter("6. You want to download online passport application form. But you dont know the web site address. In these scenario, how will you search web site address?", "Use Yahoo search engine", "Use Alta Vista search engine", "Use Google search engine", "All of these", "All of these"));
        this.addQuestion(new Questionsinter("7. A web application that allows one to take education courses online.", "E-Commerce", "E-Post", "E-Learning", "E-Blogs", "E-Learning"));
        this.addQuestion(new Questionsinter("8. Following are website in which you can setup your email account, EXCEPT.", "www.hotmail.com", "www.linux.com", "www.gmail.com", "www.yahoo.com", "www.linux.com"));
        this.addQuestion(new Questionsinter("9. What kind of software would you use to look at web pages on the internet?", "Web Browser", "Antivirus", "Presentation", "Excel", "Web Browser"));
        this.addQuestion(new Questionsinter("10. The http you type at the beginning of any site address stands for ____", "Hi text Transfer Program", "Hypertext Transfer Program", "Hypertext Transfer Protocol", "Hi text Transfer Project", "Hypertext Transfer Protocol"));
        this.addQuestion(new Questionsinter("11. A web sites main page is called as ____", "Home Page", "Finding Page", "Browser Page", "Search Page", "Home Page"));
        this.addQuestion(new Questionsinter("12. B2C, C2C and B2B are tpyes of ____", "E-Mail", "E-Science", "E-Learning", "E-Commerce", "E-Commerce"));
        this.addQuestion(new Questionsinter("13. What do you select if you want to delete temporary files, history and cookies?", "Delete", "Use Default", "Fonts", "None of these", "Delete"));
        this.addQuestion(new Questionsinter("14. Which of the following is not a way of communication using the internet?", "Instant Massaging", "Emailing", "Formatting", "Chats Rooms", "Formatting"));
        this.addQuestion(new Questionsinter("15. This programs allows parents as well as organizations to block out selected site and set time limits on the internet access.", "WAIS", "FTP", "Filters", "Plug-ins", "Filters"));
    }

    public void addQuestion(Questionsinter questionsinter) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsinter.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsinter.getANSWER());
        contentValues.put(KEY_OPTA, questionsinter.getOptionA());
        contentValues.put(KEY_OPTB, questionsinter.getOptionB());
        contentValues.put(KEY_OPTC, questionsinter.getOptionC());
        contentValues.put(KEY_OPTD, questionsinter.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsinter> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsinter questionsinter = new Questionsinter();
                questionsinter.setId(cursor.getInt(0));
                questionsinter.setQUESTION(cursor.getString(1));
                questionsinter.setANSWER(cursor.getString(2));
                questionsinter.setOptionA(cursor.getString(3));
                questionsinter.setOptionB(cursor.getString(4));
                questionsinter.setOptionC(cursor.getString(5));
                questionsinter.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsinter);
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

