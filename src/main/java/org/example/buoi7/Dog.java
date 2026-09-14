package org.example.buoi7;

public class Dog extends Animal implements Runable {
    @Override
    public void run() {
        System.out.println("Đi bằng 4 chân");
    }
}
