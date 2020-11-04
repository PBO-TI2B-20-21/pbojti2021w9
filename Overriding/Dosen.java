
package Overriding;

public class Dosen extends Manusia {
    @Override
    public void makan(){
        System.out.println("dosen lagi makan");
    }
    public void lembur(){
        System.out.println("lagi lembur");
    }
}
