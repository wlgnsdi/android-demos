package com.android.samples.donuttracker

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TrackerApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}