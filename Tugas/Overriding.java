/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author INDRAFN
 */
public class Overriding {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa();

        a.bernafas();
        a.makan();
        
        System.out.println();
        
        b.makan();
        b.lembur();
        
        System.out.println();
        
        c.makan();
        c.tidur();
    }
}
