package com.home.base.net.ext

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author Ting
 * @date 2018/1/23
 */

fun <T> Observable<T>.execute(observer: Observer<T>) {
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(observer)
}

interface BaseUrl {
    companion object {
        val URL = "http://127.0.0.1/"
    }
}