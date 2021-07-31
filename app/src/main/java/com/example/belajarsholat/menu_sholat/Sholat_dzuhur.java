package com.example.belajarsholat.menu_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.belajarsholat.cara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.video_sholat.video_sholatdzhuhur;

public class Sholat_dzuhur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_dzuhur);
    }

    public void juz30dzuhur(View view) {
        Intent intent = new Intent(Sholat_dzuhur.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatdzuhur(View view) {
        Intent intent = new Intent(Sholat_dzuhur.this, Cara_Sholatsubuh.class);
        startActivity(intent);
    }

    public void videosholatdzuhur(View view) {
        Intent intent = new Intent(Sholat_dzuhur.this, video_sholatdzhuhur.class);
        startActivity(intent);
    }
}