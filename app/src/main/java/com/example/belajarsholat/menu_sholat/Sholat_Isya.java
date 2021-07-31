package com.example.belajarsholat.menu_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.belajarsholat.cara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.video_sholat.video_sholatisya;

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