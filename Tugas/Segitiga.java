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
public class Segitiga {
    public int sudut;
    
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        int kel = sisiA + sisiB + sisiC;
        return kel;
    }
    public double keliling(int sisiA, int sisiB){
        double kell = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return kell;
    }
}
