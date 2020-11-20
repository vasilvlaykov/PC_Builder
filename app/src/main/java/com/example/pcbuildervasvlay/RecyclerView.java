package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView mRecycleView;
    private androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private List<ExampleItemInfo> exampleList;

    private ExampleAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        exampleList = new ArrayList<>();
        int constraint = MainMenu.getConstraint();
        // with iter i will add only the matching elements from complete builds
        for (ExampleItemInfo s : PopularBuildsList.BuildsListInfo) {
            int price = Integer.parseInt(s.getTotalPrice());
            if (price <= constraint) {
                exampleList.add(s);
            }
        }

        mRecycleView = findViewById(R.id.recyclerView);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);

        setOnClickListner();

        mAdapter = new ExampleAdapter(exampleList, listener);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);
    }

    private void setOnClickListner() {
        listener = new ExampleAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), BuildDetails.class);
                intent.putExtra("cpuN", exampleList.get(position).getCpu().getName());
                intent.putExtra("cpuP", exampleList.get(position).getCpu().getPrice());
                intent.putExtra("gpuN", exampleList.get(position).getGpu().getName());
                intent.putExtra("gpuP", exampleList.get(position).getGpu().getPrice());
                intent.putExtra("mtbN", exampleList.get(position).getMotherboard().getName());
                intent.putExtra("mtbP", exampleList.get(position).getMotherboard().getPrice());
                intent.putExtra("ramN", exampleList.get(position).getRam().getName());
                intent.putExtra("ramP", exampleList.get(position).getRam().getPrice());
                intent.putExtra("ssdN", exampleList.get(position).getSsd().getName());
                intent.putExtra("ssdP", exampleList.get(position).getSsd().getPrice());
                intent.putExtra("hddN", exampleList.get(position).getHdd().getName());
                intent.putExtra("hddP", exampleList.get(position).getHdd().getPrice());
                intent.putExtra("coolN", exampleList.get(position).getCoolant().getName());
                intent.putExtra("coolP", exampleList.get(position).getCoolant().getPrice());
                intent.putExtra("powerN", exampleList.get(position).getPowerSupply().getName());
                intent.putExtra("powerP", exampleList.get(position).getPowerSupply().getPrice());
                intent.putExtra("pcCaseN", exampleList.get(position).getPcCase().getName());
                intent.putExtra("pcCaseP", exampleList.get(position).getPcCase().getPrice());
                intent.putExtra("totalP", exampleList.get(position).getTotalPrice());
                startActivity(intent);
            }
        };
    }
}