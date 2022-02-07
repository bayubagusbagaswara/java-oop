package com.javaoop.app;

import com.javaoop.data.Product;

public class ProductApp {
    public static void main(String[] args) {

        // create object product
        Product product = new Product("Indomie", 5000);

        // create object product1
        Product product1 = new Product("Indomie", 5000);

        // compare product & product1
        System.out.println("Equals : " + product.equals(product1)); // true, karena sama field atau atributnya
        System.out.println("HashCode : " + (product.hashCode() == product1.hashCode())); // true
        System.out.println("HashCode product : " + product.hashCode());
        System.out.println("HashCode product 1 : " + product1.hashCode());

        // create object product2
        Product product2 = new Product("Indomie", 3000);

        // compare product1 & product2
        System.out.println("Equals : " + product1.equals(product2)); // false, karena isinya beda
        System.out.println("HashCode : " + (product1.hashCode() == product2.hashCode()));
        System.out.println("HashCode product1 : " + product1.hashCode());
        System.out.println("HashCode product2 : " + product2.hashCode());
    }
}
