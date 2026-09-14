package org.example.buoi7.Ex2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(1, "Nguyễn Văn A", 1);
        students[1] = new Student(2, "Nguyễn Văn B", 2);
        students[2] = new Student(3, "Nguyễn Văn C", 3);
        students[3] = new Student(4, "Nguyễn Văn D", 1);
        students[4] = new Student(5, "Nguyễn Văn E", 2);
        students[5] = new Student(6, "Nguyễn Văn F", 3);
        students[6] = new Student(7, "Nguyễn Văn G", 1);
        students[7] = new Student(8, "Nguyễn Văn H", 2);
        students[8] = new Student(9, "Nguyễn Văn I", 3);
        students[9] = new Student(10, "Nguyễn Văn K", 1);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("--------------------------");

        // câu b
        for (Student student : students) {
            student.diemDanh();
        }

        System.out.println("--------------------------");
        // câu c
        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        System.out.println("--------------------------");
        // câu d
        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.diDonVeSinh();
            }
        }
    }
}
