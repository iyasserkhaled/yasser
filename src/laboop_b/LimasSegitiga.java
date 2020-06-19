/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboop_b;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author YASSER
 */
public class LimasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,tl,ts,volume;
       System.out.println("Tinggi limas segitiga: ");
       tl =  new Scanner (System.in).nextDouble();
        System.out.println("alas segitiga: ");
       a =  new Scanner (System.in).nextDouble();
        System.out.println("tinggi segitiga: ");
       ts =  new Scanner (System.in).nextDouble();
       volume = (a*ts)*(tl)/3;
     
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.println("hasilnya = -------------");
             System.out.println("Volume Limas segitiga = " + df.format(volume));
    }
    
}
