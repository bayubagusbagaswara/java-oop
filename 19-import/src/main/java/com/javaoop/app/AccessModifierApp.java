package com.javaoop.app;

import com.javaoop.data.Product;
import com.javaoop.data.ProductPrivate;
import com.javaoop.data.ProductProtected;

public class AccessModifierApp {
    public static void main(String[] args) {

        Product product = new Product("Indomie", 5000);
        System.out.println(product.name);
        System.out.println(product.price);

        ProductProtected productProtected = new ProductProtected("Bakso", 8000);

        ProductPrivate productPrivate = new ProductPrivate("Soto", 10000);

    }
}
