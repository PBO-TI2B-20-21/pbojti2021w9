/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author hp
 */
public class Staff extends Karyawan {

    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setGajiLembur(double GajiLembur) {
        this.gajiLembur = GajiLembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public double getGajiLembur(int lembur, double gajiLembur) //overloading
    {
        return super.getGaji() + lembur * gajiLembur;
    }

    public double getGaji() //overriding                          
    {
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP         :" + this.getNip());
        System.out.println("Nama        :" + this.getNama());
        System.out.println("Golongan    :" + this.getGolongan());
        System.out.println("Jml Lemnbur :" + this.getLembur());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji        :%.0f\n", this.getGaji());
    }
}