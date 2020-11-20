package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class MotherboardList {
    public static List<Motherboard> MotherboardListAll = new ArrayList<>();


    static Motherboard m1 = new Motherboard("Asus ROG Maximus XII HERO", "Intel", "DDR4", 400); //3
    static Motherboard m2 = new Motherboard("MSI MEG Z490 Godlike", "Intel", "DDR4", 400); //3
    static Motherboard m3 = new Motherboard("GIGABYTE Z490 Gaming X", "Intel", "DDR4", 165); //1
    static Motherboard m4 = new Motherboard("ASRock X570 Phantom Gaming X", "AMD", "DDR4", 370); //2
    static Motherboard m5 = new Motherboard("Aorus X570 Master", "AMD", "DDR4", 330); //2
    static Motherboard m6 = new Motherboard("Asus ROG Strix B550-E Gaming", "AMD", "DDR4", 185); //1
    static Motherboard m7 = new Motherboard("ASRock X299 Taichi", "Intel", "DDR4", 400); //3
    static Motherboard m8 = new Motherboard("ASRock X570 Phantom Gaming X", "AMD", "DDR4", 630); //3
    static Motherboard m9 = new Motherboard("MSI B450 Gaming Plus", "AMD", "DDR4", 90); //1
    static Motherboard m10 = new Motherboard("Asus Prime B450M-ACSM", "AMD", "DDR4", 70); //1
    static Motherboard m11 = new Motherboard("ASRock B550M-HDV", "AMD", "DDR4", 85); //1
    static Motherboard m12 = new Motherboard("ASRock B550 PRO4", "AMD", "DDR4", 130); //1


    static {
        MotherboardListAll.add(m1);
        MotherboardListAll.add(m2);
        MotherboardListAll.add(m3);
        MotherboardListAll.add(m4);
        MotherboardListAll.add(m5);
        MotherboardListAll.add(m6);
        MotherboardListAll.add(m7);
        MotherboardListAll.add(m8);
        MotherboardListAll.add(m9);
        MotherboardListAll.add(m10);
        MotherboardListAll.add(m11);
        MotherboardListAll.add(m12);
    }

}
