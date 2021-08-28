package com.example.belajarsholat;

import static com.example.belajarsholat.R.id;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.belajarsholat.Fitur_latihan.Quiz;
import com.example.belajarsholat.Login_register.LoginActivity;
import com.example.belajarsholat.Menu_utama.Berwudhu;
import com.example.belajarsholat.Menu_utama.Menu_Sholat;
import com.example.belajarsholat.Model.aboutme.AboutData;
import com.example.belajarsholat.Model.aboutme.Aboutme;
import com.example.belajarsholat.Model.ashar.Ashar;
import com.example.belajarsholat.Model.ashar.AsharData;
import com.example.belajarsholat.Model.wudhu.Wudhu;
import com.example.belajarsholat.Model.wudhu.WudhuData;
import com.example.belajarsholat.Profil.Profile;
import com.example.belajarsholat.Session.SessionManager;
import com.example.belajarsholat.Menu_utama.aboutme;
import com.example.belajarsholat.Sholat_fardhu.Sholat_Ashar;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import me.biubiubiu.justifytext.library.JustifyTextView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
    TextView etUsername, etName;
    String username, name;
    SessionManager sessionManager;
    ApiInterface apiInterface;
    String Judul, Deskripsi;
    JustifyTextView deskripsi;

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

    private void getabout() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Aboutme> aboutmeCall = apiInterface.Responsekami();
        aboutmeCall.enqueue( new Callback<Aboutme>() {

            @Override
            public void onResponse(Call<Aboutme> call, Response<Aboutme> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {

                    sessionManager = new SessionManager( MainActivity2.this );
                    AboutData aboutData = response.body().getData();
                    sessionManager.createaboutSession( aboutData );
                } else {
                    Toast.makeText( MainActivity2.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Aboutme> call, Throwable t) {

                Toast.makeText( MainActivity2.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void getwudhu() {

        apiInterface = ApiClient.getClient().create( ApiInterface.class );
        Call<Wudhu> wudhuCall = apiInterface.Responsewudhu();
        wudhuCall.enqueue( new Callback<Wudhu>() {

            @Override
            public void onResponse(Call<Wudhu> call, Response<Wudhu> response) {
                if (response.body() != null && response.isSuccessful() && response.body().isStatus()) {
                    sessionManager = new SessionManager( MainActivity2.this );
                    WudhuData wudhuData = response.body().getData();
                    sessionManager.createwudhuSession( wudhuData );
                } else {
                    Toast.makeText( MainActivity2.this, response.body().getMessage(), Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onFailure(Call<Wudhu> call, Throwable t) {
                Toast.makeText( MainActivity2.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT ).show();
            }


        } );
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
        getwudhu();
        Intent intent = new Intent(MainActivity2.this, Berwudhu.class);
        startActivity(intent);
    }

    public void tentang_kami(View view) {
        getabout();
        Intent intent = new Intent(MainActivity2.this, aboutme.class);
        startActivity(intent);
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity2.this, Profile.class);
        startActivity(intent);
    }



}