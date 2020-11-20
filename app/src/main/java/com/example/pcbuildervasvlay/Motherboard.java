package com.example.pcbuildervasvlay;

public class Motherboard {
    private String name;
    private String manufacturer;
    private String RAMCompatibility;
    private int price;

    public Motherboard (String name, String manufacturer, String RAMCompatibility, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.RAMCompatibility = RAMCompatibility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getRAMCompatibility() {
        return RAMCompatibility;
    }

    public void setRAMCompatibility(String RAMCompatibility) {
        this.RAMCompatibility = RAMCompatibility;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
