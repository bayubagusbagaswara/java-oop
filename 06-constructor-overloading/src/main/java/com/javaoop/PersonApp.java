package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        // create object person with constructor 2 parameter
        var person = new Person("Bayu", "Kediri");

        // create object person with constructor 1 parameter
        Person person1 = new Person("Albert");

        // create object person without paramater
        Person person2 = new Person();

        person.name = "Bayu Bagaswara";
        person1.name = "Albert Einstein";
        person2.name = "Issac Newton";

        person.sayHello("Budi");
        person1.sayHello("Budi");
        person2.sayHello("Budi");

        System.out.println(person.name);
        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
