
package Overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan(){
        System.out.println("Mahasiswa lagi makan");
    }
    public void tidur(){
        System.out.println("sedang tidur");
    }
}
