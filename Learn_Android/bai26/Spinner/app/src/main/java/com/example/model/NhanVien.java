package com.example.model;

public class NhanVien {
   private String ten;
   private String thuBatDau;
   private int soNgay;

    public NhanVien() {
    }

    public NhanVien(String ten, String thuBatDau, int soNgay) {
        this.ten = ten;
        this.thuBatDau = thuBatDau;
        this.soNgay = soNgay;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuBatDau() {
        return thuBatDau;
    }

    public void setThuBatDau(String thuBatDau) {
        this.thuBatDau = thuBatDau;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return this.ten +"\n Ngày bắt đầu: "+this.thuBatDau +" \n Ngày đi: "+this.soNgay;
    }
}
