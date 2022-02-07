# Interface Inheritance

- Sebelumnya kita sudah tahu kalau di Java, child class hanya bisa punya 1 class parent
- Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
- Bahkan interface pun bisa implement interface lain, bisa lebih dari 1
- Namun jika interface ingin mewarisi interface lain, kita menggunakan kata kunci extends, bukan implements

# Default Method

- Sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method konkrit yang memiliki block method
- Namun sejak versi Java 8, ada fitur default method di interface
- Fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang  implement interface tersebut
- Ketika kita menambah satu method di interface, maka secara otomatis semua class yang implement akan rusak, karena harus meng-override method tersebut
- Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface