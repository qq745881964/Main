package com.example.shinelon.main;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Splash extends AppCompatActivity {
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent intent=new Intent(Splash.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        bt=findViewById(R.id.button);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        handler.sendEmptyMessageDelayed(1,3000);
        bt.setText("点击事件");

        bt.setTextColor(Color.BLUE);
        FloatingActionButton fab=(FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
      //草拟大爷
        bt=findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Splash.this,"点击了我们",Toast.LENGTH_LONG).show();

                Log.d("Toast","1232");

            }
        });

        Toast.makeText(this,"1111111111",Toast.LENGTH_LONG).show();
    }



    public void log(){
        Log.d("Toast","111111111");
        Toast.makeText(this, "我草拟大爷", Toast.LENGTH_SHORT).show();
    }


}
