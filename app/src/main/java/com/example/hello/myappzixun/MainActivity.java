package com.example.hello.myappzixun;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private TextView item;
    int total=3;
    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        item=(TextView)findViewById(R.id.itme);
        timer = new Timer();
        //使用timer进行计时
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                total--;
                //判断是否计时完成
                if(total==0){
                    gettomain();
                    handler.sendEmptyMessage(1);  //
                }else{
                    handler.sendEmptyMessage(2);
                }

            }
        }, 0, 1000);

    }

    Handler handler=new Handler(){

        public void handleMessage(Message msg) {
            //倒计时完成
            if(msg.what==0){
                gettomain();
                timer.cancel();
                total=3;
                item.setEnabled(true);

            }else{
                item.setEnabled(false);
                item.setText(total+"");  //9 8 7 6   0
            }

        };

    };

    public void gettomain(){
        Intent in=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(in);
    }

}
