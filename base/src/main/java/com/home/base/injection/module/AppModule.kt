package com.home.base.injection.module

import android.content.Context
import com.home.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Ting
 * @date 2018/3/20.
 * @function Application级别Module,全局Context
 */
@Module
class AppModule(private val context: BaseApplication) {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }
}