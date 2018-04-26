package com.example.coolweather.db.tableDc;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.coolweather.db.DBConstant;
import com.example.coolweather.util.LogUtil;

/**
 * Created by chenbing on 2018/4/26.
 * 省份表
 */
public class ProvinceTableDc {
    private static final String TAG = "ProvinceTableDc";
    //表名
    public static final String TABLE_NAME = "province";
    //自增id
    public static final String ID = "_id";
    //省份名称
    public static final String PROVINCE_NAME = "provinceName";
    //省份编码
    public static final String PROVINCE_CODE = "provinceCode";

    public static void createTable(SQLiteDatabase database){
        String sql = DBConstant.CREATE_TABLE + TABLE_NAME + "("
                +ID +DBConstant.PERMARY
                +PROVINCE_NAME + DBConstant.TYPE_TEXT
                +PROVINCE_CODE + DBConstant.TYPE_INT_END
                +");";
        LogUtil.e(TAG, "createTable: " + sql );
        database.execSQL(sql);
    }
}
