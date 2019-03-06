package org.esurovskiy.test1;

import java.util.Random;

public class Car {
    private final Random color = new Random();

    public static Car DEFAULT_CAR = new Car();


    public Car(){
    }
    public Car(int a){

    }

    public static void getColor(){
        System.out.println("Get color");
    }
}
