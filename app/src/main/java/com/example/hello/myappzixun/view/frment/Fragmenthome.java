package com.example.hello.myappzixun.view.frment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hello.myappzixun.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 韦作铭 on 2018/02/10.
 */

public class Fragmenthome extends Fragment{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<String> list;
    private TextView fan;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home,container,false);
        tabLayout = view.findViewById(R.id.tab);
        viewPager =view.findViewById(R.id.view_pager);
        fan=view.findViewById(R.id.fan);
        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fan.setText("");
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();
        list.add("推荐");
        list.add("热点");
        list.add("北京");
        list.add("视频");
        list.add("社会");
        list.add("图片");


        //设置适配器
        viewPager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public CharSequence getPageTitle(int position) {

                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {
                Fragment fragment = null;

                switch (position) {
                    case 0:
                        fragment = new Fragmenttuijian();
                        break;
                    case 1:
                        fragment = new Fragmentredian();
                        break;
                    case 2:
                        fragment = new Fragmentbeijing();
                        break;
                    case 3:
                        fragment = new Fragmentshipin();
                        break;
                    case 4:
                        fragment = new Fragmentshehui();
                        break;
                    case 5:
                        fragment = new Fragmenttupian();
                        break;
                    default:
                        break;
                }

                return fragment;
            }

            @Override
            public int getCount() {

                return list.size();
            }
        });

        //关联
        tabLayout.setupWithViewPager(viewPager);
    }



}
