package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    private TextView priceRange;
    private static SeekBar seekBar;
    private ImageButton searchButton;
    private ImageButton buildButton;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        searchButton = (ImageButton)findViewById(R.id.searchButton);
        buildButton = findViewById(R.id.buildButton);
        seekBar = (SeekBar)findViewById(R.id.seekBar);
        priceRange = (TextView)findViewById(R.id.priceRange);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                String temp = "€" + Integer.valueOf(progress).toString();
                priceRange.setText(temp);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                String temp = "€" + Integer.valueOf(progress).toString();
                priceRange.setText(temp);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                priceRange.setText(priceRange.getText().toString());
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openResults();
            }
        });
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLowMidHigh();
            }
        });
    }

    private void openLowMidHigh() {
        Intent intent = new Intent(this, LowMidHigh.class);
        startActivity(intent);
    }

    public void openResults() {
        Intent intent = new Intent(this, RecyclerView.class); //*
        startActivity(intent);
    }

    public static int getConstraint() {
        int constraints = seekBar.getProgress();
        return constraints;
    }
}