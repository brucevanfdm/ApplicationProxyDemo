package com.fedming.applicationproxydemo.app;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

/**
 * 继承了Application0ne与ApplicationTwo的MultiApplication
 * 最后将该Application配置到AndroidManifest.xml中即可实现继承多个Application
 * Created by Bruce on 2017/10/29.
 */

public class MultiApplication extends ProxyApplication {

    private static final String TAG = "fdm";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "MultiApplication onCreate");
    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
