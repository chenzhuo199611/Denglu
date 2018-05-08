package com.bawie.chenzhuo.denglu_01.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bawie.chenzhuo.denglu_01.R;
import com.bawie.chenzhuo.denglu_01.model.ModelImpel;
import com.bawie.chenzhuo.denglu_01.presenter.PresenterImpel;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText zhanghao;
    private EditText mima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initDatas();
    }

    private void initDatas() {
         zhanghao = findViewById(R.id.zhanghao);
         mima = findViewById(R.id.mima);
        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PresenterImpel presenterImpel=new PresenterImpel();
                presenterImpel.ShowLoginToView(new ModelImpel(),MainActivity.this);
            }
        });
        Button reg = findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RegActivity.class));
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
      /*  bar.set*/

        Toast.makeText (MainActivity.this,"登录成功!!!",Toast.LENGTH_SHORT).show ();
    }

    @Override
    public void showError() {

        Toast.makeText (MainActivity.this,"登录失败··",Toast.LENGTH_SHORT).show ();
    }

}
