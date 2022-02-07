package com.javaoop.app;

import com.javaoop.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        // create object Company by Company OuterClass
        Company company = new Company();
        company.setName("PT Sejahtera");

        // create object employee by Employee InnerClass
        // Class Karyawan letaknya ada di dalam Class Company
        // instansiasi Object harus berdasarkan Object yang telah dibuat, yakni company
        Company.Employee employee = company.new Employee();
        employee.setName("Bayu Bagus");

        // bisa akses data milik Outer Class
        System.out.println("Name Employee : " + employee.getName());
        System.out.println("Name Company employee : " + employee.getCompany());
    }
}
