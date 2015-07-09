package com.ysy.ysy_im.entities;

import java.io.Serializable;

/**
 * Created by ggec5486 on 2015/7/9.
 */
public class Message implements Serializable {


    private MessageType content_type;

    public enum MessageType {
        txt, multimedia, emo
    }

    ;

    public MessageType getType() {

        return content_type;
    }
}
