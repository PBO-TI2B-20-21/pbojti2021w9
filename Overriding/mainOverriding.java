/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author USER
 */
public class mainOverriding {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        Manusia ma = new Manusia();
        d.makan();
        m.makan();
        ma.makan();
    }
}
