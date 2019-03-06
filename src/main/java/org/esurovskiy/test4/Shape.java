package org.esurovskiy.test4;

public class Shape {
    private String shapeColor;

    public Shape(String color) {
        shapeColor = color;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "Shape color is:" + shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

}
