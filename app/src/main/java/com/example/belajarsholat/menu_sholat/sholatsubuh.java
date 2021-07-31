package com.example.belajarsholat.menu_sholat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.cara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.video_sholat.video_sholatsubuh;

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