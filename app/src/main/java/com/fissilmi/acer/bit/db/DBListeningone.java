package com.fissilmi.acer.bit.db;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.fissilmi.acer.bit.R;
import com.fissilmi.acer.bit.model.Soal;

public class DBListeningone extends SQLiteOpenHelper {
    final static String DB_NAME = "db_listening1";

    public DBListeningone(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, suara BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Pada potongan ayat tersebut terdapat tiga hukum bacaan, yaitu");
        values.put("pil_a", "Izhar, Iqlab, dan Idgham Bilagunnah");
        values.put("pil_b", "Idgham Bilagunnah, Izhar Syafawi, Ikhfa Syafawi");
        values.put("pil_c", "Ikhfa Syafawi, Izhar Syafawi, Idgham Bilagunnah");
        values.put("jwban","2");
        values.put("suara", R.raw.listening1quiz1);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Potongan ayat tersebut mengandung hukum bacaan?");
        values.put("pil_a", "Idgham Bilagunnah");
        values.put("pil_b","Ikhfa Syafawi");
        values.put("pil_c", "Idgham Mutamasilain");
        values.put("jwban","1");
        values.put("suara", R.raw.listening2quiz1);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Potongan ayat tersebut terdapat hukum bacaan?");
        values.put("pil_a", "Idgham Mutamasilain");
        values.put("pil_b","Idgham Bigunnah");
        values.put("pil_c", "Idgham Bilagunnah");
        values.put("jwban","0");
        values.put("suara", R.raw.listening3quiz1);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Pada potongan ayat tersebut terdapat mim mati yang harus dibaca jelas karena hukumnya");
        values.put("pil_a", "Izhar Syafawi");
        values.put("pil_b","Ikhfa Syafawi");
        values.put("pil_c", "Idgham Mutamasilain");
        values.put("jwban","0");
        values.put("suara", R.raw.listening4quiz1);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Potongan ayat tersebut terdapat hukum bacaan?");
        values.put("pil_a", "Ikhfa Syafawi ");
        values.put("pil_b","Izhar Syafawi");
        values.put("pil_c", "Idgham Bilagunnah");
        values.put("jwban","1");
        values.put("suara", R.raw.listening5quiz1);
        db.insert("tbl_soal", "soal", values);

        String sql2 = "CREATE TABLE IF NOT EXISTS tbl_suara(id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, suara BLOB)";
        db.execSQL(sql2);

        ContentValues v = new ContentValues();
        v.put("nama", "soal 1");
        v.put("suara", R.raw.listening1quiz1);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 2");
        v.put("suara", R.raw.listening2quiz1);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 3");
        v.put("suara", R.raw.listening3quiz1);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 4");
        v.put("suara", R.raw.listening4quiz1);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 5");
        v.put("suara", R.raw.listening5quiz1);
        db.insert("tbl_suara", "nama", v);

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setSuara(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        db.execSQL("DROP TABLE IF EXISTS tbl_suara");
        onCreate(db);
    }

}