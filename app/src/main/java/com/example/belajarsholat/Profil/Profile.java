package com.example.belajarsholat.Profil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.api.ApiInterface;

public class Profile extends AppCompatActivity {
    TextView etRegisterName, etRegisterUsername, etRegisterPassword;
    ApiInterface apiInterface;
    SessionManager sessionManager;
    String name, username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_profile );

        etRegisterName = findViewById( R.id.etRegisterName );
        etRegisterUsername = findViewById( R.id.etRegisterUsername );
        etRegisterPassword = findViewById( R.id.etRegisterPassword );

        sessionManager = new SessionManager( Profile.this );
        name = sessionManager.getUserDetail().get( SessionManager.NAME );
        username = sessionManager.getUserDetail().get( SessionManager.USERNAME );

        etRegisterUsername.setText( username );
        etRegisterName.setText( name );
    }

    public void ubahdata(View view) {
        Intent intent = new Intent(Profile.this, Ubahprofile.class);
        startActivity(intent);
    }
}