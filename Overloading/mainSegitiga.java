/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author USER
 */
public class mainSegitiga {
    public static void main(String[] args) {
        Segitiga stg = new Segitiga();
        System.out.println(stg.TotalSudut(5));
        System.out.println(stg.TotalSudut(10, 30));
        System.out.println(stg.keliling(1, 2,3));
        System.out.println(stg.keliling(4, 7));
    }
}
