package com.home.common.presenter

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import com.home.base.net.BaseObserver
import com.home.base.net.ext.execute
import com.home.base.presenter.BasePresenter
import com.home.common.bean.MeiZiBean
import com.home.common.common.AppConstance
import com.home.common.presenter.view.MainView
import com.work.ddnet.rx.RxRestClient
import java.util.*
import javax.inject.Inject

/**
 * @author Ting
 * @date 2018/3/19.
 */
class MainPresenter @Inject constructor() : BasePresenter<MainView>() {

    fun getData() {
        val calendar = Calendar.getInstance()
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        RxRestClient.builder()
                .url(AppConstance.FU_LI_URL + "$month/$day")
                .build()
                .get()
                .execute(object : BaseObserver<String>(mView) {
                    override fun onNext(t: String) {
                        Log.e("main", t)
                        val gson = Gson()
                        val jsonArray = JsonParser().parse(t).asJsonObject.getAsJsonArray("results")
                        val list = gson.fromJson<List<MeiZiBean>>(jsonArray, object : TypeToken<List<MeiZiBean>>() {}.type)
                        mView.showGirl(list)
                    }
                })
    }

}