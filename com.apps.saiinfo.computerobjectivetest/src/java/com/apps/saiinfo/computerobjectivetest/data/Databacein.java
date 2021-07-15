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
import com.apps.saiinfo.computerobjectivetest.source.Questionsin;
import java.util.ArrayList;
import java.util.List;

public class Databacein
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest8";
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

    public Databacein(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsin("1. The mouse, joystick, touch screen and stylus are all types of _____ devices.", "Processing", "Printing", "Pointing", "Editing", "Pointing"));
        this.addQuestion(new Questionsin("2. Refer the image No.1 given below. you can easily access any part of the screen in the windows operating system.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsin("3. Which of the following part of the computer shows you information from the computer?", "Mouse", "Monitor", "Printer", "Keyboard", "Monitor"));
        this.addQuestion(new Questionsin("4. ____ are specialized digital video cameras that capture images.", "OCR", "Inkjet", "Webcams", "Monitor", "Webcams"));
        this.addQuestion(new Questionsin("5. OMR, OCR and MICR are all types of _____", "Bar code readers", "Magnetic card readers", "Radio Frequency card readers", "Character and mark recognition devices", "Character and mark recognition devices"));
        this.addQuestion(new Questionsin("6. Refer the image No.2 given below. you can use this device to print your documents.", "True", "False", "", "", "False"));
        this.addQuestion(new Questionsin("7. The most widely used audio-input device is the ____", "Stylus", "Webcam", "Microphone", "Radio frequency card reader", "Microphone"));
        this.addQuestion(new Questionsin("8. Following are the types of printer, EXCEPT", "Laser", "Thermal", "InkJet", "Automatic", "Automatic"));
        this.addQuestion(new Questionsin("9. ____ combine the capabilities of a scanner, printer, fax and copy machine.", "Potters", "Fax machines", "Input device", "Multifunctional device", "Multifunctional device"));
        this.addQuestion(new Questionsin("10. Which of the following device is not from pointing type of device?", "Mouse", "Keyboard", "Joystick", "Touch Screen", "Keyboard"));
        this.addQuestion(new Questionsin("11. Headphone is a typical output device.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsin("12. Refer the image No.3 given below. you can use this key from your keyboard to ____", "To shutdown your computer", "Display the start menu", "To cancle the selection or command", "Switch on your computer", "Display the start menu"));
        this.addQuestion(new Questionsin("13. This type of mouse emit and senses light to detect mouse movement.", "Mechanical", "Optical", "Trackpad", "Pointing Stick", "Optical"));
        this.addQuestion(new Questionsin("14. Using scanner you can do following things, EXCEPT ____", "Scan your documents", "Scan your photos", "Print the document", "Scan images, pictures etc.", "Print the document"));
        this.addQuestion(new Questionsin("15. Refer the image No.4 given below. The output of an image of the given device is often called as Softcopy.", "True", "False", "", "", "True"));
    }

    public void addQuestion(Questionsin questionsin) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsin.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsin.getANSWER());
        contentValues.put(KEY_OPTA, questionsin.getOptionA());
        contentValues.put(KEY_OPTB, questionsin.getOptionB());
        contentValues.put(KEY_OPTC, questionsin.getOptionC());
        contentValues.put(KEY_OPTD, questionsin.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsin> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsin questionsin = new Questionsin();
                questionsin.setId(cursor.getInt(0));
                questionsin.setQUESTION(cursor.getString(1));
                questionsin.setANSWER(cursor.getString(2));
                questionsin.setOptionA(cursor.getString(3));
                questionsin.setOptionB(cursor.getString(4));
                questionsin.setOptionC(cursor.getString(5));
                questionsin.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsin);
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

