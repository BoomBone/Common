package com.home.common.ui.activity

import android.os.Bundle
import com.home.base.ui.activity.BaseMvpActivity
import com.home.common.R
import com.home.common.injection.component.DaggerMainComponent
import com.home.common.presenter.MainPresenter
import com.home.common.presenter.view.MainView

class MainActivity : BaseMvpActivity<MainPresenter>(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injection()
        mPresenter.println()
    }

    private fun injection() {
        DaggerMainComponent.builder()
                .build()
                .inject(this)
        mPresenter.mView = this
    }
}
