package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.Model.ashar.Ashar;
import com.example.belajarsholat.Model.ashar.AsharData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatashar;
import com.example.belajarsholat.Video_sholat.video_sholatashar;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        ashar();
        sessionManager = new SessionManager( Sholat_Ashar.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getasharDetail().get( SessionManager.DESKRIPSIASHAR );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );


    }


    private void ashar() {
        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Ashar> asharCall = apiInterface.Responseashar();
        asharCall.enqueue( new Callback<Ashar>() {



            @Override
            public void onResponse(Call<Ashar> call, Response<Ashar> response) {

                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Sholat_Ashar.this );
                    AsharData asharData = response.body().getData();
                    sessionManager.createasharSession( asharData );
                } else {
                    Toast.makeText( Sholat_Ashar.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Ashar> call, Throwable t) {

                Toast.makeText( Sholat_Ashar.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
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