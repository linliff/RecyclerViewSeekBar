package com.linlif.slidegridview


/**
 * dp px 转换工具类
 */
object DensityUtil {

    private val scale = App.context?.getResources()?.getDisplayMetrics()?.density

    /**
     * dp 转 px
     *
     * @param dpValue
     * @return
     */
    fun dip2px(dpValue: Float): Int {

        return (dpValue * this!!.scale!! + 0.5f).toInt()
    }

    /**
     * px 转 dp
     *
     * @param pxValue
     * @return
     */
    fun px2dip(pxValue: Float): Int {

        return (pxValue / this!!.scale!! + 0.5f).toInt()
    }


}
