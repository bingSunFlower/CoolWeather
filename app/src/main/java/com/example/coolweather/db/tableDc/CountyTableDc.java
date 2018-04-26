package com.example.coolweather.db.tableDc;

import android.database.sqlite.SQLiteDatabase;

import com.example.coolweather.db.DBConstant;
import com.example.coolweather.util.LogUtil;

/**
 * Created by chenbing on 2018/4/26.
 * 县表
 */
public class CountyTableDc {
    private static final String TAG = "CountyTableDc";
    //表名
    public static final String TABLE_NAME = "county";
    //自增id
    public static final String ID = "_id";
    //城市名称
    public static final String COUNTY_NAME = "countyName";
    //城市编码
    public static final String COUNTY_CODE = "countyCode";

    public static void createTable(SQLiteDatabase database){
        String sql = DBConstant.CREATE_TABLE + TABLE_NAME + "("
                +ID +DBConstant.PERMARY
                + COUNTY_NAME + DBConstant.TYPE_TEXT
                + COUNTY_CODE + DBConstant.TYPE_INT_END
                +");";
        LogUtil.e(TAG, "createCountyTable: " + sql );
        database.execSQL(sql);
    }
}
