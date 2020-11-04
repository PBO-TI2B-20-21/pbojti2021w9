/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overridding;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        m.Bernafas();
        m.Makan();
        System.out.println("------------------");
        Dosen d = new Dosen();
        d.Makan();
        d.Lembur();
        System.out.println("------------------");
        Mahasiswa mhs = new Mahasiswa();
        mhs.Makan();
        mhs.Tidur();
    }
}


