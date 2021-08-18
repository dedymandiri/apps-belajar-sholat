package com.example.belajarsholat.api;

import com.example.belajarsholat.Model.aboutme.Aboutme;
import com.example.belajarsholat.Model.latihanquiz.LatihanquizItem;
import com.example.belajarsholat.Model.login.Login;
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

}





