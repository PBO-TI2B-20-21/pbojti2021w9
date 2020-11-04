/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Risky
 */
public class Tugas2Main {

    public static void main(String[] args) {
        Manusia ma = new Manusia();
        ma.Bernafas();
        ma.Makan();
    
        Dosen ds = new Dosen();
        ds.Makan();
        ds.Lembur();

        Mahasiswa mhs = new Mahasiswa();
        mhs.Makan();
        mhs.Tidur();
    }

}
