package com.ubiq.testapp

import android.app.Application

class TestApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(TestAppActivityCallbacks())
    }
}