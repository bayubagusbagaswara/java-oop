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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // Method Equals digunakan untuk mengcompare sebuah object
    // membandingkan object berdasarkan lokasi memorinya, meskipun field atau datanya sama tapi jika berbeda object maka dianggap berbeda (false)
    @Override
    public boolean equals(Object o) {
        // cek jika Object this (Object saat ini) sama dengan Object o (Object 2)
        // true apabila objectnya sama
        if (this == o) return true;

        // cek apabila object berbeda class, pasti false, dan pasti berbeda objectnya
        if (o == null || getClass() != o.getClass()) return false;

        // jika object nya sama, casts dulu ke tipe data Product, untuk memastikan saja
        Product product = (Product) o;

        // selanjutnya bisa compare satu-persatu field nya
        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        return result;
    }
}
