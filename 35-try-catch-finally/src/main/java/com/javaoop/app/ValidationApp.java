package com.javaoop.app;

import com.javaoop.data.LoginRequest;
import com.javaoop.data.ValidationException;
import com.javaoop.data.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        // jika username atau password null, maka akan terjadi exception
        LoginRequest loginRequest = new LoginRequest("newton","secret");
        LoginRequest loginRequest1 = new LoginRequest("albert",null);

        try {
            // jika object login request menghasilkan error, maka akan langsung dilempar ke block catch
            // dan kode program dibawahnya tidak akan dieksekusi
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException exception) {
            System.out.println("Terjadi Error dengan pesan : " + exception.getMessage());
        }
    }
}
