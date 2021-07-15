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
import com.apps.saiinfo.computerobjectivetest.source.Questionsehard;
import java.util.ArrayList;
import java.util.List;

public class Databaceehard
extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ObjectiveTest20";
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

    public Databaceehard(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    private void addQuestions() {
        this.addQuestion(new Questionsehard("1. ____ provides the user interface, controls the computers resources and runs programs.", "Operating System", "Application System", "Drivers", "Desktop", "Operating System"));
        this.addQuestion(new Questionsehard("2. ____ Programs that guard your computer system against viruses or other damaging programs.", "Backup", "Uninstall", "Antivirus", "None of these", "Antivirus"));
        this.addQuestion(new Questionsehard("3. ____ are also known as Service Programs.", "Device Drivers", "Utilities", "Operating System", "System Software", "Utilities"));
        this.addQuestion(new Questionsehard("4. Which programs reduce the size of files so that they occupy lesser space on the disk?", "Backup", "Uninstall", "Disk Cleanup", "File Compression", "File Compression"));
        this.addQuestion(new Questionsehard("5. ____ is a utility program that locates and eliminates unnecessary fragments and rearranges files and unused disk space to optimize operations.", "Disk Cleanup", "Disk Defragment", "File Compression", "None of these", "Disk Defragment"));
        this.addQuestion(new Questionsehard("6. Which of the following is not a file compression program?", "Win Zip", "PK Zip", "Win RAR", "RID (RAID)", "RID (RAID)"));
        this.addQuestion(new Questionsehard("7. ____ improves hard-disk performance by anticipating data needs.", "Disk Caching", "Disk Writing", "Disk Defragment", "Disk Cleanup", "Disk Caching"));
        this.addQuestion(new Questionsehard("8. Software that allows your computer to interact with the user, applications and hardware is called.", "Operating System", "System Software", "Application Software", "None of these", "System Software"));
        this.addQuestion(new Questionsehard("9. Which of the following is the type of and user software.", "Operating System", "System Software", "Application Software", "None of these", "Application Software"));
        this.addQuestion(new Questionsehard("10. Which of these operating system does not have a graphical user interface?", "Windows Vista", "Windows 7", "MS Dos", "Windows XP", "MS Dos"));
        this.addQuestion(new Questionsehard("11. Norton System works is a ____", "Operating System", "Web Service", "Utility Suite", "Troubleshooting Program", "Utility Suite"));
        this.addQuestion(new Questionsehard("12. If you receive one file through the internet having virus, what do you select if you want to remove virus?", "Disk Cleanup", "File Cleanup", "Uninstall", "Scan using Norton Utility", "Scan using Norton Utility"));
        this.addQuestion(new Questionsehard("13. USB drives are also known as:", "Flash Drives", "Universal state buy", "Optical drive", "Ports", "Flash Drives"));
        this.addQuestion(new Questionsehard("14. Process of expanding a compressed file is known as :", "File Association", "File Restoring", "File Compression", "File Decompression", "File Decompression"));
        this.addQuestion(new Questionsehard("15. A combination of different devices into one unit is known as a ____", "Shared Device", "Multifunctional Device", "Flatbed Device", "Single use Device", "Multifunctional Device"));
    }

    public void addQuestion(Questionsehard questionsehard) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("question", questionsehard.getQUESTION());
        contentValues.put(KEY_ANSWER, questionsehard.getANSWER());
        contentValues.put(KEY_OPTA, questionsehard.getOptionA());
        contentValues.put(KEY_OPTB, questionsehard.getOptionB());
        contentValues.put(KEY_OPTC, questionsehard.getOptionC());
        contentValues.put(KEY_OPTD, questionsehard.getOptionD());
        this.myDatabase.insert("question", null, contentValues);
    }

    public List<Questionsehard> getAllQuestions() {
        ArrayList arrayList = new ArrayList();
        this.myDatabase = this.getReadableDatabase();
        Cursor cursor = this.myDatabase.rawQuery("SELECT  * FROM question", null);
        if (cursor.moveToFirst()) {
            do {
                Questionsehard questionsehard = new Questionsehard();
                questionsehard.setId(cursor.getInt(0));
                questionsehard.setQUESTION(cursor.getString(1));
                questionsehard.setANSWER(cursor.getString(2));
                questionsehard.setOptionA(cursor.getString(3));
                questionsehard.setOptionB(cursor.getString(4));
                questionsehard.setOptionC(cursor.getString(5));
                questionsehard.setOptionD(cursor.getString(6));
                arrayList.add((Object)questionsehard);
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

