package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.coolweather.util.LogUtil;

/**
 * Created by chenbing on 2018/4/26.
 */

public class BaseBusiness {
    private static final String TAG = "BaseBusiness";
    //对象锁
    public static final Object lock = new Object();
    //数据库名称
    private final String dbName = "cool_weather.db";
    protected static SQLiteDatabase db;

    private DbHelper dbHelper;

    /**数据库版本
     * 1 2018.4.26 初始创建
     */
    private final int db_version = 1;
    public BaseBusiness(Context context){
        dbHelper = new DbHelper(context,dbName,null,db_version);
        synchronized (lock){
            openDataBase(context);
        }
    }

    /**
     * 获取数据库对象
     * @param context
     * @return
     */
    private SQLiteDatabase openDataBase(Context context){
        if (context == null){
            return null;
        }
        if (db == null || !db.isOpen()){
            try {
                db = dbHelper.getWritableDatabase();
            }catch (Exception e){
                LogUtil.e(TAG, "openDataBase: " + e.getMessage());
            }
        }
        return db;
    }
}
