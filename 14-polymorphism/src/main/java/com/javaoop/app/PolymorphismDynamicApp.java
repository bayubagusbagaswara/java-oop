package com.javaoop.app;

import com.javaoop.example.Animal;
import com.javaoop.example.Bird;
import com.javaoop.example.Cat;

public class PolymorphismDynamicApp {
    public static void main(String[] args) {

        // POLYMORPHISM
        // buat object Cat, tapi dengan tipe data Animal
        Animal cat = new Cat();
        cat.munculSuara(); // method Overriding munculSuara milik Cat class

        Animal bird = new Bird();
        bird.munculSuara(); // method Overriding munculSuara milik Bird class
    }
}
