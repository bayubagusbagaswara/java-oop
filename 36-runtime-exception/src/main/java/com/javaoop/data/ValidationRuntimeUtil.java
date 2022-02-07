package com.javaoop.data;

public class ValidationRuntimeUtil {

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.getUsername() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.getUsername().isBlank()) {
            throw new BlankException("Username can not blank");
        } else if (loginRequest.getPassword() == null) {
            throw new NullPointerException("Password is null");
        } else if (loginRequest.getPassword().isBlank()) {
            throw new BlankException("Password can not blank");
        }
    }
}
