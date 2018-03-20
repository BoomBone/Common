package com.home.base.injection.module

import android.app.Activity
import android.content.Context
import com.home.base.common.BaseApplication
import com.home.base.injection.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Ting
 * @date 2018/3/20.
 * @function Activity级别Module
 */
@Module
class ActivityModule(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun provideActivity(): Activity {
        return activity
    }
}