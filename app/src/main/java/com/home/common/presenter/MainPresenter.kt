package com.home.common.presenter

import android.content.Context
import android.util.Log
import android.widget.Button
import com.home.base.net.ext.execute
import com.home.base.presenter.BasePresenter
import com.home.common.presenter.view.MainView
import com.work.ddnet.rx.RxRestClient
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * @author Ting
 * @date 2018/3/19.
 */
class MainPresenter @Inject constructor() : BasePresenter<MainView>() {
    fun println() {
        Log.e("main", "main")
    }

    fun testNet(btn: Button, context: Context) {
        btn.setOnClickListener {
            RxRestClient.builder()
                    .url("http://news.baidu.com/")
                    .build()
                    .get()
                    .execute(object : Observer<String> {
                        override fun onSubscribe(d: Disposable) {

                        }

                        override fun onError(e: Throwable) {
                        }

                        override fun onComplete() {
                        }

                        override fun onNext(t: String) {
                            context.toast("网络请求成功")
                        }
                    })
        }
    }
}