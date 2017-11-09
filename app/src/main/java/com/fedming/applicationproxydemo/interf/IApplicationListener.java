package com.fedming.applicationproxydemo.interf;

import android.content.Context;
import android.content.res.Configuration;

public interface IApplicationListener {

    void onProxyCreate();

    void onProxyAttachBaseContext(Context base);

    void onProxyConfigurationChanged(Configuration newConfig);

}