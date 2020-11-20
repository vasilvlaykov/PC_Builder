package com.example.pcbuildervasvlay;

public class ExampleItemInfo {
    private int mImageResource;
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private RAM ram;
    private SSD ssd;
    private HDD hdd;
    private Coolant coolant;
    private PowerSupply powerSupply;
    private PcCase pcCase;
    private String totalPrice;

    public ExampleItemInfo(int mImageResource, CPU cpu, GPU gpu, Motherboard motherboard, RAM ram, SSD ssd, HDD hdd, Coolant coolant, PowerSupply powerSupply, PcCase pcCase) {
        this.mImageResource = mImageResource;
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.coolant = coolant;
        this.powerSupply = powerSupply;
        this.pcCase = pcCase;
        int temp = cpu.getPrice() + gpu.getPrice() + motherboard.getPrice() + ssd.getPrice() + hdd.getPrice() + coolant.getPrice() + powerSupply.getPrice()
                            + pcCase.getPrice();
        this.totalPrice = Integer.valueOf(temp).toString();
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public CPU getCpu() {
        return cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setCoolant(Coolant coolant) {
        this.coolant = coolant;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setPcCase(PcCase pcCase) {
        this.pcCase = pcCase;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SSD getSsd() {
        return ssd;
    }

    public HDD getHdd() {
        return hdd;
    }

    public Coolant getCoolant() {
        return coolant;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public PcCase getPcCase() {
        return pcCase;
    }

    public String getTotalPrice() {
        return totalPrice;
    }
}
