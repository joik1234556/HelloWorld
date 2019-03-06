package org.esurovskiy.test2;

import org.test3.Bird;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        final HashMap<Bird, String> map = new HashMap<Bird, String>();
        map.put(new Bird("1"), "кг");
        map.put(new Bird("2"), "г");
        map.put(new Bird("3"), "см");
        System.out.println(map);
        System.out.println(map.get(new Bird("2")));

    }
}
