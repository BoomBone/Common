package com.home.base.presenter

import com.home.base.presenter.view.BaseView

/**
 * @author Ting
 * @date 2018/3/19.
 * @function 基础的Presenter
 */
open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}