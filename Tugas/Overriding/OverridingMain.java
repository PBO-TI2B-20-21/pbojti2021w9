package Tugas.Overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Manusia manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan();
        System.out.println();

        Dosen dosen = new Dosen();
        dosen.makan();
        dosen.lembur();
        System.out.println();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
