package org.example.buoi11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        int total = 10000000;
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new  ArrayList<>();

        long startTime1 = System.nanoTime();
        for(int i = 0; i < total; i++) {
            linkedList.add("abc" + i);
        }

        long startTime2 = System.nanoTime();
        for(int i = 0; i < total; i++) {
            arrayList.add("abc" + i);
        }

        long startTime3 = System.nanoTime();

        System.out.println(startTime2 - startTime1);
        System.out.println(startTime3 - startTime2);
    }
}
