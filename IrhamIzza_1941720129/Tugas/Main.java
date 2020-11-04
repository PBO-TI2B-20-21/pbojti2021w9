package Tugas;
public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b =  new Dosen();
        Mahasiswa c = new Mahasiswa();
        
        a.makan();
        a.bernafas();
        System.out.println();
        b.makan();
        b.lembur();
        System.out.println();
        c.makan();
        c.tidur();
    }
}
