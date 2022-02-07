package com.javaoop.data;

public class Manager {

    public String name;
    public String address;

    public Manager(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Manager(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is " + this.name + " as Manager");
    }
}
