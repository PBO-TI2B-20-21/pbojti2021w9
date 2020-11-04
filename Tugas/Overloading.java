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
public class Overloading {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        
        System.out.println("Total Sudut 1 : " + s.totalSudut(15));
        System.out.println("Total Sudut 2 : " + s.totalSudut(10, 15));
        System.out.println("Keliling 1   : " + s.keliling(10, 25, 10));
        System.out.println("Keliling 2   : " + s.keliling(10, 25));
    }
}
