package com.bawie.chenzhuo.denglu_01.http;

/**
 * Created by asus on 2018/5/8.
 */

public interface OkLoadListener {
    void okLoadSuccess(String json);

    void okLoadError(String error);
}
