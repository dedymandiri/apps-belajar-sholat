package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.Video_sholat.video_sholatsubuh;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class sholatsubuh extends AppCompatActivity {
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholatsubuh);


//        judul = findViewById( R.id.judul );
        deskripsi = findViewById( R.id.subuhdeskripsi );
//        subuh();
        sessionManager = new SessionManager( sholatsubuh.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getsubuhDetail().get( SessionManager.DESKRIPSISUBUH );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );

    }



    public void juz30(View view) {
        Intent intent = new Intent(sholatsubuh.this, List_Surat_Pendek.class);
        startActivity(intent);
    }

    public void carasholatsubuh(View view) {
        Intent intent = new Intent(sholatsubuh.this, Cara_Sholatsubuh.class);
        startActivity(intent);
    }

    public void videosholatsubuh(View view) {

        Intent intent = new Intent(sholatsubuh.this, video_sholatsubuh.class);
        startActivity(intent);
    }
}