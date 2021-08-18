package com.example.belajarsholat.Adapter;

import com.example.belajarsholat.Model.latihanquiz.LatihanquizItem;

import java.util.List;

public interface Adapterpresenter {

    void showLoading();
    void hideLoading();
    void onGetResult(List<LatihanquizItem> datas);
    void onErrorLoading(String message);

}
