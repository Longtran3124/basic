package org.example.buoi6.Ex1;

public abstract class Phone {

    public Contact[] contacts;

    public Phone() {
        contacts = new Contact[100];
    }

    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}
