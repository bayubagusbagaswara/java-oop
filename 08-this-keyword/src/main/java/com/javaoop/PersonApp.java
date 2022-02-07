package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        var person = new Person("Bayu", "Kediri");

        person.sayHello("Budi");

        System.out.println(person.name); // Bayu
        System.out.println(person.address); // Kediri
    }
}
