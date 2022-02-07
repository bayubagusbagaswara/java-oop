# Interface

- Sebelumnya kita sudah tahu bawhwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya
- Namun sebenarnya yang lebih tepat untuk kontrak adalah Interface
- Jangan salah sangka bahwa interface disini bukanlan User Interface
- Interface mirip seperti abstract class, yang membedakan adalah di Interface, semua method otomatis abstract, tidak memiliki block
- Di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
- Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements
- di interface tidak boleh ada field, adanya field yang constant atau datanya tidak bisa diubah-ubah lagi 
- method di interface otomatis bersifat abstract public semua 
- abstract artinya hanya boleh di inisialisasi, tanpa boleh di deklarasikan atau diisi blok methodnya