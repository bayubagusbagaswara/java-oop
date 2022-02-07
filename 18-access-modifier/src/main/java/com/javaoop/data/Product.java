package com.javaoop.data;

/**
 * dalam 1 file, hanya boleh 1 class yang Public
 * saran, sebaiknya bikin 1 file itu hanya 1 class
 * dan nama class nya harus sama dengan nama file java nya
 */
public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
