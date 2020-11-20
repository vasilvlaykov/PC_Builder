package com.example.pcbuildervasvlay;

public class RAM {
    private String name;
    private String RAMCompatibility;
    private int price;

    public RAM (String name, String RAMCompatibility, int price) {
        this.name = name;
        this.RAMCompatibility = RAMCompatibility;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
