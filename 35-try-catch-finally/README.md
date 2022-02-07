# Try Catch

- Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression di Java
- Ini gunannya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka secara otomatis program kita akan terhenti
- Cara menggunakan try-catch expression di Java sangatlah mudah
- Di block `try`, kita cukup penggil method yang bisa menyebabkan exception
- Dan di block `catch`, kita bisa melakukan sesuatu jika terjadi exception, misal menampilkan pesan exception nya

# Finally Keyword

- Dalam try-catch, kita bisa menambahkan block finally
- Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak
- Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses maupun gagal
- Misalnya di block `try` kita ingin membaca file, dan di block `catch` kita akan tangkap jika terjadi error. Dan di block `finally` jika terjadi error ataupun sukses membaca file, kita wajib untuk menutup koneksi ke file tersebut, agar tidak menggantung di memory