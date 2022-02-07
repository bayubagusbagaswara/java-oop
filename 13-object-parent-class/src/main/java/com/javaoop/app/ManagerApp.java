package com.javaoop.app;

import com.javaoop.data.Manager;
import com.javaoop.data.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {

        Manager manager = new Manager("Bayu");
        manager.sayHello("Aan");

        VicePresident vicePresident = new VicePresident("Bagaswara");
        vicePresident.sayHello("Aan");

        VicePresident vicePresident1 = new VicePresident("Bagus", null);
        vicePresident1.sayHello("Aan");

        // method toString adalah milik Object class yang berguna untuk mengubah menjadi String
        // akan tetapi, kita harus override dulu didalam class kita
        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicePresident);
        System.out.println(vicePresident.toString());
    }
}
