package com.softtanck.lenovoservice;

import android.app.Application;
import android.util.Log;

/**
 * @author : Tanck
 * @Description : TODO
 * @date 8/10/2015
 */
public class LApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Tanck", "oncreat");
    }

}
