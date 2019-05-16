package com.casic.jpushdemo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cn.jpush.android.api.JPushInterface;

/*
* 该Demo可以正常接收推送数据
* 注意：
* 该Demo 在手机重启以后无法接收消息
*
* */
public class MainActivity extends AppCompatActivity {

    private TextView mTv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }

    private void initData() {

        Intent intent = this.getIntent();
        if (intent!=null){
            Bundle bundle = intent.getExtras();
            if (bundle!=null){
                String title = bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
                String content = bundle.getString(JPushInterface.EXTRA_ALERT);

                mTv_message.setText("title:"+title+"\n"+"content:"+content);

            }
        }



    }


    private void initView() {

        mTv_message = findViewById(R.id.tv_message);

    }
}
