package Tugas.Overriding;

public class Mahasiswa extends Manusia{
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan gado-gado");
    }
    public void tidur(){
        System.out.println("Mahasiswa butuh tidur");
    }
}
