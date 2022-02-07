package com.javaoop.app;

import com.javaoop.data.Product;
import com.javaoop.data.ProductPrivate;
import com.javaoop.data.ProductProtected;

public class AccessModifierApp {
    public static void main(String[] args) {

        // PUBLIC bisa diakses darimana saja
        Product product = new Product("Indomie", 5000);
        System.out.println(product.name);
        System.out.println(product.price);

        // PROTECTED tidak bisa akses field nya, karena beda package
        ProductProtected productProtected = new ProductProtected("Bakso", 8000);

        // PRIVATE tidak bisa akses field nya, karena beda class
        ProductPrivate productPrivate = new ProductPrivate("Soto", 10000);

    }
}
