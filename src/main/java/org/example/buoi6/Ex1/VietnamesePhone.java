package org.example.buoi6.Ex1;

public class VietnamesePhone extends Phone {

    @Override
    public void insertContact(String name, String phone) {
        if (name == null || phone == null) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        } else if ("".equals(name) || "".equals(phone)) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        }

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = new Contact(name, phone);
                System.out.println("Da them lien he: " + name);
                return;
            }
        }
        System.out.println("Danh ba da day, khong the them lien he moi");
    }

    @Override
    public void removeContact(String name) {
        if (name == null || "".equals(name)) {
            System.out.println("Không có dữ liệu để xóa");
        }

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equals(name)) {
                contacts[i] = null;
                System.out.println("Da xoa lien he: " + name);
                return;
            }
        }
        System.out.println("Khong tim thay lien he: " + name);
    }

    @Override
    public void updateContact(String name, String newPhone) {

        if (name == null || newPhone == null) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        } else if ("".equals(name) || "".equals(newPhone)) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        }

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equals(name)) {
                contacts[i].setPhone(newPhone);
                System.out.println("Da cap nhat so dien thoai cua: " + name);
                return;
            }
        }
        System.out.println("Khong tim thay lien he: " + name);
    }

    @Override
    public void searchContact(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && contacts[i].getName().equals(name)) {
                System.out.println("Tim thay: " + contacts[i].getName() + " - " + contacts[i].getPhone());
                return;
            }
        }
        System.out.println("Khong tim thay lien he: " + name);
    }
}
