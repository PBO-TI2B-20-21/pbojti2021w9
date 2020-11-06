/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Rafi Rachmawan
 */
public class MainOverriding {
  public static void main(String[] args) {
        manusia a = new manusia();
        manusia b = new dosen();
        manusia c = new mahasiswa();

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
