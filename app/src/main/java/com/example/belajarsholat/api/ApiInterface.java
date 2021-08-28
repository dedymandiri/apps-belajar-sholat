package com.example.belajarsholat.api;

import com.example.belajarsholat.Model.aboutme.Aboutme;
import com.example.belajarsholat.Model.ashar.Ashar;
import com.example.belajarsholat.Model.dzuhur.Dzuhur;
import com.example.belajarsholat.Model.isya.Isya;
import com.example.belajarsholat.Model.latihanquiz.LatihanquizItem;
import com.example.belajarsholat.Model.login.Login;
import com.example.belajarsholat.Model.maghrib.Maghrib;
import com.example.belajarsholat.Model.profile.Profile;
import com.example.belajarsholat.Model.register.Register;
import com.example.belajarsholat.Model.subuh.Subuh;
import com.example.belajarsholat.Model.wudhu.Wudhu;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
            @Field("username") String username,
            @Field("password") String password

    );

    @FormUrlEncoded
    @POST("register.php")
    Call<Register> registerResponse(
            @Field("username") String username,
            @Field("name") String name,
            @Field("password") String password

    );

    @GET("getsoal.php")
    Call<List<LatihanquizItem>> ResponseTentang(

    );

    @GET("gettentang.php")
    Call<Aboutme> Responsekami(

    );


    @GET("getwudhu.php")
    Call<Wudhu> Responsewudhu(

    );


    @GET("getsubuh.php")
    Call<Subuh> Responsesubuh(

    );

    @GET("getdzuhur.php")
    Call<Dzuhur> Responsedzuhur(

    );

    @GET("getashar.php")
    Call<Ashar> Responseashar(

    );

    @GET("getmaghrib.php")
    Call<Maghrib> Responsemaghrib(

    );

    @GET("getisya.php")
    Call<Isya> Responseisya(


    );

    @FormUrlEncoded
    @POST("getprofile.php")
    Call<Profile> Responseprofile(
            @Field("id") String id,
            @Field("username") String username,
            @Field("name") String name

    );

}





