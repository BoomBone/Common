package com.home.common.presenter

import android.util.Log
import com.home.base.presenter.BasePresenter
import com.home.common.presenter.view.MainView

/**
 * @author Ting
 * @date 2018/3/19.
 */
class MainPresenter : BasePresenter<MainView>() {
    fun println(){
        Log.e("main","main")
    }
}