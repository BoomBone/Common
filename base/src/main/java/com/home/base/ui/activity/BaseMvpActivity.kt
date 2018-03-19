package com.home.base.ui.activity

import com.home.base.presenter.BasePresenter
import com.home.base.presenter.view.BaseView

/**
 * @author Ting
 * @date 2018/3/19.
 * @function 基础的Mvp架构Activity
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mPresenter: T

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
}