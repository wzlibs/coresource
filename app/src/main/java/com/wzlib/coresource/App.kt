package com.wzlib.coresource

import com.wzlibs.core.CoreApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : CoreApplication() {
    override fun isDebug(): Boolean {
        return BuildConfig.DEBUG
    }
}