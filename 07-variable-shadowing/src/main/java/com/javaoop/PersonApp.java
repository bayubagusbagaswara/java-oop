package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        var person = new Person("Bayu", "Kediri");

        person.sayHello("Budi");

        System.out.println(person.name); // null, field name di class tidak berubah
        System.out.println(person.address); // null, field address di class tidak berubah
    }
}
