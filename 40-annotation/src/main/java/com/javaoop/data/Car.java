package com.javaoop.data;

/**
 * misal type interface, bisa menambahkan annotation
 */
@Fancy(name = "Car Interface", tags = {"application", "java"})
public interface Car extends HasBrand, IsMaintenance {

    void drive();
    int getTier();

    default boolean isBig(){return false;}
}
