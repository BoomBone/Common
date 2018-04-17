package com.home.common.presenter

import android.util.Log
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.home.base.net.BaseObserver
import com.home.base.net.ext.execute
import com.home.base.presenter.BasePresenter
import com.home.common.common.AppConstance
import com.home.common.data.MeiZiPicBean
import com.home.common.presenter.view.MainView
import com.work.ddnet.rx.RxRestClient
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

/**
 * @author Ting
 * @date 2018/3/19.
 */
class MainPresenter @Inject constructor() : BasePresenter<MainView>() {

    fun testNet() {

    }

    fun getData() {
        val calendar = Calendar.getInstance()
        var month = calendar.get(Calendar.MONTH)
        var day = calendar.get(Calendar.DAY_OF_MONTH)
        RxRestClient.builder()
                .url(AppConstance.FU_LI_URL + "$month/$day")
                .build()
                .get()
                .execute(object : BaseObserver<String>(mView) {
                    override fun onNext(t: String) {
                        Log.e("main", t)
                        val list = arrayListOf<MeiZiPicBean>()
                        val jsonArray = JSON.parseObject(t).getJSONArray("results")
                        for (i in jsonArray.withIndex()) {
                            val jsonObject = jsonArray.getJSONObject(i.index)
                            val url = jsonObject.getString("url")
                            val bean = MeiZiPicBean(url)
                            list.add(bean)
                        }
                        mView.showGirl(list)
                    }
                })
    }

}