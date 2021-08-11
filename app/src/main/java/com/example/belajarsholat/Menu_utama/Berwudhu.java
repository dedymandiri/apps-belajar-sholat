package com.example.belajarsholat.Menu_utama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;
import com.example.belajarsholat.Tatacara_sholat.Cara_berwudhu;
import com.example.belajarsholat.Video_sholat.Video_Wudhu;

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

    public void carasholatashar(View view) {
        Intent intent = new Intent(Berwudhu.this, Cara_berwudhu.class);
        startActivity(intent);
    }
}