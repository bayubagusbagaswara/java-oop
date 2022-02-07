package com.javaoop.example;

public class Bird extends Animal {

    // Menggunakan method dari kelas induk abstrak
    @Override
    public void munculSuara() {
        System.out.println("Suara Kucing: Meow...meow..meow.");
    }

}
