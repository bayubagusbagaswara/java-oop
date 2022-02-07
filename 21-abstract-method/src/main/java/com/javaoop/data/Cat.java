package com.javaoop.data;

public class Cat extends Animal {

    // override method abstract
    @Override
    public void run() {
        System.out.println("Cat " + name + " is run.");
    }
}
