package com.company;

public class Main {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        man.bernafas();
        man.makan();

        Mahasiswa mhs = new Mahasiswa();
        mhs.makan();
        mhs.tidur();

        Dosen dsn = new Dosen();
        dsn.makan();
        dsn.lembur();
    }
}
