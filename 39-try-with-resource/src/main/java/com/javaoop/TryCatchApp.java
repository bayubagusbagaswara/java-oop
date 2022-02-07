package com.javaoop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchApp {
    public static void main(String[] args) {

        // Pertama kita coba MANUAL CLOSE RESOURCE dulu
        // Contoh: kita akan membaca sebuah file yang bernama note.txt
        // Manual Close Resource, ujung-ujungnya BufferedReader mempunyai extends close()
        // function close() akan dipanggil otomatis setelah Try Catch
        // BufferedReader sebenarnya adalah turunan dari autocloseable(), jadi menutup secara otomatis

        BufferedReader reader = null;

        try {
            // buat object untuk membuka dan membaca sebuah file
            reader = new BufferedReader(new FileReader("note.txt"));

            // setelah berhasil membuka file, maka kita baca isi file dengan cara perulangan
            // dan cara bacanya tiap line atau baris di filenya
            // while akan terus dieksekusi sampai barisnya kosong
            System.out.println("SUKSES BUKA FILE DAN MEMBACA ISI FILE");
            System.out.println();
            while (true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                // cetak hasil dari membaca file per barisnya
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error dalam membaca file" + throwable.getMessage());

        } finally {
            // setiap kali ingin membuat object untuk membaca sebuah file, maka cek terlebih dahulu
            // jika reader tidak sama dengan null, artinya sedang melakukan open dan read file dan setelah selesai membaca file, maka wajib ditutup
            if (reader != null) {
                try {
                    // filenya berhasil dibuka atau gagal, maka wajib ditutup, agar tidak menggantung di memory
                    reader.close();
                    System.out.println();
                    System.out.println("SUKSES MENUTUP FILE");
                } catch (IOException e){
                    System.out.println("Terjadi error saat menutup file " + e.getMessage());
                }
            }
        }
    }
}
