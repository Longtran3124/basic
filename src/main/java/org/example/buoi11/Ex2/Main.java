package org.example.buoi11.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Nguyen Van A");
        students.put(2, "Tran Thi B");
        students.put(3, "Le Van C");

        // a. In ra key
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // b. In ra value
        for (String value : students.values()) {
            System.out.println(value);
        }
    }
}
