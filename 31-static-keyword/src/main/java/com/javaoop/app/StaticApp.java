package com.javaoop.app;

import com.javaoop.data.Application;
import com.javaoop.data.Constant;
import com.javaoop.data.Country;
import com.javaoop.data.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // Cara akses Static Field, tanpa harus buat object dari constant class terlebih dahulu
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        // Cara akses Static Method, tanpa perlu buat object dari MathUtil
        System.out.println(
                MathUtil.sum(1, 1, 1, 1, 1, 1)
        );

        // Cara akses Static Inner Class, tanpa perlu buat Object dari Outer Classnya.
        // tapi object City tidak bisa lagi akses Country
        Country.City city = new Country.City();
        city.setName("Jakarta");
        System.out.println(city.getName());

        // Cara akses Static Block, pada Static Block ini akan dieksekusi pertama saat Class Application di Load/dipanggil
        // setelah itu baru data field/method lainnya bisa dipanggil
        System.out.println(Application.PROCESSORS);
    }
}
