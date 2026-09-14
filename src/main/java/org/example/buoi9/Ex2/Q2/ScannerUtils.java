package org.example.buoi9.Ex2.Q2;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner sc = new Scanner(System.in);
    public static int inputAge() {
        System.out.print("Nhap tuoi: ");
        return Integer.parseInt(sc.nextLine());
    }
}
