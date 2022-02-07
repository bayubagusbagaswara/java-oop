# Exception

- Saat kita membuat aplikasi, kita tidak akan terhindar dengan namanya error
- Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception
- Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
- Jika kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau turunan-turunannya

# Membuat Exception

- Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai dengan kata kunci throw diikuti dengan class exception nya
- Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambah lebih dari satu class exception
- Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw diikuti dengan object exception nya