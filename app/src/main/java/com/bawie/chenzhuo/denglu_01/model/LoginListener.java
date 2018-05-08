package com.bawie.chenzhuo.denglu_01.model;

/**
 * Created by asus on 2018/5/8.
 */

public interface LoginListener {
    void loginSuccess(String json);

    void loginError(String error);
}
