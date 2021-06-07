package com.example.belajarsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sholat_Isya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_isya);
    }

    public void juz30isya(View view) {
        Intent intent = new Intent(Sholat_Isya.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatisya(View view) {
        Intent intent = new Intent(Sholat_Isya.this, Cara_Sholatsubuh.class);
        startActivity(intent);
    }

    public void videosholatisya(View view) {
        Intent intent = new Intent(Sholat_Isya.this, video_sholatisya.class);
        startActivity(intent);
    }
}