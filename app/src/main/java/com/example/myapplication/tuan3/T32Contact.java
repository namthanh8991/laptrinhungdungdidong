package com.example.myapplication.tuan3;

public class T32Contact {
    private  String ten;
    private String tuoi;
    private int hinh;

    public T32Contact() {
    }

    public T32Contact(String ten , String tuoi, int hinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.hinh= hinh ;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
