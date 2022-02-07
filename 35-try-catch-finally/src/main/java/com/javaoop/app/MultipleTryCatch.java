package com.javaoop.app;

import com.javaoop.data.LoginRequest;
import com.javaoop.data.ValidationException;
import com.javaoop.data.ValidationUtil;

public class MultipleTryCatch {
    public static void main(String[] args) {

        // create object login request with parameter
        LoginRequest loginRequest = new LoginRequest("albert","secret");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception){
            // block catch can handle exception class ValidationException & NullPointerException
            System.out.println("Data invalid : " + exception.getMessage());
        } finally {
            // block finally akan selalu dieksekusi ketika sukses maupun error
            System.out.println("Finally akan selalu di eksekusi");
        }
    }
}
