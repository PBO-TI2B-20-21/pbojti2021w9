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
public class Segitiga {
    public int sudut, keliling;
    public double c;
    
    public int totalSudut(int sudutA){
        sudut = 180-sudutA;
        return sudut;
    }
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180-(sudutA+sudutB);
        return sudut;
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    public double keliling(int sisiA, int sisiB){
        c = Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
        return c;
    }
}
