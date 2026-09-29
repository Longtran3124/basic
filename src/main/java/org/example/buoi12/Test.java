package org.example.buoi12;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1);
        Student student2 = new Student(1);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);

        System.out.println(studentSet.size());


        Integer integer1 = new Integer(1);
        Integer integer12 = new Integer(1);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(integer1);
        integerSet.add(integer12);

        System.out.println(integerSet.size());
    }

}
