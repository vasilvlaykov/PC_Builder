package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

//******************************************************************************
//AMD or INTEL *****************************************************************
//******************************************************************************
public class LowMidHigh extends AppCompatActivity {
    private ImageButton amdButton;
    private ImageButton intelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_mid_high);

        amdButton = findViewById(R.id.logoAmd);
        intelButton = findViewById(R.id.logoIntel);

        amdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goAmd();
            }
        });

        intelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goIntel();
            }
        });
    }

    private void goIntel() {
        Intent intent = new Intent(this, CpuRV.class);
        String temp = "Intel";
        intent.putExtra("Manufacturer", temp);
        startActivity(intent);
    }

    private void goAmd() {
        Intent intent = new Intent(this, CpuRV.class);
        String temp = "AMD";
        intent.putExtra("Manufacturer", temp);
        startActivity(intent);
    }
}