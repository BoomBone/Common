package com.home.base.net

import com.home.base.common.BaseException
import com.home.base.presenter.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @author Ting
 * @date 2018/3/22.
 */
open class BaseObserver<T>(val baseView: BaseView) : Observer<T> {
    override fun onNext(t: T) {
    }

    override fun onComplete() {
    }

    override fun onSubscribe(d: Disposable) {
    }

    override fun onError(e: Throwable) {
        baseView.hideLoading()
        if (e is BaseException) {
            baseView.onError(e.msg)
        }

    }
}