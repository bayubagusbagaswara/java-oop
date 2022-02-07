package com.javaoop.data;

public class LoginRequest {

    private String username;
    private String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Membuat object login request");
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

    public void sayHello(String name){
        System.out.println("Hai " + name + " username Anda = " + this.username);
    }

    @Override
    public String toString() {
        return "LoginRequest1{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
