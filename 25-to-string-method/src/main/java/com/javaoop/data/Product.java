package com.javaoop.data;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * toString Method adalah method yang ada di dalam class Object Java
     * berguna untuk memberi informasi terhadap Object kita, yang isinya adalah field dalam object yang kita buat
     * kita bisa mengubah isi blok methodnya
     * @return berupa string dari field di object saat ini
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
