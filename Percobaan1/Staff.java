package Percobaan1;

public class Staff extends Karyawan {

   private int lembur;
    private double gajilembur;
    
    public void setLembur(int lembur){
        this.lembur=lembur;
    }
    public int getLembur(){
        return lembur;
    }
    public void setGajilembur(double gajilembur){
        this.gajilembur=gajilembur;
    }
    public double getGajilembur(){
        return gajilembur;
    }
    //overloading
    public double getGaji(int lembur, double gajilembur){
        return super.getGaji()+lembur*gajilembur;
    }
    //overriding
    public double getGaji(){
        return super.getGaji()+lembur*gajilembur;
    }
    public void lihatInfo(){
        System.out.println("Nip        : "+this.getNip());
        System.out.println("NAma       : "+this.getNama());
        System.out.println("golongan   : "+this.getGolongan());
        System.out.println("Jmlh lembur: "+this.getLembur());
        System.out.printf("Gaji lembur:%.0f\n", this.getGajilembur());
        System.out.printf("Gaji       :%.0f\n", this.getGaji());
    }
}
