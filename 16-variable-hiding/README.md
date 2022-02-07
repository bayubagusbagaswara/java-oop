# Variable Hiding

- Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field di class child itu sama dengan nama field di class parent nya
- Tdak ada yang namanya field overriding, ketika kita buat ulang nama field di class child, itu namanya adalah variable hiding
- Untuk mengatasi variable hiding, caranya adalah kita bisa menggunakan `super keyword`
- Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts (konversi)
- Saat object di casts, method akan tetap mengakses method overriding, tetapi variable akan mengakses variable yang ada di class nya 
- SARAN: jangan pernah bikin field yang sama di class turunan, bisa menyebabkan variable hiding