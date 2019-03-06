package org.esurovskiy.test2;

import org.test3.Bird;

public class Duck extends Bird {
    public Duck() {
        super("duck name");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Ходить как утка");
    }



    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", hz=" + hz +
                '}';
    }

    void print() {
        walk();
        swim();
        System.out.println(name);
        System.out.println(color);
        System.out.println(hz);
    }
}
