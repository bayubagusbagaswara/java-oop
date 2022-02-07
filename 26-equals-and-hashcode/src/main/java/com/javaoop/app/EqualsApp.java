package com.javaoop.app;

public class EqualsApp {
    public static void main(String[] args) {

        /**
         * compare untuk tipe data primitif menggunakan tanda sama dengan 2 kali (==)
         * compare untuk  tipe data buka primitif menggunakan Equals, termasuk tipe data object
         */

        // create object First, tipe data String
        String first = "Bayu";
        first = first + " " + "Bagaswara";
        System.out.println(first); // Bayu Bagaswara

        // create object Second, tipe data String
        String second = "Bayu Bagaswara";
        System.out.println(second); // Bayu Bagaswara

        // compare first & second
        System.out.println(first == second); // false

        /**
         * Kenapa first == second hasilnya false?
         * karena first dan second merupakan 2 Object yang berbeda
         * pake ==, membandingkan apakah Objectnya sama atau tidak
         * Jadi, yang dibandingkan bukan isinya, padahal isi stringnya sama
         */

        // buat object Third
        String third = "Bayu Bagaswara";
        System.out.println(third == second); // true

        /**
         * Kenapa third == second hasilnya true? padahal objectnya berbeda meski isi stringnya sama
         * hal tersebut terjadi karena Java mengoptimasi memori, jadi hanya ditulis 1 kali saja
         * jadi dia mereference ke Object yang sudah ada yakni object second
         * alhasil third == second adalah true
         */

        /**
         * PROBLEM diatas
         * Apakah object first sama dengan object second? false
         * Apakah object second sama dengan object third? true
         */

        /**
         * KESIMPULANNYA, karena STRING adalah tipe data Object
         * untuk meng-compare String lebih baik mengunakan Equals
         * jadi benar-benar Objectnya yang dibandingkan, dicek isi kontennya sama atau tidak
         */

        // Apakah object first sama dengan object second? true
        // Apakah object second sama dengan object third? true
        System.out.println(first.equals(second)); // true
        System.out.println(second.equals(third)); // true
    }
}
