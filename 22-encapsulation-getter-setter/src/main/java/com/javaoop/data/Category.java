package com.javaoop.data;

public class Category {

    // semua field harus diset sebagai private, agar data terjaga keamanannya, tidak bisa bisa diubah dari sembarang tempat
    private String id;
    private boolean expensive;

    // method getter
    public String getId() {
        return id;
    }

    // method setter
    public void setId(String id) {
        // Contoh Validation menggunakan Setter
        // data baru bisa diterima jika tidak null atau datanya ada
        if (id != null){
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
