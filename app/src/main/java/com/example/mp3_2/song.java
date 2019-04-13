package com.example.mp3_2;

public class song {
    private String tbh;
    private int flie;

    public song() {
    }

    public song(String tbh, int flie) {
        this.tbh = tbh;
        this.flie = flie;
    }

    public String getTbh() {
        return tbh;
    }

    public void setTbh(String tbh) {
        this.tbh = tbh;
    }

    public int getFlie() {
        return flie;
    }

    public void setFlie(int flie) {
        this.flie = flie;
    }

    public int getFile() {
        return 0;
    }
}
