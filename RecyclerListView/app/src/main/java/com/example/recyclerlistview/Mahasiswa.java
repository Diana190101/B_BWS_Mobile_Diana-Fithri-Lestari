package com.example.recyclerlistview;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String noHP;

    public Mahasiswa(String nama, String nim, String noHP) {
        this.nama = nama;
        this.nim = nim;
        this.noHP = noHP;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
}
