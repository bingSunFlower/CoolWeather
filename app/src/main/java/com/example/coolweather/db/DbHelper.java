package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.coolweather.db.tableDc.CityTableDc;
import com.example.coolweather.db.tableDc.CountyTableDc;
import com.example.coolweather.db.tableDc.ProvinceTableDc;

/**
 * Created by chenbing on 2018/4/26.
 */

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        ProvinceTableDc.createTable(db);
        CityTableDc.createTable(db);
        CountyTableDc.createTable(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
