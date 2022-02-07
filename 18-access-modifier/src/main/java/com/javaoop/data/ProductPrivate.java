package com.javaoop.data;

/**
 * Private hanya bisa diakses dalam satu class yang sama
 * meskipun package sama, tetap tidak bisa diakses
 */
public class ProductPrivate {

    private String name;
    private int price;

    public ProductPrivate(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
