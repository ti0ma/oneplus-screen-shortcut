package me.molonosov.oprefreshrate

import android.app.Application
import android.content.Context

class GlobalApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {
        private var appContext: Context? = null

        fun getAppContext(): Context? {
            return appContext
        }
    }
}