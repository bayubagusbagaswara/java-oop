package com.javaoop.data;

public class Fortuner implements Car {

    // method di interface wajib di override semua
    @Override
    public void drive() {
        System.out.println("This Avanza drive");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
