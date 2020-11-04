package Percobaan1;
public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[]= new Manager[2];
        Staff Staff1[]= new Staff[2];
        Staff Staff2[]=new Staff[3];
        
        man[0]=new Manager();
        man[0].setNama("tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");
        
        man[1]=new Manager();
         man[0].setNama("atika");
        man[0].setNip("102");
        man[0].setGolongan("1");
        man[0].setTunjangan(2500000);
        man[0].setBagian("pemasaran");
        
        Staff1[0]=new Staff();
        Staff1[0].setNama("usman");
        Staff1[0].setNip("0003");
        Staff1[0].setGolongan("2");
        Staff1[0].setLembur(10);
        Staff1[0].setGajilembur(10000);
        
        Staff1[1]=new Staff();
        Staff1[1].setNama("Anugrah");
        Staff1[1].setNip("0005");
        Staff1[1].setGolongan("2");
        Staff1[1].setLembur(10);
        Staff1[1].setGajilembur(55000);
        man[0].setstaff(Staff1);
       
        Staff2[0]=new Staff();
        Staff2[0].setNama("hendra");
        Staff2[0].setNip("0004");
        Staff2[0].setGolongan("3");
        Staff2[0].setLembur(15);
        Staff2[0].setGajilembur(55000);
        
        Staff2[1]=new Staff();
        Staff2[1].setNama("arie");
        Staff2[1].setNip("0006");
        Staff2[1].setGolongan("4");
        Staff2[1].setLembur(5);
        Staff2[1].setGajilembur(100000);
        
        Staff2[2]=new Staff();
        Staff2[2].setNama("mentari");
        Staff2[2].setNip("0007");
        Staff2[2].setGolongan("3");
        Staff2[2].setLembur(6);
        Staff2[2].setGajilembur(20000);
        man[1].setstaff(Staff2);
        //cetak informasi manafer+Staff
        man[0]. lihatInfo();
        man[1]. lihatInfo();
    }
}