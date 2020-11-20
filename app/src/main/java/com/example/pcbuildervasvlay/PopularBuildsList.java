package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopularBuildsList {
    public static List<ExampleItem> BuildsList = new ArrayList<>();
    public static List<ExampleItemInfo> BuildsListInfo = new ArrayList<>();

    static ExampleItem b1 = new ExampleItem(R.drawable.ic_pc, CPUList.c1.getName(), GPUList.g12.getName(), getP1());
    static ExampleItem b2 = new ExampleItem(R.drawable.ic_pc, CPUList.c5.getName(), GPUList.g5.getName(), getP2());
    static ExampleItem b3 = new ExampleItem(R.drawable.ic_pc, CPUList.c1.getName(), GPUList.g9.getName(), getP3());
    static ExampleItem b4 = new ExampleItem(R.drawable.ic_pc, CPUList.c6.getName(), GPUList.g12.getName(), getP4());
    static ExampleItem b5 = new ExampleItem(R.drawable.ic_pc, CPUList.c2.getName(), GPUList.g21.getName(), getP5());
    static ExampleItem b6 = new ExampleItem(R.drawable.ic_pc, CPUList.c18.getName(), GPUList.g27.getName(), getP6());
    static ExampleItem b7 = new ExampleItem(R.drawable.ic_pc, CPUList.c18.getName(), GPUList.g28.getName(), getP7());

    //***************************************************************************************************************

    static ExampleItemInfo i1 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c1, GPUList.g12, MotherboardList.m9, RAMList.ram7, SSDList.ssd1, HDDList.hdd1, CoolantList.coolant0, PowerSupplyList.ps7, PcCaseList.pcCase8);
    static ExampleItemInfo i2 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c5, GPUList.g5, MotherboardList.m10, RAMList.ram8, SSDList.ssd8, HDDList.hdd0, CoolantList.coolant0, PowerSupplyList.ps8, PcCaseList.pcCase9);
    static ExampleItemInfo i3 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c1, GPUList.g9, MotherboardList.m11, RAMList.ram3, SSDList.ssd9, HDDList.hdd0, CoolantList.coolant0, PowerSupplyList.ps8, PcCaseList.pcCase10);
    static ExampleItemInfo i4 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c6, GPUList.g12, MotherboardList.m12, RAMList.ram9, SSDList.ssd9, HDDList.hdd2, CoolantList.coolant0, PowerSupplyList.ps3, PcCaseList.pcCase11);
    static ExampleItemInfo i5 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c2, GPUList.g21, MotherboardList.m4, RAMList.ram2, SSDList.ssd2, HDDList.hdd2, CoolantList.coolant0, PowerSupplyList.ps4, PcCaseList.pcCase12);
    static ExampleItemInfo i6 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c18, GPUList.g27, MotherboardList.m2, RAMList.ram1, SSDList.ssd4, HDDList.hdd2, CoolantList.coolant16, PowerSupplyList.ps9, PcCaseList.pcCase13);
    static ExampleItemInfo i7 = new ExampleItemInfo(R.drawable.ic_pc, CPUList.c18, GPUList.g28, MotherboardList.m2, RAMList.ram1, SSDList.ssd10, HDDList.hdd2, CoolantList.coolant16, PowerSupplyList.ps9, PcCaseList.pcCase14);





    static {
        //add all builds
        BuildsList.add(b1);
        BuildsList.add(b2);
        BuildsList.add(b3);
        BuildsList.add(b4);
        BuildsList.add(b5);
        BuildsList.add(b6);
        BuildsList.add(b7);

        //******************************************************

        BuildsListInfo.add(i1);
        BuildsListInfo.add(i2);
        BuildsListInfo.add(i3);
        BuildsListInfo.add(i4);
        BuildsListInfo.add(i5);
        BuildsListInfo.add(i6);
        BuildsListInfo.add(i7);
    }

    private static String getP7() {
        int temp = 0;
        temp = CPUList.c18.getPrice() + GPUList.g28.getPrice() + CoolantList.coolant16.getPrice() + MotherboardList.m2.getPrice() + RAMList.ram1.getPrice() + SSDList.ssd10.getPrice()
                + PowerSupplyList.ps9.getPrice() + HDDList.hdd2.getPrice() + PcCaseList.pcCase14.getPrice();
        return Integer.valueOf(temp).toString();
    }

    private static String getP6() {
        int temp = 0;
        temp = CPUList.c18.getPrice() + GPUList.g27.getPrice() + CoolantList.coolant16.getPrice() + MotherboardList.m2.getPrice() + RAMList.ram1.getPrice() + SSDList.ssd4.getPrice()
                + PowerSupplyList.ps9.getPrice() + HDDList.hdd2.getPrice() + PcCaseList.pcCase13.getPrice();
        return Integer.valueOf(temp).toString();
    }

    private static String getP5() {
        int temp = 0;
        temp = CPUList.c2.getPrice() + GPUList.g21.getPrice() + MotherboardList.m4.getPrice() + RAMList.ram2.getPrice() + SSDList.ssd2.getPrice() + PowerSupplyList.ps4.getPrice()
                + HDDList.hdd2.getPrice() + PcCaseList.pcCase12.getPrice();
        return Integer.valueOf(temp).toString();
    }

    private static String getP4() {
        int temp = 0;
        temp = CPUList.c6.getPrice() + GPUList.g12.getPrice() + MotherboardList.m12.getPrice() + RAMList.ram9.getPrice() + SSDList.ssd9.getPrice() + PowerSupplyList.ps3.getPrice()
                + PcCaseList.pcCase11.getPrice() + HDDList.hdd2.getPrice();
        return Integer.valueOf(temp).toString();
    }

    private static String getP3() {
        int temp = 0;
        temp = CPUList.c1.getPrice() + GPUList.g9.getPrice() + MotherboardList.m11.getPrice() + RAMList.ram3.getPrice() + SSDList.ssd9.getPrice() + PowerSupplyList.ps8.getPrice()
                + PcCaseList.pcCase10.getPrice();
        return Integer.valueOf(temp).toString();
    }

    private static String getP2() {
        int temp = 0;
        temp = MotherboardList.m10.getPrice() + CPUList.c5.getPrice() + GPUList.g5.getPrice() + RAMList.ram8.getPrice() + SSDList.ssd8.getPrice() + PowerSupplyList.ps8.getPrice()
                + PcCaseList.pcCase9.getPrice();
        return Integer.valueOf(temp).toString();
    }

    private static String getP1() {
        int temp = 0;
        temp = CPUList.c1.getPrice() + GPUList.g12.getPrice() + MotherboardList.m9.getPrice() + RAMList.ram7.getPrice() + SSDList.ssd1.getPrice() + HDDList.hdd1.getPrice()
                + PowerSupplyList.ps7.getPrice() + PcCaseList.pcCase8.getPrice();
        return Integer.valueOf(temp).toString();
    }
}
