package com.javaoop.app;

import com.javaoop.data.Manager;
import com.javaoop.data.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Bayu";
        manager.sayHello("Budi");

        // object vice president memiliki data inherit dari manager
        var vp = new VicePresident();
        vp.name = "Joko";
        vp.sayHello("Budi");
    }
}
