package com.example.belajarsholat.Profil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Model.profile.Profile;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class Ubahprofile extends AppCompatActivity {
    TextView etRegisterName, etRegisterUsername, etRegisterPassword, btn_ybah;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String name, username, id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ubahprofile );

        etRegisterName = findViewById( R.id.etRegisterName );
        etRegisterUsername = findViewById( R.id.etRegisterUsername );
        etRegisterPassword = findViewById( R.id.etRegisterPassword );
        btn_ybah = findViewById( R.id.ubah_btn );

        sessionManager = new SessionManager( Ubahprofile.this );
        name = sessionManager.getUserDetail().get( SessionManager.NAME );
        username = sessionManager.getUserDetail().get( SessionManager.USERNAME );
        id = sessionManager.getUserDetail().get( SessionManager.USER_ID );

        etRegisterUsername.setText( username );
        etRegisterName.setText( name );

        btn_ybah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME = etRegisterUsername.getText().toString().trim();
                String USERNAME = etRegisterName.getText().toString().trim();
                updateProfile(id, NAME, USERNAME);
            }
        });
    }

    private void updateProfile(final String id, final String name, final String username) {
            apiInterface = ApiClient.getClient().create(ApiInterface.class);
            Call<Profile> call = apiInterface.Responseprofile(id, name, username );
            call.enqueue(new Callback<Profile>() {
                @Override
                public void onResponse(Call<Profile> call, Response<Profile> response) {

                    if (response.isSuccessful() && response.body() != null){
                        Boolean status = response.body().isStatus();
                        if (status){

                            Toast.makeText(Ubahprofile.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent( Ubahprofile.this, Profile.class);
                            startActivity(intent);
                            finish();
                        }else {
                            Toast.makeText(Ubahprofile.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<Profile> call, Throwable t) {
                    Toast.makeText(Ubahprofile.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });

    }


}