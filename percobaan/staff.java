/**
 * staff
 */
public class staff extends karyawan {

    private int lembur;
    private double gajiLembur;
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    public int getLembur() {
        return lembur;
    }
    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    public double getGajiLembur() {
        return gajiLembur;
    }
    //overloading
    public double getGaji(int lembur, double gajiLembur) {
        // TODO Auto-generated method stub
        return super.getGaji()+lembur+gajiLembur;
    }
    //overide
    @Override
    public double getGaji() {
        // TODO Auto-generated method stub
        return super.getGaji()+lembur*gajiLembur;
    }
    public void lihatInfo(){
        System.out.println("NIP        : "+this.getNip());
        System.out.println("Nama       : "+this.getNama());
        System.out.println("Golongan   : "+this.getGolongan());
        System.out.println("Jml Lembur : "+this.getLembur());
        System.out.printf("Gaji Lembur :%f\n", this.getGajiLembur());
        System.out.printf("Gaji        :%f\n", this.getGaji());
        System.out.println("");
    }
}