package com.example.belajarsholat.Fitur_latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;

public class Periksa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_periksa );
    }

    public void kembali(View view) {
        Intent intent = new Intent( Periksa.this, Hasilquiz.class);
        startActivity(intent);
    }
}