package com.boyhotkey96.quanly_nhanvien;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by boyhotkey96 on 18/08/2017.
 */

public class ClasDAO {

    MyDatabase myDatabase;
    SQLiteDatabase database;

    public ClasDAO(Context context) {
         myDatabase = new MyDatabase(context);
    }

    public void open() {
        database = myDatabase.getWritableDatabase();
    }
}
