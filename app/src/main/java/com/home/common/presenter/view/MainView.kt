package com.home.common.presenter.view

import com.home.base.presenter.view.BaseView
import com.home.common.bean.MeiZiBean

/**
 * @author Ting
 * @date 2018/3/19.
 */
interface MainView : BaseView {
    fun showGirl(picList: List<MeiZiBean>)
}