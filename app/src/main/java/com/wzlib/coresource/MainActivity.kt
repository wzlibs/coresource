package com.wzlib.coresource

import com.wzlib.coresource.databinding.ActivityMainBinding
import com.wzlibs.core.CoreActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : CoreActivity<ActivityMainBinding>() {

    override fun bindingView(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}