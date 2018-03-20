package com.home.base.common

import android.app.Application
import com.home.base.injection.component.AppComponent
import com.home.base.injection.component.DaggerAppComponent
import com.home.base.injection.module.AppModule

/**
 * @author Ting
 * @date 2018/3/20.
 * @function dagger2相当于实现单例
 */
open class BaseApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}