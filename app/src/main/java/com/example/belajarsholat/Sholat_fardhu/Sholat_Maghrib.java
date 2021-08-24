package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatmaghrib;
import com.example.belajarsholat.Video_sholat.video_sholatmaghrib;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Sholat_Maghrib extends AppCompatActivity {
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sholat_maghrib );

//        judul = findViewById( R.id.judul );
        deskripsi = findViewById( R.id.deskripsi_maghrib );
//        maghrib();
        sessionManager = new SessionManager( Sholat_Maghrib.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getmaghribDetail().get( SessionManager.DESKRIPSIMAGHRIB );
//        judul.
//
//        setText( Judul );
        deskripsi.setText( Deskripsi );

    }




    public void carasholatmaghrib(View view) {
        Intent intent = new Intent(Sholat_Maghrib.this, Cara_sholatmaghrib.class);
        startActivity(intent);
    }

    public void videosholatmaghrib(View view) {
        Intent intent = new Intent(Sholat_Maghrib.this, video_sholatmaghrib.class);
        startActivity(intent);
    }

    public void juz30maghrib(View view) {
        Intent intent = new Intent(Sholat_Maghrib.this, List_Surat_Pendek.class);
        startActivity(intent);
    }
}