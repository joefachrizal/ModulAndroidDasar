package com.android.cnd.pertemuan1.base;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.play.core.splitcompat.SplitCompat;

/**
 * * Written by @JoeFachrizal 24/12/2019 21:57.
 **/
public class BaseSplitActivity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
        SplitCompat.install(this);
    }
}
