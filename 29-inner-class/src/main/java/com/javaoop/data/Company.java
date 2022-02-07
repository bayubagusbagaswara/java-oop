package com.javaoop.data;

/**
 * Company as Outer class
 */
public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Employee as Inner Class
    // Employee membutuhkan class Company
    public class Employee {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // method getCompany mengambil data field name milik class Company
        // Keuntungan Inner class, kita bisa mengakses seluruh data yang berada di Outer classnya
        // meskipun di outer class itu adalah private field ataupun method
        public String getCompany(){
            // artinya this akan mengacu ke data Object Company
            return Company.this.getName();
        }
    }
}
