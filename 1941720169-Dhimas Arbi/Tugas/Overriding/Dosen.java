package Tugas.Overriding;

public class Dosen extends Manusia{
    @Override
    public void makan() {
        System.out.println("Dosen makan sate");
    }
    public void lembur(){
        System.out.println("Dosen lembur membuat soal ujian");
    }
}
