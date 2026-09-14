package org.example.buoi5.Ex1;

public class CanBo {
    private String hoVaTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo(String hoVaTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public CanBo(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
}
