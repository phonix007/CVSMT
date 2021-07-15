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
import com.apps.saiinfo.computerobjectivetest.source.Questionsinput;
import java.util.ArrayList;
import java.util.List;

public class Databaceinput
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest2";
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

    public Databaceinput(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsinput("1. Resolution determines the clarity and sharpness of a computer's screen image.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsinput("2. Flatbed and portable are two types of ____", "Optical Scanners", "Optical Mouse", "Wireless Keyboard", "Plotters", "Optical Scanners"));
        this.addQuestion(new Questionsinput("3. Smallest unit on the screen that can be turned on and off to make different shades of individual dots that form images on a monitor is known as ____", "Camera", "Pixel", "Thermal Printer", "Voice-over IP", "Pixel"));
        this.addQuestion(new Questionsinput("4. Which device is used as the standard pointing device in a graphical user environment.", "Trackball", "Joystick", "Keyboard", "Mouse", "Mouse"));
        this.addQuestion(new Questionsinput("5. Keys such as the Ctrl key that perform as action when held down in combination with another keys are known as ____", "Function Keys", "Combination Keys", "Special Purpose Keys", "Typewriter Keys", "Combination Keys"));
        this.addQuestion(new Questionsinput("6. The keys labelled 0 to 9 on the keyboard are called ____", "Function Keys", "Numeric Keys", "Special Purpose Keys", "Typewriter Keys", "Numeric Keys"));
        this.addQuestion(new Questionsinput("7. ____ keyboard keys are used to control the cursor or insertion point on the screen.", "Escape", "Function Keys", "Toggle Keys", "Navigation Keys", "Navigation Keys"));
        this.addQuestion(new Questionsinput("8. Icons are graphical object used to represent commonly used application.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsinput("9. ____ are similar to traditional cameras but images are recorded digitally.", "Analog Camera", "Digital Camera", "Hybrid Camera", "Simple Camera", "Digital Camera"));
        this.addQuestion(new Questionsinput("10. Personal digital assistants (PDAs) are the most widely used handheld computers.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsinput("11. Caps Lock, Num Lock and Scroll Lock keys are also known as ____ keys.", "Toggle Keys", "Function Keys", "Numeric Keys", "Special Keys", "Toggle Keys"));
        this.addQuestion(new Questionsinput("12. ____ Device is used to record your sound.", "Keyboard", "Microphone", "Scanner", "Speaker", "Microphone"));
        this.addQuestion(new Questionsinput("13. Voice recognition systems accept voice commands to control computer operations and to create documents.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsinput("14. Fax machines send and receive images over telephone lines.", "True", "False", "", "", "True"));
        this.addQuestion(new Questionsinput("15. You want to copy file having size 1.50 MB to the pen drive. But in your pen drive 1.00 MB free space is available. referring to the above scenario, identify the name of utility which you can use.", "Delete your file", "Uninstall all the programs", "Compress your file", "Clean your desktop", "Compress your file"));
    }

    public void addQuestion(Questionsinput questionsinput) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsinput.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsinput.getANSWER());
        contentValues.put(KEY_OPTA, questionsinput.getOptionA());
        contentValues.put(KEY_OPTB, questionsinput.getOptionB());
        contentValues.put(KEY_OPTC, questionsinput.getOptionC());
        contentValues.put(KEY_OPTD, questionsinput.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsinput> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsinput questionsinput = new Questionsinput();
                questionsinput.setId(cursor.getInt(0));
                questionsinput.setQUESTION(cursor.getString(1));
                questionsinput.setANSWER(cursor.getString(2));
                questionsinput.setOptionA(cursor.getString(3));
                questionsinput.setOptionB(cursor.getString(4));
                questionsinput.setOptionC(cursor.getString(5));
                questionsinput.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsinput);
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

