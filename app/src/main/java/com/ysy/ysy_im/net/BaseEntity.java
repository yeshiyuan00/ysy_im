package com.ysy.ysy_im.net;


import com.google.gson.stream.JsonReader;

/**
 * Created by ggec5486 on 2015/7/9.
 */
public abstract class BaseEntity {
    public abstract void readFormJson(JsonReader reader) throws AppException;
}
