package com.bawie.chenzhuo.denglu_01.presenter;

import com.bawie.chenzhuo.denglu_01.http.HttpConfig;
import com.bawie.chenzhuo.denglu_01.model.LoginListener;
import com.bawie.chenzhuo.denglu_01.model.RegListener;
import com.bawie.chenzhuo.denglu_01.view.ILoginView;
import com.bawie.chenzhuo.denglu_01.model.IModel;
import com.bawie.chenzhuo.denglu_01.view.IRegView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asus on 2018/5/8.
 */

public class PresenterImpel implements IPresenter{

    @Override
    public  void ShowLoginToView(IModel iModel, final ILoginView iLoginView) {
                Map<String,String> map = new HashMap<>();

        map.put ("mobile",iLoginView.getMobile ());

        map.put ("password",iLoginView.getPwd ());

        iModel.getLoginDatas (HttpConfig.url, map, new LoginListener() {
            @Override
            public void loginSuccess(String json) {
                iLoginView.showSuccess ();
            }

            @Override
            public void loginError(String error) {
                iLoginView.showError ();
            }
        });
    }

    @Override
    public void ShowRegToView(IModel iModel, final IRegView iRegView) {
        Map<String,String> map = new HashMap<> ();

        map.put ("mobile",iRegView.getMobile ());

        map.put ("password",iRegView.getPwd ());

        iModel.getRegDatas (HttpConfig.reg_url, map, new RegListener() {
            @Override
            public void regSuccess(String json) {
                iRegView.showSuccess ();
            }

            @Override
            public void regError(String error) {
                iRegView.showError ();
            }
        });
    }
}
