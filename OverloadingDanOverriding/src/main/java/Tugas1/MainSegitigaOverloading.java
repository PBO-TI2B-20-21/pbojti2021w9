/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author hp
 */
public class MainSegitigaOverloading {

    public static void main(String[] args) {
        SegitigaOverloading segitiga = new SegitigaOverloading();
        segitiga.totalSudut(70);
        segitiga.totalSudut(45, 30);
        segitiga.Keliling(12, 17, 20);
        segitiga.Keliling(12, 18);
    }
}