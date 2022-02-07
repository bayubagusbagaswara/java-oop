package com.javaoop;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceApp {
    public static void main(String[] args) {

        // Kedua coba OTOMATIS CLOSE RESOURCE
        // dengan menggunakan Try With Resource, kita bsia menghapus block finally, tapi fungsinya masih terjaga
        // Cara membuat try with resource:
        // pada block Try, tambahkan inisialisasi instance object untuk membuka dan membaca file mengugnakan BufferedReader
        // serta tammbahkan sumber filenya
        // Kenapa kok bisa otomatis close?
        // karena sebenarnya object BufferedReader itu adalah turunan dari Autoclosable()
        // Artinya, setelah BufferedReader selesai membuka dan membaca file, maka akan di close otomatis
        // Setelah block catch dijalankan, program berhenti karena langsung di close

        try (BufferedReader reader = new BufferedReader(new FileReader("note.txt"))){
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable){
            System.out.println("Error membaca file " + throwable.getMessage());
        }
    }
}
