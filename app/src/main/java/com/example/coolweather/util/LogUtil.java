package com.example.coolweather.util;

import android.util.Log;

/**
 * Created by chenbing on 2018/4/26.
 */

public class LogUtil {
    private static final int verbose = 1;
    private static final int debug = 2;
    private static final int info = 3;
    private static final int warn = 4;
    private static final int error = 5;
    private static final int nothing = 6;

    private static int level = verbose;

    public static void v(String tag,String message){
        if (level<=verbose){
            Log.e(tag,message);
        }
    }
    public static void d(String tag,String message){
        if (level<=debug){
            Log.d(tag,message);
        }
    }
    public static void i(String tag,String message){
        if (level<=info){
            Log.i(tag,message);
        }
    }
    public static void w(String tag,String message){
        if (level<=warn){
            Log.w(tag,message);
        }
    }
    public static void e(String tag,String message){
        if (level<=error){
            Log.e(tag,message);
        }
    }
}
