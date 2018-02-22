package com.example.hello.myappzixun.parsenter;

import com.example.hello.myappzixun.modle.bean.LoginBean;

/**
 * Created by 韦作铭 on 2018/2/10.
 */

public interface LoginPresenterInter {
    void onSuccess(LoginBean loginBean);


    void onSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);
}

