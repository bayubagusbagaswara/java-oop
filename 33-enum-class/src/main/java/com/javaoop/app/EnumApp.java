package com.javaoop.app;

import com.javaoop.data.Customer;
import com.javaoop.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        // create object Customer
        Customer customer = new Customer();

        // set name customer
        customer.setName("Bayu Bagaswara");

        // set level customer with enum data
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        System.out.println("====================");

        // create object customer1
        Customer customer1 = new Customer();

        // set name and level customer1
        customer1.setName("Nikola Tesla");
        customer1.setLevel(Level.PREMIUM);

        System.out.println("Name : " + customer1.getName());
        System.out.println("Level : " + customer1.getLevel());
        System.out.println("Description : " + customer1.getLevel().getDescription());

        // jika mau ambil nama Enumnya, pake fungsi name(), outputnya sudah String
        String levelString = Level.PREMIUM.name();
        System.out.println("Name enum : " + levelString);

        // KONVERSI ENUM KE STRING
        // menggunakan function valueOf dan masukkan isinya enumnya apa
        Level level = Level.valueOf("STANDARD");
        System.out.println("Level : " + level);

        // Jika ingin mengetahui semua data Enumnya dan disimpan dalam Array, pake values()
        System.out.println("PRINT SEMUA ENUM LEVEL");
        Level[] values = Level.values();
        for (var value : values) {
            System.out.println("Enum : " + value);
        }
    }
}
