package com.home.common.presenter

import android.util.Log
import com.home.base.presenter.BasePresenter
import com.home.common.presenter.view.MainView
import javax.inject.Inject

/**
 * @author Ting
 * @date 2018/3/19.
 */
class MainPresenter @Inject constructor(): BasePresenter<MainView>() {
    fun println(){
        Log.e("main","main")
    }
}