package com.javaoop.data;

/**
 * class Facebook diset sebagai Final Class
 * sehingga tidak bisa diturunkan ke Class lainnya
 */
final public class Facebook extends SocialMedia {

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
