package com.home.base.common

import java.sql.ClientInfoStatus

/**
 * @author Ting
 * @date 2018/3/22.
 * @function 定义通用异常
 */
class BaseException(val status: Int, val msg: String) : Throwable() {
}