# Error 

- Error adalah jenis exception yagn terakhir
- Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch
- Biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try-catch
- Artinya direkomendasikan untuk mematikan aplikasi nya
- Contoh, jika diawal aplikasi kita tidak bisa terkoneksi dengan database, maka direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi