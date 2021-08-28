package com.example.belajarsholat.Fitur_rekomendasi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Fitur_latihan.Hasilquiz;
import com.example.belajarsholat.R;

public class Rekomendasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String a = "";
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rekomendasi );
        TextView hasil = (TextView)findViewById(R.id.hasilrekomendasi);
        if (Hasilquiz.hasilMateri == 1){
            a = "Berwudhu";
        }else if(Hasilquiz.hasilMateri == 2){
            a = "Sholat Subuh";
        }
        else if(Hasilquiz.hasilMateri == 3){
            a = "Sholat Dzuhur";
        }
        else if(Hasilquiz.hasilMateri == 4){
            a = "Sholat Ashar";
        }
        else if(Hasilquiz.hasilMateri == 6){
            a = "Sholat Maghrib";
        }
        else{
            a = "Sholat Isya";
        }
        hasil.setText(""+ a);
    }


}