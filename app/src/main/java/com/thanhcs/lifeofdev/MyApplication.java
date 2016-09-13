package com.thanhcs.lifeofdev;

import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

/**
 * Created by thanhcs94 on 9/13/2016.
 */
public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        MultiDex.install(getApplicationContext());
        super.onCreate();
    }
}