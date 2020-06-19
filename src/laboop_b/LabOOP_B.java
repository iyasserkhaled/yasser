/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboop_b;

import java.util.Scanner;

/**
 *
 * @author YASSER
 */
public class LabOOP_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r,luas,keliling;
        System.out.println("Jari-jari: ");
        r = new Scanner (System.in).nextDouble();
        luas = 3.14*r*r;
        keliling = 2*3.14*r;
        System.out.println("================ Hasil perhitungan ======");
        System.out.println("luas lingkaran :" + luas);
        System.out.println("keliling lingkaran: " + keliling );
    }
    
}
