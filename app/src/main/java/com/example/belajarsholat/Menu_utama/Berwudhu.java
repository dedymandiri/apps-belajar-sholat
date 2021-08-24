package com.example.belajarsholat.Menu_utama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_berwudhu;
import com.example.belajarsholat.Video_sholat.Video_Wudhu;
import com.example.belajarsholat.api.ApiInterface;
import me.biubiubiu.justifytext.library.JustifyTextView;

public class Berwudhu extends AppCompatActivity {
    TextView judul, deskpripsi;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berwudhu);


//        judul = findViewById( R.id.judul );
        deskpripsi = findViewById( R.id.wudhudeskripsi );
//        wudhu();
        sessionManager = new SessionManager( Berwudhu.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getwudhuDetail().get(SessionManager.DESKRIPSIWUDHU);
//        judul.setText( Judul );
        deskpripsi.setText( Deskripsi );
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