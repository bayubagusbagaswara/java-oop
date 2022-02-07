# Enum Class

- Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
- Misalnya seperti data gender, ada male dan female saja. Atau tipe customer, ada standard, premium atau vip, dan lain-lain
- Dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang sudah ditentukan
- Saat membuat enum class, secara otomatis dia akan meng-extends class java.lang.Enum
- Oleh karena itu, class enum tidak bisa extends class yang lain. Namun masih tetap bisa implements sebuah interface

# Enum Members

- Sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method, dan constructor)
- Khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebas