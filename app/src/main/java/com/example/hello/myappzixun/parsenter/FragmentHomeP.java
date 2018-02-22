package com.example.hello.myappzixun.parsenter;

import com.example.hello.myappzixun.modle.FragmentHomeModel;
import com.example.hello.myappzixun.modle.bean.HomeBean;
import com.example.hello.myappzixun.view.iview.InterFragmentHome;

/**
 * Created by 韦作铭 on 2018/2/10.
 */

public class FragmentHomeP implements FragmentHomePInter {
    private FragmentHomeModel fragmentHomeModel;
    private InterFragmentHome interFragmentHome;

    //创建构造方法
    public FragmentHomeP(InterFragmentHome interFragmentHome) {
        this.interFragmentHome = interFragmentHome;

        //创建model的引用
        fragmentHomeModel = new FragmentHomeModel(this);
    }

    public void getNetData(String homeUrl) {

        //让model获取数据
        fragmentHomeModel.getData(homeUrl);

    }

    @Override
    public void onSuccess(HomeBean homeBean) {

        //此时的数据回调到p层,,,把数据从p层传到view层进行使用
        interFragmentHome.onSuccess(homeBean);
    }



}
