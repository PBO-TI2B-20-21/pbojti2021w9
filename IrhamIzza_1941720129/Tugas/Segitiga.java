package Tugas;
public class Segitiga {
    public int sudut;
    
    public int totalSudut(int sudutA) { 
    sudut=180-sudutA;
    System.out.println(sudut);
    return sudut;
    } 
    public int totalSudut(int sudutA, int sudutB) { 
    sudut=180-(sudutA+sudutB);
    System.out.println(sudut);
    return sudut;
    } 
    public int keliling(int sisiA, int sisiB, int sisiC) { 
    sudut= sisiA+sisiB+sisiC;
    System.out.println(sudut);
    return sudut;
    } 
    public double keliling(int sisiA, int sisiB) { 
    double sudut = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
    System.out.println(sudut);
    return sudut;
    } 
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        s.totalSudut(3);
        s.totalSudut(3, 4);
        s.keliling(3, 4);
        s.keliling(3, 4, 5);
    }
}
