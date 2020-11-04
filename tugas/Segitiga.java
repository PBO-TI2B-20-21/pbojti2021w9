package tugas;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        System.out.println("Sudut A :" + (sudut = 180-sudutA));
        return sudut;
    }
    public int totalSudut(int sudutA,int sudutB){
        System.out.println("Sudut A & B:" + (sudut = 80-(sudutA+sudutB)));
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling;
        System.out.println("Keliling A, B & C :" + (keliling = sisiA + sisiB + sisiC));
        return keliling;
    }

    public double keliling(int sisiA, int sisiB){
        double c;
        System.out.println("Keliling A & B :" + (c = Math.sqrt(sisiA + sisiB)));
        return c;
    }

}
