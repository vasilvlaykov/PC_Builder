package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class FinalShowdown extends AppCompatActivity {
    private TextView cpuName;
    private TextView cpuPrice;
    private TextView gpuName;
    private TextView gpuPrice;
    private TextView motherboardName;
    private TextView motherboardPrice;
    private TextView ramName;
    private TextView ramPrice;
    private TextView ssdName;
    private TextView ssdPrice;
    private TextView hddName;
    private TextView hddPrice;
    private TextView coolantName;
    private TextView coolantPrice;
    private TextView powerSupplyName;
    private TextView powerSupplyPrice;
    private TextView pcCaseName;
    private TextView pcCasePrice;
    private TextView finalPrice;
    private ImageButton iButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_showdown);

        iButton = findViewById(R.id.goToMenu);

        cpuName = findViewById(R.id.CPUName);
        cpuPrice = findViewById(R.id.CPUPrice);
        gpuName = findViewById(R.id.GPUName);
        gpuPrice = findViewById(R.id.GPUPrice);
        motherboardName = findViewById(R.id.MTBName);
        motherboardPrice = findViewById(R.id.MTBPrice);
        ramName = findViewById(R.id.RAMName);
        ramPrice = findViewById(R.id.RAMPrice);
        ssdName = findViewById(R.id.SSDName);
        ssdPrice = findViewById(R.id.SSDPrice);
        hddName = findViewById(R.id.HDDName);
        hddPrice = findViewById(R.id.HDDPrice);
        coolantName = findViewById(R.id.CoolantName);
        coolantPrice = findViewById(R.id.CoolantPrice);
        powerSupplyName = findViewById(R.id.PowerSupplyName);
        powerSupplyPrice = findViewById(R.id.PowerSupplyPrice);
        pcCaseName = findViewById(R.id.PcCaseName);
        pcCasePrice = findViewById(R.id.PcCasePrice);
        finalPrice = findViewById(R.id.TotalPricePrice);

        //**************************************************

        String cpuN = "";
        String cpuP = "";
        String gpuN = "";
        String gpuP = "";
        String mtbN = "";
        String mtbP = "";
        String ramN = "";
        String ramP = "";
        String ssdN = "";
        String ssdP = "";
        String hddN = "";
        String hddP = "";
        String coolantN = "";
        String coolantP = "";
        String powerSupplyN = "";
        String powerSupplyP = "";
        String pcCaseN = "";
        String pcCaseP = "";
        String totalP = "";

        int totalCost = 0;

        SharedPreferences sp = getApplicationContext().getSharedPreferences("Final pref", Context.MODE_PRIVATE);
        cpuN = sp.getString("Cpu Name", "");
        cpuP = sp.getString("Cpu Price", "");
        gpuN = sp.getString("Gpu Name", "");
        gpuP = sp.getString("Gpu Price", "");
        mtbN = sp.getString("Mtb Name", "");
        mtbP = sp.getString("Mtb Price", "");
        ramN = sp.getString("Ram Name", "");
        ramP = sp.getString("Ram Price", "");
        ssdN = sp.getString("Ssd Name", "");
        ssdP = sp.getString("Ssd Price", "");
        hddN = sp.getString("Hdd Name", "");
        hddP = sp.getString("Hdd Price", "");
        coolantN = sp.getString("Cool Name", "");
        coolantP = sp.getString("Cool Price", "");
        powerSupplyN = sp.getString("Power Name", "");
        powerSupplyP = sp.getString("Power Price", "");
        pcCaseN = sp.getString("PcCase Name", "");
        pcCaseP = sp.getString("PcCase Price", "");
        totalCost = Integer.parseInt(cpuP) + Integer.parseInt(gpuP) + Integer.parseInt(mtbP) + Integer.parseInt(ramP) + Integer.parseInt(ssdP) + Integer.parseInt(hddP)
                + Integer.parseInt(coolantP) + Integer.parseInt(powerSupplyP) + Integer.parseInt(pcCaseP);
        totalP = Integer.valueOf(totalCost).toString();

        cpuName.setText(cpuN);
        cpuPrice.setText(cpuP);
        gpuName.setText(gpuN);
        gpuPrice.setText(gpuP);
        motherboardName.setText(mtbN);
        motherboardPrice.setText(mtbP);
        ramName.setText(ramN);
        ramPrice.setText(ramP);
        ssdName.setText(ssdN);
        ssdPrice.setText(ssdP);
        hddName.setText(hddN);
        hddPrice.setText(hddP);
        coolantName.setText(coolantN);
        coolantPrice.setText(coolantP);
        powerSupplyName.setText(powerSupplyN);
        powerSupplyPrice.setText(powerSupplyP);
        pcCaseName.setText(pcCaseN);
        pcCasePrice.setText(pcCaseP);
        finalPrice.setText(totalP);

        iButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    public void searchCpu(View v) {
        String temp = cpuName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchGpu(View v) {
        String temp = gpuName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchMtb(View v) {
        String temp = motherboardName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchRam(View v) {
        String temp = ramName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchSsd(View v) {
        String temp = ssdName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchHdd(View v) {
        String temp = hddName.getText().toString();
        if (!temp.equals("None")) {
            temp = temp.replace(" ", "+");
            temp = "https://www.google.com/search?q=" + temp;

            Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
            intent.putExtra("My url", temp);
            startActivity(intent);
        }
    }

    public void searchCool(View v) {
        String temp = coolantName.getText().toString();
        if (!temp.equals("Stock fan")) {
            temp = temp.replace(" ", "+");
            temp = "https://www.google.com/search?q=" + temp;

            Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
            intent.putExtra("My url", temp);
            startActivity(intent);
        }
    }

    public void searchPower(View v) {
        String temp = powerSupplyName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchCase(View v) {
        String temp = pcCaseName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

}