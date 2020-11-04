public class Segitiga {
    
    private int sudut;
    private int keliling;

    public int  sudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Hasil method 1 :"+ sudut);
        return sudut;
    }

    public int sudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Hasil method 2 :"+ sudut);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB,int sisiC) {
        keliling = sisiA + sisiB + sisiC;
        System.out.println("Hasil method 3 :"+ keliling);
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
        System.out.println("Hasil method 4 :"+ c);
        return c;
    }
}
