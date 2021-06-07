package com.example.belajarsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Berwudhu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berwudhu);
    }

    public void videowudhu(View view) {
        Intent intent = new Intent(Berwudhu.this, Video_Wudhu.class);
        startActivity(intent);
    }
}