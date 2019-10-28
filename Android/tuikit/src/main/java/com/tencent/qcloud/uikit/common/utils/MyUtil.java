package com.tencent.qcloud.uikit.common.utils;

import android.util.Log;

import com.tencent.qcloud.uikit.business.chat.model.MessageInfo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sss on 2019-10-18 15:30.
 * email jkjkjk.com
 */
public class MyUtil {

    public static boolean isPushWxSuccessfully(MessageInfo message) {
        try {
            Log.i("isPushWxSuccessfully", message.getTIMMessage().getCustomStr());
            JSONObject jsonObject = new JSONObject(message.getTIMMessage().getCustomStr());
            boolean isPushWxSuccessfully = (boolean) jsonObject.get("isPushWxSuccessfully");
            if (message.isSelf() && isPushWxSuccessfully) {
                return true;
            }
        } catch (JSONException e) {
            Log.e("isPushWxSuccessfully", e.toString());
            return false;
        } catch (Exception e) {
            Log.e("isPushWxSuccessfully", e.toString());
            return false;
        }
        return false;
    }

}
