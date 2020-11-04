/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasOverloading;

/**
 *
 * @author Zidan
 */
public class MainOverloading {
    public static void main(String[] args) {
       Overloading segitiga = new Overloading();
       segitiga.totalSudut(30);
       segitiga.totalSudut(15,60);
       segitiga.keliling(5,3,8);
       segitiga.keliling(7,10);
    }
}
