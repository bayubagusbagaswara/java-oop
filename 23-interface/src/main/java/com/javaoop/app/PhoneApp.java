package com.javaoop.app;

import com.javaoop.example.Nokia;
import com.javaoop.example.Phone;
import com.javaoop.example.UserHandphone;

import java.util.Scanner;

public class PhoneApp {

    public static void main(String[] args) {

        // create object Nokia tipe data interface Phone
        Phone nokia = new Nokia();

        // create object userhandphone with parameter object nokia
        // object user bayu bisa menggunakan fitur dari object nokia
        UserHandphone bayu = new UserHandphone(nokia);

        // Deklarasi variabel yang digunakan
        Scanner inputUser = new Scanner(System.in);
        String aksi;

        // Buat perulangan untuk menampilkan halaman secara terus-menerus
        while (true){
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------------");

            // User melakukan input
            System.out.print("Pilih aksi: ");
            aksi = inputUser.nextLine();

            if (aksi.equalsIgnoreCase("1")){
                // user bayu melakukan aksi mengaktifkan Handphone
                bayu.aktifkanHandphone();
            } else if (aksi.equalsIgnoreCase("2")){
                // user bayu melakukan aksi matikanHandphone
                bayu.matikanHandphone();
            } else if (aksi.equalsIgnoreCase("3")){
                // user bayu melakukan aksi volumeNaik
                bayu.volumeNaik();
            } else if (aksi.equalsIgnoreCase("4")){
                // user bayu melakukan aksi volumeTurun
                bayu.volumeTurun();
            } else {
                System.out.println("Kamu memilih aksi yang salah");
                System.exit(0);
            }
        }
    }
}
