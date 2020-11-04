package TugasOverloading;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        sudut=180-sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut=180-(sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling=sisiA+sisiB+sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        double c= Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB, 2));
        return c;
    }

    public static void main(String[] args) {
        Segitiga s=new Segitiga();
        System.out.println("Total sudut segitiga 1\t: "+s.totalSudut(41));
        System.out.println("Total sudut segitiga 2\t: "+s.totalSudut(37, 60));

        System.out.println("Keliling segitiga 1\t\t: "+s.keliling(58, 31, 90));
        System.out.println("Keliling segitiga 2\t\t: "+s.keliling(74, 59));
    }
}