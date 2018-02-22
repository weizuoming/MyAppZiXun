package com.example.hello.myappzixun.view.frment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.hello.myappzixun.Main2Activity;
import com.example.hello.myappzixun.R;
import com.example.hello.myappzixun.view.LoginActivity;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/**
 * Created by 韦作铭 on 2018/02/10.
 */

public class Fragmentuser extends Fragment implements View.OnClickListener {

    private ImageView my_user_icon;
    private SmartRefreshLayout smart_refresh;
    private ScrollView fragment_my_scroll;
    private TextView gengduo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user,container,false);
        my_user_icon = view.findViewById(R.id.my_user_icon);
        fragment_my_scroll = view.findViewById(R.id.fragment_my_scroll);
        smart_refresh = view.findViewById(R.id.smart_refresh);
        gengduo = view.findViewById(R.id.my_gengduo);

        Log.d("TAG","+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++跳转成功");


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        my_user_icon.setOnClickListener(this);
        gengduo.setOnClickListener(this);




//        intent.setClass(getActivity(),LoginActivity.class);
//        startActivity(intent);
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {

            case R.id.my_user_icon:
                intent.setClass(getActivity(), LoginActivity.class);

                break;
            case R.id.my_gengduo:

                Main2Activity m=new Main2Activity();
                m.gengDuo();
//                Toast.makeText(getActivity(),"ssss",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
