package com.javaoop.app;

import com.javaoop.data.Fortuner;
import com.javaoop.data.Car;

public class CarApp {
    public static void main(String[] args) {

        // create object Fortuner dengan tipe data Car atau Polymorphism
        // Jadi Car nanti bisa berwujud banyak jenis Car, misal Avanza

        // Car car = new Car(); // tidak bisa
        Car car = new Fortuner();
        System.out.println(car.getTire());
        car.drive();
    }
}
