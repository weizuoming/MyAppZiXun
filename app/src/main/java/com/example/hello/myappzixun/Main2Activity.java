package com.example.hello.myappzixun;


import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

import com.example.hello.myappzixun.view.frment.Fragmenthome;
import com.example.hello.myappzixun.view.frment.Fragmenttext;
import com.example.hello.myappzixun.view.frment.Fragmentuser;

public class Main2Activity extends AppCompatActivity {

    private DrawerLayout dl;
    private RadioGroup radioGroup;
    private RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        dl = (DrawerLayout) findViewById(R.id.drawer_layout);
        rl = (RelativeLayout) findViewById(R.id.drawer_relative);
        dl.setDrawerListener(new DrawerLayout.DrawerListener() {

            /**
             *
             * @param drawerView
             * @param slideOffset 表示的抽屉拖出来的宽度,,像素值
             */
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            /**
             * 抽屉打开了
             * @param drawerView
             */
            @Override
            public void onDrawerOpened(View drawerView) {

            }

            /**
             * 抽屉关闭
             * @param drawerView
             */
            @Override
            public void onDrawerClosed(View drawerView) {

            }

            /**
             * 抽屉的状态改变
             *
             * idle -- 表示与导航视图没有交互,静止
             dragging -- 表示目前有与导航视图的交互,拖拽的状态
             settling -- 表示有与导航视图的交互，并且导航视图正在关闭或打开
             * @param newState
             */
            @Override
            public void onDrawerStateChanged(int newState) {
                Log.i("zhaungtai---",newState+"---");
            }
        });
        //默认显示
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenttext()).commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenttext()).commit();
                        break;
                    case R.id.rb2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmenthome()).commit();
                        break;
                    case R.id.rb3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,new Fragmentuser()).commit();
                        Log.d("TAG","+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++跳转成功");

                        break;

                    default:
                        break;
                }
            }
        });
    }
    public void gengDuo(){
        dl.openDrawer(dl);

    }

}
