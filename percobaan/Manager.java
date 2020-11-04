/**
 * Manager
 */
public class Manager extends karyawan {

    private double tunjangan;
    private String bagian;
    private staff st[];
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    public String getBagian() {
        return bagian;
    }
    public void setSt(staff[] st) {
        this.st = st;
    }
    public void viewStaff(){
        System.out.println("============================");
        for (int i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("============================");
    }
    public void lihatInfo(){
        System.out.println("NIP        : "+this.getNip());
        System.out.println("Nama       : "+this.getNama());
        System.out.printf("Tunjangan   :%f\n", this.getTunjangan());
        System.out.printf("Gaji        :%f\n", this.getGaji());
        System.out.println("Bagian     : "+this.getBagian());
        this.viewStaff();
    }
    @Override
    public double getGaji() {
        // TODO Auto-generated method stub
        return super.getGaji()+tunjangan;
    }
}