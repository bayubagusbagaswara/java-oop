package com.javaoop.data;

public class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("This Avanza drive");
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Brand is Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

}
