package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatisya;
import com.example.belajarsholat.Video_sholat.video_sholatisya;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Sholat_Isya extends AppCompatActivity {
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_isya);

//        judul = findViewById( R.id.judul );
        deskripsi = findViewById( R.id.deskripsi_isya );
//        isya();
        sessionManager = new SessionManager( Sholat_Isya.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getisyaDetail().get( SessionManager.DESKRIPSIISYA );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );

    }



    public void juz30isya(View view) {
        Intent intent = new Intent(Sholat_Isya.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatisya(View view) {
        Intent intent = new Intent(Sholat_Isya.this, Cara_sholatisya.class);
        startActivity(intent);
    }

    public void videosholatisya(View view) {
        Intent intent = new Intent(Sholat_Isya.this, video_sholatisya.class);
        startActivity(intent);
    }
}