package com.javaoop.data;

public class Manager extends Employee {

    public String company;

    public Manager(String name) {
        super(name);
    }

    public Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is " + this.name + " as Manager");
    }
}
