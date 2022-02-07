package com.javaoop.data;

import java.lang.reflect.Field;

public class ValidationUtil {

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new BlankException("Username can not blank");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new BlankException("Password can not blank");
        }
    }

    // Method validationReflection untuk memvalidasi object menggunakan Reflection
    // dengan reflection bisa di otomatisasi pengecekannya
    public static void validationReflection(Object object) {

        // getClass untuk mendapatkan class Reflection

        Class aClass = object.getClass();

        // getDeclaredFields untuk mendapatkan semua field dari class Reflection

        Field[] fields = aClass.getDeclaredFields();

        // cek satu per satu fieldnya yang memiliki Annotation NotBlank, kemudian lakukan validasi
        // untuk melakukan validasi, pastikan fieldnya tidak boleh data yang kosong
        // artinya cukup cek field yang mempunyai annotation NotBlank
        for (var field : fields) {
            // paksa fieldnya agar bisa diakses, karena ada field yang private
            field.setAccessible(true);

            // baca fieldnya, apakah ada annotation NotBlank atau tidak
            if (field.getAnnotation(NotBlank.class) != null){
                try {
                    // ambil type parameter objectnya, dan konversi ke object String
                    String value = (String) field.get(object);

                    // jika fieldnya kosong atau tidak memiliki annotation NotBlank, maka throw exception BlankException
                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e){
                    // jika error saat ingin mengambil data field dari object
                    System.out.println("Tidak bisa mengakses field " + field.getName() + " dari object");
                }
            }
        }
    }
}
