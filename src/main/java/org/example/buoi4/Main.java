package org.example.buoi4;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // question 1
        float account1 = 5240.5f;
        float account2 = 10970.055f;

        int accountluong1 = (int) account1;
        int accountluong2 = (int) account2;

        System.out.println(accountluong1);
        System.out.println(accountluong2);

        // question 2
        Random rd = new Random();
        int so = rd.nextInt(10000);
        String ketQua = String.format("%05d", so);
        System.out.println(ketQua);

        // question 4
        System.out.println( (float) thuong(12, 5));


        // Ex2
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
            accounts[i].email = "Email " + (i + 1);        // Email 1, Email 2, ...
            accounts[i].username = "User name " + (i + 1);  // User name 1, ...
            accounts[i].fullName = "Full name " + (i + 1);  // Full name 1, ...
            accounts[i].createDate = new Date();            // now
        }


        for (Account account : accounts) {
            System.out.println("Email: " + account.email);
            System.out.println("UserName: " + account.username);
            System.out.println("FullName: " + account.fullName);
            System.out.println("CreateDate: " + account.createDate);
        }

        System.out.println("--------------------------");

        // question 1
        Integer luong = 5000;
        float luong1 = luong;
        System.out.printf("%.2f%n", luong1);

        // question 2
        String valuee = "1234567";
        int v = Integer.parseInt(valuee);
        System.out.println(v);

        // question 3
        Integer i = Integer.parseInt("1234567");
        int I = i.intValue();
        System.out.println(I);
    }

    static double thuong (int a, int b) {
        return a / b;
    }
}
