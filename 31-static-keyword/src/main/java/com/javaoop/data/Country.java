package com.javaoop.data;

/**
 * Static Inner Class
 * Country sebagai Outer Class, yang tidak bisa diset Static
 * City sebagai Inner Class dari Country, bisa diset Static
 */
public class Country {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * City adalah Inner Class yang diset Static
     * Jika Inner Class sudah Static, maka dia sudah tidak bisa akses data di Outer Class
     * Object City tidak bisa lagi akses data di Object Country
     */
    public static class City {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
