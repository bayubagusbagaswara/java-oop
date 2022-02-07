package com.javaoop.app;

import com.javaoop.data.Rectangle;
import com.javaoop.data.Shape;

public class ShapeApp {
    public static void main(String[] args) {

        var shape = new Shape();
        System.out.println("Get Corner Parent : " + shape.getCorner()); // 0

        var rectangle = new Rectangle();
        System.out.println("Get Corner Child : " + rectangle.getCorner()); // 4
        System.out.println("Get Corner Child Super Parent : " + rectangle.getParentCorner()); // 0
    }
}
