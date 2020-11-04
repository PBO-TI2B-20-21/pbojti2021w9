/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author WINDOWS 10
 */
public class mainSegitiga {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        sgt.totalSudut(10);
        System.out.println("Total sudut 1\t: "+sgt.sudut);
        sgt.totalSudut(10, 20);
        System.out.println("Total sudut 2\t: "+sgt.sudut);
        sgt.keliling(10, 10, 10);
        System.out.println("Total keliling 1: "+sgt.keliling);
        sgt.keliling(5, 2);
        System.out.println("Total C 1\t: "+sgt.c);
    }
    
}
