package org.esurovskiy.test4;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Circle extends Shape {
    private double radius;

    public Circle(final String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + getShapeColor() + ", radius=" + radius +
                "\nShape area is: " + calcArea();
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }
}
