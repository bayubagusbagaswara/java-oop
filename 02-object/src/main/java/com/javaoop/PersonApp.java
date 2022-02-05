package com.javaoop;

public class PersonApp {
    public static void main(String[] args) {

        // Membuat object Person dan simpan ke dalam variable person1
        var person1 = new Person();

        // Membuat object Person dan simpan ke dalam variable person2
        // Person disini adalah tipe data dari variable person2
        Person person2 = new Person();

        // Membuat object Person dan simpan ke dalam variable person3
        Person person3;
        person3 = new Person();

        // posisi object di alamat memori nya
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
