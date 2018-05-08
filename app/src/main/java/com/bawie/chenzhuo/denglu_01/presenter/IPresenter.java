package com.bawie.chenzhuo.denglu_01.presenter;

import com.bawie.chenzhuo.denglu_01.view.ILoginView;
import com.bawie.chenzhuo.denglu_01.model.IModel;
import com.bawie.chenzhuo.denglu_01.view.IRegView;

/**
 * Created by asus on 2018/5/8.
 */

public interface IPresenter {
    void ShowLoginToView(IModel iModel, ILoginView iLoginView);

    void ShowRegToView(IModel iModel, IRegView iRegView);
}
