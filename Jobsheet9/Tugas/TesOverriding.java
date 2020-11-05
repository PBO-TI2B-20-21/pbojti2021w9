/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.Tugas;

/**
 *
 * @author DEBORA
 */
public class TesOverriding {
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Manusia b = new Dosen();
        Manusia c = new Mahasiswa();

        System.out.println("___________");
        a.bernafas();
        a.makan();
        System.out.println("___________");
        b.bernafas();
        b.makan();
        System.out.println("___________");
        c.bernafas();
        c.makan();
        System.out.println("___________");
    }
}
