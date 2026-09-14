package org.example.buoi2;

import org.example.buoi2.Account;
import org.example.buoi2.Department;
import org.example.buoi2.Position;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department phongBanIT = new Department();
        phongBanIT.departmentID = 1;
        phongBanIT.departmentName = "phong ban it";

        Department phongBanSale = new Department();
        phongBanSale.departmentID = 2;
        phongBanSale.departmentName = "phong ban sale";

        Department phongBanMaketing = new Department();
        phongBanMaketing.departmentID = 3;
        phongBanMaketing.departmentName = "phong ban maketing";


        Position dev = new Position();
        dev.positionID = 1;
        dev.positionName = "Dev";

        Position sale = new Position();
        sale.positionID = 2;
        sale.positionName = "Sale";

        Position mkt = new Position();
        mkt.positionID = 3;
        mkt.positionName = "Marketing";

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

        Account account3 = new Account();
        account3.accountID = 3;
        account3.email = "123456@gmail.com";
        account3.username = "C";
        account3.fullName = "Nguyen Van C";
        account3.department = phongBanMaketing;
        account3.position = mkt;

        Account[] danhSachAccount = {account1, account2, account3};


//        System.out.println("Phong Ban IT " + account1.fullName);
//        System.out.println("Phong Ban Sale " + account2.fullName);


        // question 1
        if (account2.department == null) {
            System.out.println("nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + account2.department.departmentName);
        }

        // question 2
        Group group1 = new Group();
        group1.groupID = 1;
        group1.groupName = "Java Fresher";

        Group group2 = new Group();
        group2.groupID = 2;
        group2.groupName = "C# Fresher";

        GroupAccount ga1 = new GroupAccount();
        ga1.groupID = 1;
        ga1.accountID = 2; // account2

        GroupAccount ga2 = new GroupAccount();
        ga2.groupID = 2;
        ga2.accountID = 2; // account2

        // Đếm số group của account2
        int soGroup = 0;
        if (ga1.accountID == account2.accountID)
            soGroup++;
        if (ga2.accountID == account2.accountID)
            soGroup++;

        if (soGroup == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (soGroup <= 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (soGroup == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }


        // question 10
        for (int i = 0; i < danhSachAccount.length; i++) {
            Account a = danhSachAccount[i];
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + a.email);
            System.out.println("Full name: " + a.fullName);
            System.out.println("Phòng ban: " + a.department.departmentName);
        }

        System.out.println("-------------------------------------");

        // question 8
        for (Account a : danhSachAccount) {
            System.out.println("Email: " + a.email);
            System.out.println("Full name: " + a.fullName);
            System.out.println("Phòng ban: " + a.department.departmentName);
        }

        System.out.println("---------------------------------");

        // question 9
        Department[] danhSachPhongBan = {phongBanIT, phongBanSale, phongBanMaketing};
        for (Department d : danhSachPhongBan) {
            System.out.println("id: " + d.departmentID);
            System.out.println("name: " + d.departmentName);
        }

        System.out.println("---------------------------------");

        // question 11
        for (int i = 0; i < danhSachPhongBan.length; i++) {
            Department d = danhSachPhongBan[i];
            System.out.println("Thông tin department thứ " + (i + 1) + " là:");
            System.out.println("id: " + d.departmentID);
            System.out.println("name: " + d.departmentName);
        }

        System.out.println("---------------------------------");

        int i = 0;
        while (i < danhSachAccount.length) {
            Account a = danhSachAccount[i];
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + a.email);
            System.out.println("Full name: " + a.fullName);
            System.out.println("Phòng ban: " + a.department.departmentName);
            i++;
        }



        // Ex3
        System.out.println("---------------------------------");
        Account a1 = new Account();
        a1.fullName = "Nguyen Van C";
        a1.createDate = new Date();
        // question 1
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Exam 1: " + a1.fullName);
        System.out.println("Ngày tạo: " + sdf1.format(a1.createDate));

        System.out.println();

        // question 2
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Exam 1: " + a1.fullName);
        System.out.println("Ngày tạo: " + sdf2.format(a1.createDate));

        System.out.println();

        // question 3
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
        System.out.println("Exam 1: " + a1.fullName);
        System.out.println("Ngày tạo: " + sdf3.format(a1.createDate));

        System.out.println();

        // question 4
        SimpleDateFormat sdf4 = new SimpleDateFormat("MM/yyyy");
        System.out.println("Exam 1: " + a1.fullName);
        System.out.println("Ngày tạo: " + sdf4.format(a1.createDate));

        System.out.println();

        // question 5
        SimpleDateFormat sdf5 = new SimpleDateFormat("MM/dd");
        System.out.println("Exam 1: " + a1.fullName);
        System.out.println("Ngày tạo: " + sdf5.format(a1.createDate));


        // Ex2
        // question 1
        int soNguyen = 5;
        System.out.printf("%d%n", soNguyen);

        // question 2
        int so2 = 100000000;
        System.out.printf("%,d%n", so2);

        // question 3
        double so3 = 5.567098;
        System.out.printf("%.4f%n", so3);

        // question 4
        String hoTen = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", hoTen);

        // question 5
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.println(sdf.format(now));

    }
}
