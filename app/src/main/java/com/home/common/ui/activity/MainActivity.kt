package com.home.common.ui.activity

import android.os.Bundle
import com.home.base.ui.activity.BaseMvpActivity
import com.home.base.utils.GlideApp
import com.home.common.R
import com.home.common.injection.component.DaggerMainComponent
import com.home.common.presenter.MainPresenter
import com.home.common.presenter.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : BaseMvpActivity<MainPresenter>(), MainView {
    override fun success() {
        toast("网络请求成功")
        GlideApp.with(this)
                .load("http://7xi8d6.com1.z0.glb.clouddn.com/20180129074038_O3ydq4_Screenshot.jpeg")
                .into(mMainIv)
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
        mMainBtn.setOnClickListener {
            mPresenter.testNet()
        }
    }

}
