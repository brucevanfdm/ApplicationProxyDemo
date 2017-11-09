package com.fedming.applicationproxydemo.app;

import android.content.Context;
import android.content.res.Configuration;

import com.fedming.applicationproxydemo.interf.IApplicationOneListener;

/**
 * ApplicationTwo的实现类
 * Created by Bruce on 2017/10/29.
 */

public class ImplementApplicationOne extends ApplicationOne implements IApplicationOneListener {
    @Override
    public void onOneCreate() {
        super.onCreate();
    }

    @Override
    public void onOneAttachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onOneConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}