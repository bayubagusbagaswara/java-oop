package com.javaoop.app;

import com.javaoop.data.City;

public class LocationApp {

    public static void main(String[] args) {

        // cannot create object from Location, because abstract class
        // var location = new Location(); // ERROR

        // create object City
        var city = new City();

        // field name milik abstract class Location
        city.name = "Jakarta";

        System.out.println("City Name : " + city.name);
    }
}
