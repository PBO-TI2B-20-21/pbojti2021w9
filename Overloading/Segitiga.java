
package Overloading;
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int SudutB){
        return sudut = 180 - (sudutA + SudutB);
    }
    public int keliling(int sisiA,int sisiB,int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling (int sisiA, int sisiB){
        double c = Math.sqrt(sisiA*sisiA) + Math.sqrt(sisiB*sisiB);
        return c;
    }
}
