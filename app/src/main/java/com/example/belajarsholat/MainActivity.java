package com.example.belajarsholat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Latihan(View view) {
        Intent intent = new Intent(MainActivity.this, quiz.class);
        startActivity(intent);
    }

    public void sholat(View view) {
        Intent intent = new Intent(MainActivity.this, Menu_Sholat.class);
        startActivity(intent);
    }

    public void berwudhu(View view) {
        Intent intent = new Intent(MainActivity.this, Berwudhu.class);
        startActivity(intent);
    }

    public void tentang_kami(View view) {
        Intent intent = new Intent(MainActivity.this, Tentang_Kami.class);
        startActivity(intent);
    }
}