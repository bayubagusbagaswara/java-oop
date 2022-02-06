package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        var person = new Person();

        person.name = "Bayu Bagaswara";
        person.address = "Kediri";

        // panggil method sayHello milik object person
        person.sayHello("Budi");

    }
}
