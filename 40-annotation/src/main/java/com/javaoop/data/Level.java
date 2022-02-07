package com.javaoop.data;

/**
 * bisa menambahkan Annotation di enum juga, karena enum termasuk type juga
 */
public enum Level {
    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
