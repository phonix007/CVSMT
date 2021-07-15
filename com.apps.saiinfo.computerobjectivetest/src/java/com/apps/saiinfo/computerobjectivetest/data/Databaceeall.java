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
import com.apps.saiinfo.computerobjectivetest.source.Questionseall;
import java.util.ArrayList;
import java.util.List;

public class Databaceeall
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest48";
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

    public Databaceeall(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionseall("1. The operating system is often referred to as the software environment or software _____", "Network", "Platform", "Window", "Desktop", "Platform"));
        this.addQuestion(new Questionseall("2. The standard for high definition optical discs is ____", "CD", "DVD", "RAM", "Blu-ray", "Blu-ray"));
        this.addQuestion(new Questionseall("3. If you want to make friends and discuss topics with each other. Which website you may refer to ____", "Facebook", "HDFC Bank", "Cloud Computing", "Send this file", "Facebook"));
        this.addQuestion(new Questionseall("4. Card Readers and Bar Code Readers are types of _____", "Application Software", "Monitor", "Printer", "Scanner", "Scanner"));
        this.addQuestion(new Questionseall("5. Process of copying information to your computer from a specially configured FTP server is called as ______", "Uploading", "Downloading", "Deleting", "Restoring", "Downloading"));
        this.addQuestion(new Questionseall("6. This type of network strategy uses central servers to coordinate and supply services to other nodes on the network.", "Ring", "Terminal", "Peer-to-Peer", "Client/Server", "Client/Server"));
        this.addQuestion(new Questionseall("7. This type of disks can be written to only once.", "CD-R", "CD-RW", "CD-ROM", "CD-RM", "CD-R"));
        this.addQuestion(new Questionseall("8. Every time the computer system is started, the operating system loads these into memory.", "Driver Updates", "Device Managers", "Device Drivers", "Windows Updates", "Device Drivers"));
        this.addQuestion(new Questionseall("9. _____ is any data or instructions that are used by a computer.", "Input", "Output", "Information", "Digital", "Input"));
        this.addQuestion(new Questionseall("10. These types of ports typically provide connections to specialized devices such as camcorders and storage devices.", "AGP", "Parallel", "Serial", "Firewire", "Firewire"));
        this.addQuestion(new Questionseall("11. In most cases, the word software is interchangeable with the word _____", "Program", "Procedure", "Computer", "Metadata", "Program"));
        this.addQuestion(new Questionseall("12. A CD-RW disk _____", "can be written to only once", "cannot be written on", "cannot be erased", "can be erased and rewritten", "can be erased and rewritten"));
        this.addQuestion(new Questionseall("13. The category of operating system used for handheld devices is _____", "Network", "Embedded", "Stand-alone", "Open Source", "Embedded"));
        this.addQuestion(new Questionseall("14. Input and Output devices such as a mouse, keyboard, and monitor are located ____ the system unit.", "Inside", "Outside", "", "", "Outside"));
        this.addQuestion(new Questionseall("15. You want to carry 5 GB data with you while travelling to other city. Referring to this scenario, you need to use ______ to store 5 GB data.", "Mouse", "Floppy Disk", "Digital Versatile Disk", "Compact Disk", "Digital Versatile Disk"));
    }

    public void addQuestion(Questionseall questionseall) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionseall.getQUESTION());
        contentValues.put(KEY_ANSWER, questionseall.getANSWER());
        contentValues.put(KEY_OPTA, questionseall.getOptionA());
        contentValues.put(KEY_OPTB, questionseall.getOptionB());
        contentValues.put(KEY_OPTC, questionseall.getOptionC());
        contentValues.put(KEY_OPTD, questionseall.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionseall> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionseall questionseall = new Questionseall();
                questionseall.setId(cursor.getInt(0));
                questionseall.setQUESTION(cursor.getString(1));
                questionseall.setANSWER(cursor.getString(2));
                questionseall.setOptionA(cursor.getString(3));
                questionseall.setOptionB(cursor.getString(4));
                questionseall.setOptionC(cursor.getString(5));
                questionseall.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionseall);
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

