package com.home.base.injection.component

import android.content.Context
import com.home.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author Ting
 * @date 2018/3/20.
 * @function Applicaion级别Component
 */
@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun context(): Context
}