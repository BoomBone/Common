package com.home.common.injection.component

import com.home.base.injection.PerComponentScope
import com.home.base.injection.component.ActivityComponent
import com.home.common.ui.activity.MainActivity
import dagger.Component

/**
 * @author Ting
 * @date 2018/3/20.
 * @fuction mPresenter连接桥
 */
@PerComponentScope
@Component(dependencies = [(ActivityComponent::class)])
interface MainComponent {
    fun inject(activity: MainActivity)
}