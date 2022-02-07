package com.javaoop.app;

import com.javaoop.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // create object from anonymous class
        // HelloWorld is an interface
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello without parameter");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Bayu");
    }
}
