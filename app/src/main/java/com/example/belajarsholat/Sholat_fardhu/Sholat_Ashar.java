package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatashar;
import com.example.belajarsholat.Video_sholat.video_sholatashar;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Sholat_Ashar extends AppCompatActivity {
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_ashar);


//        judul = findViewById( R.id.judul );
        deskripsi = findViewById( R.id.deskripsi_ashar );
//        ashar();
        sessionManager = new SessionManager( Sholat_Ashar.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getasharDetail().get( SessionManager.DESKRIPSIASHAR );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );


    }





    public void juz30ashar(View view) {
        Intent intent = new Intent(Sholat_Ashar.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatashar(View view) {
        Intent intent = new Intent(Sholat_Ashar.this, Cara_sholatashar.class);
        startActivity(intent);
    }

    public void videosholatashar(View view) {
        Intent intent = new Intent(Sholat_Ashar.this, video_sholatashar.class);
        startActivity(intent);
    }

    private class ProgressDialog {
    }
}