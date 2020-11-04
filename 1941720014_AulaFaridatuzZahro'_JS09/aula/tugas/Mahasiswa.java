package aula.tugas;

/**
 *
 * @author Aulafz
 */
public class Mahasiswa extends Manusia {

    @Override
    public void makan() {
        System.out.println("Mahasiswa suka makan");
    }

    public void tidur() {
        System.out.println("Mahasiswa jarang tidur");
    }
}
