package org.example.buoi10.Ex1;

public class Student {
    private int id;
    private String name;
    private static String college;
    private static int moneyGroup;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public static int getMoneyGroup() {
        return moneyGroup;
    }

    public static void setMoneyGroup(int moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }
}
