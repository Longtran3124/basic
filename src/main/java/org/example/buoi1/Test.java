package org.example.buoi1;

public class Test {
    public static void main(String[] args) {

        Department phongBanIT = new Department();
        phongBanIT.departmentID = 1;
        phongBanIT.departmentName = "phong ban it";

        Department phongBanSale = new Department();
        phongBanSale.departmentID = 2;
        phongBanSale.departmentName = "phong ban sale";

        Department phongBanMaketing = new Department();
        phongBanMaketing.departmentID = 1;
        phongBanMaketing.departmentName = "phong ban maketing";


        Position dev = new Position();
        dev.positionID = 1;
        dev.positionName = "Dev";

        Position sale = new Position();
        sale.positionID = 2;
        sale.positionName = "Sale";

        Account account1 = new Account();
        account1.accountID = 1;
        account1.email = "123456@Gmail.com";
        account1.username = "A";
        account1.fullName = "Nguyen Van A";
        account1.departmentID = 1;
        account1.department = phongBanIT;
        account1.position = dev;

        Account account2 = new Account();
        account2.accountID = 2;
        account2.email = "123456@gmail.com";
        account2.username = "B";
        account2.fullName = "Nguyen Van B";
        account2.department = phongBanSale;
        account2.position = sale;


        System.out.println("Phong Ban IT " + account1.fullName);
        System.out.println("Phong Ban Sale " + account2.fullName);
    }
}
