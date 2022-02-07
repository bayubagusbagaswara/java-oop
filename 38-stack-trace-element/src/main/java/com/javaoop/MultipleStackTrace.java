package com.javaoop;

public class MultipleStackTrace {
    public static void main(String[] args) {

        // jika memanggil function sampleError() pasti akan menyebabkan error
        // Oleh karena itu harus di try catch
        try {
            // Error Ketiga
            sampleError();
        } catch (RuntimeException exception) {
            // error ini berasal dari saat memanggil method sampleError()
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Albert", "Einstein", "Newton", "Tesla"
            };
            // Error Pertama, index out of bound dari array
            System.out.println(names[100]);

        } catch (Throwable throwable){
            // dari Throwable, lalu ingin menjadikan RuntimeException
            // Error Kedua, lempar bikin RuntimeException
            throw new RuntimeException(throwable);
        }
    }
}
