package org.example.buoi6.vidu;

public class Cat extends Animal {

    private String mauLong;

    public Cat(String mauLong) {
        super();
        System.out.println("Contructor Cat");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }
}
