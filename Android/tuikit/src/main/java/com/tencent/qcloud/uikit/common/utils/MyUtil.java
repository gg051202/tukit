package com.tencent.qcloud.uikit.common.utils;

import com.tencent.qcloud.uikit.business.chat.model.MessageInfo;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sss on 2019-10-18 15:30.
 * email jkjkjk.com
 */
public class MyUtil {

    public static boolean isPushWx(MessageInfo message) {
        try {
            JSONObject jsonObject = new JSONObject(message.getTIMMessage().getCustomStr());
            boolean notPushWx = (boolean) jsonObject.get("notPushWx");
            if (message.isSelf() && !notPushWx) {
                return true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
    public static boolean isPushWxSuccessfully(MessageInfo message) {
        try {
            JSONObject jsonObject = new JSONObject(message.getTIMMessage().getCustomStr());
            boolean isPushWxSuccessfully = (boolean) jsonObject.get("isPushWxSuccessfully");
            if (message.isSelf() && isPushWxSuccessfully) {
                return true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

}
