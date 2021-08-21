package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.Model.dzuhur.Dzuhur;
import com.example.belajarsholat.Model.dzuhur.DzuhurData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatdzuhur;
import com.example.belajarsholat.Video_sholat.video_sholatdzhuhur;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        dzuhur();
        sessionManager = new SessionManager( Sholat_dzuhur.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getdzuhurDetail().get( SessionManager.DESKRIPSIDZUHUR );
//        judul.
//
//        setText( Judul );
        deskripsi.setText( Deskripsi );


    }

    private void dzuhur() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Dzuhur> dzuhurCall = apiInterface.Responsedzuhur();
        dzuhurCall.enqueue( new Callback<Dzuhur>() {


            @Override
            public void onResponse(Call<Dzuhur> call, Response<Dzuhur> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Sholat_dzuhur.this );
                    DzuhurData dzuhurData = response.body().getData();
                    sessionManager.createdzuhurSession( dzuhurData );
                } else {
                    Toast.makeText( Sholat_dzuhur.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Dzuhur> call, Throwable t) {

                Toast.makeText( Sholat_dzuhur.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
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