package com.example.composesample.base

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import com.example.composesample.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application(),Application.ActivityLifecycleCallbacks {
    val TAG: String = "MyApplication"
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(appModule)
        }
    }
    override fun onActivityCreated(p0: Activity, p1: Bundle?) {
        Log.d(TAG, "onActivityCreated: called ")
    }

    override fun onActivityStarted(p0: Activity) {
        Log.d(TAG, "onActivityStarted: called ")

    }

    override fun onActivityResumed(p0: Activity) {
        Log.d(TAG, "onActivityResumed: called ")

    }

    override fun onActivityPaused(p0: Activity) {
        Log.d(TAG, "onActivityPaused: called ")

    }

    override fun onActivityStopped(p0: Activity) {
        Log.d(TAG, "onActivityStopped: called ")

    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
        Log.d(TAG, "onActivitySaveInstanceState: called ")

    }

    override fun onActivityDestroyed(p0: Activity) {
        Log.d(TAG, "onActivityDestroyed: called ")
    }
}