package Tugas.Overriding;

public class Main {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Manusia dos = new Dosen();
        Manusia mas = new Mahasiswa();
        
        man.makan();
        dos.makan();
        mas.makan();
    }
}
