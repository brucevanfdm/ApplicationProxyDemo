package com.fedming.applicationproxydemo.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.fedming.applicationproxydemo.interf.IApplicationListener;
import com.fedming.applicationproxydemo.interf.IApplicationOneListener;
import com.fedming.applicationproxydemo.interf.IApplicationTwoListener;

public class ImplementApplication extends Application implements IApplicationListener {

    private IApplicationOneListener iApplicationOneListener;
    private IApplicationTwoListener iApplicationTwoListener;

    @Override
    public void onProxyCreate() {
        super.onCreate();

        if (iApplicationOneListener != null) {
            iApplicationOneListener.onOneCreate();
        }
        if (iApplicationTwoListener != null) {
            iApplicationTwoListener.onTwoCreate();
        }

    }

    @Override
    public void onProxyAttachBaseContext(Context base) {
        super.attachBaseContext(base);
        this.iApplicationOneListener = initApplicationOne();
        this.iApplicationTwoListener = initApplicationTwo();

        if (this.iApplicationOneListener != null) {
            this.iApplicationOneListener.onOneAttachBaseContext(base);
        }
        if (this.iApplicationTwoListener != null) {
            this.iApplicationTwoListener.onTwoAttachBaseContext(base);
        }
    }

    @Override
    public void onProxyConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (this.iApplicationOneListener != null) {
            this.iApplicationOneListener.onOneConfigurationChanged(newConfig);
        }

        if (this.iApplicationTwoListener != null) {
            this.iApplicationTwoListener.onTwoConfigurationChanged(newConfig);
        }

    }

    private IApplicationOneListener initApplicationOne() {
        try {
            Class clazz = Class.forName("com.fedming.applicationproxydemo.app.ImplementApplicationOne");
            return (IApplicationOneListener) clazz.newInstance();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    private IApplicationTwoListener initApplicationTwo() {
        try {
            Class clazz = Class.forName("com.fedming.applicationproxydemo.app.ImplementApplicationTwo");
            return (IApplicationTwoListener) clazz.newInstance();

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

}