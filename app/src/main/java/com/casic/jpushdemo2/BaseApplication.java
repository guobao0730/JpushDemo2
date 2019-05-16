package com.casic.jpushdemo2;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @author 郭宝
 * @project： JpushDemo2
 * @package： com.casic.jpushdemo2
 * @date： 2019/5/16 0016 10:19
 * @brief:
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
