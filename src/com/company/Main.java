package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(1 + r.nextInt(100));
        }
        int x = 1 + r.nextInt(list.size());
        System.out.println(list.get(x));
    }
}
