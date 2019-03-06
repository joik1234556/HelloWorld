package org.esurovskiy.test1;

import org.esurovskiy.test2.Computer;

import java.util.Random;

public class Main1 {
    private final static int K;


    int i = 0;
    int b;

    static {
        K = 10 / new Random().nextInt(2);
    }


    public static void main(String[] args) {
        final Computer computer = new Computer(1);
        computer.manufacture = "12345";

    }
}

















