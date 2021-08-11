package com.example.belajarsholat.Fitur_latihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;

public class Hasilquiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilquiz);

        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Yang Benar = "+ Quiz.benar+"\nJawaban Yang Salah = "+ Quiz.salah);
        nilai.setText(""+ Quiz.hasil);
    }

    public void ulangi(View view) {
        finish();
        Intent a = new Intent(getApplicationContext(), Quiz.class);
        startActivity(a);
    }

    public void rekomendasi(View view) {
    }
}