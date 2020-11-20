package com.example.pcbuildervasvlay;

import java.util.ArrayList;
import java.util.List;

public class PcCaseList {
    public static List<PcCase> PcCaseListAll = new ArrayList<>();


    static PcCase pcCase1 = new PcCase("Cooler Master Cosmos C700P", 300); //3
    static PcCase pcCase2 = new PcCase("Corsair Carbide 275R", 70); //1
    static PcCase pcCase3 = new PcCase("Phanteks Evolv X", 195); //2
    static PcCase pcCase4 = new PcCase("Cooler Master Silencio S600", 90); //1
    static PcCase pcCase5 = new PcCase("Corsair Obsidian 1000D", 450); //3
    static PcCase pcCase6 = new PcCase("be quiet! Dark Base Pro 900", 215); //3
    static PcCase pcCase7 = new PcCase("Lian-Li PC-011 Dynamic", 125); //2
    static PcCase pcCase8 = new PcCase("NZXT H510", 70); //1
    static PcCase pcCase9 = new PcCase("Thermaltake Versa H17 Black Micro ATX", 45); //1
    static PcCase pcCase10 = new PcCase("CoolerMaster MasterBox B320LARGB", 60); //1
    static PcCase pcCase11 = new PcCase("Phanteks P400 Midi-Tower", 85); //1
    static PcCase pcCase12 = new PcCase("NZXT H510 Elite", 150); //2
    static PcCase pcCase13 = new PcCase("Cooler Master MasterCase H500 ARGB", 120); //1
    static PcCase pcCase14 = new PcCase("Fractal Design Define S2 Vision RGB", 185); //2


    static {
        PcCaseListAll.add(pcCase2);
        PcCaseListAll.add(pcCase4);
        PcCaseListAll.add(pcCase8);
        PcCaseListAll.add(pcCase9);
        PcCaseListAll.add(pcCase10);
        PcCaseListAll.add(pcCase11);
        PcCaseListAll.add(pcCase13);
        PcCaseListAll.add(pcCase3);
        PcCaseListAll.add(pcCase7);
        PcCaseListAll.add(pcCase12);
        PcCaseListAll.add(pcCase14);
        PcCaseListAll.add(pcCase1);
        PcCaseListAll.add(pcCase5);
        PcCaseListAll.add(pcCase6);
    }
}
