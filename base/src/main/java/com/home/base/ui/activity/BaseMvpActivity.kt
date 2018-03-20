package com.home.base.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.home.base.common.BaseApplication
import com.home.base.injection.component.ActivityComponent
import com.home.base.injection.component.DaggerActivityComponent
import com.home.base.injection.module.ActivityModule
import com.home.base.presenter.BasePresenter
import com.home.base.presenter.view.BaseView
import javax.inject.Inject

/**
 * @author Ting
 * @date 2018/3/19.
 * @function 基础的Mvp架构Activity
 */
abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    @Inject
    lateinit var mPresenter: T

    lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()
    }

    protected abstract fun injectComponent()

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .build()
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
}