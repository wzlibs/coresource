package com.wzlibs.ggadmob.managers.ids

import android.content.Context
import com.wzlibs.core.R

class NativeAdsIdManager(private val context: Context) : AdsIdManager(context) {
    override val debugId: String
        get() = context.getString(R.string.id_native_test)
}