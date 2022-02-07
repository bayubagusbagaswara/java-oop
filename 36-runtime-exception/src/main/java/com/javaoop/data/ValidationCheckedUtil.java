package com.javaoop.data;

public class ValidationCheckedUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.getUsername() == null){
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isBlank()){
            throw new ValidationException("Username can not blank");
        } else if (loginRequest.getPassword() == null){
            throw new NullPointerException("Password is null");
        } else if (loginRequest.getPassword().isBlank()){
            throw new ValidationException("Password can not blank");
        }
    }
}
