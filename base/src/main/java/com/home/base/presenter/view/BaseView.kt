package com.home.base.presenter.view

/**
 * @author Ting
 * @date 2018/3/19.
 * @function 基础的View接口
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(error:String)
}