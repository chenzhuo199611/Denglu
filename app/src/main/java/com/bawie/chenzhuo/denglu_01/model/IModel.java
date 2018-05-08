package com.bawie.chenzhuo.denglu_01.model;

import java.util.Map;

/**
 * Created by asus on 2018/5/8.
 */

public interface IModel {
    void getLoginDatas(String url, Map<String,String> map, LoginListener loginListener);

    void getRegDatas(String url,Map<String,String> map,RegListener regListener);
}
