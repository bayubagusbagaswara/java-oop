package com.javaoop.data;

public class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("This Mobilio drive");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "This Brand is Honda";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
