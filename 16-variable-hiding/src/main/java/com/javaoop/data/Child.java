package com.javaoop.data;

public class Child extends Parent {

    public String name;

    // method overriding
    @Override
    public void doIt() {
        System.out.println("Do it from Child Class");
        // untuk akses variable name di class parent harus menggunakan super
        // kalau hanya menulis variable name, maka yang diakses adalah field name di class child ini
        System.out.println("Parent name is " + super.name);
    }
}
