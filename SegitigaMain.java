package com.company;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut :" +s.totalSudut(5));
        System.out.println("Total Sudut :" +s.totalSudut(6, 12));
        System.out.println("Total Keliling :" +s.keliling(50, 25));
        System.out.println("Total Keliling :" +s.keliling(14, 20));
    }
}
