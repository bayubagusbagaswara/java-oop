package com.javaoop.data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Membuat Annotation berisi informasi tambahan, biasanya metadata
 * buatnya harus ditambahkan @interface
 * @Target() memberitahu kalau dia ada dimana, dan tipenya Array
 * @Retention() adalah informasi Annotation nya, akan dimasukkan ke dalam class hasil compilasi, dan saat dijalankan
 */
@Retention(RetentionPolicy.RUNTIME) // artinya annotation akan dimasukkan ke class hasil kompilasi program dan saat dijalankan kita bisa ambil informasinya
@Target({ElementType.TYPE}) // artinya target di type, bisa Class, Interface, Enum
public @interface Fancy {

    // jadi saat orang ingin menggunakan Annotation Fancy, maka harus memasukkan atribut namenya

    // tambahkan field ke Annotation nya
    String name();

    // tambahkan default value ke Annotation
    String[] tags() default {
    };
}
