package com.example.shinelon.main;

import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean flag = false;

    private Handler handler=new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            flag=false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {

        if(keyCode==KeyEvent.KEYCODE_BACK && flag==false)
        {
            Toast.makeText(this, "确定退出吗？", Toast.LENGTH_SHORT).show();
            flag=true;
            handler.sendEmptyMessageDelayed(1,2000);
            return true;
        }

        return super.onKeyUp(keyCode, event);
    }
}
