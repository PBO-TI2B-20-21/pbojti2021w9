public class Main {

    public static void main(String[] args) {
        Mahasiswa maha=new Mahasiswa();
        Dosen dosen = new Dosen();
        Manusia manusia = new Manusia();
        
        manusia.makan();
        manusia.bernafas();
        maha.makan();
        maha.tidur();
        dosen.lembur();
        dosen.makan();

    }
}