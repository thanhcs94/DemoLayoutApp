package com.thanhcs.lifeofdev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.thanhcs.lifeofdev.adapter.InforViewAdapter;
import com.thanhcs.lifeofdev.view.superrecyclerview.LinearLayoutManager;
import com.thanhcs.lifeofdev.view.superrecyclerview.SuperRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    SuperRecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();

        recyclerView =  (SuperRecyclerView)findViewById(R.id.superRecyclerView);
        LinearLayoutManager recycleLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(recycleLayoutManager);
        List<String> listData = new ArrayList<>();
        listData.add(getResources().getString(R.string.sample));
        listData.add(getResources().getString(R.string.sample));
        listData.add(getResources().getString(R.string.sample));
        listData.add(getResources().getString(R.string.sample));
        listData.add(getResources().getString(R.string.sample));
        listData.add(getResources().getString(R.string.sample));
        listData.add(getResources().getString(R.string.sample));
        InforViewAdapter adapterFollower = new InforViewAdapter(listData, this);
        recyclerView.setAdapter(adapterFollower);
    }


    public void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                }

        );
    }

}
