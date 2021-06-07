package com.example.belajarsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_Sholat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sholat);
    }

    public void subuh(View view) {
        Intent intent = new Intent(Menu_Sholat.this, sholatsubuh.class);
        startActivity(intent);
    }

    public void dzuhur(View view) {
        Intent intent = new Intent(Menu_Sholat.this, Sholat_dzuhur.class);
        startActivity(intent);
    }

    public void ashar(View view) {
        Intent intent = new Intent(Menu_Sholat.this, Sholat_Ashar.class);
        startActivity(intent);
    }

    public void maghrib(View view) {
        Intent intent = new Intent(Menu_Sholat.this, Sholat_Maghrib.class);
        startActivity(intent);
    }

    public void isya(View view) {
        Intent intent = new Intent(Menu_Sholat.this, Sholat_Isya.class);
        startActivity(intent);
    }


}