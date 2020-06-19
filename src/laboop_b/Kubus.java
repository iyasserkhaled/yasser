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
public class Kubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s,volume;
       System.out.println("------- Sisi-Sisi= ---------");
       s =  new Scanner (System.in).nextDouble();
       volume= s*s*s;
     
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.println("hasilnya = -------------");
             System.out.println("Volume = " + volume);
            
    }
    
}
