package com.ysy.ysy_im.push;

import android.content.Context;
import android.content.Intent;

import com.ysy.ysy_im.entities.Message;
import com.ysy.ysy_im.utilitis.Constants;

/**
 * Created by ggec5486 on 2015/7/9.
 */
public class IMPushManager {
    private static IMPushManager mIMPushManager;
    private Context context;

    public IMPushManager(Context context) {
        this.context = context;
    }

    public static IMPushManager getInstance(Context context) {
        if (mIMPushManager == null) {
            mIMPushManager = new IMPushManager(context);
        }
        return mIMPushManager;
    }

    public void HandlePush(String content) {

        PushChanger.getInstance().notifyChanged(content);
    }

    public void SendMessage(Message message) {

        Intent intent = new Intent(context, IMPushService.class);
        intent.putExtra(Constants.KEY_MESSAGE, message);
        context.startService(intent);
    }

    public void addObserver(PushWatcher watcher) {
        PushChanger.getInstance().addObserver(watcher);
    }

    public void removeObserver(PushWatcher watcher) {
        PushChanger.getInstance().deleteObserver(watcher);
    }

    public void removeObservers() {
        PushChanger.getInstance().deleteObservers();
    }
}
