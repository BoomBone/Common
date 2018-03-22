package com.home.common.presenter

import com.home.base.net.BaseObserver
import com.home.base.net.ext.execute
import com.home.base.presenter.BasePresenter
import com.home.common.presenter.view.MainView
import com.work.ddnet.rx.RxRestClient
import javax.inject.Inject

/**
 * @author Ting
 * @date 2018/3/19.
 */
class MainPresenter @Inject constructor() : BasePresenter<MainView>() {

    fun testNet() {
        RxRestClient.builder()
                .url("http://news.baidu.com/")
                .build()
                .get()
                .execute(object : BaseObserver<String>(mView) {
                    override fun onNext(t: String) {
                        mView.success()
                    }
                })
    }

}