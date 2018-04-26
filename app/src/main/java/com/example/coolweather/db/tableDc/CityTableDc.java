package com.example.coolweather.db.tableDc;

import android.database.sqlite.SQLiteDatabase;

import com.example.coolweather.db.DBConstant;
import com.example.coolweather.util.LogUtil;

/**
 * Created by chenbing on 2018/4/26.
 * 城市表
 */
public class CityTableDc {
    private static final String TAG = "CityTableDc";
    //表名
    public static final String TABLE_NAME = "city";
    //自增id
    public static final String ID = "_id";
    //城市名称
    public static final String CITY_NAME = "cityName";
    //城市编码
    public static final String CITY_CODE = "cityCode";

    public static void createTable(SQLiteDatabase database){
        String sql = DBConstant.CREATE_TABLE + TABLE_NAME + "("
                +ID +DBConstant.PERMARY
                + CITY_NAME + DBConstant.TYPE_TEXT
                + CITY_CODE + DBConstant.TYPE_INT_END
                +");";
        LogUtil.e(TAG, "createCityTable: " + sql );
        database.execSQL(sql);
    }
}
