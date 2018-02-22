package com.example.hello.myappzixun.parsenter;

import android.app.Application;

import com.example.hello.myappzixun.util.ImageLoaderUtil;


/**
 * Created by 韦作铭 on 2018/02/10.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderUtil.init(this);
    }
}
