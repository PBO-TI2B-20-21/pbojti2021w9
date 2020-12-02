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
public class SegitigaOverloading {

    private int sudut;

    public int totalSudut(int sudutA) {
        System.out.println(180 - sudutA);
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        System.out.println(180 - (sudutA + sudutB));
        return sudut = 180 - (sudutA + sudutB);
    }

    public int Keliling(int sisiA, int sisiB, int sisiC) {
        int keliling;
        System.out.println(sisiA + sisiB + sisiC);
        return keliling = sisiA + sisiB + sisiC;
    }

    public double Keliling(int sisiA, int sisiB) {
        double c;
        System.out.println(Math.sqrt((sisiA * sisiA) + (sisiB * sisiB)));
        return c = Math.sqrt(sisiA * sisiA) + (sisiB * sisiB);
    }
}