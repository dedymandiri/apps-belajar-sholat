package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.Model.maghrib.Maghrib;
import com.example.belajarsholat.Model.maghrib.MaghribData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_sholatmaghrib;
import com.example.belajarsholat.Video_sholat.video_sholatmaghrib;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        maghrib();
        sessionManager = new SessionManager( Sholat_Maghrib.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getmaghribDetail().get( SessionManager.DESKRIPSIMAGHRIB );
//        judul.
//
//        setText( Judul );
        deskripsi.setText( Deskripsi );

    }


    private void maghrib() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Maghrib> maghribCall = apiInterface.Responsemaghrib();
        maghribCall.enqueue( new Callback<Maghrib>() {


            @Override
            public void onResponse(Call<Maghrib> call, Response<Maghrib> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Sholat_Maghrib.this );
                    MaghribData maghribData = response.body().getData();
                    sessionManager.createmaghribisyaSession( maghribData );
                } else {
                    Toast.makeText( Sholat_Maghrib.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Maghrib> call, Throwable t) {

                Toast.makeText( Sholat_Maghrib.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
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