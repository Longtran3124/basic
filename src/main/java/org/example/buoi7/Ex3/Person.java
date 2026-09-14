package org.example.buoi7.Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, Date dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Moi nhap gioi tinh: ");
        this.gender = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String dob = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = dateFormat.parse(dob);
        } catch (Exception e) {
            System.out.println("sai dinh dang dob");
        }
        System.out.print("Nhap dia chi: ");
        this.address = sc.nextLine();
    }

    public void showInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ten: " + name);
        System.out.println("gioi tinh: " + gender);
        System.out.println("ngay sinh (dd/MM/yyyy): " + sdf.format(dateOfBirth));
        System.out.println("address: " + address);
    }

}
