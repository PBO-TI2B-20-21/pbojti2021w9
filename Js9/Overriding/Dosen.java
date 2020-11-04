/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author WINDOWS 10
 */
public class Dosen extends Manusia{
    public String lembur;
    
    public Dosen(){
    }
    public Dosen(String lembur){
        this.lembur=lembur;
    }
    public void tampilDosen(){
        System.out.println("Aktivitas Dosen");
        System.out.println("Makan\t: "+super.makan);
        System.out.println("Lembur\t: "+lembur);
        System.out.println("=====================================");
    }
}
