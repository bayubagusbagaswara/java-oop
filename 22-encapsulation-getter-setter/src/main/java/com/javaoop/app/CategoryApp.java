package com.javaoop.app;

import com.javaoop.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        // buat Object
        var category = new Category();

        // ambil data fieldnya menggunakan Getter
        var getId = category.getId();
        System.out.println(getId); // null, belum diset

        // ubah data fieldnya menggunakan Setter
        category.setId("rahasia");
        System.out.println(category.getId());

        // coba validation, maka akan langsung di reject
        category.setId(null);
        System.out.println(category.getId()); // tetap menampilkan data lama
    }
}
