package com.tencent.qcloud.uikit.common;

import android.view.View;

import com.tencent.qcloud.uikit.business.chat.model.MessageInfo;

/**
 * Created by guilin on 2019-05-07 14:00.
 * email 973635949@qq.com
 */
public interface IUIKitSendMessageSuccessCallBack {
    void success(MessageInfo message);

    void showPushHint();

    void onMessageLongClick(final int index, final MessageInfo messageInfo, View view);
}
