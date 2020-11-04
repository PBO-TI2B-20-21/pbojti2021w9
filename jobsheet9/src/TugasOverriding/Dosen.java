package TugasOverriding;

public class Dosen extends Manusia{

    @Override
    public void makan() {
        super.makan();
    }
    public void lembur(){
        System.out.println("Banyak waktu lembur");
    }
}