package Tugas.Overloading;
public class main {
    public static void main(String[] args) {
        
        Segitiga segitiga = new Segitiga();

        System.out.println(segitiga.totalSudut(8));
        System.out.println(segitiga.totalSudut(9, 4));
        System.out.println(segitiga.keliling(11, 22));
        System.out.println(segitiga.keliling(34, 55, 78));
    }
}
