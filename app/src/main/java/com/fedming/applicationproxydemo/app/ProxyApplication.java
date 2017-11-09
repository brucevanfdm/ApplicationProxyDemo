package com.fedming.applicationproxydemo.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.fedming.applicationproxydemo.interf.IApplicationListener;

/**
 * 代理Application对象
 * Created by Bruce on 2017/10/29.
 */

public class ProxyApplication extends Application {

    private IApplicationListener listener;

    @Override
    public void onCreate() {
        super.onCreate();
        if (this.listener != null) {
            this.listener.onProxyCreate();
        }
    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        this.listener = initImplementApplication();
        if (this.listener != null) {
            this.listener.onProxyAttachBaseContext(base);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.listener != null) {
            this.listener.onProxyConfigurationChanged(newConfig);
        }
    }

    private IApplicationListener initImplementApplication() {
        try {
            Class clazz = Class.forName("com.fedming.applicationproxydemo.app.ImplementApplication");
            return (IApplicationListener) clazz.newInstance();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

}
