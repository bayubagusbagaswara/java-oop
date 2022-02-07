package com.javaoop.data;

/**
 * Static Method
 * tambahkan static sebelum definisi nama methodnya
 * method ini dapat diakses langsung tanpa perlu membuat Object MathUtil terlebih dahulu
 * untuk menggunakannya cukup panggil class ini, lalu ikuti dengan nama methodnya
 * contoh: MathUtil.sum()
 */

public class MathUtil {

    public static int sum(int... values){
        int total = 0;
        for (var value : values ) {
            total += value;
        }
        return total;
    }
}
