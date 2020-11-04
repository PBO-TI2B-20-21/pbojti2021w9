package Tugas.Overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        segitiga.totalSudut(50);
        segitiga.totalSudut(50, 70);
        segitiga.keliling(20,30,40);
        segitiga.keliling(20,30);
    }
}
