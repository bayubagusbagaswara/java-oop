package com.javaoop.data;

public class VicePresident extends Manager {

    // disini wajib memanggil super constructor di parent class
    // minimal satu constructor yang dipanggil di child class
    public VicePresident(String name) {
        super(name);
    }

    public VicePresident(String name, String address) {
        super(name, address);
    }

    public void sayHello(String name) {
        System.out.println("Hai " + name + ", my name is " + this.name + " as Vice President.");
    }
}
