/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author Risky
 */
public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing Manager & Staff");
        Manager man[] = new Manager[2];
        Staff staff[] = new Staff[2];
        Staff staff2[] = new Staff[3];
        
        //Pembuatan Manager
        
        man[0]= new Manager();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Adminitrasi");
        
        man[1]= new Manager();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");
        
        staff[0]= new Staff();
        staff[0].setNama("Usman");
        staff[0].setNip("0003");
        staff[0].setGolongan("2");
        staff[0].setLembur(10);
        staff[0].setGajiLembur(55000);
        
        
        staff[1]= new Staff();
        staff[1].setNama("Anigrah");
        staff[1].setNip("0005");
        staff[1].setGolongan("2");
        staff[1].setLembur(10);
        staff[1].setGajiLembur(55000);
        man[0].setStaff(staff);
        
        staff2[0]= new Staff();
        staff2[0].setNama("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(55000);
        
        staff2[1]= new Staff();
        staff2[1].setNama("Arrie");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);
        
        staff2[2]= new Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        man[1].setStaff(staff2);
        
        //cetak informasi dari manager + stafnya
        man[0].lihatInfo();
        man[1].lihatInfo();
    }
}
