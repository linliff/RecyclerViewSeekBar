package com.linlif.slidegridview

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by linlif on 2019-12-20
 */
class App : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }


}
