package com.home.base.injection

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * @author Ting
 * @date 2018/3/20.
 * @function Activity级别作用域
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScope