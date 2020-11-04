package Tugas.Overriding;
public class main {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa();

        System.out.println();
        a.bernafas();
        a.makan();
        System.out.println();
        b.bernafas();
        b.makan();
        System.out.println();
        c.bernafas();
        c.makan();
        System.out.println();
    }
    }

