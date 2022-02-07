package com.javaoop.app;

import com.javaoop.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        // create object login request and send parameter constructor
        LoginRequest loginRequest = new LoginRequest("Bayu", "rahasia");

        // toString automated in record class
         System.out.println(loginRequest);

         // method getter automated created in record class
         System.out.println(loginRequest.username());
         System.out.println(loginRequest.password());

        System.out.println("===================");

        // create object login request with constructor parameter
        LoginRequest loginRequest1 = new LoginRequest("albert","secret");

        System.out.println(loginRequest1.username());
        System.out.println(loginRequest1.password());
        System.out.println(loginRequest1);

        // create object login request with constructor 2 parameter
        LoginRequest loginRequest2 = new LoginRequest("newton", "newton");
        System.out.println(loginRequest2);

        // create object login request with constructor parameter username
        LoginRequest loginRequest3 = new LoginRequest("tesla");
        System.out.println(loginRequest3);

        // create object login request without parameter
        LoginRequest loginRequest4 = new LoginRequest();
        System.out.println(loginRequest4);
    }
}
