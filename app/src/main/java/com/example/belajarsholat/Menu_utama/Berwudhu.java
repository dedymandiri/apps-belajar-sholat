package com.example.belajarsholat.Menu_utama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Model.wudhu.Wudhu;
import com.example.belajarsholat.Model.wudhu.WudhuData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Tatacara_sholat.Cara_berwudhu;
import com.example.belajarsholat.Video_sholat.Video_Wudhu;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        wudhu();
        sessionManager = new SessionManager( Berwudhu.this );
//        Judul = sessionManager.getaboutDetail().get(SessionManager.JUDUL);
        Deskripsi = sessionManager.getwudhuDetail().get(SessionManager.DESKRIPSIWUDHU);
//        judul.setText( Judul );
        deskpripsi.setText( Deskripsi );
    }

    private void wudhu() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Wudhu> wudhuCall = apiInterface.Responsewudhu();
        wudhuCall.enqueue( new Callback<Wudhu>() {

            @Override
            public void onResponse(Call<Wudhu> call, Response<Wudhu> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {
                    sessionManager = new SessionManager( Berwudhu.this );
                    WudhuData WudhuData = response.body().getData();
                    sessionManager.createwudhuSession( WudhuData );
                } else {
                    Toast.makeText( Berwudhu.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Wudhu> call, Throwable t) {
                Toast.makeText( Berwudhu.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }


        } );
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