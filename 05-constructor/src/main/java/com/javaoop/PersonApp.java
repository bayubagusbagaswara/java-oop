package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        // karena saat pertama kali object person dibuat itu kita memanggil method constructor
        // dan constructor butuh parameter, maka kita harus memasukkan data parameter nya
        var person = new Person("Bayu", "Kediri");

        person.name = "Bayu Bagaswara";

        person.sayHello("Budi");
    }
}
