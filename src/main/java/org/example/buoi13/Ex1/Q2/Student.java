package org.example.buoi13.Ex1.Q2;

public class Student {
    private int id;
    private String name;
    private static int count = 0;

    public Student() {
    }

    public Student(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    @Deprecated
    public int getId() {
        return id;
    }

    public String getMSV() {
        return "MSV " + id;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
