package com.javaoop.app;

import com.javaoop.data.Employee;
import com.javaoop.data.Manager;
import com.javaoop.data.VicePresident;

public class PolymorphismApp {
    public static void main(String[] args) {

        // object employee bisa berubah bentuk menjadi manager ataupun vice president
        // karena manager dan vice president memiliki tururan dari employee sebagai class paling parent nya
        Employee employee = new Employee("Albert");
        employee.sayHello("Newton"); // sayHello milik Employee class

        // Employee employee = new Manager();
        employee = new Manager("Tesla");
        employee.sayHello("Newton"); // sayHello milik Manager class

        // Employee employee = new VicePresident();
        employee = new VicePresident("Pascal");
        employee.sayHello("Newton"); // sayHello milik VicePresident class

        System.out.println("================");

        // object vice president juga bisa berubah bentuk
        VicePresident vicePresident = new VicePresident("Pascal");
        vicePresident.sayHello("Newton");


        // POLYMORPHISM FUNCTION
        // function nya bisa berubah bentuk
        // parameter method sayHello bisa berubah bentuk, asal tipe data parameter berupa class paling Parent nya (hirarki paling atas)
        sayHello(new Employee("Bayu Employee"));
        sayHello(new Manager("Bagus Manager"));
        sayHello(new VicePresident("Bagaswara Vice President"));
    }

    // method sayHello memiliki parameter yang bisa Polymorphism
    // karena tipe parameter nya adalah Employee, maka semua class turunan dari Employee bisa menggunakan method sayHello
    static void sayHello(Employee employee) {
        System.out.println("Hello "  + employee.name);
    }
}
