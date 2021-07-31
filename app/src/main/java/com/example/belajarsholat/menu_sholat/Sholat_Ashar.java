package com.example.belajarsholat.menu_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.belajarsholat.cara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.video_sholat.video_sholatashar;

public class Sholat_Ashar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_ashar);
    }

    public void juz30ashar(View view) {
        Intent intent = new Intent(Sholat_Ashar.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatashar(View view) {
        Intent intent = new Intent(Sholat_Ashar.this, Cara_Sholatsubuh.class);
        startActivity(intent);
    }

    public void videosholatashar(View view) {
        Intent intent = new Intent(Sholat_Ashar.this, video_sholatashar.class);
        startActivity(intent);
    }
}