package com.home.common.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.home.base.utils.GlideApp
import com.home.common.R
import com.home.common.data.MeiZiPicBean

/**
 * @author Ting
 * @date 2018/4/17.
 */
class MainAdapter(val layoutId: Int, val list: List<MeiZiPicBean>) : BaseQuickAdapter<MeiZiPicBean, BaseViewHolder>(layoutId, list) {
    override fun convert(helper: BaseViewHolder?, item: MeiZiPicBean?) {
        if (item != null) {
            if (helper != null) {
                GlideApp.with(mContext).load(item.url).into(helper.getView(R.id.mMainItemIv))
            }
        }
    }
}