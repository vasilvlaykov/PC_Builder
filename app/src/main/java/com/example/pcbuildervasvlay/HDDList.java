package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class HDDList {
    public static List<HDD> HDDListAll = new ArrayList<>();


    static HDD hdd0 = new HDD("None", 0);
    static HDD hdd1 = new HDD("Seagate BarraCuda 1TB", 40); //1
    static HDD hdd2 = new HDD("Seagate BarraCuda 2TB", 55); //2
    static HDD hdd3 = new HDD("Seagate BarraCuda 4TB", 85); //3
    static HDD hdd4 = new HDD("Toshiba X300 4TB", 90); //3
    static HDD hdd5 = new HDD("WD Blue Desktop 1TB", 37); //1
    static HDD hdd6 = new HDD("WD Blue Desktop 2TB", 57); //2


    static {
        HDDListAll.add(hdd0);
        HDDListAll.add(hdd1);
        HDDListAll.add(hdd2);
        HDDListAll.add(hdd3);
        HDDListAll.add(hdd4);
        HDDListAll.add(hdd5);
        HDDListAll.add(hdd6);
    }

}
