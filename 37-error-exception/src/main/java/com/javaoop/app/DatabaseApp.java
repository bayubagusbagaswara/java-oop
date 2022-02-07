package com.javaoop.app;

import com.javaoop.data.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {

        // panggil method static connectDatabase
        // jika salah satu parameter kosong, maka tidak akan konek ke database, dan aplikasi akan mati
        connectDatabase("admin",null);
        System.out.println("Sukses konek");
    }

    // Method connectDatabase
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
