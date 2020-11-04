/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.println("tingkah laku Dosen : ");
        dosen dsn=new dosen();
        dsn.bernafas();
        dsn.makan();
        dsn.lembur();
        System.out.println();
        System.out.println("tingkah laku Mahasiswa : ");
        mahsiswa mhs=new mahsiswa();
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
    }
}