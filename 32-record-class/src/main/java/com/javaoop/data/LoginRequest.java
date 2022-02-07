package com.javaoop.data;

/**
 * LoginRequest memiliki constructor dengan parameter username dan password
 * parameter ini adalah data/field yang ada didalam record class LoginRequest
 */
public record LoginRequest(String username, String password) {

    // Compact Constructor, tanpa tanda kurung (), fungsinya jika kita ingin melakukan sebuah tindakan pada constructor tersebut
    public LoginRequest {
        System.out.println("Membuat Object LoginRequest");
    }

    // Constructor Overloading, syaratnya harus tetap memanggil constructor utama
    public LoginRequest(String username) {
        // ini akan mengakses constructor utama
        // meskipun passwordnya tidak diisi, tapi tetap dipanggil
        this(username, null);
    }

    public LoginRequest() {
        // manggil constructor utama juga, dengan data username dan password adalah null
        this("","");
    }

    // menambahkan method di record class
    public void sayHello(String name){
        // akses field pake this.
        System.out.println("Hai " + name + " username Anda = " + this.username);
    }

}
