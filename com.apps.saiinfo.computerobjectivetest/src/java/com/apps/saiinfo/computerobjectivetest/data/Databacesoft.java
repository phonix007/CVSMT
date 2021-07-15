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
import com.apps.saiinfo.computerobjectivetest.source.Questionssoft;
import java.util.ArrayList;
import java.util.List;

public class Databacesoft
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest21";
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

    public Databacesoft(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionssoft("1. Keyboard that transmits input to the system unit through the air is known as ____", "Touch Screen", "Optical character recognition", "IP Telephony", "Wireless Keyboard", "Wireless Keyboard"));
        this.addQuestion(new Questionssoft("2. Magnetic ink character recognition is often used for ____", "Medical Reports", "Cheques", "Photographs", "Barcode", "Cheques"));
        this.addQuestion(new Questionssoft("3. Following are the three types of memory, EXCEPT", "Random access memory", "Read only memory", "Flash memory", "Control memory", "Control memory"));
        this.addQuestion(new Questionssoft("4. Process of reducing the storage requirements for a file is called as ____", "File Compression", "File Modification", "File Association", "File Decompression", "File Compression"));
        this.addQuestion(new Questionssoft("5. ____ Programs recognize both hardware and software programs and try to correct them as far as possible.", "Disk Cleanup", "Uninstall", "Troubleshooting", "Backup", "Troubleshooting"));
        this.addQuestion(new Questionssoft("6. ____ is the process of removing a file from a compressed archive.", "Pulling", "Restoring", "Extracting", "Deleting", "Extracting"));
        this.addQuestion(new Questionssoft("7. Another name for the cursor is the ____", "Mouse", "Clicker", "Insertion point", "None of  these", "Insertion point"));
        this.addQuestion(new Questionssoft("8. ____ is one popular and free version of the UNIX operating system.", "Internet", "Windows", "DOS", "Linux", "Linux"));
        this.addQuestion(new Questionssoft("9. These typically appear as underlined and colored text and or images.", "Protocols", "Hyperlinks", "Applets", "Top-level domain names", "Hyperlinks"));
        this.addQuestion(new Questionssoft("10. Stand alone operating systems are also called as ____", "Network Operating System", "Desktop Operating System", "User Operating System", "Union Operating System", "Desktop Operating System"));
        this.addQuestion(new Questionssoft("11. ____ Provides a list of options or commands.", "Menus", "Icons", "Dialog Box", "Status Box", "Menus"));
        this.addQuestion(new Questionssoft("12. ____ programs make copies of the files to be used in case the original files are damaged or lost.", "Disk Cleanup", "File Cleanup", "Uninstall", "Backup", "Backup"));
        this.addQuestion(new Questionssoft("13. Which one of the following is an example of operating system.", "Microsoft Word", "Microsoft Excel", "Microsoft Windows", "Microsoft Powerpoint", "Microsoft Windows"));
        this.addQuestion(new Questionssoft("14. A named area on a disk that is used to store related subfolder and files is known as ____", "Icon", "Folder", "File", "Window", "Folder"));
        this.addQuestion(new Questionssoft("15. You want to take a print out of your document, but after selecting print command you found that there is no printer installed on your computer. referring to the scenario, how do you install printer on your computer?", "Computer ---- Device and Printers ---- Add a Printer", "Control Panel ---- Device and Printers ---- Add a Printer", "Control Panel ---- Add a Printer", "None of these", "Control Panel ---- Device and Printers ---- Add a Printer"));
    }

    public void addQuestion(Questionssoft questionssoft) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionssoft.getQUESTION());
        contentValues.put(KEY_ANSWER, questionssoft.getANSWER());
        contentValues.put(KEY_OPTA, questionssoft.getOptionA());
        contentValues.put(KEY_OPTB, questionssoft.getOptionB());
        contentValues.put(KEY_OPTC, questionssoft.getOptionC());
        contentValues.put(KEY_OPTD, questionssoft.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionssoft> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionssoft questionssoft = new Questionssoft();
                questionssoft.setId(cursor.getInt(0));
                questionssoft.setQUESTION(cursor.getString(1));
                questionssoft.setANSWER(cursor.getString(2));
                questionssoft.setOptionA(cursor.getString(3));
                questionssoft.setOptionB(cursor.getString(4));
                questionssoft.setOptionC(cursor.getString(5));
                questionssoft.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionssoft);
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

