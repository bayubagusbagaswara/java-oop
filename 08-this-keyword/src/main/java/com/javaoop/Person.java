package com.javaoop;

public class Person {

    String name;
    String address;
    final String country = "Indonesia";

    public Person(String name, String address) {
        // this merujuk ke object saat ini atau object yang sudah kita buat
        this.name = name;
        this.address = address;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }

}
