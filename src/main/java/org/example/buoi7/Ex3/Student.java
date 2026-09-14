package org.example.buoi7.Ex3;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private double avgScore;
    private String email;

    public Student() {
        super();
    }

    public Student(String name, String gender, Date dateOfBirth, String address,
                    String studentId, double avgScore, String email) {
        super(name, gender, dateOfBirth, address);
        this.studentId = studentId;
        this.avgScore = avgScore;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.studentId = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        this.avgScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap email: ");
        this.email = sc.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("Diem trung binh: " + avgScore);
        System.out.println("Email: " + email);
    }

    public boolean isScholarship() {
        return avgScore >= 8.0;
    }
}
