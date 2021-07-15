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
import com.apps.saiinfo.computerobjectivetest.source.Questionssecenglish;
import java.util.ArrayList;
import java.util.List;

public class Databacesecenglish
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest12";
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

    public Databacesecenglish(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssecenglish("1. RAM, ROM and Flash are three well-known types of ____", "Memory Chips", "Hard Disk", "Input Device", "Output Device", "Memory Chips"));
        this.addQuestion(new Questionssecenglish("2. Optical character recognition device and optical mark recognition device are two names of the same device.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionssecenglish("3. Following are the high capacity disks, EXCEPT", "HIFD Disk", "Drivers", "Super Disk", "Zip Disk", "Drivers"));
        this.addQuestion(new Questionssecenglish("4. A photoelectric scanner that reads bar codes for processing in known as ____", "Barcode Reader", "Dot pitch", "Platform Scanner", "Thin film transistor monitor", "Barcode Reader"));
        this.addQuestion(new Questionssecenglish("5. Read only, Write once and Rewritable are three basic types of Compact disk.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssecenglish("6. A device, such as a digital camera or a digital video camera, that creates or captures original images is known as ____", "Input", "Clarity", "Image capturing device", "Musical instrument digital interface (MIDI)", "Image capturing device"));
        this.addQuestion(new Questionssecenglish("7. _____ measurement is used to determine a printer resolution.", "api", "cpi", "dpi", "bpi", "dpi"));
        this.addQuestion(new Questionssecenglish("8. Following are the units of memory, EXCEPT", "Nano bytes (NB)", "Mega bytes (MB)", "Giga bytes (GB)", "Byte", "Nano bytes (NB)"));
        this.addQuestion(new Questionssecenglish("9. Which of this printers would an architect be most likely to use to print large plans?", "Inkjet printers", "Dot-Matrix printers", "Plotters", "Laser printers", "Plotters"));
        this.addQuestion(new Questionssecenglish("10. _____ are used to store data and programs.", "Recycle bin", "Icons", "Menus", "File", "File"));
        this.addQuestion(new Questionssecenglish("11. Our voice creates analog signals that vary to represent different tones, pitches and volume.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionssecenglish("12. For most microcomputer systems, the internal hard disk drive is designated as the ____", "E Drive", "F Drive", "C Drive", "External Drive", "C Drive"));
        this.addQuestion(new Questionssecenglish("13. Which of the following is a portable storage device?", "Digital Versatile Disk (DVD)", "Digital Scanner", "Digital Keyboard", "Barcode Scanner", "Digital Versatile Disk (DVD)"));
        this.addQuestion(new Questionssecenglish("14. Which of the following device can store large amounts of data?", "Hard Disk", "Floppy Disk", "Compact Disk", "Scanner", "Hard Disk"));
        this.addQuestion(new Questionssecenglish("15. The hard disk's disk surface is scratched and some or all of the data is destroyed when there is a _____", "Track Crash", "Sectors Crash", "Head Crash", "Cylinders Crash", "Head Crash"));
    }

    public void addQuestion(Questionssecenglish questionssecenglish) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssecenglish.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssecenglish.getANSWER());
        contentValues.put(KEY_OPTA, questionssecenglish.getOptionA());
        contentValues.put(KEY_OPTB, questionssecenglish.getOptionB());
        contentValues.put(KEY_OPTC, questionssecenglish.getOptionC());
        contentValues.put(KEY_OPTD, questionssecenglish.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssecenglish> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssecenglish questionssecenglish = new Questionssecenglish();
                questionssecenglish.setId(cursor.getInt(0));
                questionssecenglish.setQUESTION(cursor.getString(1));
                questionssecenglish.setANSWER(cursor.getString(2));
                questionssecenglish.setOptionA(cursor.getString(3));
                questionssecenglish.setOptionB(cursor.getString(4));
                questionssecenglish.setOptionC(cursor.getString(5));
                questionssecenglish.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssecenglish);
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

