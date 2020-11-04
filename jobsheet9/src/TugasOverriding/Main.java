package TugasOverriding;

public class Main {
    public static void main(String[] args) {
        System.out.println("Untuk Dosen : ");
        Dosen d=new Dosen();
        d.bernafas();
        d.makan();
        d.lembur();
        System.out.println();
        System.out.println("Untuk Mahasiswa : ");
        Mahasiswa m=new Mahasiswa();
        m.bernafas();
        m.makan();
        m.tidur();
    }
}