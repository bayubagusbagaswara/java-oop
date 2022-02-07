# StackTraceElement Class

- Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement object
- StackTraceElement berisikan informasi tentang class, file, bahkan baris lokasi terjadinya error
- Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
- Cara yang paling mudah, kita bisa memanggil method `printStackTrace()` class Throwable, untuk memprint ke console detail error StackTraceElement nya