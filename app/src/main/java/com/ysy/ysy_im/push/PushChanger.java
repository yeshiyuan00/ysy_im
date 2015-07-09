package com.ysy.ysy_im.push;

import java.util.Observable;

/**
 * Created by ggec5486 on 2015/7/9.
 */
public class PushChanger extends Observable {

    private static PushChanger mPushChanger;

    public static PushChanger getInstance() {
        if (mPushChanger == null) {
            mPushChanger = new PushChanger();
        }
        return mPushChanger;
    }

    public void notifyChanged(String content) {
        notifyObservers(content);
    }
}
