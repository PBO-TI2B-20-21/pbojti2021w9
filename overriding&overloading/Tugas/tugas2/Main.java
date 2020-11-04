public class Main {
    public static void main(String[] args) {
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        ds.makan();
        ds.lembur();

        System.out.println("===================");

        mhs.makan();
        mhs.tidur();
    }
}
