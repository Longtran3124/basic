package org.example.buoi5.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float diemHocLuc;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0;
    }

    public void setDiemHocLuc(float diemHocLuc) {
        this.diemHocLuc = diemHocLuc;
    }

    public void congThemDiem(float diem) {
        this.diemHocLuc += diem;
    }

    public void inThongTin(){
        String xepLoai;
        if (diemHocLuc < 4f) {
            xepLoai = "Yếu";
        } else if (diemHocLuc < 6f) {
            xepLoai = "Trung bình";
        } else if (diemHocLuc < 8f) {
            xepLoai = "Khá";
        } else {
            xepLoai = "Giỏi";
        }

        System.out.println("Tên: " + name);
        System.out.println("Điểm học lực: " + diemHocLuc);
        System.out.println("Xếp loại: " + xepLoai);
    }
}
