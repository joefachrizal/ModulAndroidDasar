package com.android.cnd.pertemuan1.base;

import android.app.Application;
import android.content.Context;

import com.google.android.play.core.splitcompat.SplitCompat;

/**
 * * Written by @JoeFachrizal 24/12/2019 21:55.
 **/
public class BaseApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        SplitCompat.install(this);
    }
}
