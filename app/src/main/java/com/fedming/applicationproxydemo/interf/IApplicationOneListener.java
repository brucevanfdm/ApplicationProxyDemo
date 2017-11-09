package com.fedming.applicationproxydemo.interf;

import android.content.Context;
import android.content.res.Configuration;

public interface IApplicationOneListener {

    void onOneCreate();

    void onOneAttachBaseContext(Context base);

    void onOneConfigurationChanged(Configuration newConfig);
}