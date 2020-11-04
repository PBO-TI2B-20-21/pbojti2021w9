/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasOverriding;

/**
 *
 * @author Zidan
 */
public class Dosen extends Manusia{
    @Override
    public void makan(){
        System.out.println("Dosen Bisa Makan");
    }
    public void lembur(){
        System.out.println("Dosen Melakukan Lembur");
    }
}
