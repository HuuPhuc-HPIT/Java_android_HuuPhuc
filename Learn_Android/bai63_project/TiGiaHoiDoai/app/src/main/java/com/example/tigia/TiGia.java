package com.example.tigia;

import android.graphics.Bitmap;

import java.io.Serializable;

public class TiGia implements Serializable {
    private String type;
    private String imgUrl;
    private Bitmap bitmap;
    private String muaTienMat;
    private String muack;
    private String banTienMat;
    private String banck;

    public TiGia() {
    }

    public TiGia(String type, String imgUrl, Bitmap bitmap, String muaTienMat, String muack, String banTienMat, String banck) {
        this.type = type;
        this.imgUrl = imgUrl;
        this.bitmap = bitmap;
        this.muaTienMat = muaTienMat;
        this.muack = muack;
        this.banTienMat = banTienMat;
        this.banck = banck;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getMuaTienMat() {
        return muaTienMat;
    }

    public void setMuaTienMat(String muaTienMat) {
        this.muaTienMat = muaTienMat;
    }

    public String getMuack() {
        return muack;
    }

    public void setMuack(String muack) {
        this.muack = muack;
    }

    public String getBanTienMat() {
        return banTienMat;
    }

    public void setBanTienMat(String banTienMat) {
        this.banTienMat = banTienMat;
    }

    public String getBanck() {
        return banck;
    }

    public void setBanck(String banck) {
        this.banck = banck;
    }


}
