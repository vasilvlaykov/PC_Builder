package com.example.pcbuildervasvlay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BuildDetails extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example_item_info);

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

        //*********************************************************

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

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cpuN = extras.getString("cpuN");
            cpuP = Integer.valueOf(extras.getInt("cpuP")).toString();
            gpuN = extras.getString("gpuN");
            gpuP = Integer.valueOf(extras.getInt("gpuP")).toString();
            mtbN = extras.getString("mtbN");
            mtbP = Integer.valueOf(extras.getInt("mtbP")).toString();
            ramN = extras.getString("ramN");
            ramP = Integer.valueOf(extras.getInt("ramP")).toString();
            ssdN = extras.getString("ssdN");
            ssdP = Integer.valueOf(extras.getInt("ssdP")).toString();
            hddN = extras.getString("hddN");
            hddP = Integer.valueOf(extras.getInt("hddP")).toString();
            coolantN = extras.getString("coolN");
            coolantP = Integer.valueOf(extras.getInt("coolP")).toString();
            powerSupplyN = extras.getString("powerN");
            powerSupplyP = Integer.valueOf(extras.getInt("powerP")).toString();
            pcCaseN = extras.getString("pcCaseN");
            pcCaseP = Integer.valueOf(extras.getInt("pcCaseP")).toString();
            totalP = extras.getString("totalP");
        }

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
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
    }

    public void searchCool(View v) {
        String temp = coolantName.getText().toString();
        temp = temp.replace(" ", "+");
        temp = "https://www.google.com/search?q=" + temp;

        Intent intent = new Intent(getApplicationContext(), CheckGoogle.class);
        intent.putExtra("My url", temp);
        startActivity(intent);
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