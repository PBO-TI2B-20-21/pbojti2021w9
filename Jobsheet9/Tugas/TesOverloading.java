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
public class TesOverloading {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println(segitiga.totalSudut(10));
        System.out.println(segitiga.totalSudut(10, 5));
        System.out.println(segitiga.keliling(12, 27));
        System.out.println(segitiga.keliling(12, 25, 27));
    }
}

