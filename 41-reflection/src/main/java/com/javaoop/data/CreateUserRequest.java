package com.javaoop.data;

public class CreateUserRequest {

    // username, password, dan name tidak boleh kosong
    @NotBlank
    private String username, password, name;

    public CreateUserRequest() {
        System.out.println("Success create user request");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
