package com.example.belajarsholat;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Model.aboutme.AboutData;
import com.example.belajarsholat.Model.aboutme.Aboutme;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        about();
        sessionManager = new SessionManager( aboutme.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getaboutDetail().get( SessionManager.DESKRIPSI );
//        judul.setText( Judul );
        deskripsi.setText( Deskripsi );
    }

    private void about() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Aboutme> aboutmeCall = apiInterface.Responsekami();
        aboutmeCall.enqueue( new Callback<Aboutme>() {

            @Override
            public void onResponse(Call<Aboutme> call, Response<Aboutme> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( aboutme.this );
                    AboutData aboutData = response.body().getData();
                    sessionManager.createaboutSession( aboutData );
                } else {
                    Toast.makeText( aboutme.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Aboutme> call, Throwable t) {

                Toast.makeText( aboutme.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

}
