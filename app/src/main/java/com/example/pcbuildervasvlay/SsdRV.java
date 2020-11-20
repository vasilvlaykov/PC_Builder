package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SsdRV extends AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView mRecycleView;
    private androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private List<SSD> itemList;
    SharedPreferences sp;

    private SsdEA.RecyclerViewClickListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ssd_rv);
        itemList = new ArrayList<>();

        sp = getSharedPreferences("Final pref", Context.MODE_PRIVATE);

        itemList.addAll(SSDList.SSDListAll);


        mRecycleView = findViewById(R.id.recyclerView);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);

        setOnClickListner();

        mAdapter = new SsdEA(itemList, listener);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
    }

    private void setOnClickListner() {
        listener = new SsdEA.RecyclerViewClickListener() {
            public void onClick(View v, int position, String name, String price) {
                Intent intent = new Intent(getApplicationContext(), HddRV.class);

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Ssd Name", name);
                editor.putString("Ssd Price", price);
                editor.apply();

                startActivity(intent);
            }
        };
    }


}