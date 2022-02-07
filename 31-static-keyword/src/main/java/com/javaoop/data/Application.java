package com.javaoop.data;

/**
 * Static Block, otomatis dieksekusi ketika sebuah class di load
 */
public class Application {

    // Field Static, data field PROCESSORS didapatkan dari block static
    public static final int PROCESSORS;

    // Static Block, block ini akan dieksekusi sekali saat pertama kali Class Application di Load
    static {
        // field PROCESSORS akan diisi dari code yang ditulis di Block Static ini
        PROCESSORS = Runtime.getRuntime().availableProcessors();
        System.out.println("Mengakses class Application");
    }
}
