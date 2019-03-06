package org.esurovskiy.test4;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Rectangle1 extends Quadrix {

    public Rectangle1(final int a, final int b) {
        super(a, b, a, b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int square() {
        return getA() * getB();
    }
}
