package com.javaoop.data;

public class Rectangle extends Shape {

    // method overriding getCorner
    @Override
    public int getCorner() {
        return 4;
    }

    // method super getCorner
    public int getParentCorner() {
        return super.getCorner();
    }
}
