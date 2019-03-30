package com.example.model;

import java.io.Serializable;

public class SinhVine implements Serializable {
    private int ma;
    private String ten;

    public SinhVine() {
    }

    public SinhVine(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return this.ma+"\t"+ this.ten;
    }
}
