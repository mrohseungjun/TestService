package com.example.testservice

import android.app.Application
import android.util.Log

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d("TEST","current state: ${ApplicationLifecycleStatus.state}")
        registerActivityLifecycleCallbacks(ApplicationLifecycleStatus())
    }
}