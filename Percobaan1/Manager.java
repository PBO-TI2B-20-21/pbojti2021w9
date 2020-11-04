package Percobaan1;

public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff St[];
    public void setTunjangan(double tunjangan){
        this.tunjangan=tunjangan;
    }
    public double getTunjangan(){
        return tunjangan;
    }
    public void setBagian(String bagian){
        this.bagian=bagian;
    }
    public String getBagian(){
        return bagian;
    }
    public void setstaff(Staff St[]){
        this.St=St;
    }
    public void viewstaff(){
        int i;
        System.out.println("-----------------");
        for(i=0; i< St.length; i++){
            St[i].lihatInfo();
        }
        System.out.println("------------------");
    }
    public void lihatInfo(){
        System.out.println("Manager   : "+this.getBagian());
        System.out.println("Nip       : "+this.getNip());
        System.out.println("NAma      : "+this.getNama());
        System.out.println("Golongan  : "+this.getGolongan());
        System.out.printf("tunjangan :%.0f\n",this.getTunjangan());
        System.out.printf("Gaji      :%.0f\n",this.getGaji());
        System.out.println("Bagian    : "+this.getBagian());
        this.viewstaff();
        System.out.println("");
    }
    public double getGaji(){
        return super.getGaji()+tunjangan;
    }
}

  
