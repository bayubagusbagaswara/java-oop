package com.javaoop.data;

/**
 * Customer adalah Class yang mengambil dan menggunakan data Enum Level
 * data enum Level bisa diakses melalui instance object dari Customer
 */
public class Customer {

    public String name;
    public Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
