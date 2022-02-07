package com.javaoop.app;

import com.javaoop.data.Product;

public class ProductApp {
    public static void main(String[] args) {

        Product product = new Product("Indomie", 5000);

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        // cetak object product, hasilnya ada informasi data field instance object product
        System.out.println(product);
    }
}
