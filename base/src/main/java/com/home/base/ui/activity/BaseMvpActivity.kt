package com.home.base.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.home.base.presenter.BasePresenter
import com.home.base.presenter.view.BaseView
import javax.inject.Inject

/**
 * @author Ting
 * @date 2018/3/19.
 * @function 基础的Mvp架构Activity
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    @Inject
    lateinit var mPresenter: T

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
}