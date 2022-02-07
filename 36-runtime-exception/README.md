# Jenis Exception

Secara garis besar, di Java itu exception dibagi menjadi 3 jenis:

- Checked Exception, yaitu exception yang wajib di try catch
- Runtime Exception
- Error

# Runtime Exception

- Runtime Exception adalah jenis exception yang tidak wajib di tangkap menggunakan try-catch
- Compiler Java tidak akan protes walaupun kita tidak menggunakan try-catch ketika kita memanggil method yang bisa menyebabkan runtime exception
- Untuk membuat class runtime exception, kita wajib meng-extends class RuntimeException
- Ada banyak di Java yang merupakan runtime exception, seperti `NullPointerException`, `IllegalArgumentException`, dan lain-lain

# Perlu Diperhatikan

- Walaupun tidak wajib try catch, ada Baiknya tetap membuat try catch
- Karena jika terjadi error runtime exception, yang ditakutkan adalah program kita berhenti total
- Biasanya akan dijadikan satu tempat namanya Error Handler