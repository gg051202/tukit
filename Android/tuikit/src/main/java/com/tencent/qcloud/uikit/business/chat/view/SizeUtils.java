package com.tencent.qcloud.uikit.business.chat.view;


import android.content.Context;
import android.util.TypedValue;


/**
 * 常用单位转换的辅助类
 *
 * @author zhy
 */
public class SizeUtils {
    private SizeUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * dp转px
     *
     * @param dpVal
     */
    public static int dp2px(Context context,float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpVal, context.getResources().getDisplayMetrics());
    }

//    /**
//     * sp转px
//     *
//     * @param spVal
//     */
//    public static int sp2px(float spVal) {
//        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, spVal, MyApplication.getInstance().getResources()
//                .getDisplayMetrics());
//    }
//
//    /**
//     * px转dp
//     *
//     * @param pxVal
//     */
//    public static float px2dp(float pxVal) {
//        final float scale = MyApplication.getInstance().getResources().getDisplayMetrics().density;
//        return (pxVal / scale);
//    }
//
//    /**
//     * px转sp
//     *
//     * @param pxVal
//     */
//    public static float px2sp(float pxVal) {
//        return (pxVal / MyApplication.getInstance().getResources().getDisplayMetrics().scaledDensity);
//    }

}
