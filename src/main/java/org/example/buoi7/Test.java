package org.example.buoi7;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Runable cat2 = new Cat();

        System.out.println(cat);
    }

    public void printInfo(Animal animal) {
        System.out.println(animal.getSoLuongMat());
    }
}

