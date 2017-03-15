package com.pujiang.annotation.myannotationtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    Button btn_text,btn_bug,btn_info;
    @ViewById
    TextView text_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (text_info!=null)
            text_info.setText("测试用例1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (text_info!=null)
            text_info.setText("测试用例1111");
    }

    @Click(R.id.btn_bug)
    void  setClickText_bug(){
        text_info.setText("测试用例2");
    }

    @Click(R.id.btn_text)
    void stClickText_text(){
        text_info.setText("信息展示1");
    }

    @Click(R.id.btn_info)
    void stClickText_info(){
        Intent intent = new Intent(this,LoginActivity_.class);
        startActivity(intent);
    }

    @Click(R.id.text_info)
    void stClickText_info1(){
        btn_text.setText("button改变");
    }
}
