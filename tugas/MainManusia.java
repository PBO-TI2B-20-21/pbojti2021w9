package tugas;

public class MainManusia {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        Manusia orang;
        orang = man;
        orang.bernafas();
        orang.makan();

        orang = ds;
        orang.makan();
        ds.bernafas();

        orang = mhs ;
        orang.makan();
        mhs .tidur();
 }

}
