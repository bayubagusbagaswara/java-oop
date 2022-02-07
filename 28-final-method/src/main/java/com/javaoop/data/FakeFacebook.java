package com.javaoop.data;

/**
 * meskipun FakeFacebook extends terhadap Facebook, tetap tidak bisa override methodnya
 * karena method di Facebook sudah diset Final
 * jika memaksa untuk override, maka akan terjadi error
 */
public class FakeFacebook extends Facebook {

    // method override error
    // void login(String username, String password){    }
}
