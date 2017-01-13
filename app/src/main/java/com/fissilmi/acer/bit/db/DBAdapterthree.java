package com.fissilmi.acer.bit.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.fissilmi.acer.bit.model.Question;

import java.util.ArrayList;
import java.util.List;

public class DBAdapterthree extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "QuizLevel3";

    // Table name
    private static final String TABLE_QUESTION = "question";

    // Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_QUESION = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA= "opta"; //option a
    private static final String KEY_OPTB= "optb"; //option b
    private static final String KEY_OPTC= "optc"; //option c
    private static final String KEY_OPTD= "optd"; //option d

    private SQLiteDatabase myDatabase;

    public DBAdapterthree(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        myDatabase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUESTION + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUESION
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC +" TEXT, "+KEY_OPTD+" TEXT)";

        db.execSQL(sql);

        addQuestions();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUESTION);

        // Create tables again
        onCreate(db);
    }

    public int rowCount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }

    public List<Question> getAllQuestions() {

        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUESTION;
        myDatabase=this.getReadableDatabase();

        Cursor cursor = myDatabase.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setId(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOptionA(cursor.getString(3));
                quest.setOptionB(cursor.getString(4));
                quest.setOptionC(cursor.getString(5));
                quest.setOptionD(cursor.getString(6));

                quesList.add(quest);

            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }

    private void addQuestions()
    {
        //format is question-option1-option2-option3-option4-answer

        Question q1=new Question("Pada Surat Al-Lahab ayat 1 berikut, huruf ba pada kalimat tabbat masuk ke dalam tasydid?  تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ","Hukum", "Ashli", "Mitslain", "Mutajanisain","Ashli");
        this.addQuestion(q1);

        Question q2=new Question(" Pada Surat Al-Lahab ayat 1 berikut, kata lahabiww masuk ke dalam tasydid? تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ","Hukum", "Ashli", "Mitslain", "Mutajanisain","Ashli");
        this.addQuestion(q2);

        Question q3=new Question("مَنْ يَّعْمَلْ, hukum bacaan yang terdapat pada ayat berikut adalah idgham karena ","tanwin bertemu mim", "huruf ya bertasydid", "nun mati bertemu ya", "nun mati bepisah ya","nun mati bertemu ya");
        this.addQuestion(q3);

        Question q4=new Question(" كَلَّا لَئِنْ لَمْ Pada ayat berikut terdapat hukum bacaan ","idgham mutamasilain", "idgham mutajanisain", "idgham bigunnah", "idgham bilagunnah","idgham bilagunnah");
        this.addQuestion(q4);

        Question q5=new Question("وَ هُمْ مُعْرِضُوْنَ  Ayat berikut adalah contoh bacaan ","idgham bigunnah", "idgham bilagunnah", "idgham mutamasilain", "idgham mutajanisain","idgham mutamasilain");
        this.addQuestion(q5);
    }

    // Adding new question
    public void addQuestion(Question quest) {

        ContentValues values = new ContentValues();
        values.put(KEY_QUESION, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOptionA());
        values.put(KEY_OPTB, quest.getOptionB());
        values.put(KEY_OPTC, quest.getOptionC());
        values.put(KEY_OPTD, quest.getOptionD());

        // Inserting Row
        myDatabase.insert(TABLE_QUESTION, null, values);
    }

}