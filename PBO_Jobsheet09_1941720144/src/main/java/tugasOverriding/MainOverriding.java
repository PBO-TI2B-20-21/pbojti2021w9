/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasOverriding;

/**
 *
 * @author Zidan
 */
public class MainOverriding {
    public static void main(String[] args) {
        Manusia m=new Manusia();
        m.bernafas();
        m.makan();
        
        Dosen dsn=new Dosen();
        dsn.bernafas();
        dsn.lembur();
        dsn.makan();
        
        Mahasiswa mhs=new Mahasiswa();
        mhs.bernafas();
        mhs.makan();
        mhs.tidur();
    }
}
