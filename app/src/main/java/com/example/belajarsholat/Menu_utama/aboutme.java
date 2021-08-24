package com.example.belajarsholat.Menu_utama;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class aboutme extends AppCompatActivity {
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_aboutme );


//        judul = findViewById( R.id.judul );
        deskripsi = findViewById( R.id.deskripsi );
//        about();
        sessionManager = new SessionManager( aboutme.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getaboutDetail().get( SessionManager.DESKRIPSI );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );
    }



}
