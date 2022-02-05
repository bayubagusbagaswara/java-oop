package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        var person = new Person();

        // manipulasi data field milik object person
        person.name = "Bayu Bagaswara";
        person.address = "Kediri";
        // person.country = "Tidak bisa diubah"

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}
