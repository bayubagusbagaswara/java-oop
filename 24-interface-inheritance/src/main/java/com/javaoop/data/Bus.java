package com.javaoop.data;

public class Bus implements Car {

    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTier() {
        return 8;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    // default method tidak wajib di override, dan bisa kita ubah isi block method nya
    @Override
    public boolean isBig() {
        return true;
    }
}
