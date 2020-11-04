package Tugas.Overloading;
import java.*;
import java.util.Scanner;

public class MainSegitiga {
    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);
        Segitiga s = new Segitiga();
        int pilih, sudutA, sudutB, sisiA, sisiB, sisiC;
        do{
            menu();
            pilih = dhimas.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan sudut: ");
                    sudutA = dhimas.nextInt();
                    System.out.println("Sudut: "+s.totalSudut(sudutA));
                    break;
                case 2:
                    System.out.print("Masukkan sudut A: ");
                    sudutA = dhimas.nextInt();
                    System.out.println("Masukkan sudut B: ");
                    sudutB = dhimas.nextInt();
                    System.out.println("Sudut: "+s.totalSudut(sudutA,sudutB));
                    break;
                case 3:
                    System.out.print("Masukkan sisi A: ");
                    sisiA = dhimas.nextInt();
                    System.out.print("Masukkan sisi B: ");
                    sisiB = dhimas.nextInt();
                    System.out.print("Masukkan sisi C: ");
                    sisiC = dhimas.nextInt();
                    System.out.println("Keliling: "+s.keliling(sisiA,sisiB,sisiC));
                    break;
                case 4:
                    System.out.print("Masukkan sisi A: ");
                    sisiA = dhimas.nextInt();
                    System.out.print("Masukkan sisi B: ");
                    sisiB = dhimas.nextInt();
                    System.out.println("Keliling: "+s.keliling(sisiA,sisiB));
                    break;
                default:
                    System.exit(0);
            }

        }while(pilih == 1||pilih==2||pilih==3||pilih==4);
    }
    public static void menu(){
        System.out.println("\n------------------------");
        System.out.println("1. Total sudut(1 sudut)");
        System.out.println("2. Total sudut(2 sudut)");
        System.out.println("3. Keliling(3 sisi)");
        System.out.println("4. Keliling(2 sisi)");
        System.out.println("------------------------");
    }
}
