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
public class Mahasiswa extends Manusia{
    public String tidur;
    
    public Mahasiswa(){
    }
    public Mahasiswa(String tidur){
        this.tidur=tidur;
    }
    public void tampilMhs(){
        System.out.println("Aktivitas Mahasiswa");
        System.out.println("Makan\t: "+super.makan);
        System.out.println("Tidur\t: "+tidur);
        System.out.println("=====================================");
    }
}    
