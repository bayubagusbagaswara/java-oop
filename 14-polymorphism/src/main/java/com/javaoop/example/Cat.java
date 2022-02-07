package com.javaoop.example;

public class Cat extends Animal {

    // Menggunakan method dari kelas induk abstrak
    @Override
    public void munculSuara() {
        System.out.println("Suara Burung: Cit...cit..cit.");
    }

}
