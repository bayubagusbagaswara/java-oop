package com.javaoop.app;

import com.javaoop.data.Avanza;
import com.javaoop.data.Car;
import com.javaoop.data.Fancy;

/**
 * bisa menambahkan annotation di tingkat class
 */
@Fancy(name = "CarApp", tags ={"application", "java"})
public class CarApp {
    public static void main(String[] args) {

        Car avanza = new Avanza();
        avanza.drive();
        avanza.getTier();
    }
}
