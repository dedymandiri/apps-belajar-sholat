package com.example.belajarsholat.Sholat_fardhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.belajarsholat.Tatacara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Video_sholat.video_sholatmaghrib;

public class Sholat_Maghrib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_maghrib);
    }

    public void carasholatmaghrib(View view) {
        Intent intent = new Intent(Sholat_Maghrib.this, Cara_Sholatsubuh.class);
        startActivity(intent);
    }

    public void videosholatmaghrib(View view) {
        Intent intent = new Intent(Sholat_Maghrib.this, video_sholatmaghrib.class);
        startActivity(intent);
    }

    public void juz30maghrib(View view) {
        Intent intent = new Intent(Sholat_Maghrib.this, List_Surat_Pendek.class);
        startActivity(intent);
    }
}