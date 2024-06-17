package com.example.testservice

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

enum class ApplicationState {
    FOREGROUND,
    BACKGROUND
}

class ApplicationLifecycleStatus : Application.ActivityLifecycleCallbacks {

    companion object {
        var state: ApplicationState = ApplicationState.FOREGROUND
    }

    override fun onActivityStarted(activity: Activity) {
        state = ApplicationState.FOREGROUND
    }

    override fun onActivityStopped(activity: Activity) {
        state = ApplicationState.BACKGROUND
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {}

    override fun onActivityResumed(activity: Activity) {}

    override fun onActivityPaused(activity: Activity) {}

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}

    override fun onActivityDestroyed(activity: Activity) {
        Log.d("Test", "State_Destroyed")
    }
}