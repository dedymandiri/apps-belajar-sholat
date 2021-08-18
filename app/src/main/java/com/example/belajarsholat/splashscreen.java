package com.example.belajarsholat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class splashscreen extends AppCompatActivity implements Runnable{

    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        

    }
}
