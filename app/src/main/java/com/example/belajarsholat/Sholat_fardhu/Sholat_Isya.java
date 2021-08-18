package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.Model.isya.Isya;
import com.example.belajarsholat.Model.isya.IsyaData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatisya;
import com.example.belajarsholat.Video_sholat.video_sholatisya;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        isya();
        sessionManager = new SessionManager( Sholat_Isya.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getisyaDetail().get( SessionManager.DESKRIPSIISYA );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );

    }

    private void isya() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Isya> isyaCall = apiInterface.Responseisya();
        isyaCall.enqueue( new Callback<Isya>() {


            @Override
            public void onResponse(Call<Isya> call, Response<Isya> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Sholat_Isya.this );
                    IsyaData isyaData = response.body().getData();
                    sessionManager.createisyaSession( isyaData );
                } else {
                    Toast.makeText( Sholat_Isya.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Isya> call, Throwable t) {

                Toast.makeText( Sholat_Isya.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
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