package com.javaoop.app;

import com.javaoop.data.Facebook;

public class SocialMediaApp {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        facebook.setName("Bayu Bagus");
        System.out.println(facebook.getName());
    }
}
