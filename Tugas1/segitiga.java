/**
 * segitiga
 */
public class segitiga {

    private int sudut;
    public void setSudut(int sudut) {
        this.sudut = sudut;
    }
    public int getSudut() {
        return sudut;
    }
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA,int sisiB, int sisiC){
        int  keliling = sisiA+sisiB+sisiC;
        return keliling;
    }
    public double keliling(int sisiA,int sisiB){
        double sisiC = Math.sqrt( Math.pow(sisiA,2) + Math.pow(sisiB,2) );
        return sisiC;
    }
    public static void main(String[] args) {
        segitiga sgt=new segitiga();
        System.out.println("Total sudut segitiga 1\t: "+sgt.totalSudut(30));
        System.out.println("Total sudut segitiga 2\t: "+sgt.totalSudut(30, 60));

        System.out.println("Keliling segitiga 1\t: "+sgt.keliling(30, 60, 90));
        System.out.println("Keliling segitiga 2\t: "+sgt.keliling(3, 4));
        
    }
}