package org.example.buoi9;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        // lỗi ArrayIndexOutOfBoundsException
//        System.out.println(arr[10]);


//        int x = 10;
//        int y = 0;
//        // Bắt lỗi cha trước vì nếu catch đầu sai thì thằng thứ 2 sẽ bắt lỗi
//        // không nên bắt lỗi cha trước mà phải bắt lỗi con trước
//        try {
//            int z = x / y;
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        } finally { // luôn luôn được chạy dù có lỗi hay không
//            System.out.println("finally");
//        }


//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if (age < 0) {
//            throw new RuntimeException("Age invalid"); // Trả về 1 đối tượng exception
//        }
//
//        System.out.println("Done");
        try {
            int x = 10;
            int y = 0;
            divede(x, y);
        } catch (ArithmeticException e) {
            e.printStackTrace(); // in ra cụ thể lỗi
        }

        System.out.println("Done");
    }

    public static void divede(int x, int y) {
        System.out.println(x / y);
    }
}
