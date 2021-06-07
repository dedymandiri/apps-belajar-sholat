package com.example.belajarsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class sholatsubuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholatsubuh);


    }

    public void juz30(View view) {
        Intent intent = new Intent(sholatsubuh.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatsubuh(View view) {
        Intent intent = new Intent(sholatsubuh.this, Cara_Sholatsubuh.class);
        startActivity(intent);
    }

    public void videosholatsubuh(View view) {

        Intent intent = new Intent(sholatsubuh.this, video_sholatsubuh.class);
        startActivity(intent);
    }
}