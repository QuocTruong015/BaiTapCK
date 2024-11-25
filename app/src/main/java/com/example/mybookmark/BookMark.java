package com.example.mybookmark;

public class BookMark {
    private String name;
    private String des;
    private int ava;

    public BookMark(String name, String des, int ava) {
        this.name = name;
        this.des = des;
        this.ava = ava;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getAva() {
        return ava;
    }

    public void setAva(int ava) {
        this.ava = ava;
    }
}
