package com.example.socketdemo.activity;

import android.util.Log;
import android.view.View;

import com.example.socketdemo.R;
import com.example.socketdemo.base.BaseActivity;
import com.example.socketdemo.wifitools.Version;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected String getTitleText() {
        return "首页";
    }

    @Override
    protected void initData() {
        setToolbarLeftIcon(0);

    }

    public void sendFiles(View view) {
        //发送文件
//        pushActivity(ChooseReceiverActivity.class);
        pushActivity(SendFilesActivity.class);
        Log.d("solarex", "sdk = " + Version.SDK);
    }

    public void receiveFiles(View view) {
        //接收文件
//        pushActivity(ReceiverWaitingActivity.class);
        pushActivity(ReceiveFilesActivity.class);
    }
}
