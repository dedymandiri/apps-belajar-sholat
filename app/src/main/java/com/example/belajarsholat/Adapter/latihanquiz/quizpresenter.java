package com.example.belajarsholat.Adapter.latihanquiz;

import androidx.annotation.NonNull;

import com.example.belajarsholat.Adapter.Adapterpresenter;
import com.example.belajarsholat.Model.latihanquiz.LatihanquizItem;
import com.example.belajarsholat.api.ApiClient;
import com.example.belajarsholat.api.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class quizpresenter {

    private Adapterpresenter view;

    public quizpresenter(Adapterpresenter view) {

        this.view = view;
    }

    public void getData() {
        view.showLoading();

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<LatihanquizItem>> call = apiInterface.ResponseTentang();
        call.enqueue(new Callback<List<LatihanquizItem>>() {

            @Override
            public void onResponse(@NonNull Call<List<LatihanquizItem>> call, @NonNull Response<List<LatihanquizItem>> response) {
                view.hideLoading();
                if (response.isSuccessful() && response.body() !=null){
                    view.onGetResult(response.body());
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<LatihanquizItem>> call, @NonNull Throwable t) {
                view.hideLoading();
                view.onErrorLoading(t.getLocalizedMessage());
            }
        });
    }

}

