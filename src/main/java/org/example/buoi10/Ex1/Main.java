package org.example.buoi10.Ex1;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student(1, "Nguyen Van A");
        students[1] = new Student(2, "Nguyen Van B");
        students[2] = new Student(3, "Nguyen Van C");

        Student.setCollege("Dai hoc bach khoa");

        for (Student student : students) {
            System.out.println("ID: " + student.getId()
            + ", Name: " + student.getName()
            + ", College: " + student.getCollege());
        }

        System.out.println("---------------------------");

        Student.setCollege("Dai hoc cong nghe");

        for (Student student : students) {
            System.out.println("ID: " + student.getId()
                    + ", Name: " + student.getName()
                    + ", College: " + student.getCollege());
        }

        Student.setMoneyGroup(0);
        for (Student student : students) {
            student.setMoneyGroup(student.getMoneyGroup() + 100);
        }
    }
}
