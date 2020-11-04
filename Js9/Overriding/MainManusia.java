/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author WINDOWS 10
 */
public class MainManusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dos=new Dosen();
        dos.makan="Nasi Goreng";
        dos.lembur="sampai jam 9 malam";
        dos.tampilDosen();
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.makan="Pecel Lele";
        mhs.tidur="Kesiangan";
        mhs.tampilMhs();
    }
}
