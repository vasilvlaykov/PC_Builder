package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class RAMList {
    public static List<RAM> RAMListAll = new ArrayList<>();


    static RAM ram1 = new RAM("Patriot Viper Steel DDR4-4400 (2x 8GB)", "DDR4", 120); //2
    static RAM ram2 = new RAM("Patriot Viper RGB DDR4-3600 (2x 8GB)", "DDR4", 87); //1
    static RAM ram3 = new RAM("Patriot Viper 4 DDR4-3400 (2x 8GB)", "DDR4", 60); //1
    static RAM ram4 = new RAM("Corsair Vengeance RGB Pro DDR4-3200 (4x 8GB)", "DDR4", 165); //2
    static RAM ram5 = new RAM("Patriot Viper Steel DDR4-3200 (2x 16GB)", "DDR4", 110); //2
    static RAM ram6 = new RAM("HyperX Predator RGB DDR4-2933 (4x 8GB)", "DDR4", 195); //2
    static RAM ram7 = new RAM("Corsair Vengeance LPX DDR4-2666 (2x 8GB)", "DDR4", 60); //1
    static RAM ram8 = new RAM("Crucial Ballistix 2400 MHz DDR4 (2x 4GB)", "DDR4", 38); //1
    static RAM ram9 = new RAM("Crucial Ballistix 3200 MHz DDR4 (2x 8GB)", "DDR4", 60); //1


    static {
        RAMListAll.add(ram1);
        RAMListAll.add(ram2);
        RAMListAll.add(ram3);
        RAMListAll.add(ram4);
        RAMListAll.add(ram5);
        RAMListAll.add(ram6);
        RAMListAll.add(ram7);
        RAMListAll.add(ram8);
        RAMListAll.add(ram9);
    }
}
