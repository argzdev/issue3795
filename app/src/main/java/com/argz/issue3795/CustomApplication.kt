package com.argz.issue3795

import android.app.Application
import android.content.Context
import android.os.StrictMode

class CustomApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build()
        )
        super.attachBaseContext(base)
    }
}