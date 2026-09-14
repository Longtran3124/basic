package org.example.buoi2;

public class Test {
    public static void main(String[] args) {
//        int ketQua = -1;
//
//        if (ketQua > 0 && ketQua < 5) {
//            System.out.println("Yeu");
//        } else if (ketQua > 5 && ketQua < 6.5) {
//            System.out.println("TB");
//        } else if (ketQua > 6.5 && ketQua < 8) {
//            System.out.println("Gioi");
//        } else if (ketQua > 8 && ketQua < 10) {
//            System.out.println("Xuat sac");
//        } else {
//            System.out.println("Bao loi");
//        }

//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }


        int[] numbers = {1, 4, 5, 8, 9, 10, 111};

        for (int i = 1; i <= 7; i++) {
            System.out.println(numbers[i - 1]);
        }

        System.out.println("----------------------");

        int count = 1;
        while (count < 100) {
            System.out.println(count);
            count++;
        }

        System.out.println("----------------------");

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);
    }
}
