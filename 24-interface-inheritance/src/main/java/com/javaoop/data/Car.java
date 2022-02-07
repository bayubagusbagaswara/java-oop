package com.javaoop.data;

public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTier();

    // default method, tidak wajib di override
    default boolean isBig(){
        return false;
    }
}
