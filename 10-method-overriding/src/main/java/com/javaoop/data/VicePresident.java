package com.javaoop.data;

/**
 * VicePresident inheritance terhadap Manager
 */
public class VicePresident extends Manager {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is VP " + this.name);
    }
}
