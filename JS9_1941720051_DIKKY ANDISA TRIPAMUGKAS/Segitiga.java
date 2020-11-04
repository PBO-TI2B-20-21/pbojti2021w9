public class Segitiga {
    public int sudut;

    public int totalSudut(int sudutA ) {
        System.out.println(180-sudutA);
        return sudut = 180-sudutA;
        
    }

    public int totalSudut(int sudutA, int sudutB) {
        System.out.println(180-(sudutA+sudutB));
        return sudut = 180-(sudutA+sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling;
        System.out.println(sisiA + sisiB + sisiC);
        return keliling = sisiA + sisiB + sisiC;
    }

    public double keliling(double sisiA, double sisiB) {
        double c;
        System.out.println(Math.sqrt((sisiA*sisiA)+(sisiB*sisiB)));
        return c = Math.sqrt((sisiA*sisiA)+(sisiB*sisiB));
    }    
}