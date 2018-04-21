package com.home.common.bean

import com.google.gson.annotations.SerializedName

/**
 * @author Ting
 * @date 2018/4/21
 */
data class ResultBean(
        @SerializedName("error")val error: Boolean,
        @SerializedName("result")val result: List<MeiZiBean>) {
}