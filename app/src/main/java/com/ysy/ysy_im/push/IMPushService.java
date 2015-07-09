package com.ysy.ysy_im.push;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.ysy.ysy_im.entities.Message;
import com.ysy.ysy_im.utilitis.Constants;

/**
 * Created by ggec5486 on 2015/7/9.
 */
public class IMPushService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Message message = (Message) intent.getSerializableExtra(Constants.KEY_MESSAGE);
        switch (message.getType()) {
            case txt:
                break;
            case multimedia:
                break;
            case emo:
                break;
        }
        return super.onStartCommand(intent, flags, startId);
    }
}
