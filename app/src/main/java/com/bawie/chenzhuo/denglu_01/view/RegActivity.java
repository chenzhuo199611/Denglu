package com.bawie.chenzhuo.denglu_01.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawie.chenzhuo.denglu_01.R;
import com.bawie.chenzhuo.denglu_01.model.ModelImpel;
import com.bawie.chenzhuo.denglu_01.presenter.PresenterImpel;

/**
 * Created by asus on 2018/5/8.
 */

public class RegActivity extends AppCompatActivity implements IRegView {

    private EditText zhanghao;
    private EditText mima;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        initDatas();
    }

    private void initDatas() {
        zhanghao = findViewById(R.id.zhanghao);
        mima = findViewById(R.id.mima);
        Button reg =findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PresenterImpel presenterImpel = new PresenterImpel ();

                presenterImpel.ShowRegToView (new ModelImpel(),RegActivity.this);
            }
        });
    }
    @Override
    public String getMobile() {
        return zhanghao.getText ().toString ();
    }

    @Override
    public String getPwd() {
        return mima.getText ().toString ();
    }

    @Override
    public void showSuccess() {
        Toast.makeText (this,"注册成功--",Toast.LENGTH_SHORT).show ();

        startActivity (new Intent(RegActivity.this,MainActivity.class));
    }

    @Override
    public void showError() {
        Toast.makeText (this,"注册失败--",Toast.LENGTH_SHORT).show ();
    }

}
