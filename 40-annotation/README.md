# Annotation

- Annotation adalah menambahkan metadata ke kode program yang kita buat
- Biasanya Annotation digunakan saat kita ingin membuat library atau framework
- Annotation sendiri bisa diakses menggunakan Reflection
- Untuk membuat annotation bisa menggunakan kata kunci @interface 
- Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value

## Attribut Annotation

- @Target : memberitahu annotation  bisa digunakan dimana? Class, method, field, dan lain-lain
- @Retention : memberitahu annotation apakah disimpan di hasil kompilasi dan apakah bisa dibaca oleh reflection?