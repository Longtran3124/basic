package org.example.buoi6.Ex1;

public class Main {
    public static void main(String[] args) {
        Phone phone = new VietnamesePhone();

        phone.insertContact("Long", "0901234567");
        phone.insertContact("An", "0912345678");

        phone.searchContact("Long");

        phone.updateContact("Long", "0999999999");
        phone.searchContact("Long");

        phone.removeContact("An");
        phone.searchContact("An");
    }
}
