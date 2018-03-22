package com.home.common.ui.activity

import android.os.Bundle
import com.home.base.ui.activity.BaseMvpActivity
import com.home.common.R
import com.home.common.injection.component.DaggerMainComponent
import com.home.common.presenter.MainPresenter
import com.home.common.presenter.view.MainView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : BaseMvpActivity<MainPresenter>(), MainView {
    override fun success() {
        toast("网络请求成功")
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
        btn_net.setOnClickListener {
            mPresenter.testNet()
        }
    }

}
