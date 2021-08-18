package com.example.belajarsholat;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.belajarsholat.Adapter.Adapterpresenter;
import com.example.belajarsholat.Adapter.latihanquiz.LatihanAdapter;
import com.example.belajarsholat.Adapter.latihanquiz.quizpresenter;
import com.example.belajarsholat.Model.latihanquiz.LatihanquizItem;

import java.util.List;

public class latihanquiz extends AppCompatActivity implements Adapterpresenter {
    private static final int INTENT_LAPORAN_AKHIR_DETAIL = 100;
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefresh;
    quizpresenter presenter;
    LatihanAdapter adapter;
    List<LatihanquizItem> data;

    LatihanAdapter.ItemClickListener itemClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_latihanquiz );

        swipeRefresh = findViewById(R.id.quiz);
        recyclerView = findViewById(R.id.list_quiz);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        presenter = new quizpresenter(this);
        presenter.getData();


        swipeRefresh.setOnRefreshListener(
                () -> presenter.getData() );

        itemClickListener = (((view, position) -> {

        }));
    }


    @Override
    public void showLoading() {

        swipeRefresh.setRefreshing(true);
    }

    @Override
    public void hideLoading() {

        swipeRefresh.setRefreshing(false);
    }

    @Override
    public void onGetResult(List<LatihanquizItem> datas) {
        adapter = new LatihanAdapter(this, datas, itemClickListener);
        adapter.notifyDataSetChanged();
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        data = datas;
    }

    @Override
    public void onErrorLoading(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}