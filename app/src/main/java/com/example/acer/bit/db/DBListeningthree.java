package com.example.acer.bit.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.acer.bit.R;
import com.example.acer.bit.model.Soal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ACER on 12/01/2017.
 */

public class DBListeningthree extends SQLiteOpenHelper {
    final static String DB_NAME = "db_listening3";

    public DBListeningthree(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, suara BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Bacaan tersebut mengandung tasydid...");
        values.put("pil_a", "Hukum");
        values.put("pil_b", "Ashli");
        values.put("pil_c", "Samar");
        values.put("jwban","1");
        values.put("suara", R.raw.alfatihah);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Bacaan tersebut mengandung tasydid...");
        values.put("pil_a", "Hukum");
        values.put("pil_b","Ashli");
        values.put("pil_c", "Samar");
        values.put("jwban","1");
        values.put("suara", R.raw.yusuf);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Bacaan tersebut mengandung tasydid...");
        values.put("pil_a", "Hukum");
        values.put("pil_b","Ashli");
        values.put("pil_c", "Samar");
        values.put("jwban","1");
        values.put("suara", R.raw.lahab);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Bacaan tersebut mengandung tasydid...");
        values.put("pil_a", "Hukum");
        values.put("pil_b","Ashli");
        values.put("pil_c", "Samar");
        values.put("jwban","1");
        values.put("suara", R.raw.aladiyat);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Bacaan tersebut mengandung tasydid...");
        values.put("pil_a", "Hukum");
        values.put("pil_b","Ashli");
        values.put("pil_c", "Samar");
        values.put("jwban","0");
        values.put("suara", R.raw.azzalzalah);
        db.insert("tbl_soal", "soal", values);

        String sql2 = "CREATE TABLE IF NOT EXISTS tbl_suara(id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, suara BLOB)";
        db.execSQL(sql2);

        ContentValues v = new ContentValues();
        v.put("nama", "soal 1");
        v.put("suara", R.raw.alfatihah);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 2");
        v.put("suara", R.raw.yusuf);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 3");
        v.put("suara", R.raw.lahab);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 4");
        v.put("suara", R.raw.aladiyat);
        db.insert("tbl_suara", "nama", v);

        v.put("nama", "soal 5");
        v.put("suara", R.raw.azzalzalah);
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