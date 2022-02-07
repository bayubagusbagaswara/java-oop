package com.javaoop.app;

import com.javaoop.data.Avanza;
import com.javaoop.data.Bus;
import com.javaoop.data.Car;

public class CarApp {
    public static void main(String[] args) {

        // create object avanza with polymorphism
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
        System.out.println(car.isBig());

        Car bus = new Bus();
        System.out.println(bus.isBig());
    }
}
