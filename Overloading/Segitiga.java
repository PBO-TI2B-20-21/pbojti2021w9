package Overloading;
public class Segitiga {
    private int sudut;
   
    public int TotalSudut(int sudutA){
return sudut=180-sudutA;
    }
     public int TotalSudut(int sudutA, int SudutB){
return sudut=180 - (sudutA+ SudutB);
    }
    public int keliling(int sisiA,int sisiB,int sisiC){
    return sisiA+sisiB+sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(sisiA*sisiA)+Math.sqrt(sisiB*sisiB);
    }
    
   
   
}
