package com.example.hello.myappzixun.parsenter;

import com.example.hello.myappzixun.RegistActivityInter;
import com.example.hello.myappzixun.modle.RegistModel;
import com.example.hello.myappzixun.modle.bean.RegistBean;

/**
 * Created by 韦作铭 on 2018/2/10.
 */

public class RegistPresenter implements RegistPresenterInter {

    private RegistActivityInter registActivityInter;
    private RegistModel registModel;

    public RegistPresenter(RegistActivityInter registActivityInter) {
        this.registActivityInter = registActivityInter;
        registModel = new RegistModel(this);
    }

    public void registUser(String registUrl, String name, String pwd) {

        registModel.registUser(registUrl, name, pwd);
    }

    @Override
    public void onRegistSuccess(RegistBean registBean) {
        registActivityInter.onRegistSuccess(registBean);
    }
}