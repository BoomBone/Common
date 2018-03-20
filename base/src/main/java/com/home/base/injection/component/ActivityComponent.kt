package com.home.base.injection.component

import android.app.Activity
import android.content.Context
import com.home.base.injection.ActivityScope
import com.home.base.injection.module.ActivityModule
import com.home.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author Ting
 * @date 2018/3/20.
 * @function Applicaion级别Component
 */
@ActivityScope
@Component(dependencies = [(AppComponent::class)], modules = [(ActivityModule::class)])
interface ActivityComponent {
    fun context(): Context
    fun activity(): Activity
}