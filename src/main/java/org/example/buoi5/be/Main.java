package org.example.buoi5.be;

import org.example.buoi5.entity.Account;
import org.example.buoi5.entity.Department;

public class Main {
    public static void main(String[] args) {
        Department department1 = new Department(); // dùng constructor không có tham số
        Department department2 = new Department("Tran Duc Long"); // dùng constructor có tham số

        Account account1 = new Account();
        account1.setAccountID(1);

        System.out.println(account1.getAccountID());

    }
}
