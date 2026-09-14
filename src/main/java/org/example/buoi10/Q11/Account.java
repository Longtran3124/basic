package org.example.buoi10.Q11;

import org.example.buoi9.Ex2.Q1.InvalidAgeInputtingException;
import org.example.buoi9.Ex2.Q2.ScannerUtils;

import java.util.Date;

public class Account {
    private int accountID;
    private String email;
    private String username;
    private String fullName;
    private int departmentID;
    private Department department;
    private int positionID;
    private Position position;
    private Date createDate;
    private int age;

    // Tạo phương thức

    public Account() {
    }

    public Account(int accountID, String email, String username, String fullName, int departmentID, Department department, int positionID, Position position, Date createDate, int age) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.departmentID = departmentID;
        this.department = department;
        this.positionID = positionID;
        this.position = position;
        this.createDate = createDate;
        this.age = age;
    }

    // Tạo Getter/Setter


    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // QUestion 11
    public void inputAge(int age) {
        if (age <= 0) {
            throw new InvalidAgeInputtingException("The age must be greater than 0");
        }
    }

    // Question 12
    public void inputAccountAge() {
        try {
            int age = ScannerUtils.inputAge();
            inputAge(age);
            if (age < 18) {
                System.out.println("The age must be greater than 18");
                inputAccountAge(); // yêu cầu nhập lại
                return;
            }
            this.age = age; // lưu lại khi nó hợp lệ
        } catch (InvalidAgeInputtingException e) {
            System.out.println(e.getMessage());
            inputAccountAge();
        }
    }

}
