package com.javaoop;

public class Person {

    String name;
    String address;
    final String country = "Indonesia";

    // nama parameter sama dengan nama variable data class
    Person(String name, String address) {
        name = name; // field name tidak berubah
        address = address; // field address tidak berubah
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String name) {
        // field name tidak bisa diakses
        System.out.println("Hello " + name + ", My Name is " + name);
    }
}
