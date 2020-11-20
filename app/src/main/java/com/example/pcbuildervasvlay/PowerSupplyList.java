package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class PowerSupplyList {
    public static List<PowerSupply> PowerListAll = new ArrayList<>();


    static PowerSupply ps1 = new PowerSupply("Corsair CX450", 60); //1
    static PowerSupply ps2 = new PowerSupply("Corsair RM550x", 90); //1
    static PowerSupply ps3 = new PowerSupply("Seasonic Prime Titanium 650W", 125); //2
    static PowerSupply ps4 = new PowerSupply("Seasonic SSR-750PX", 120); //3
    static PowerSupply ps5 = new PowerSupply("Corsair AX850", 225); //4
    static PowerSupply ps6 = new PowerSupply("Corsair AX1000", 235); //5
    static PowerSupply ps7 = new PowerSupply("Corsair TX650M 650W", 85); //2
    static PowerSupply ps8 = new PowerSupply("Thermaltake Smart RGB - 500W", 50); //1
    static PowerSupply ps9 = new PowerSupply("Thermaltake Toughpower GF1 850W 80+ Gold", 140); //4


    static {
        PowerListAll.add(ps1);
        PowerListAll.add(ps2);
        PowerListAll.add(ps8);
        PowerListAll.add(ps3);
        PowerListAll.add(ps7);
        PowerListAll.add(ps4);
        PowerListAll.add(ps5);
        PowerListAll.add(ps9);
        PowerListAll.add(ps6);
    }
}
