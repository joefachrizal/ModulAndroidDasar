package com.android.cnd.pertemuan1.base

import android.app.Application
import android.content.Context
import com.google.android.play.core.splitcompat.SplitCompat

/**
 * * Written by @JoeFachrizal 24/12/2019 21:55.
 */
class BaseApp : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        SplitCompat.install(this)
    }
}