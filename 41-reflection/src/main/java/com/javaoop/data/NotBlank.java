package com.javaoop.data;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Membuat Annotation
 * @Target annotation ini adalah di Fieldnya
 * @Retention untuk informasi semua class, file yakni Runtime, biar bisa dibaca oleh Reflection
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {
    // tidak perlu menambahkan apa-apa
}
