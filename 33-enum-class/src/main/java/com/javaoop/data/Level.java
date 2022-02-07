package com.javaoop.data;

/**
 * Level sebagai Enum Class
 * Fungsi enum adalah untuk menyimpan data-data yang terbatas nilainya
 * Enum tidak bisa extends Class lain, hanya bisa implement dari Interface
 */
public enum Level {

    // saat memanggil method Constructor, akan melakukan pembuatan enum Level, sekaligus mengirimkan parameter description
    // jadi di data enumnya harus ditulis sekaligus dengan descriptionnya

    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    // field
    private final String description;

    // constructor for create enum
    Level(String description){
        this.description = description;
    }

    // getter for take data description, return value is string
    public String getDescription() {
        return description;
    }
}
