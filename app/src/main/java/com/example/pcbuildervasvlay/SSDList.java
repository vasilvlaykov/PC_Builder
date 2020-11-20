package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class SSDList {
    public static List<SSD> SSDListAll = new ArrayList<>();


    static SSD ssd1 = new SSD("Addlink S70 512GB", 83); //1
    static SSD ssd2 = new SSD("WD Black SN750 1TB", 160); //2
    static SSD ssd3 = new SSD("Samsung 970 EVO Plus 500GB", 80); //1
    static SSD ssd4 = new SSD("Crucial MX500 1TB", 95); //2
    static SSD ssd5 = new SSD("Crucial P1 1TB NVMe", 100); //2
    static SSD ssd6 = new SSD("Corsair Force MP600 1TB", 185); //2
    static SSD ssd7 = new SSD("Crucial BX500 480GB", 52); //1
    static SSD ssd8 = new SSD("Kingston 240GB A400", 30); //1
    static SSD ssd9 = new SSD("Crucial P1 500GB NAND", 60); //1
    static SSD ssd10 = new SSD("Samsung SSD 860 EVO 1TB", 95); //2


    static {
        SSDListAll.add(ssd1);
        SSDListAll.add(ssd2);
        SSDListAll.add(ssd3);
        SSDListAll.add(ssd4);
        SSDListAll.add(ssd5);
        SSDListAll.add(ssd6);
        SSDListAll.add(ssd7);
        SSDListAll.add(ssd8);
        SSDListAll.add(ssd9);
        SSDListAll.add(ssd10);
    }

}
