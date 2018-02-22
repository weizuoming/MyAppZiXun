package com.example.hello.myappzixun.view.iview;

import com.example.hello.myappzixun.modle.bean.LoginBean;

/**
 * Created by 韦作铭 on 2018/2/10.
 */

public interface LoginActivityInter {
    void getLoginSuccess(LoginBean loginBean);


    void getLoginSuccessByQQ(LoginBean loginBean, String ni_cheng, String iconurl);

}
