package com.javaoop.app;

import com.javaoop.data.Manager;
import com.javaoop.data.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {

        Manager manager = new Manager("Bayu");
        manager.sayHello("Aan");

        // saat membuat object vice president bisa memasukkan parameter di constructor
        // constructor nya memanggil class parent
        VicePresident vicePresident = new VicePresident("Bagaswara");

        vicePresident.sayHello("Aan");

        // parameter constructor bisa diisi null
        VicePresident vicePresident1 = new VicePresident("Bagus", null);
        vicePresident1.sayHello("Aan");
    }
}
