package com.example.belajarsholat.Menu_utama;

import static com.example.belajarsholat.R.id;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Fitur_latihan.Quiz;
import com.example.belajarsholat.Login_register.LoginActivity;
import com.example.belajarsholat.R;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.aboutme;

public class MainActivity2 extends AppCompatActivity {
    TextView etUsername, etName;
    String username, name;
    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sessionManager = new SessionManager(MainActivity2.this);
        if(sessionManager.isLoggedIn() == false){
            moveToLogin();
        }

        //etUsername = findViewById( id.etMainUsername);
        etName = findViewById(R.id.etMainName);

        //username = sessionManager.getUserDetail().get(SessionManager.USERNAME);
        name = sessionManager.getUserDetail().get(SessionManager.NAME);

        //etUsername.setText(username);
        etName.setText(name);


    }

    private void moveToLogin() {
        Intent intent = new Intent(MainActivity2.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case id.actinlogout:
                sessionManager.logoutSession();
                moveToLogin();
        }
        return super.onOptionsItemSelected(item);

    }

    public void Latihan(View view) {
        Intent intent = new Intent(MainActivity2.this, Quiz.class);
        startActivity(intent);
    }

    public void sholat(View view) {
        Intent intent = new Intent(MainActivity2.this, Menu_Sholat.class);
        startActivity(intent);
    }

    public void berwudhu(View view) {
        Intent intent = new Intent(MainActivity2.this, Berwudhu.class);
        startActivity(intent);
    }

    public void tentang_kami(View view) {
        Intent intent = new Intent(MainActivity2.this, aboutme.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity2.this, Profile.class);
        startActivity(intent);
    }

    private class latihanquiz {
    }
}