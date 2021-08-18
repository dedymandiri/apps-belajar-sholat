package com.example.belajarsholat.Sholat_fardhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Listsurat_pendek.List_Surat_Pendek;
import com.example.belajarsholat.Model.subuh.Subuh;
import com.example.belajarsholat.Model.subuh.SubuhData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_Sholatsubuh;
import com.example.belajarsholat.Video_sholat.video_sholatsubuh;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        subuh();
        sessionManager = new SessionManager( sholatsubuh.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getsubuhDetail().get( SessionManager.DESKRIPSISUBUH );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );

    }

    private void subuh() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Subuh> subuhCall = apiInterface.Responsesubuh();
        subuhCall.enqueue( new Callback<Subuh>() {

            @Override
            public void onResponse(Call<Subuh> call, Response<Subuh> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( sholatsubuh.this );
                    SubuhData aboutData = response.body().getData();
                    sessionManager.createsubuhSession( aboutData );
                } else {
                    Toast.makeText( sholatsubuh.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Subuh> call, Throwable t) {

                Toast.makeText( sholatsubuh.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
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