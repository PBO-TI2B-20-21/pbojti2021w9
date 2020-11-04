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
public class Mahasiswa extends Manusia{
    @Override
    public void makan(){
        System.out.println("Mahasiswa Bisa Makan");
    }
    public void tidur(){
        System.out.println("Mahasiswa Bisa Tidur");
    }
}
