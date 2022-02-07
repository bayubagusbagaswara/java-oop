package com.javaoop.data;

public class ValidationUtil {

    // method validate untuk melakukan validasai object LoginRequest
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.getUsername() == null){
            // jika username null, maka lempar dan buat constructor ValidationException, sekaligus kirimkan pesan errornya di parameter
            throw new ValidationException("Username tidak boleh null");
        } else if (loginRequest.getUsername().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        } else if (loginRequest.getPassword() == null){
            throw new ValidationException("Password tidak boleh null");
        } else if (loginRequest.getPassword().isBlank()){
            throw new ValidationException("Password tidak boleh kosong");
        }
    }
}
