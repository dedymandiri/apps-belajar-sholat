package com.example.belajarsholat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Login_register.LoginActivity;

public abstract class splashscreen extends AppCompatActivity implements Runnable{

    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(splashscreen.this, LoginActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }
}
