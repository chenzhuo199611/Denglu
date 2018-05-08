package com.bawie.chenzhuo.denglu_01.model;

/**
 * Created by asus on 2018/5/8.
 */

public interface RegListener {
    void regSuccess(String json);

    void regError(String error);
}
