package com.javaoop.data;

/**
 * Protected hanya bisa diakses di package yang sama, diluar package sudah tidak bisa diakses
 * dan juga hanya class turunan (bisa beda package)
 */
public class ProductProtected {

    protected String name;
    protected int price;

    public ProductProtected(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
