package com.javaoop.data;

public class VicePresident extends Manager {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is " + this.name + " as Vice President");
    }
}
