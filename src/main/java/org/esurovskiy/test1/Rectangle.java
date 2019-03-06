package org.esurovskiy.test1;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public int calculateSquare() {
        print();
        return width * height;
    }

    public void print() {
        System.out.println("Width: " + width + " Height: " + height);

    }
}
