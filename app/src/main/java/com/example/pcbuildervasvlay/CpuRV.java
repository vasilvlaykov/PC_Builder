package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CpuRV extends AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView mRecycleView;
    private androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private List<CPU> itemList;
    private String compare;
    SharedPreferences sp;

    private CpuEA.RecyclerViewClickListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpu_rv);
        itemList = new ArrayList<>();

        sp = getSharedPreferences("Final pref", Context.MODE_PRIVATE);

        Bundle extras = getIntent().getExtras();
        compare = "";
        if (extras != null) {
            compare = extras.getString("Manufacturer");
        }

        for (CPU cpu : CPUList.CPUListAll) {
            if (cpu.getManufacturer().equals(compare)) {
                itemList.add(cpu);
            }
        }


        mRecycleView = findViewById(R.id.recyclerView);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);

        setOnClickListener();

        mAdapter = new CpuEA(itemList, listener);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
    }

    private void setOnClickListener() {
        listener = new CpuEA.RecyclerViewClickListener() {
            public void onClick(View v, int position, String name, String price) {
                Intent intent = new Intent(CpuRV.this, GpuRV.class);
                intent.putExtra("Manufacturer", compare);

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("Cpu Name", name);
                editor.putString("Cpu Price", price);
                editor.apply();

                startActivity(intent);
            }
        };
    }


}