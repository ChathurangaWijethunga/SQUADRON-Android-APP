package com.example.squadron;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //start Login activity after 2sec
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //start main(landing) screen
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();//finish this activity
            }
        }, 2000);//2000 means 2sec
    }
}