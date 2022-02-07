package com.javaoop.app;

import com.javaoop.data.Employee;
import com.javaoop.data.Manager;
import com.javaoop.data.VicePresident;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Albert");
        employee.sayHello("Newton");

        employee = new Manager("Tesla");
        employee.sayHello("Newton");

        employee = new VicePresident("Pascal");
        employee.sayHello("Newton");

        System.out.println("================");

        // POLYMORPHISM FUNCTION

        sayHello(new Employee("Frank"));
        sayHello(new Manager("Frank"));
        sayHello(new VicePresident("Frank"));
    }

    static void sayHello(Employee employee) {

        // jika employee adalah instance dari class VicePresident
        if (employee instanceof VicePresident) {
            // konversi employee menjadi object VicePresident
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            // konversi employee menjadi object Manager
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            // employee sudah dalam bentuk object Employee
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
