package com.javaoop;

public class StackTraceApp {
    public static void main(String[] args) {

        try {
            // create variable array
            String[] names = {
                    "Albert", "Einstein", "Newton", "Tesla"
            };
            // coba akses isi Array name ke 100, karena data nya tidak ada
            // maka akan menyebabkan Error
            System.out.println(names[100]);

        } catch (Throwable throwable){
            // menangkap Errornya pake Class Throwable agar bisa menangkap semua jenis Errornya
            // pengen dapetin errornya, maka gunaakan method getStackTrace()
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            // jika pengen otomatis langsung dikasih tau letak errornya dimana
            throwable.printStackTrace(); // langsung mencetak semua Errornya
        }
    }
}
