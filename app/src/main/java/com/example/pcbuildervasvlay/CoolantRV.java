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

public class CoolantRV extends AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView mRecycleView;
    private androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private List<Coolant> itemList;
    SharedPreferences sp;

    private CoolantEA.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coolant_rv);
        itemList = new ArrayList<>();

        sp = getSharedPreferences("Final pref", Context.MODE_PRIVATE);

        itemList.addAll(CoolantList.CoolantListAll);


        mRecycleView = findViewById(R.id.recyclerView);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);

        setOnClickListner();

        mAdapter = new CoolantEA(itemList, listener);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
    }

    private void setOnClickListner() {
        listener = new CoolantEA.RecyclerViewClickListener() {
            public void onClick(View v, int position, String name, String price) {
                Intent intent = new Intent(getApplicationContext(), PowerRV.class);

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Cool Name", name);
                editor.putString("Cool Price", price);
                editor.apply();

                startActivity(intent);
            }
        };
    }


}