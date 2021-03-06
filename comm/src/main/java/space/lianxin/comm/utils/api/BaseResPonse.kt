package space.lianxin.comm.utils.api

/**
 * ===========================================
 * 网络请求返回的基类.
 *
 * @author: lianxin
 * @date: 2021/3/3 19:37
 * ===========================================
 */
data class BaseResponse<out T>(
    val state: Int,
    val message: String,
    val ext: T
)