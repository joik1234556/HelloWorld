package org.esurovskiy.test4;

public class Square extends Rectangle {
    public Square(final String color, final double width) {
        super(color, width, width);
    }

    @Override
    public void setWidth(final double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(final double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
