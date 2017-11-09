package com.fedming.applicationproxydemo.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

/**
 * 想要继承的第二个Application
 * Created by Bruce on 2017/10/29.
 */

public class ApplicationTwo extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("fdm", "ApplicationTwo onCreate");
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
