package com.fedming.applicationproxydemo.interf;

import android.content.Context;
import android.content.res.Configuration;

public interface IApplicationTwoListener {

    void onTwoCreate();

    void onTwoAttachBaseContext(Context base);

    void onTwoConfigurationChanged(Configuration newConfig);
}