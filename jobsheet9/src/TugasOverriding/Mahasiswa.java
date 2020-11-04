package TugasOverriding;

public class Mahasiswa extends Manusia{

    @Override
    public void makan() {
        super.makan();
        System.out.println("Mahasiswa harus banyak makan ");
    }
    public void tidur(){
        System.out.println("Mahasiswa perlu cukup tidur");
    }
}