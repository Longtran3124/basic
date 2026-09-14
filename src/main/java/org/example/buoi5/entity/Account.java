package org.example.buoi5.entity;

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

    // Tạo phương thức

    public Account() {
    }

    public Account(int accountID, String email, String username, String fullName, int departmentID, Department department, int positionID, Position position, Date createDate) {
        this.accountID = accountID;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.departmentID = departmentID;
        this.department = department;
        this.positionID = positionID;
        this.position = position;
        this.createDate = createDate;
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
}
