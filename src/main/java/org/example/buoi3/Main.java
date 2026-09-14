package org.example.buoi3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // question 1
//        System.out.println("Mởi nhập 3 số nguyên: ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int l = sc.nextInt();
//
//        System.out.println("3 số nguyên là " + n + " " + m + " " + l);


        // question 2
//        System.out.println("Mời nhập 2 số thực");
//        float f = sc.nextFloat();
//        float b = sc.nextFloat();
//
//        System.out.println("2 số thực là " + f + " " + b);


        // question 3
//        System.out.println("Mời nhập họ và tên: ");
//        String hoVaTen = sc.nextLine();
//
//        System.out.println("Họ tên là " + hoVaTen);

        // question 4
//        System.out.println("Mời nhập ngày sinh: ");
//        Date ngaySinh = new Date(sc.nextLong());
//
//        System.out.println("Ngày sinh: " + ngaySinh);

//        soChan();
        soNguyenDuong();
    }

    static void soChan() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    static void soNguyenDuong() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
