package com.fedming.applicationproxydemo.app;

import android.content.Context;
import android.content.res.Configuration;

import com.fedming.applicationproxydemo.interf.IApplicationTwoListener;

/**
 * ApplicationTwo的实现类
 * Created by Bruce on 2017/10/29.
 */
public class ImplementApplicationTwo extends ApplicationTwo implements IApplicationTwoListener {

    @Override
    public void onTwoCreate() {
        super.onCreate();
    }

    @Override
    public void onTwoAttachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onTwoConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}