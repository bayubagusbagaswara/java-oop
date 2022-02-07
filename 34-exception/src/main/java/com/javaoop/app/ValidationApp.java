package com.javaoop.app;

import com.javaoop.data.LoginRequest;
import com.javaoop.data.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        // create object login request
        LoginRequest loginRequest = new LoginRequest(null, null);

        // untuk melakukan validasi, cukup panggil method validate milik class ValidationUtil
        // lalu masukkan object login request sebagai parameter method nya

        // ValidationUtil.validate(loginRequest);

        // saat memanggil method validate, akan terjadi error
        // karena kita butuh sebuah cara untuk menangkap errornya tersebut
        // kita bahas di materi selanjutnya
    }
}
