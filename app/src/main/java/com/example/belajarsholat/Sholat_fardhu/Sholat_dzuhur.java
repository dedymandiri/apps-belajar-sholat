package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatdzuhur;
import com.example.belajarsholat.Video_sholat.video_sholatdzhuhur;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Sholat_dzuhur extends AppCompatActivity {
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sholat_dzuhur );


//        judul = findViewById( R.id.judul );
        deskripsi = findViewById( R.id.deskripsi_dzuhur );
//        dzuhur();
        sessionManager = new SessionManager( Sholat_dzuhur.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getdzuhurDetail().get( SessionManager.DESKRIPSIDZUHUR );
//        judul.
//
//        setText( Judul );
        deskripsi.setText( Deskripsi );


    }


    public void juz30dzuhur(View view) {
        Intent intent = new Intent(Sholat_dzuhur.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatdzuhur(View view) {
        Intent intent = new Intent(Sholat_dzuhur.this, Cara_sholatdzuhur.class);
        startActivity(intent);
    }

    public void videosholatdzuhur(View view) {
        Intent intent = new Intent(Sholat_dzuhur.this, video_sholatdzhuhur.class);
        startActivity(intent);
    }

}