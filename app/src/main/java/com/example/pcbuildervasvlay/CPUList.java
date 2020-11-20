package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class CPUList {
    public static List<CPU> CPUListAll = new ArrayList<>();


    static CPU c1 = new CPU("AMD Ryzen 5 3600", "AMD", 170); //1
    static CPU c2 = new CPU("AMD Ryzen 7 3700X", "AMD", 280); //2
    static CPU c3 = new CPU("AMD Ryzen 9 3900X", "AMD", 420); //3
    static CPU c4 = new CPU("Intel Core i9-9900K @ 3.60GHz", "Intel", 410); //3
    static CPU c5 = new CPU("AMD Ryzen 5 2600", "AMD", 120); //1
    static CPU c6 = new CPU("AMD Ryzen 5 3600X", "AMD", 199); //1
    static CPU c7 = new CPU("Intel Core i7-9700K @ 3.60GHz", "Intel", 310); //2
    static CPU c8 = new CPU("AMD Ryzen 7 2700X", "AMD", 175); //1
    static CPU c9 = new CPU("Intel Core i7-3770H @ 3.40GHz", "Intel", 210); //2
    static CPU c10 = new CPU("AMD Ryzen 7 3800X", "AMD", 300); //2
    static CPU c11 = new CPU("Intel Core i7-8700K @ 3.70GHz", "Intel", 350); //2
    static CPU c12 = new CPU("AMD Ryzen 9 3950X", "AMD", 700); //3
    static CPU c13 = new CPU("AMD Ryzen 3 3200G", "AMD", 90); //1
    static CPU c14 = new CPU("Intel Core i7-4790K @ 4.00GHz", "Intel", 280); //2
    static CPU c15 = new CPU("AMD Ryzen 5 1600", "AMD", 130); //1
    static CPU c16 = new CPU("Intel Core i5-9400F @ 2.90GHz", "Intel", 135); //1
    static CPU c17 = new CPU("Intel Core i7-8700 @ 3.20GHz", "Intel", 310); //2
    static CPU c18 = new CPU("Intel Core i7-10700K @ 3.80GHz", "Intel", 380); //2
    static CPU c19 = new CPU("Intel Core i7-6700K @ 4.00GHz", "Intel", 275); //2
    static CPU c20 = new CPU("Intel Core i7-4790 @ 3.60GHz", "Intel", 300); //2

    static {
        //add all
        CPUListAll.add(c1);
        CPUListAll.add(c2);
        CPUListAll.add(c3);
        CPUListAll.add(c4);
        CPUListAll.add(c5);
        CPUListAll.add(c6);
        CPUListAll.add(c7);
        CPUListAll.add(c8);
        CPUListAll.add(c9);
        CPUListAll.add(c10);
        CPUListAll.add(c11);
        CPUListAll.add(c12);
        CPUListAll.add(c13);
        CPUListAll.add(c14);
        CPUListAll.add(c15);
        CPUListAll.add(c16);
        CPUListAll.add(c17);
        CPUListAll.add(c18);
        CPUListAll.add(c19);
        CPUListAll.add(c20);

    }

}
