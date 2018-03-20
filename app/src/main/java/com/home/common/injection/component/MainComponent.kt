package com.home.common.injection.component

import com.home.common.ui.activity.MainActivity
import dagger.Component

/**
 * @author Ting
 * @date 2018/3/20.
 * @fuction mPresenter连接桥
 */
@Component
interface MainComponent {
    fun inject(activity: MainActivity)
}