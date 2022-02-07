# Equals Method

- Hal yang agak membingungkan di Java adalah cara membandingkan `(compare)` object
- Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama atau tidak, biasanya kita menggunakan operator `==` atau sama dengan
- Tetapi di Java, operator `==` hanya untuk mengecek/membandingkan tipe `data primitif`, seperti int, string, boolean, dll
- Sedangkan untuk tipe data `non primitif`, pengecekanna menggunakan method `equals`
- Dan secara default, method equals itu akan membandingkan dua object secara `kesamaan posisi object di memory`, artinya jika kita membuat 2 object yang isi fieldny sama, maka akan tetap dianggap berbeda oleh method equals
- Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut

# HashCode Method

- Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan representasi String, hashCode adalah representasi integer
- HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set, dan lain-lain, karena cukup menggunakan hashCode method untuk mendapatkan identitas unique object kita
- Secara default hashCode akan mengembalikan nilai integer sesuai data di memory
- Namun, kita bisa meng-override nya jika kita menginginkannya

# Kontrak HashCode Method

Tidak mudah meng-override method hashCode, karena ada kontraknya:

- Sebanyak apapun hashCode dipanggil, untuk object yang sama, maka harus menghasilkan data integer yang sama
- Jika ada 2 object yang sama, jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama
- Tidak wajib hashCode harus berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar 2 Milyar