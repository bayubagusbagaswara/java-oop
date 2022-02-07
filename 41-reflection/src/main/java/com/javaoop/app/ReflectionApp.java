package com.javaoop.app;

import com.javaoop.data.CreateUserRequest;
import com.javaoop.data.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        // create object reques
        CreateUserRequest request = new CreateUserRequest();

        request.setUsername("bayu");
        request.setPassword("rahasia");
        request.setName("bayu");

        // validasi, cukup panggil method validationReflection
        ValidationUtil.validationReflection(request);
    }
}
