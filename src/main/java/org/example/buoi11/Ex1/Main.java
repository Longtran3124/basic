package org.example.buoi11.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nguyen Van A"));
        students.add(new Student("Tran Thi B"));
        students.add(new Student("Le Van C"));
        students.add(new Student("Nguyen Van A"));
        students.add(new Student("Pham Thi D"));
        students.add(new Student("Nguyen Van A"));
        students.add(new Student("Hoang Van E"));

        // a. In ra tong so phan tu cua student
        System.out.println(students.size());

        // b. Lay phan tu thu 4 cua student
        System.out.println(students.get(4));

        // c. In ra phan tu dau va cuoi
        System.out.println("Phần tử đầu: " + students.get(0));
        System.out.println("Phần tử cuối: " + students.get(students.size() - 1));

        // d. them phan tu vao vi tri dau
        students.add(0, new Student("Tran Van N"));
        System.out.println(students.size());

        // e. Them phan tu vao cuoi
        students.add(students.size(), new  Student("Nguyen Van L"));
        System.out.println(students.size());
    }
}
