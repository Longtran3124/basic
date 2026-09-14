package org.example.buoi11;

public class Student {
    // static: dung chung, dem so id da cap phat
    private static int autoId = 1;

    private int id;
    private String name;

    public Student(String name) {
        // id tu dong tang, khong can truyen vao
        this.id = autoId++;
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

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
