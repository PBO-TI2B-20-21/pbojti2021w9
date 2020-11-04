package Tugas.Overloading;
public class Main {

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        s.totalSudut(120);
        s.totalSudut(50, 40);
        s.keliling(15, 6, 10);
        s.keliling(20, 9);
        
        System.out.println("Total Sudut : "+s.totalSudut(120));
        System.out.println("Total Sudut : "+s.totalSudut(50, 40));
        System.out.println("Keliling Segitiga : "+s.keliling(15, 6, 10));
        System.out.println("Keliling Segitiga :"+s.keliling(20, 9));
    }
    
}
