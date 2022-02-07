package com.javaoop.app;

public class PolymorphismStaticApp {
    public static void main(String[] args) {

        System.out.println(maxNumber(5.5, 7.5));
        System.out.println(maxNumber(10, 20));

        int perkalian1 = perkalian(5, 10);
        int perkalian2 = perkalian(2, 5, 10);
        System.out.println(perkalian1);
        System.out.println(perkalian2);
    }

    // Method Overloading
    // Method sama namun parameter berbeda
    // Tipe data double
    static double maxNumber(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Method Overloading
    // Method sama, namun parameter berbeda
    // Tipe data int
    static int maxNumber(int a, int b) {
        if (a < b){
            return a;
        }else {
            return b;
        }
    }

    // Method Overloading, nama method sama, jumlah parameter berbeda
    static int perkalian(int a, int b){
        return a * b;
    }

    // Method Overloading, nama method sama, jumlah parameter berbeda
    static int perkalian(int a, int b, int c){
        return a * b * c;
    }

}
