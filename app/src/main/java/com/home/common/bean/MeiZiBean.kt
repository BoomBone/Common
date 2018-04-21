package com.home.common.bean

import com.google.gson.annotations.SerializedName

/**
 * @author Ting
 * @date 2018/4/21
 */

data class MeiZiBean(
        @SerializedName("_id") val _id: String,
        @SerializedName("createdAt") val createdAt: String,
        @SerializedName("desc") val desc: String,
        @SerializedName("publishedAt") val publishedAt: String,
        @SerializedName("source") val source: String,
        @SerializedName("type") val type: String,
        @SerializedName("url") val url: String,
        @SerializedName("used") val used: Boolean,
        @SerializedName("who") val who: String
)