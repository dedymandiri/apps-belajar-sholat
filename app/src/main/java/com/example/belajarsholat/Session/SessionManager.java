package com.example.belajarsholat.Session;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.example.belajarsholat.Model.aboutme.AboutData;
import com.example.belajarsholat.Model.ashar.AsharData;
import com.example.belajarsholat.Model.dzuhur.DzuhurData;
import com.example.belajarsholat.Model.isya.IsyaData;
import com.example.belajarsholat.Model.login.loginData;
import com.example.belajarsholat.Model.maghrib.MaghribData;
import com.example.belajarsholat.Model.subuh.SubuhData;
import com.example.belajarsholat.Model.wudhu.WudhuData;

import java.util.HashMap;

public class SessionManager {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private static final String STATUS_A = "status";
    private static final String STATUS_B = "status";
    private static final String STATUS_C = "status";
    private static final String STATUS_D = "status";
    private static final String STATUS_E = "status";
    private static final String STATUS_F = "status";
    public static final String IS_LOGGED_IN = "isLoggedIn";
    public static final String USER_ID = "user_id";
    public static final String USERNAME = "username";
    public static final String NAME = "name";
    public static final String JUDUL = "judulabout";
    public static final String DESKRIPSI = "deskripsiabout";
    public static final String JUDULWUDHU = "judulwudhu";
    public static final String DESKRIPSIWUDHU = "deskripsiwudhu";
    public static final String JUDULSUBUH = "judulsubuh";
    public static final String DESKRIPSISUBUH = "deskripsisubuh";
    public static final String JUDULDZUHUR = "judul_dzuhur";
    public static final String DESKRIPSIDZUHUR = "deskripsi_dzuhur";
    public static final String JUDULASHAR = "judul_ashar";
    public static final String DESKRIPSIASHAR = "deskripsi_ashar";
    public static final String JUDULMAGHRIB= "judul_maghrib";
    public static final String DESKRIPSIMAGHRIB = "deskripsi_maghrib";
    public static final String JUDULISYA= "judul_isya";
    public static final String DESKRIPSIISYA= "deskripsi_isya";




    public SessionManager(Context context) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences( context );
       editor = sharedPreferences.edit();
    }

    public void createLoginSession(loginData user) {
        editor.putBoolean( IS_LOGGED_IN, true );
        editor.putString( USER_ID, user.getUserId() );
        editor.putString( USERNAME, user.getUsername() );
        editor.putString( NAME, user.getName() );
        editor.commit();

    }

    public void createaboutSession(AboutData user) {
        editor.putBoolean( STATUS_A, true );
        editor.putString( JUDUL, user.getJudul() );
        editor.putString( DESKRIPSI, user.getDeskripsi() );
        editor.commit();

    }

    public void createwudhuSession(WudhuData user) {
        editor.putBoolean( STATUS_B, true );
        editor.putString( JUDULWUDHU, user.getJudulWudhu() );
        editor.putString( DESKRIPSIWUDHU, user.getDeskripsiWudhu() );
        editor.commit();

    }


    public void createsubuhSession(SubuhData user) {
        editor.putBoolean( STATUS_C, true );
        editor.putString( JUDULSUBUH, user.getJudulSubuh() );
        editor.putString( DESKRIPSISUBUH, user.getDeskripsiSubuh() );
        editor.commit();

    }

    public void createdzuhurSession(DzuhurData user) {
        editor.putBoolean( STATUS_D, true );
        editor.putString( JUDULDZUHUR, user.getJudulDzuhur() );
        editor.putString( DESKRIPSIDZUHUR, user.getDeskripsiDzuhur() );
        editor.commit();

    }

    public void createasharSession(AsharData user) {
        editor.putBoolean( STATUS_E, true );
        editor.putString( JUDULASHAR, user.getJudulAshar() );
        editor.putString( DESKRIPSIASHAR, user.getDeskripsiAshar() );
        editor.commit();

    }

    public void createmaghribisyaSession(MaghribData user) {
        editor.putBoolean( STATUS_E, true );
        editor.putString( JUDULMAGHRIB, user.getJudulMaghrib() );
        editor.putString( DESKRIPSIMAGHRIB, user.getDeskripsiMaghrib() );
        editor.commit();

    }

    public void createisyaSession(IsyaData user) {
        editor.putBoolean( STATUS_F, true );
        editor.putString( JUDULISYA, user.getJudulIsya() );
        editor.putString( DESKRIPSIISYA, user.getDeskripsiIsya() );
        editor.commit();

    }

    public HashMap<String, String> getUserDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( USER_ID, sharedPreferences.getString( USER_ID, null ) );
        user.put( USERNAME, sharedPreferences.getString( USERNAME, null ) );
        user.put( NAME, sharedPreferences.getString( NAME, null ) );
        return user;

    }


    public HashMap<String, String> getaboutDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDUL, sharedPreferences.getString( JUDUL, null ) );
        user.put( DESKRIPSI, sharedPreferences.getString( DESKRIPSI, null ) );
        return user;

    }


    public HashMap<String, String> getwudhuDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDULWUDHU, sharedPreferences.getString( JUDULWUDHU, null ) );
        user.put( DESKRIPSIWUDHU, sharedPreferences.getString( DESKRIPSIWUDHU, null ) );
        return user;

    }


    public HashMap<String, String> getsubuhDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDULSUBUH, sharedPreferences.getString( JUDULSUBUH, null ) );
        user.put( DESKRIPSISUBUH, sharedPreferences.getString( DESKRIPSISUBUH, null ) );
        return user;

    }

    public HashMap<String, String> getdzuhurDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDULDZUHUR, sharedPreferences.getString( JUDULDZUHUR, null ) );
        user.put( DESKRIPSIDZUHUR, sharedPreferences.getString( DESKRIPSIDZUHUR, null ) );
        return user;

    }

    public HashMap<String, String> getasharDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDULASHAR, sharedPreferences.getString( JUDULASHAR, null ) );
        user.put( DESKRIPSIASHAR, sharedPreferences.getString( DESKRIPSIASHAR, null ) );
        return user;

    }

    public HashMap<String, String> getmaghribDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDULMAGHRIB, sharedPreferences.getString( JUDULMAGHRIB, null ) );
        user.put( DESKRIPSIMAGHRIB, sharedPreferences.getString( DESKRIPSIMAGHRIB, null ) );
        return user;

    }

    public HashMap<String, String> getisyaDetail() {
        HashMap<String, String> user = new HashMap<>();
        user.put( JUDULISYA, sharedPreferences.getString( JUDULISYA, null ) );
        user.put( DESKRIPSIISYA, sharedPreferences.getString( DESKRIPSIISYA, null ) );
        return user;

    }


    public void logoutSession() {
        editor.clear();
        editor.commit();
    }

    public boolean isLoggedIn() {
        return sharedPreferences.getBoolean( IS_LOGGED_IN, false );
    }

    public void createasharSession(DzuhurData dzuhurData) {
    }
}
