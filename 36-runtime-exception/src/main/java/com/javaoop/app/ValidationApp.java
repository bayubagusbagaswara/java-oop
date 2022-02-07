package com.javaoop.app;

import com.javaoop.data.LoginRequest;
import com.javaoop.data.ValidationCheckedUtil;
import com.javaoop.data.ValidationException;
import com.javaoop.data.ValidationRuntimeUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("albert","secret");

        // 1. CheckedException, adalah exception yang wajib di try catch
        try {
            ValidationCheckedUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e){
            System.out.println("Data Tidak Valid : " + e.getMessage());
        } finally {
            System.out.println("Finally selalu di eksekusi");
        }

        // 2. RuntimeException, tanpa perlu menggunakan Try Catch
        LoginRequest loginRequest1 = new LoginRequest("newton","secret");
        ValidationRuntimeUtil.validateRuntime(loginRequest1);

        // jika gagal validate atau terjadi error, maka kode program dibawahnya tidak akan dieksekusi
        // misal username tidak valid, maka aplikasi langsung mati
        System.out.println("Sukses tidak terjadi RuntimeException, Data Valid");

    }
}
