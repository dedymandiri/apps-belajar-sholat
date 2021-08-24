package com.example.belajarsholat.Menu_utama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.MainActivity2;
import com.example.belajarsholat.Model.ashar.Ashar;
import com.example.belajarsholat.Model.ashar.AsharData;
import com.example.belajarsholat.Model.dzuhur.Dzuhur;
import com.example.belajarsholat.Model.dzuhur.DzuhurData;
import com.example.belajarsholat.Model.isya.Isya;
import com.example.belajarsholat.Model.isya.IsyaData;
import com.example.belajarsholat.Model.maghrib.Maghrib;
import com.example.belajarsholat.Model.maghrib.MaghribData;
import com.example.belajarsholat.Model.subuh.Subuh;
import com.example.belajarsholat.Model.subuh.SubuhData;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Sholat_fardhu.Sholat_Ashar;
import com.example.belajarsholat.Sholat_fardhu.Sholat_Isya;
import com.example.belajarsholat.Sholat_fardhu.Sholat_Maghrib;
import com.example.belajarsholat.Sholat_fardhu.Sholat_dzuhur;
import com.example.belajarsholat.Sholat_fardhu.sholatsubuh;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Menu_Sholat extends AppCompatActivity {

    SessionManager sessionManager;
    ApiInterface apiInterface;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sholat);
    }

    private void getashar() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Ashar> asharCall = apiInterface.Responseashar();
        asharCall.enqueue( new Callback<Ashar>() {

            @Override
            public void onResponse(Call<Ashar> call, Response<Ashar> response) {

                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Menu_Sholat.this );
                    AsharData asharData = response.body().getData();
                    sessionManager.createasharSession( asharData );
                } else {
                    Toast.makeText( Menu_Sholat.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Ashar> call, Throwable t) {

                Toast.makeText( Menu_Sholat.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void getdzuhur() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Dzuhur> dzuhurCall = apiInterface.Responsedzuhur();
        dzuhurCall.enqueue( new Callback<Dzuhur>() {


            @Override
            public void onResponse(Call<Dzuhur> call, Response<Dzuhur> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Menu_Sholat.this );
                    DzuhurData dzuhurData = response.body().getData();
                    sessionManager.createdzuhurSession( dzuhurData );
                } else {
                    Toast.makeText( Menu_Sholat.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Dzuhur> call, Throwable t) {

                Toast.makeText( Menu_Sholat.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void getisya() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Isya> isyaCall = apiInterface.Responseisya();
        isyaCall.enqueue( new Callback<Isya>() {


            @Override
            public void onResponse(Call<Isya> call, Response<Isya> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Menu_Sholat.this );
                    IsyaData isyaData = response.body().getData();
                    sessionManager.createisyaSession( isyaData );
                } else {
                    Toast.makeText( Menu_Sholat.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Isya> call, Throwable t) {

                Toast.makeText( Menu_Sholat.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void getmaghrib() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Maghrib> maghribCall = apiInterface.Responsemaghrib();
        maghribCall.enqueue( new Callback<Maghrib>() {


            @Override
            public void onResponse(Call<Maghrib> call, Response<Maghrib> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Menu_Sholat.this );
                    MaghribData maghribData = response.body().getData();
                    sessionManager.createmaghribisyaSession( maghribData );
                } else {
                    Toast.makeText( Menu_Sholat.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Maghrib> call, Throwable t) {

                Toast.makeText( Menu_Sholat.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void getsubuh() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Subuh> subuhCall = apiInterface.Responsesubuh();
        subuhCall.enqueue( new Callback<Subuh>() {

            @Override
            public void onResponse(Call<Subuh> call, Response<Subuh> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( Menu_Sholat.this );
                    SubuhData subuhData = response.body().getData();
                    sessionManager.createsubuhSession( subuhData );
                } else {
                    Toast.makeText( Menu_Sholat.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Subuh> call, Throwable t) {

                Toast.makeText( Menu_Sholat.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    public void subuh(View view) {
        getsubuh();
        Intent intent = new Intent(Menu_Sholat.this, sholatsubuh.class);
        startActivity(intent);
    }

    public void dzuhur(View view) {
        getdzuhur();
        Intent intent = new Intent(Menu_Sholat.this, Sholat_dzuhur.class);
        startActivity(intent);
    }

    public void ashar(View view) {
        getashar();
        Intent intent = new Intent(Menu_Sholat.this, Sholat_Ashar.class);
        startActivity(intent);
    }

    public void maghrib(View view) {
        getmaghrib();
        Intent intent = new Intent(Menu_Sholat.this, Sholat_Maghrib.class);
        startActivity(intent);
    }

    public void isya(View view) {
        getisya();
        Intent intent = new Intent(Menu_Sholat.this, Sholat_Isya.class);
        startActivity(intent);
    }


}