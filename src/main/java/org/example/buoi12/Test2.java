package org.example.buoi12;

import java.util.LinkedList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();

        Integer number = 100;

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i).equals(number)) {
                System.out.println("da tim thay");
            }
        }
    }
}
