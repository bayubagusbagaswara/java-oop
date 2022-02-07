package com.javaoop;

public class Person {

    String name;
    String address;
    final String country = "Indonesia";

    // constructor with 2 parameter
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    // constructor overloading with one parameter
    Person(String paramName) {
        // memanggil constructor 2 parameter, tetapi paramAddress di set null
        this(paramName, null);
    }

    // constructor overloading without parameter
    Person() {
        // memanggil constructor 1 parameter, tetapi parameternya di set null
        this(null);
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
