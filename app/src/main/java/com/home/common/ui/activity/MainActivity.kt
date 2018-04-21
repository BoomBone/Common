package com.home.common.ui.activity

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.home.base.ui.activity.BaseMvpActivity
import com.home.common.R
import com.home.common.bean.MeiZiBean
import com.home.common.injection.component.DaggerMainComponent
import com.home.common.presenter.MainPresenter
import com.home.common.presenter.view.MainView
import com.home.common.ui.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseMvpActivity<MainPresenter>(), MainView {
    override fun showGirl(picList: List<MeiZiBean>) {
        mMainRv.layoutManager = GridLayoutManager(this, 2)
        mMainRv.adapter = MainAdapter(R.layout.app_item_main, picList)
    }


    override fun injectComponent() {
        DaggerMainComponent.builder()
                .activityComponent(activityComponent)
                .build()
                .inject(this)
        mPresenter.mView = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()

    }

    private fun initView() {
        mPresenter.getData()
    }

}
