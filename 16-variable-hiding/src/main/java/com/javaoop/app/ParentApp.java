package com.javaoop.app;

import com.javaoop.data.Child;
import com.javaoop.data.Parent;

public class ParentApp {

    public static void main(String[] args) {

        Child child = new Child();
        child.name = "Bayu";
        child.doIt();
        System.out.println("Child name : " + child.name); // name di child

        // casts child to parent
        Parent parent = child;
        parent.doIt(); //  doIt milik child, karena object nya tetap child, bukan object parent
        System.out.println(parent.name); // name nya akan ditutupi oleh field name yang sama di parent class

        // Jadi, di parent kita memiliki variable name, dan di child juga punya variable name
        // saat kita cast child ke parent, maka:
        // 1. method doIt tetap mengakses overriding nya
        // 2. variable name beralih menjadi mengacu ke class saat ini
        // intinya di class child kita tidak bisa mengakses variable di class parent, jika nama variablenya sama
        // untuk bisa mengakses field di parent, maka gunakan keyword super
    }
}
