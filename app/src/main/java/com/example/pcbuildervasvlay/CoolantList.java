package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class CoolantList {
    public static List<Coolant> CoolantListAll = new ArrayList<>();

    static Coolant coolant0 = new Coolant("Stock fan", 0);
    static Coolant coolant1 = new Coolant("Noctua NF-S12B redux-1200", 14); //1
    static Coolant coolant2 = new Coolant("Corsair LL120 RGB", 26); //1
    static Coolant coolant3 = new Coolant("Cooler Master MF120R A-RGB", 15); //1
    static Coolant coolant4 = new Coolant("Noctua NF-A12x25 PWM", 30); //1
    static Coolant coolant5 = new Coolant("NZXT Aer RGB 2 120mm", 27); //1
    static Coolant coolant6 = new Coolant("Scythe Kaze Flex 120 PWM", 10); //1
    static Coolant coolant7 = new Coolant("Corsair Hydro Series H100i Pro", 120); //2
    static Coolant coolant8 = new Coolant("Deepcool Captain 240 Pro V2", 100); //2
    static Coolant coolant9 = new Coolant("NZXT Kraken X53", 125); //2
    static Coolant coolant10 = new Coolant("EVGA CLC 280mm", 130); //2
    static Coolant coolant11 = new Coolant("Thermaltake Water 3.0 Triple Riing", 170); //2
    static Coolant coolant12 = new Coolant("Cooler Master MasterLiquid ML240P Mirage", 100); //2
    static Coolant coolant13 = new Coolant("Alphacool Eisbaer Aurora", 120); //2
    static Coolant coolant14 = new Coolant("NZXT Kraken Z63", 220); //2
    static Coolant coolant15 = new Coolant("ekwb EK-AIO 240 D-RGB", 250); //2
    static Coolant coolant16 = new Coolant("DeepCool Castle 240RGB", 115); //2


    static {
        CoolantListAll.add(coolant0);
        CoolantListAll.add(coolant1);
        CoolantListAll.add(coolant2);
        CoolantListAll.add(coolant3);
        CoolantListAll.add(coolant4);
        CoolantListAll.add(coolant5);
        CoolantListAll.add(coolant6);
        CoolantListAll.add(coolant7);
        CoolantListAll.add(coolant8);
        CoolantListAll.add(coolant9);
        CoolantListAll.add(coolant10);
        CoolantListAll.add(coolant11);
        CoolantListAll.add(coolant12);
        CoolantListAll.add(coolant13);
        CoolantListAll.add(coolant14);
        CoolantListAll.add(coolant15);
        CoolantListAll.add(coolant16);
    }

}
