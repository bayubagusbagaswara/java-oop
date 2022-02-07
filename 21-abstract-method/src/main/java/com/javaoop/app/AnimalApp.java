package com.javaoop.app;

import com.javaoop.data.Animal;
import com.javaoop.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Meong";
        animal.run();
    }
}
