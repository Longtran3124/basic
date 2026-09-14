package org.example.buoi11;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // In ra kích thước của list
        System.out.println(list.size());

        // Xóa tất cả phần tử trong list
//        list.clear();
//
//        System.out.println(list.size());
        // nó lấy giá trị Index
        System.out.println(list.get(0));
    }
}
