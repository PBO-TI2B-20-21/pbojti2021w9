/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author USER
 */
public class Mahasiswa extends Manusia {
    public void makan(){
        System.out.println("Mahasiswa butuh makan agar sehat");
    }
    public void tidur(){
        System.out.println("Mahasiswa butuh cukup tidur yaitu 8 jam agar tidak mudah sakit");
    }
}
