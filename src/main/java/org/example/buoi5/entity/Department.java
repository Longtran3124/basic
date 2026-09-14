package org.example.buoi5.entity;

public class Department {
    int departmentID;
    String departmentName;

    public Department() {
    }

    public Department(String nameDepartment) {
        this.departmentName = nameDepartment;
        this.departmentID = 0;
    }
}
