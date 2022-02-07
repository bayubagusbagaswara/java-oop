# Record Class

- Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode, dan toString method
- Record class digunakan untuk mempermudah pembuatan jenis class tersebut
- Saat kita membuat record class, secara otomatis Java akan membatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis
- Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface
- 
# Noted
- Record class digunakan untuk mempermudah jenis class yang berisikan data seperti getter, equals, hashCode, dan toString method
- saat membuat Record class, maka secara otomatis Java akan membuatkan getter, equals, hashCode, dan toString, dan juga Constructor 
- Record class itu sebenarnya Immutable (tidak bisa diubah-ubah lagi), makanya tidak ada method Setter
- Record Class itu harus punya `(wajib) constructor` ditandai dengan `tanda kurung ()`, kalau class biasa tidak ada
- dan harus ditulis parameternya, misal String username dan String password
- maka otomatis username dan password akan dibuatkan method yang lain

# Record Class Constructor

- Secara default, constructor di record class itu akan dibuat secara otomatis. Dan sesuai dengan definisi record class parameter
- Namun, jika kita ingin melakukan sesuatu di constructor tersebut, maka kita bisa `compact constructor`, yaitu `constructor tanpa tanda kurung ()`
- Selain itu, kita juga bisa melakukan constructor overloading
- Namun ada syarat untuk melakukan overloading, yaitu constructor overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di record class