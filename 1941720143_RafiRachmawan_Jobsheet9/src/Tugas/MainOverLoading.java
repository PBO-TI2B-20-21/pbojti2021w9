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
public class MainOverLoading {
     public static void main(String[] args) {
        segitiga Segitiga = new segitiga();

        System.out.println(Segitiga.totalSudut(10));
        System.out.println(Segitiga.totalSudut(10, 5));
        System.out.println(Segitiga.keliling(12, 27));
        System.out.println(Segitiga.keliling(12, 25, 27));

    }
}
